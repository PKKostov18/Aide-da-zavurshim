var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', async function(req, res) {

  let repo = req.app._repo;
  
  let items = await repo.getAll();

  res.render('page', { title: 'Measurements system', items: items });
});

module.exports = router;
