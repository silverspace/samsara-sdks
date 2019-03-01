'use strict';

var utils = require('../utils/writer.js');
var Fleet = require('../service/FleetService');

module.exports.addOrganizationAddresses = function addOrganizationAddresses (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var addresses = req.swagger.params['addresses'].value;
  Fleet.addOrganizationAddresses(accessUnderscoretoken,addresses)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.add_fleet_address = function add_fleet_address (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var addressParam = req.swagger.params['addressParam'].value;
  Fleet.add_fleet_address(accessUnderscoretoken,addressParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createDispatchRoute = function createDispatchRoute (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var createDispatchRouteParams = req.swagger.params['createDispatchRouteParams'].value;
  Fleet.createDispatchRoute(accessUnderscoretoken,createDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createDriver = function createDriver (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var createDriverParam = req.swagger.params['createDriverParam'].value;
  Fleet.createDriver(accessUnderscoretoken,createDriverParam)
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
  Fleet.createDriverDispatchRoute(accessUnderscoretoken,driverUnderscoreid,createDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createDriverDocument = function createDriverDocument (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var driverUnderscoreid = req.swagger.params['driver_id'].value;
  var createDocumentParams = req.swagger.params['createDocumentParams'].value;
  Fleet.createDriverDocument(accessUnderscoretoken,driverUnderscoreid,createDocumentParams)
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
  Fleet.createVehicleDispatchRoute(accessUnderscoretoken,vehicleUnderscoreid,createDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.create_dvir = function create_dvir (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var createDvirParam = req.swagger.params['createDvirParam'].value;
  Fleet.create_dvir(accessUnderscoretoken,createDvirParam)
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
  Fleet.deactivateDriver(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid)
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
  Fleet.deleteDispatchRouteById(accessUnderscoretoken,routeUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deleteOrganizationAddress = function deleteOrganizationAddress (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var addressId = req.swagger.params['addressId'].value;
  Fleet.deleteOrganizationAddress(accessUnderscoretoken,addressId)
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
  Fleet.fetchAllDispatchRoutes(accessUnderscoretoken,groupUnderscoreid,endUnderscoretime,duration)
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
  Fleet.fetchAllRouteJobUpdates(accessUnderscoretoken,groupUnderscoreid,sequenceUnderscoreid,include)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAllAssetCurrentLocations = function getAllAssetCurrentLocations (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupUnderscoreid = req.swagger.params['group_id'].value;
  Fleet.getAllAssetCurrentLocations(accessUnderscoretoken,groupUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAllAssets = function getAllAssets (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupUnderscoreid = req.swagger.params['group_id'].value;
  Fleet.getAllAssets(accessUnderscoretoken,groupUnderscoreid)
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
  Fleet.getAllDeactivatedDrivers(accessUnderscoretoken,groupUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAssetLocation = function getAssetLocation (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var assetUnderscoreid = req.swagger.params['asset_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Fleet.getAssetLocation(accessUnderscoretoken,assetUnderscoreid,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAssetReefer = function getAssetReefer (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var assetUnderscoreid = req.swagger.params['asset_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Fleet.getAssetReefer(accessUnderscoretoken,assetUnderscoreid,startMs,endMs)
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
  Fleet.getDeactivatedDriverById(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid)
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
  Fleet.getDispatchRouteById(accessUnderscoretoken,routeUnderscoreid)
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
  Fleet.getDispatchRouteHistory(accessUnderscoretoken,routeUnderscoreid,startUnderscoretime,endUnderscoretime)
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
  Fleet.getDispatchRoutesByDriverId(accessUnderscoretoken,driverUnderscoreid,endUnderscoretime,duration)
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
  Fleet.getDispatchRoutesByVehicleId(accessUnderscoretoken,vehicleUnderscoreid,endUnderscoretime,duration)
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
  Fleet.getDriverById(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDriverDocumentTypesByOrgId = function getDriverDocumentTypesByOrgId (req, res, next) {
  Fleet.getDriverDocumentTypesByOrgId()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDriverDocumentsByOrgId = function getDriverDocumentsByOrgId (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var endMs = req.swagger.params['endMs'].value;
  var durationMs = req.swagger.params['durationMs'].value;
  Fleet.getDriverDocumentsByOrgId(accessUnderscoretoken,endMs,durationMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDriverSafetyScore = function getDriverSafetyScore (req, res, next) {
  var driverId = req.swagger.params['driverId'].value;
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Fleet.getDriverSafetyScore(driverId,accessUnderscoretoken,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getFleetVehicle = function getFleetVehicle (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var vehicleUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid = req.swagger.params['vehicle_id_or_external_id'].value;
  Fleet.getFleetVehicle(accessUnderscoretoken,vehicleUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getOrganizationAddress = function getOrganizationAddress (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var addressId = req.swagger.params['addressId'].value;
  Fleet.getOrganizationAddress(accessUnderscoretoken,addressId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getOrganizationAddresses = function getOrganizationAddresses (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  Fleet.getOrganizationAddresses(accessUnderscoretoken)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getOrganizationContact = function getOrganizationContact (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var contactUnderscoreid = req.swagger.params['contact_id'].value;
  Fleet.getOrganizationContact(accessUnderscoretoken,contactUnderscoreid)
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
  Fleet.getVehicleHarshEvent(vehicleId,accessUnderscoretoken,timestamp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getVehicleLocations = function getVehicleLocations (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var vehicleUnderscoreid = req.swagger.params['vehicle_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Fleet.getVehicleLocations(accessUnderscoretoken,vehicleUnderscoreid,startMs,endMs)
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
  Fleet.getVehicleSafetyScore(vehicleId,accessUnderscoretoken,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getVehicleStats = function getVehicleStats (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  var series = req.swagger.params['series'].value;
  var tagIds = req.swagger.params['tagIds'].value;
  var startingAfter = req.swagger.params['startingAfter'].value;
  var endingBefore = req.swagger.params['endingBefore'].value;
  var limit = req.swagger.params['limit'].value;
  Fleet.getVehicleStats(accessUnderscoretoken,startMs,endMs,series,tagIds,startingAfter,endingBefore,limit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getVehiclesLocations = function getVehiclesLocations (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Fleet.getVehiclesLocations(accessUnderscoretoken,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_dvirs = function get_dvirs (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var endUnderscorems = req.swagger.params['end_ms'].value;
  var durationUnderscorems = req.swagger.params['duration_ms'].value;
  var groupUnderscoreid = req.swagger.params['group_id'].value;
  Fleet.get_dvirs(accessUnderscoretoken,endUnderscorems,durationUnderscorems,groupUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_drivers = function get_fleet_drivers (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupDriversParam = req.swagger.params['groupDriversParam'].value;
  Fleet.get_fleet_drivers(accessUnderscoretoken,groupDriversParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_drivers_hos_daily_logs = function get_fleet_drivers_hos_daily_logs (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var driverUnderscoreid = req.swagger.params['driver_id'].value;
  var hosLogsParam = req.swagger.params['hosLogsParam'].value;
  Fleet.get_fleet_drivers_hos_daily_logs(accessUnderscoretoken,driverUnderscoreid,hosLogsParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_drivers_summary = function get_fleet_drivers_summary (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var driversSummaryParam = req.swagger.params['driversSummaryParam'].value;
  var snapUnderscoretoUnderscoredayUnderscorebounds = req.swagger.params['snap_to_day_bounds'].value;
  Fleet.get_fleet_drivers_summary(accessUnderscoretoken,driversSummaryParam,snapUnderscoretoUnderscoredayUnderscorebounds)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_hos_authentication_logs = function get_fleet_hos_authentication_logs (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var hosAuthenticationLogsParam = req.swagger.params['hosAuthenticationLogsParam'].value;
  Fleet.get_fleet_hos_authentication_logs(accessUnderscoretoken,hosAuthenticationLogsParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_hos_logs = function get_fleet_hos_logs (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var hosLogsParam = req.swagger.params['hosLogsParam'].value;
  Fleet.get_fleet_hos_logs(accessUnderscoretoken,hosLogsParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_hos_logs_summary = function get_fleet_hos_logs_summary (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var hosLogsParam = req.swagger.params['hosLogsParam'].value;
  Fleet.get_fleet_hos_logs_summary(accessUnderscoretoken,hosLogsParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_locations = function get_fleet_locations (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupParam = req.swagger.params['groupParam'].value;
  Fleet.get_fleet_locations(accessUnderscoretoken,groupParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_maintenance_list = function get_fleet_maintenance_list (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupParam = req.swagger.params['groupParam'].value;
  Fleet.get_fleet_maintenance_list(accessUnderscoretoken,groupParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_trips = function get_fleet_trips (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var tripsParam = req.swagger.params['tripsParam'].value;
  Fleet.get_fleet_trips(accessUnderscoretoken,tripsParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.listContacts = function listContacts (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  Fleet.listContacts(accessUnderscoretoken)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.list_fleet = function list_fleet (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupParam = req.swagger.params['groupParam'].value;
  var startingAfter = req.swagger.params['startingAfter'].value;
  var endingBefore = req.swagger.params['endingBefore'].value;
  var limit = req.swagger.params['limit'].value;
  Fleet.list_fleet(accessUnderscoretoken,groupParam,startingAfter,endingBefore,limit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.patchFleetVehicle = function patchFleetVehicle (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var vehicleUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid = req.swagger.params['vehicle_id_or_external_id'].value;
  var data = req.swagger.params['data'].value;
  Fleet.patchFleetVehicle(accessUnderscoretoken,vehicleUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid,data)
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
  Fleet.reactivateDriverById(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid,reactivateDriverParam)
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
  Fleet.updateDispatchRouteById(accessUnderscoretoken,routeUnderscoreid,updateDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.updateOrganizationAddress = function updateOrganizationAddress (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var addressId = req.swagger.params['addressId'].value;
  var address = req.swagger.params['address'].value;
  Fleet.updateOrganizationAddress(accessUnderscoretoken,addressId,address)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.update_vehicles = function update_vehicles (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var vehicleUpdateParam = req.swagger.params['vehicleUpdateParam'].value;
  Fleet.update_vehicles(accessUnderscoretoken,vehicleUpdateParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
