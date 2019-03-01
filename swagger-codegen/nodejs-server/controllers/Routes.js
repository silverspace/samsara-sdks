'use strict';

var utils = require('../utils/writer.js');
var Routes = require('../service/RoutesService');

module.exports.createDispatchRoute = function createDispatchRoute (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var createDispatchRouteParams = req.swagger.params['createDispatchRouteParams'].value;
  Routes.createDispatchRoute(access_token,createDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createDriverDispatchRoute = function createDriverDispatchRoute (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var driver_id = req.swagger.params['driver_id'].value;
  var createDispatchRouteParams = req.swagger.params['createDispatchRouteParams'].value;
  Routes.createDriverDispatchRoute(access_token,driver_id,createDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createVehicleDispatchRoute = function createVehicleDispatchRoute (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var vehicle_id = req.swagger.params['vehicle_id'].value;
  var createDispatchRouteParams = req.swagger.params['createDispatchRouteParams'].value;
  Routes.createVehicleDispatchRoute(access_token,vehicle_id,createDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deleteDispatchRouteById = function deleteDispatchRouteById (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var route_id = req.swagger.params['route_id'].value;
  Routes.deleteDispatchRouteById(access_token,route_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.fetchAllDispatchRoutes = function fetchAllDispatchRoutes (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var group_id = req.swagger.params['group_id'].value;
  var end_time = req.swagger.params['end_time'].value;
  var duration = req.swagger.params['duration'].value;
  Routes.fetchAllDispatchRoutes(access_token,group_id,end_time,duration)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.fetchAllRouteJobUpdates = function fetchAllRouteJobUpdates (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var group_id = req.swagger.params['group_id'].value;
  var sequence_id = req.swagger.params['sequence_id'].value;
  var include = req.swagger.params['include'].value;
  Routes.fetchAllRouteJobUpdates(access_token,group_id,sequence_id,include)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDispatchRouteById = function getDispatchRouteById (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var route_id = req.swagger.params['route_id'].value;
  Routes.getDispatchRouteById(access_token,route_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDispatchRouteHistory = function getDispatchRouteHistory (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var route_id = req.swagger.params['route_id'].value;
  var start_time = req.swagger.params['start_time'].value;
  var end_time = req.swagger.params['end_time'].value;
  Routes.getDispatchRouteHistory(access_token,route_id,start_time,end_time)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDispatchRoutesByDriverId = function getDispatchRoutesByDriverId (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var driver_id = req.swagger.params['driver_id'].value;
  var end_time = req.swagger.params['end_time'].value;
  var duration = req.swagger.params['duration'].value;
  Routes.getDispatchRoutesByDriverId(access_token,driver_id,end_time,duration)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDispatchRoutesByVehicleId = function getDispatchRoutesByVehicleId (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var vehicle_id = req.swagger.params['vehicle_id'].value;
  var end_time = req.swagger.params['end_time'].value;
  var duration = req.swagger.params['duration'].value;
  Routes.getDispatchRoutesByVehicleId(access_token,vehicle_id,end_time,duration)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.updateDispatchRouteById = function updateDispatchRouteById (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var route_id = req.swagger.params['route_id'].value;
  var updateDispatchRouteParams = req.swagger.params['updateDispatchRouteParams'].value;
  Routes.updateDispatchRouteById(access_token,route_id,updateDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
