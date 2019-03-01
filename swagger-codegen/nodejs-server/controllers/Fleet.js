'use strict';

var utils = require('../utils/writer.js');
var Fleet = require('../service/FleetService');

module.exports.addOrganizationAddresses = function addOrganizationAddresses (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var addresses = req.swagger.params['addresses'].value;
  Fleet.addOrganizationAddresses(access_token,addresses)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.add_fleet_address = function add_fleet_address (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var addressParam = req.swagger.params['addressParam'].value;
  Fleet.add_fleet_address(access_token,addressParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createDispatchRoute = function createDispatchRoute (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var createDispatchRouteParams = req.swagger.params['createDispatchRouteParams'].value;
  Fleet.createDispatchRoute(access_token,createDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createDriver = function createDriver (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var createDriverParam = req.swagger.params['createDriverParam'].value;
  Fleet.createDriver(access_token,createDriverParam)
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
  Fleet.createDriverDispatchRoute(access_token,driver_id,createDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createDriverDocument = function createDriverDocument (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var driver_id = req.swagger.params['driver_id'].value;
  var createDocumentParams = req.swagger.params['createDocumentParams'].value;
  Fleet.createDriverDocument(access_token,driver_id,createDocumentParams)
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
  Fleet.createVehicleDispatchRoute(access_token,vehicle_id,createDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.create_dvir = function create_dvir (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var createDvirParam = req.swagger.params['createDvirParam'].value;
  Fleet.create_dvir(access_token,createDvirParam)
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
  Fleet.deactivateDriver(access_token,driver_id_or_external_id)
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
  Fleet.deleteDispatchRouteById(access_token,route_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deleteOrganizationAddress = function deleteOrganizationAddress (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var addressId = req.swagger.params['addressId'].value;
  Fleet.deleteOrganizationAddress(access_token,addressId)
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
  Fleet.fetchAllDispatchRoutes(access_token,group_id,end_time,duration)
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
  Fleet.fetchAllRouteJobUpdates(access_token,group_id,sequence_id,include)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAllAssetCurrentLocations = function getAllAssetCurrentLocations (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var group_id = req.swagger.params['group_id'].value;
  Fleet.getAllAssetCurrentLocations(access_token,group_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAllAssets = function getAllAssets (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var group_id = req.swagger.params['group_id'].value;
  Fleet.getAllAssets(access_token,group_id)
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
  Fleet.getAllDeactivatedDrivers(access_token,group_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAssetLocation = function getAssetLocation (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var asset_id = req.swagger.params['asset_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Fleet.getAssetLocation(access_token,asset_id,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAssetReefer = function getAssetReefer (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var asset_id = req.swagger.params['asset_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Fleet.getAssetReefer(access_token,asset_id,startMs,endMs)
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
  Fleet.getDeactivatedDriverById(access_token,driver_id_or_external_id)
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
  Fleet.getDispatchRouteById(access_token,route_id)
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
  Fleet.getDispatchRouteHistory(access_token,route_id,start_time,end_time)
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
  Fleet.getDispatchRoutesByDriverId(access_token,driver_id,end_time,duration)
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
  Fleet.getDispatchRoutesByVehicleId(access_token,vehicle_id,end_time,duration)
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
  Fleet.getDriverById(access_token,driver_id_or_external_id)
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
  var access_token = req.swagger.params['access_token'].value;
  var endMs = req.swagger.params['endMs'].value;
  var durationMs = req.swagger.params['durationMs'].value;
  Fleet.getDriverDocumentsByOrgId(access_token,endMs,durationMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDriverSafetyScore = function getDriverSafetyScore (req, res, next) {
  var driverId = req.swagger.params['driverId'].value;
  var access_token = req.swagger.params['access_token'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Fleet.getDriverSafetyScore(driverId,access_token,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getFleetVehicle = function getFleetVehicle (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var vehicle_id_or_external_id = req.swagger.params['vehicle_id_or_external_id'].value;
  Fleet.getFleetVehicle(access_token,vehicle_id_or_external_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getOrganizationAddress = function getOrganizationAddress (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var addressId = req.swagger.params['addressId'].value;
  Fleet.getOrganizationAddress(access_token,addressId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getOrganizationAddresses = function getOrganizationAddresses (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  Fleet.getOrganizationAddresses(access_token)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getOrganizationContact = function getOrganizationContact (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var contact_id = req.swagger.params['contact_id'].value;
  Fleet.getOrganizationContact(access_token,contact_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getVehicleHarshEvent = function getVehicleHarshEvent (req, res, next) {
  var vehicleId = req.swagger.params['vehicleId'].value;
  var access_token = req.swagger.params['access_token'].value;
  var timestamp = req.swagger.params['timestamp'].value;
  Fleet.getVehicleHarshEvent(vehicleId,access_token,timestamp)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getVehicleLocations = function getVehicleLocations (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var vehicle_id = req.swagger.params['vehicle_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Fleet.getVehicleLocations(access_token,vehicle_id,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getVehicleSafetyScore = function getVehicleSafetyScore (req, res, next) {
  var vehicleId = req.swagger.params['vehicleId'].value;
  var access_token = req.swagger.params['access_token'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Fleet.getVehicleSafetyScore(vehicleId,access_token,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getVehicleStats = function getVehicleStats (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  var series = req.swagger.params['series'].value;
  var tagIds = req.swagger.params['tagIds'].value;
  var startingAfter = req.swagger.params['startingAfter'].value;
  var endingBefore = req.swagger.params['endingBefore'].value;
  var limit = req.swagger.params['limit'].value;
  Fleet.getVehicleStats(access_token,startMs,endMs,series,tagIds,startingAfter,endingBefore,limit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getVehiclesLocations = function getVehiclesLocations (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Fleet.getVehiclesLocations(access_token,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_dvirs = function get_dvirs (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var end_ms = req.swagger.params['end_ms'].value;
  var duration_ms = req.swagger.params['duration_ms'].value;
  var group_id = req.swagger.params['group_id'].value;
  Fleet.get_dvirs(access_token,end_ms,duration_ms,group_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_drivers = function get_fleet_drivers (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var groupDriversParam = req.swagger.params['groupDriversParam'].value;
  Fleet.get_fleet_drivers(access_token,groupDriversParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_drivers_hos_daily_logs = function get_fleet_drivers_hos_daily_logs (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var driver_id = req.swagger.params['driver_id'].value;
  var hosLogsParam = req.swagger.params['hosLogsParam'].value;
  Fleet.get_fleet_drivers_hos_daily_logs(access_token,driver_id,hosLogsParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_drivers_summary = function get_fleet_drivers_summary (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var driversSummaryParam = req.swagger.params['driversSummaryParam'].value;
  var snap_to_day_bounds = req.swagger.params['snap_to_day_bounds'].value;
  Fleet.get_fleet_drivers_summary(access_token,driversSummaryParam,snap_to_day_bounds)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_hos_authentication_logs = function get_fleet_hos_authentication_logs (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var hosAuthenticationLogsParam = req.swagger.params['hosAuthenticationLogsParam'].value;
  Fleet.get_fleet_hos_authentication_logs(access_token,hosAuthenticationLogsParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_hos_logs = function get_fleet_hos_logs (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var hosLogsParam = req.swagger.params['hosLogsParam'].value;
  Fleet.get_fleet_hos_logs(access_token,hosLogsParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_hos_logs_summary = function get_fleet_hos_logs_summary (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var hosLogsParam = req.swagger.params['hosLogsParam'].value;
  Fleet.get_fleet_hos_logs_summary(access_token,hosLogsParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_locations = function get_fleet_locations (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var groupParam = req.swagger.params['groupParam'].value;
  Fleet.get_fleet_locations(access_token,groupParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_maintenance_list = function get_fleet_maintenance_list (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var groupParam = req.swagger.params['groupParam'].value;
  Fleet.get_fleet_maintenance_list(access_token,groupParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.get_fleet_trips = function get_fleet_trips (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var tripsParam = req.swagger.params['tripsParam'].value;
  Fleet.get_fleet_trips(access_token,tripsParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.listContacts = function listContacts (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  Fleet.listContacts(access_token)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.list_fleet = function list_fleet (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var groupParam = req.swagger.params['groupParam'].value;
  var startingAfter = req.swagger.params['startingAfter'].value;
  var endingBefore = req.swagger.params['endingBefore'].value;
  var limit = req.swagger.params['limit'].value;
  Fleet.list_fleet(access_token,groupParam,startingAfter,endingBefore,limit)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.patchFleetVehicle = function patchFleetVehicle (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var vehicle_id_or_external_id = req.swagger.params['vehicle_id_or_external_id'].value;
  var data = req.swagger.params['data'].value;
  Fleet.patchFleetVehicle(access_token,vehicle_id_or_external_id,data)
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
  Fleet.reactivateDriverById(access_token,driver_id_or_external_id,reactivateDriverParam)
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
  Fleet.updateDispatchRouteById(access_token,route_id,updateDispatchRouteParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.updateOrganizationAddress = function updateOrganizationAddress (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var address = req.swagger.params['address'].value;
  var addressId = req.swagger.params['addressId'].value;
  Fleet.updateOrganizationAddress(access_token,address,addressId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.update_vehicles = function update_vehicles (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var vehicleUpdateParam = req.swagger.params['vehicleUpdateParam'].value;
  Fleet.update_vehicles(access_token,vehicleUpdateParam)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
