'use strict';

var utils = require('../utils/writer.js');
var Routes = require('../service/RoutesService');

module.exports.createDispatchRoute = function createDispatchRoute (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var createDispatchRouteParams = req.swagger.params['createDispatchRouteParams'].value;
  Routes.createDispatchRoute(accessUnderscoretoken,createDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createDriverDispatchRoute = function createDriverDispatchRoute (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var driverUnderscoreid = req.swagger.params['driver_id'].value;
  var createDispatchRouteParams = req.swagger.params['createDispatchRouteParams'].value;
  Routes.createDriverDispatchRoute(accessUnderscoretoken,driverUnderscoreid,createDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createVehicleDispatchRoute = function createVehicleDispatchRoute (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var vehicleUnderscoreid = req.swagger.params['vehicle_id'].value;
  var createDispatchRouteParams = req.swagger.params['createDispatchRouteParams'].value;
  Routes.createVehicleDispatchRoute(accessUnderscoretoken,vehicleUnderscoreid,createDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deleteDispatchRouteById = function deleteDispatchRouteById (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var routeUnderscoreid = req.swagger.params['route_id'].value;
  Routes.deleteDispatchRouteById(accessUnderscoretoken,routeUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.fetchAllDispatchRoutes = function fetchAllDispatchRoutes (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupUnderscoreid = req.swagger.params['group_id'].value;
  var endUnderscoretime = req.swagger.params['end_time'].value;
  var duration = req.swagger.params['duration'].value;
  Routes.fetchAllDispatchRoutes(accessUnderscoretoken,groupUnderscoreid,endUnderscoretime,duration)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.fetchAllRouteJobUpdates = function fetchAllRouteJobUpdates (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupUnderscoreid = req.swagger.params['group_id'].value;
  var sequenceUnderscoreid = req.swagger.params['sequence_id'].value;
  var include = req.swagger.params['include'].value;
  Routes.fetchAllRouteJobUpdates(accessUnderscoretoken,groupUnderscoreid,sequenceUnderscoreid,include)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDispatchRouteById = function getDispatchRouteById (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var routeUnderscoreid = req.swagger.params['route_id'].value;
  Routes.getDispatchRouteById(accessUnderscoretoken,routeUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDispatchRouteHistory = function getDispatchRouteHistory (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var routeUnderscoreid = req.swagger.params['route_id'].value;
  var startUnderscoretime = req.swagger.params['start_time'].value;
  var endUnderscoretime = req.swagger.params['end_time'].value;
  Routes.getDispatchRouteHistory(accessUnderscoretoken,routeUnderscoreid,startUnderscoretime,endUnderscoretime)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDispatchRoutesByDriverId = function getDispatchRoutesByDriverId (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var driverUnderscoreid = req.swagger.params['driver_id'].value;
  var endUnderscoretime = req.swagger.params['end_time'].value;
  var duration = req.swagger.params['duration'].value;
  Routes.getDispatchRoutesByDriverId(accessUnderscoretoken,driverUnderscoreid,endUnderscoretime,duration)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDispatchRoutesByVehicleId = function getDispatchRoutesByVehicleId (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var vehicleUnderscoreid = req.swagger.params['vehicle_id'].value;
  var endUnderscoretime = req.swagger.params['end_time'].value;
  var duration = req.swagger.params['duration'].value;
  Routes.getDispatchRoutesByVehicleId(accessUnderscoretoken,vehicleUnderscoreid,endUnderscoretime,duration)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.updateDispatchRouteById = function updateDispatchRouteById (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var routeUnderscoreid = req.swagger.params['route_id'].value;
  var updateDispatchRouteParams = req.swagger.params['updateDispatchRouteParams'].value;
  Routes.updateDispatchRouteById(accessUnderscoretoken,routeUnderscoreid,updateDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
