'use strict';

var utils = require('../utils/writer.js');
var Industrial = require('../service/IndustrialService');

module.exports.getAllDataInputs = function getAllDataInputs (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var group_id = req.swagger.params['group_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Industrial.getAllDataInputs(access_token,group_id,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDataInput = function getDataInput (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var data_input_id = req.swagger.params['data_input_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Industrial.getDataInput(access_token,data_input_id,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_machines = function get_machines (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var groupParam = req.swagger.params['groupParam'].value;
  Industrial.get_machines(access_token,groupParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_machines_history = function get_machines_history (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var historyParam = req.swagger.params['historyParam'].value;
  Industrial.get_machines_history(access_token,historyParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
