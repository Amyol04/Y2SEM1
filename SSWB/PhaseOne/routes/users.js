var express = require('express'); // imports express
var router = express.Router(); // creats router object 

/* GET users listing. */
router.get('/', function(req, res, next) {
  res.send('respond with a resource');
});

module.exports = router;
