var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', async function(req, res, next) {

  let repo = req.app._repo;
  
  let items = await repo.getAll();

  res.render('index', { title: 'Measurements system', items: items });
});

router.post('/delete', async function(req, res, next) {

  let repo = req.app._repo;

  repo.deleteById(req.body.id)

  res.redirect("/");
});

router.post('/edit', async function(req, res, next) {

  let repo = req.app._repo;

  repo.update(req.body.id, req.body.newValue);

  res.redirect("/");
});

module.exports = router;
