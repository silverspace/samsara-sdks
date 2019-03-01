'use strict';

var utils = require('../utils/writer.js');
var Drivers = require('../service/DriversService');

module.exports.createDriver = function createDriver (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var createDriverParam = req.swagger.params['createDriverParam'].value;
  Drivers.createDriver(access_token,createDriverParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deactivateDriver = function deactivateDriver (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var driver_id_or_external_id = req.swagger.params['driver_id_or_external_id'].value;
  Drivers.deactivateDriver(access_token,driver_id_or_external_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAllDeactivatedDrivers = function getAllDeactivatedDrivers (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var group_id = req.swagger.params['group_id'].value;
  Drivers.getAllDeactivatedDrivers(access_token,group_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDeactivatedDriverById = function getDeactivatedDriverById (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var driver_id_or_external_id = req.swagger.params['driver_id_or_external_id'].value;
  Drivers.getDeactivatedDriverById(access_token,driver_id_or_external_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDriverById = function getDriverById (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var driver_id_or_external_id = req.swagger.params['driver_id_or_external_id'].value;
  Drivers.getDriverById(access_token,driver_id_or_external_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.reactivateDriverById = function reactivateDriverById (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var driver_id_or_external_id = req.swagger.params['driver_id_or_external_id'].value;
  var reactivateDriverParam = req.swagger.params['reactivateDriverParam'].value;
  Drivers.reactivateDriverById(access_token,driver_id_or_external_id,reactivateDriverParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
