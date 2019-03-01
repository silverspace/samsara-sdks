'use strict';

var utils = require('../utils/writer.js');
var Sensors = require('../service/SensorsService');

module.exports.get_sensors = function get_sensors (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var groupParam = req.swagger.params['groupParam'].value;
  Sensors.get_sensors(access_token,groupParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_sensors_cargo = function get_sensors_cargo (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var sensorParam = req.swagger.params['sensorParam'].value;
  Sensors.get_sensors_cargo(access_token,sensorParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_sensors_door = function get_sensors_door (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var sensorParam = req.swagger.params['sensorParam'].value;
  Sensors.get_sensors_door(access_token,sensorParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_sensors_history = function get_sensors_history (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var historyParam = req.swagger.params['historyParam'].value;
  Sensors.get_sensors_history(access_token,historyParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_sensors_humidity = function get_sensors_humidity (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var sensorParam = req.swagger.params['sensorParam'].value;
  Sensors.get_sensors_humidity(access_token,sensorParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_sensors_temperature = function get_sensors_temperature (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var sensorParam = req.swagger.params['sensorParam'].value;
  Sensors.get_sensors_temperature(access_token,sensorParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
