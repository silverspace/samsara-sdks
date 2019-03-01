'use strict';

var utils = require('../utils/writer.js');
var Industrial = require('../service/IndustrialService');

module.exports.getAllDataInputs = function getAllDataInputs (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupUnderscoreid = req.swagger.params['group_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Industrial.getAllDataInputs(accessUnderscoretoken,groupUnderscoreid,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDataInput = function getDataInput (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var dataUnderscoreinputUnderscoreid = req.swagger.params['data_input_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Industrial.getDataInput(accessUnderscoretoken,dataUnderscoreinputUnderscoreid,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_machines = function get_machines (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupParam = req.swagger.params['groupParam'].value;
  Industrial.get_machines(accessUnderscoretoken,groupParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_machines_history = function get_machines_history (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var historyParam = req.swagger.params['historyParam'].value;
  Industrial.get_machines_history(accessUnderscoretoken,historyParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
