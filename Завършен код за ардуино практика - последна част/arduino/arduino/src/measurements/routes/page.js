var express = require('express');
var router = express.Router();
router.get('/',  async function(req, res){
    let repo = req.app._repo;
  
    let items = await repo.getAllFromToday();
  
    res.render('page', { title: 'Measurements system', items: items });
})
module.exports = router;