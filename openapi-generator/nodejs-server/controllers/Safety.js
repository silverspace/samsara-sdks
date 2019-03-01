'use strict';

var utils = require('../utils/writer.js');
var Safety = require('../service/SafetyService');

module.exports.getDriverSafetyScore = function getDriverSafetyScore (req, res, next) {
  var driverId = req.swagger.params['driverId'].value;
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Safety.getDriverSafetyScore(driverId,accessUnderscoretoken,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getVehicleHarshEvent = function getVehicleHarshEvent (req, res, next) {
  var vehicleId = req.swagger.params['vehicleId'].value;
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var timestamp = req.swagger.params['timestamp'].value;
  Safety.getVehicleHarshEvent(vehicleId,accessUnderscoretoken,timestamp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getVehicleSafetyScore = function getVehicleSafetyScore (req, res, next) {
  var vehicleId = req.swagger.params['vehicleId'].value;
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Safety.getVehicleSafetyScore(vehicleId,accessUnderscoretoken,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
