'use strict';

var utils = require('../utils/writer.js');
var Sensors = require('../service/SensorsService');

module.exports.get_sensors = function get_sensors (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupParam = req.swagger.params['groupParam'].value;
  Sensors.get_sensors(accessUnderscoretoken,groupParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_sensors_cargo = function get_sensors_cargo (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var sensorParam = req.swagger.params['sensorParam'].value;
  Sensors.get_sensors_cargo(accessUnderscoretoken,sensorParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_sensors_door = function get_sensors_door (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var sensorParam = req.swagger.params['sensorParam'].value;
  Sensors.get_sensors_door(accessUnderscoretoken,sensorParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_sensors_history = function get_sensors_history (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var historyParam = req.swagger.params['historyParam'].value;
  Sensors.get_sensors_history(accessUnderscoretoken,historyParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_sensors_humidity = function get_sensors_humidity (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var sensorParam = req.swagger.params['sensorParam'].value;
  Sensors.get_sensors_humidity(accessUnderscoretoken,sensorParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_sensors_temperature = function get_sensors_temperature (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var sensorParam = req.swagger.params['sensorParam'].value;
  Sensors.get_sensors_temperature(accessUnderscoretoken,sensorParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
