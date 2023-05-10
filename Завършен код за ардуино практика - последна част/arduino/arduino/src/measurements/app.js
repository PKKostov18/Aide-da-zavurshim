const { MeasurementsRepository } = require("./_dal/measurementsRepository")
const { SerialPort } = require('serialport')
const { ReadlineParser } = require('@serialport/parser-readline')

var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');
var process = require('process');

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');
var pageRouter = require('./routes/page');

const sql = require('mssql/msnodesqlv8')
require('dotenv').config()

var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'twig');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use('/', indexRouter);
app.use('/users', usersRouter);
app.use('/page', pageRouter);

// catch 404 and forward to error handler
app.use(function (req, res, next) {
  next(createError(404));
});

// error handler
app.use(function (err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});

module.exports = app;

function initSerialPort(onSerialData) {
  let portNumber = process.argv.length == 3 ? process.argv[2] : 'COM5';

  const port = new SerialPort({
    path: portNumber,
    baudRate: 9600,
  });

  port.on('error', function (err) {
    console.log('Serial port error: ', err.message)
  });

  port.on('open', function () {
    console.log(`Connected to ${portNumber}`)
  })

  const parser = port.pipe(new ReadlineParser({ delimiter: '\r\n' }))

  parser.on('data', onSerialData)

}

const sqlConfig = {
  database: 'example',
  server: 'SL179\\SQLEXPRESS',
  pool: {
    max: 10,
    min: 0,
    idleTimeoutMillis: 30000
  },
  options: {
    trustedConnection: true,
    encrypt: false, // for Azure
    trustServerCertificate: true // change to true for local dev / self-signed certs
  }
}

async function initSqlConnection() {
  try {
    // make sure that any items are correctly URL encoded in the connection string
    console.log(`Connecting to SQL Server: ${process.env.SQL_SERVER}`);
    await sql.connect(sqlConfig);
    console.log(`Connected!`);

  } catch (err) {
    console.dir(err)
  }
}

initSqlConnection()
  .then((items) => {
    app._sql = sql;
    app._repo = new MeasurementsRepository(sql);

    initSerialPort((data) => {
      app._repo.create(parseInt(data))
      console.log(`Serial data: ${data}`)
    });
  })
  .catch((err) => {
    console.error(`Error: ${err.message}`)
    console.dir(err.stack)
  })
