'use strict';

var utils = require('../utils/writer.js');
var Drivers = require('../service/DriversService');

module.exports.createDriver = function createDriver (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var createDriverParam = req.swagger.params['createDriverParam'].value;
  Drivers.createDriver(accessUnderscoretoken,createDriverParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deactivateDriver = function deactivateDriver (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid = req.swagger.params['driver_id_or_external_id'].value;
  Drivers.deactivateDriver(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAllDeactivatedDrivers = function getAllDeactivatedDrivers (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupUnderscoreid = req.swagger.params['group_id'].value;
  Drivers.getAllDeactivatedDrivers(accessUnderscoretoken,groupUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDeactivatedDriverById = function getDeactivatedDriverById (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid = req.swagger.params['driver_id_or_external_id'].value;
  Drivers.getDeactivatedDriverById(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDriverById = function getDriverById (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid = req.swagger.params['driver_id_or_external_id'].value;
  Drivers.getDriverById(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.reactivateDriverById = function reactivateDriverById (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid = req.swagger.params['driver_id_or_external_id'].value;
  var reactivateDriverParam = req.swagger.params['reactivateDriverParam'].value;
  Drivers.reactivateDriverById(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid,reactivateDriverParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
