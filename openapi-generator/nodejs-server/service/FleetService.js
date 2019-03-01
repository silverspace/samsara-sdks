'use strict';


/**
 * /addresses
 * Add one or more addresses to the organization
 *
 * accessUnderscoretoken String Samsara API access token.
 * addresses InlineObject 
 * returns List
 **/
exports.addOrganizationAddresses = function(accessUnderscoretoken,addresses) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "notes" : "Delivery site 1",
  "formattedAddress" : "350 Rhode Island St, San Francisco, CA",
  "geofence" : {
    "polygon" : {
      "vertices" : [ {
        "latitude" : 37.765363,
        "longitude" : -122.403098
      }, {
        "latitude" : 37.765363,
        "longitude" : -122.403098
      } ]
    },
    "circle" : {
      "latitude" : 37.765363,
      "radiusMeters" : 250,
      "longitude" : -122.403098
    }
  },
  "name" : "Samsara HQ",
  "id" : 123,
  "contacts" : [ {
    "firstName" : "Jane",
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "id" : 123,
    "email" : "jane.jones@yahoo.com"
  }, {
    "firstName" : "Jane",
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "id" : 123,
    "email" : "jane.jones@yahoo.com"
  } ],
  "tags" : [ {
    "name" : "Broken Vehicles",
    "id" : 12345
  }, {
    "name" : "Broken Vehicles",
    "id" : 12345
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/add_address
 * This method adds an address book entry to the specified group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * addressParam InlineObject2 
 * no response value expected for this operation
 **/
exports.add_fleet_address = function(accessUnderscoretoken,addressParam) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /fleet/dispatch/routes
 * Create a new dispatch route.
 *
 * accessUnderscoretoken String Samsara API access token.
 * createDispatchRouteParams DispatchRouteCreate 
 * returns DispatchRoute
 **/
exports.createDispatchRoute = function(accessUnderscoretoken,createDispatchRouteParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/create
 * Create a new driver.
 *
 * accessUnderscoretoken String Samsara API access token.
 * createDriverParam DriverForCreate Driver creation body
 * returns Driver
 **/
exports.createDriver = function(accessUnderscoretoken,createDriverParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
 * Create a new dispatch route for the driver with driver_id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreid Long ID of the driver with the associated routes.
 * createDispatchRouteParams DispatchRouteCreate 
 * returns DispatchRoute
 **/
exports.createDriverDispatchRoute = function(accessUnderscoretoken,driverUnderscoreid,createDispatchRouteParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/{driver_id:[0-9]+}/documents
 * Create a driver document for the given driver.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreid Long ID of the driver for whom the document is created.
 * createDocumentParams DocumentCreate To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
 * returns Document
 **/
exports.createDriverDocument = function(accessUnderscoretoken,driverUnderscoreid,createDocumentParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
 * Create a new dispatch route for the vehicle with vehicle_id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * vehicleUnderscoreid Long ID of the vehicle with the associated routes.
 * createDispatchRouteParams DispatchRouteCreate 
 * returns DispatchRoute
 **/
exports.createVehicleDispatchRoute = function(accessUnderscoretoken,vehicleUnderscoreid,createDispatchRouteParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/maintenance/dvirs
 * Create a new dvir, marking a vehicle or trailer safe or unsafe.
 *
 * accessUnderscoretoken String Samsara API access token.
 * createDvirParam InlineObject12 
 * returns DvirBase
 **/
exports.create_dvir = function(accessUnderscoretoken,createDvirParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "defectsNeedNotBeCorrected" : false,
  "defectsCorrected" : true,
  "vehicleCondition" : "SATISFACTORY",
  "inspectionType" : "pre trip",
  "trailerDefects" : [ {
    "comment" : "Air Compressor not working",
    "defectType" : "Air Compressor"
  }, {
    "comment" : "Air Compressor not working",
    "defectType" : "Air Compressor"
  } ],
  "mechanicOrAgentSignature" : {
    "mechanicUserId" : 14849,
    "driverId" : 2581,
    "name" : "John Smith",
    "signedAt" : 12535500000,
    "type" : "driver",
    "email" : "j.smith@yahoo.com",
    "username" : "jsmith"
  },
  "mechanicNotes" : "The vehicle is now safe.",
  "vehicle" : {
    "name" : "Storer's vehicle 19",
    "id" : 19
  },
  "authorSignature" : {
    "mechanicUserId" : 14849,
    "driverId" : 2581,
    "name" : "John Smith",
    "signedAt" : 12535500000,
    "type" : "driver",
    "email" : "j.smith@yahoo.com",
    "username" : "jsmith"
  },
  "odometerMiles" : 49912,
  "vehicleDefects" : [ {
    "comment" : "Air Compressor not working",
    "defectType" : "Air Compressor"
  }, {
    "comment" : "Air Compressor not working",
    "defectType" : "Air Compressor"
  } ],
  "nextDriverSignature" : {
    "driverId" : 2581,
    "name" : "John Smith",
    "signedAt" : 12535500000,
    "type" : "driver",
    "email" : "j.smith@yahoo.com",
    "username" : "jsmith"
  },
  "trailerName" : "Storer's Trailer 19",
  "id" : 19,
  "trailerId" : 19,
  "timeMs" : 1453449599999
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Deactivate a driver with the given id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * no response value expected for this operation
 **/
exports.deactivateDriver = function(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /fleet/dispatch/routes/{route_id:[0-9]+}/
 * Delete a dispatch route and its associated jobs.
 *
 * accessUnderscoretoken String Samsara API access token.
 * routeUnderscoreid Long ID of the dispatch route.
 * no response value expected for this operation
 **/
exports.deleteDispatchRouteById = function(accessUnderscoretoken,routeUnderscoreid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /addresses/{addressId}
 * Delete an address.
 *
 * accessUnderscoretoken String Samsara API access token.
 * addressId Long ID of the address/geofence
 * no response value expected for this operation
 **/
exports.deleteOrganizationAddress = function(accessUnderscoretoken,addressId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /fleet/dispatch/routes
 * Fetch all of the dispatch routes for the group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupUnderscoreid Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * endUnderscoretime Long Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
 * duration Long Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
 * returns List
 **/
exports.fetchAllDispatchRoutes = function(accessUnderscoretoken,groupUnderscoreid,endUnderscoretime,duration) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/dispatch/routes/job_updates
 * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupUnderscoreid Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * sequenceUnderscoreid String Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
 * include String Optionally set include=route to include route object in response payload. (optional)
 * returns allRouteJobUpdates
 **/
exports.fetchAllRouteJobUpdates = function(accessUnderscoretoken,groupUnderscoreid,sequenceUnderscoreid,include) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sequence_id" : "eyJpZCI6MywiY3JlYXRlZF9hdCI6MTQ5OTQyOTIyMDAwMn0=",
  "job_updates" : [ {
    "changed_at_ms" : 1462881998034,
    "route_id" : 556,
    "job_id" : 773,
    "prev_job_state" : "JobState_EnRoute",
    "job_state" : "JobState_Arrived"
  }, {
    "changed_at_ms" : 1462881998034,
    "route_id" : 556,
    "job_id" : 773,
    "prev_job_state" : "JobState_EnRoute",
    "job_state" : "JobState_Arrived"
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/assets/locations
 * Fetch current locations of all assets for the group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupUnderscoreid Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * returns inline_response_200_1
 **/
exports.getAllAssetCurrentLocations = function(accessUnderscoretoken,groupUnderscoreid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "assets" : [ {
    "engineHours" : 104,
    "name" : "Trailer 123",
    "location" : [ {
      "latitude" : 37.0,
      "speedMilesPerHour" : 35.0,
      "location" : "525 York, San Francisco, CA",
      "longitude" : -122.7,
      "timeMs" : 12314151
    }, {
      "latitude" : 37.0,
      "speedMilesPerHour" : 35.0,
      "location" : "525 York, San Francisco, CA",
      "longitude" : -122.7,
      "timeMs" : 12314151
    } ],
    "id" : 1,
    "cable" : [ {
      "assetType" : "Reefer (Thermo King)"
    }, {
      "assetType" : "Reefer (Thermo King)"
    } ]
  }, {
    "engineHours" : 104,
    "name" : "Trailer 123",
    "location" : [ {
      "latitude" : 37.0,
      "speedMilesPerHour" : 35.0,
      "location" : "525 York, San Francisco, CA",
      "longitude" : -122.7,
      "timeMs" : 12314151
    }, {
      "latitude" : 37.0,
      "speedMilesPerHour" : 35.0,
      "location" : "525 York, San Francisco, CA",
      "longitude" : -122.7,
      "timeMs" : 12314151
    } ],
    "id" : 1,
    "cable" : [ {
      "assetType" : "Reefer (Thermo King)"
    }, {
      "assetType" : "Reefer (Thermo King)"
    } ]
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/assets
 * Fetch all of the assets for the group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupUnderscoreid Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * returns inline_response_200
 **/
exports.getAllAssets = function(accessUnderscoretoken,groupUnderscoreid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "assets" : [ {
    "assetSerialNumber" : "SNTEST123",
    "engineHours" : 104,
    "name" : "Trailer 123",
    "id" : 1,
    "cable" : [ {
      "assetType" : "Reefer (Thermo King)"
    }, {
      "assetType" : "Reefer (Thermo King)"
    } ]
  }, {
    "assetSerialNumber" : "SNTEST123",
    "engineHours" : 104,
    "name" : "Trailer 123",
    "id" : 1,
    "cable" : [ {
      "assetType" : "Reefer (Thermo King)"
    }, {
      "assetType" : "Reefer (Thermo King)"
    } ]
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/inactive
 * Fetch all deactivated drivers for the group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupUnderscoreid Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * returns List
 **/
exports.getAllDeactivatedDrivers = function(accessUnderscoretoken,groupUnderscoreid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/assets/{assetId:[0-9]+}/locations
 * Fetch the historical locations for the asset.
 *
 * accessUnderscoretoken String Samsara API access token.
 * assetUnderscoreid Long ID of the asset
 * startMs Long Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
 * endMs Long Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
 * returns List
 **/
exports.getAssetLocation = function(accessUnderscoretoken,assetUnderscoreid,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "{}";
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/assets/{assetId:[0-9]+}/reefer
 * Fetch the reefer-specific stats of an asset.
 *
 * accessUnderscoretoken String Samsara API access token.
 * assetUnderscoreid Long ID of the asset
 * startMs Long Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
 * endMs Long Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
 * returns AssetReeferResponse
 **/
exports.getAssetReefer = function(accessUnderscoretoken,assetUnderscoreid,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "reeferStats" : {
    "fuelPercentage" : [ {
      "fuelPercentage" : 99,
      "changedAtMs" : 1453449599999
    }, {
      "fuelPercentage" : 99,
      "changedAtMs" : 1453449599999
    } ],
    "powerStatus" : [ {
      "changedAtMs" : 1453449599999,
      "status" : "Active (Continuous)"
    }, {
      "changedAtMs" : 1453449599999,
      "status" : "Active (Continuous)"
    } ],
    "engineHours" : [ {
      "engineHours" : 1200,
      "changedAtMs" : 1453449599999
    }, {
      "engineHours" : 1200,
      "changedAtMs" : 1453449599999
    } ],
    "setPoint" : [ {
      "tempInMilliC" : 31110,
      "changedAtMs" : 1453449599999
    }, {
      "tempInMilliC" : 31110,
      "changedAtMs" : 1453449599999
    } ],
    "returnAirTemp" : [ {
      "tempInMilliC" : 31110,
      "changedAtMs" : 1453449599999
    }, {
      "tempInMilliC" : 31110,
      "changedAtMs" : 1453449599999
    } ],
    "alarms" : [ {
      "alarms" : [ {
        "severity" : 1,
        "operatorAction" : "Check and repair at end of trip",
        "description" : "Check Return Air Sensor",
        "alarmCode" : 102
      }, {
        "severity" : 1,
        "operatorAction" : "Check and repair at end of trip",
        "description" : "Check Return Air Sensor",
        "alarmCode" : 102
      } ],
      "changedAtMs" : 1453449599999
    }, {
      "alarms" : [ {
        "severity" : 1,
        "operatorAction" : "Check and repair at end of trip",
        "description" : "Check Return Air Sensor",
        "alarmCode" : 102
      }, {
        "severity" : 1,
        "operatorAction" : "Check and repair at end of trip",
        "description" : "Check Return Air Sensor",
        "alarmCode" : 102
      } ],
      "changedAtMs" : 1453449599999
    } ]
  },
  "name" : "Reefer 123",
  "id" : 1,
  "assetType" : "Reefer (Thermo King)"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Fetch deactivated driver by id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * returns Driver
 **/
exports.getDeactivatedDriverById = function(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/dispatch/routes/{route_id:[0-9]+}
 * Fetch a dispatch route by id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * routeUnderscoreid Long ID of the dispatch route.
 * returns DispatchRoute
 **/
exports.getDispatchRouteById = function(accessUnderscoretoken,routeUnderscoreid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/dispatch/routes/{route_id:[0-9]+}/history
 * Fetch the history of a dispatch route.
 *
 * accessUnderscoretoken String Samsara API access token.
 * routeUnderscoreid Long ID of the route with history.
 * startUnderscoretime Long Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
 * endUnderscoretime Long Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
 * returns DispatchRouteHistory
 **/
exports.getDispatchRouteHistory = function(accessUnderscoretoken,routeUnderscoreid,startUnderscoretime,endUnderscoretime) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "history" : [ {
    "changed_at_ms" : 1499411220000
  }, {
    "changed_at_ms" : 1499411220000
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
 * Fetch all of the dispatch routes for a given driver.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreid Long ID of the driver with the associated routes.
 * endUnderscoretime Long Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
 * duration Long Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
 * returns List
 **/
exports.getDispatchRoutesByDriverId = function(accessUnderscoretoken,driverUnderscoreid,endUnderscoretime,duration) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
 * Fetch all of the dispatch routes for a given vehicle.
 *
 * accessUnderscoretoken String Samsara API access token.
 * vehicleUnderscoreid Long ID of the vehicle with the associated routes.
 * endUnderscoretime Long Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
 * duration Long Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
 * returns List
 **/
exports.getDispatchRoutesByVehicleId = function(accessUnderscoretoken,vehicleUnderscoreid,endUnderscoretime,duration) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Fetch driver by id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * returns Driver
 **/
exports.getDriverById = function(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/document_types
 * Fetch all of the document types.
 *
 * returns List
 **/
exports.getDriverDocumentTypesByOrgId = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "fieldTypes" : [ null, null ],
  "name" : "Fuel Receipt",
  "uuid" : "4aff772c-a7bb-45e6-8e41-6a53e34feb83",
  "orgId" : 773
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/documents
 * Fetch all of the documents.
 *
 * accessUnderscoretoken String Samsara API access token.
 * endMs Long Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
 * durationMs Long Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
 * returns List
 **/
exports.getDriverDocumentsByOrgId = function(accessUnderscoretoken,endMs,durationMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/{driverId:[0-9]+}/safety/score
 * Fetch the safety score for the driver.
 *
 * driverId Long ID of the driver
 * accessUnderscoretoken String Samsara API access token.
 * startMs Long Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
 * endMs Long Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
 * returns DriverSafetyScoreResponse
 **/
exports.getDriverSafetyScore = function(driverId,accessUnderscoretoken,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "crashCount" : 0,
  "driverId" : 1234,
  "harshAccelCount" : 1,
  "harshEvents" : [ {
    "harshEventType" : "Harsh Braking",
    "vehicleId" : 212014918086169,
    "timestampMs" : 1535590776000
  }, {
    "harshEventType" : "Harsh Braking",
    "vehicleId" : 212014918086169,
    "timestampMs" : 1535590776000
  } ],
  "totalDistanceDrivenMeters" : 291836,
  "safetyScore" : 97,
  "totalHarshEventCount" : 3,
  "totalTimeDrivenMs" : 19708293,
  "harshTurningCount" : 0,
  "timeOverSpeedLimitMs" : 3769,
  "harshBrakingCount" : 2,
  "safetyScoreRank" : "26"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Gets a specific vehicle.
 *
 * accessUnderscoretoken String Samsara API access token.
 * vehicleUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid String ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
 * returns FleetVehicleResponse
 **/
exports.getFleetVehicle = function(accessUnderscoretoken,vehicleUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "harshAccelSetting" : "Heavy",
  "externalIds" : {
    "maintenanceId" : "ABFS18600"
  },
  "name" : "Truck A7",
  "vehicleInfo" : {
    "year" : 1997,
    "model" : "Odyssey",
    "vin" : "1FUJA6BD31LJ09646",
    "make" : "Honda"
  },
  "id" : 112
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /addresses/{addressId}
 * Fetch an address by its id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * addressId Long ID of the address/geofence
 * returns Address
 **/
exports.getOrganizationAddress = function(accessUnderscoretoken,addressId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "notes" : "Delivery site 1",
  "formattedAddress" : "350 Rhode Island St, San Francisco, CA",
  "geofence" : {
    "polygon" : {
      "vertices" : [ {
        "latitude" : 37.765363,
        "longitude" : -122.403098
      }, {
        "latitude" : 37.765363,
        "longitude" : -122.403098
      } ]
    },
    "circle" : {
      "latitude" : 37.765363,
      "radiusMeters" : 250,
      "longitude" : -122.403098
    }
  },
  "name" : "Samsara HQ",
  "id" : 123,
  "contacts" : [ {
    "firstName" : "Jane",
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "id" : 123,
    "email" : "jane.jones@yahoo.com"
  }, {
    "firstName" : "Jane",
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "id" : 123,
    "email" : "jane.jones@yahoo.com"
  } ],
  "tags" : [ {
    "name" : "Broken Vehicles",
    "id" : 12345
  }, {
    "name" : "Broken Vehicles",
    "id" : 12345
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /addresses
 * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
 *
 * accessUnderscoretoken String Samsara API access token.
 * returns List
 **/
exports.getOrganizationAddresses = function(accessUnderscoretoken) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "notes" : "Delivery site 1",
  "formattedAddress" : "350 Rhode Island St, San Francisco, CA",
  "geofence" : {
    "polygon" : {
      "vertices" : [ {
        "latitude" : 37.765363,
        "longitude" : -122.403098
      }, {
        "latitude" : 37.765363,
        "longitude" : -122.403098
      } ]
    },
    "circle" : {
      "latitude" : 37.765363,
      "radiusMeters" : 250,
      "longitude" : -122.403098
    }
  },
  "name" : "Samsara HQ",
  "id" : 123,
  "contacts" : [ {
    "firstName" : "Jane",
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "id" : 123,
    "email" : "jane.jones@yahoo.com"
  }, {
    "firstName" : "Jane",
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "id" : 123,
    "email" : "jane.jones@yahoo.com"
  } ],
  "tags" : [ {
    "name" : "Broken Vehicles",
    "id" : 12345
  }, {
    "name" : "Broken Vehicles",
    "id" : 12345
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /contacts/{contact_id}
 * Fetch a contact by its id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * contactUnderscoreid Long ID of the contact
 * returns Contact
 **/
exports.getOrganizationContact = function(accessUnderscoretoken,contactUnderscoreid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "firstName" : "Jane",
  "lastName" : "Jones",
  "phone" : "111-222-3344",
  "id" : 123,
  "email" : "jane.jones@yahoo.com"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
 * Fetch harsh event details for a vehicle.
 *
 * vehicleId Long ID of the vehicle
 * accessUnderscoretoken String Samsara API access token.
 * timestamp Long Timestamp in milliseconds representing the timestamp of a harsh event.
 * returns VehicleHarshEventResponse
 **/
exports.getVehicleHarshEvent = function(vehicleId,accessUnderscoretoken,timestamp) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "downloadForwardVideoUrl" : "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-123456789.mp4?...",
  "downloadInwardVideoUrl" : "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.mp4?...",
  "incidentReportUrl" : "https://cloud.samsara.com/groups/1234/fleet/reports/safety/vehicle/212123456789012/incident/1539201882984",
  "harshEventType" : "Harsh Braking",
  "location" : {
    "address" : "350 Rhode Island St, San Francisco, CA",
    "latitude" : "33.07614328",
    "longitude" : "-96.14907287"
  },
  "downloadTrackedInwardVideoUrl" : "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.tracked.mp4?...",
  "isDistracted" : true
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
 * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
 *
 * accessUnderscoretoken String Samsara API access token.
 * vehicleUnderscoreid Long ID of the vehicle with the associated routes.
 * startMs Long Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
 * endMs Long Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
 * returns List
 **/
exports.getVehicleLocations = function(accessUnderscoretoken,vehicleUnderscoreid,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "latitude" : 37.2,
  "speedMilesPerHour" : 35.2,
  "location" : "525 York, San Francisco, CA",
  "longitude" : -122.5,
  "timeMs" : 1535586471332
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
 * Fetch the safety score for the vehicle.
 *
 * vehicleId Long ID of the vehicle
 * accessUnderscoretoken String Samsara API access token.
 * startMs Long Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
 * endMs Long Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
 * returns VehicleSafetyScoreResponse
 **/
exports.getVehicleSafetyScore = function(vehicleId,accessUnderscoretoken,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "crashCount" : 0,
  "harshAccelCount" : 1,
  "harshEvents" : [ {
    "harshEventType" : "Harsh Braking",
    "vehicleId" : 212014918086169,
    "timestampMs" : 1535590776000
  }, {
    "harshEventType" : "Harsh Braking",
    "vehicleId" : 212014918086169,
    "timestampMs" : 1535590776000
  } ],
  "totalDistanceDrivenMeters" : 291836,
  "safetyScore" : 97,
  "totalHarshEventCount" : 3,
  "totalTimeDrivenMs" : 19708293,
  "vehicleId" : 4321,
  "harshTurningCount" : 0,
  "timeOverSpeedLimitMs" : 3769,
  "harshBrakingCount" : 2,
  "safetyScoreRank" : "26"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/vehicles/stats
 * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
 *
 * accessUnderscoretoken String Samsara API access token.
 * startMs Integer Time in Unix epoch milliseconds for the start of the query.
 * endMs Integer Time in Unix epoch milliseconds for the end of the query.
 * series String Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2 (optional)
 * tagIds String Comma-separated list of tag ids. Example: tagIds=1,2,3 (optional)
 * startingAfter String Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. (optional)
 * endingBefore String Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. (optional)
 * limit Long Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. (optional)
 * returns inline_response_200_5
 **/
exports.getVehicleStats = function(accessUnderscoretoken,startMs,endMs,series,tagIds,startingAfter,endingBefore,limit) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "pagination" : {
    "hasPrevPage" : true,
    "hasNextPage" : true,
    "endCursor" : "MTU5MTEzNjA2OTU0MzQ3",
    "startCursor" : "MTU5MTEzNjA2OTU0MzQ3"
  },
  "vehicleStats" : [ {
    "engineState" : [ {
      "value" : "Running",
      "timeMs" : 1546542978484
    }, {
      "value" : "Running",
      "timeMs" : 1546542978484
    } ],
    "auxInput2" : {
      "values" : [ {
        "value" : true,
        "timeMs" : 1546542978484
      }, {
        "value" : true,
        "timeMs" : 1546542978484
      } ],
      "name" : "Boom"
    },
    "vehicleId" : 112,
    "auxInput1" : {
      "values" : [ {
        "value" : true,
        "timeMs" : 1546542978484
      }, {
        "value" : true,
        "timeMs" : 1546542978484
      } ],
      "name" : "Boom"
    }
  }, {
    "engineState" : [ {
      "value" : "Running",
      "timeMs" : 1546542978484
    }, {
      "value" : "Running",
      "timeMs" : 1546542978484
    } ],
    "auxInput2" : {
      "values" : [ {
        "value" : true,
        "timeMs" : 1546542978484
      }, {
        "value" : true,
        "timeMs" : 1546542978484
      } ],
      "name" : "Boom"
    },
    "vehicleId" : 112,
    "auxInput1" : {
      "values" : [ {
        "value" : true,
        "timeMs" : 1546542978484
      }, {
        "value" : true,
        "timeMs" : 1546542978484
      } ],
      "name" : "Boom"
    }
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/vehicles/locations
 * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
 *
 * accessUnderscoretoken String Samsara API access token.
 * startMs Integer Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
 * endMs Integer Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
 * returns List
 **/
exports.getVehiclesLocations = function(accessUnderscoretoken,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "{}";
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/maintenance/dvirs
 * Get DVIRs for the org within provided time constraints
 *
 * accessUnderscoretoken String Samsara API access token.
 * endUnderscorems Integer time in millis until the last dvir log.
 * durationUnderscorems Integer time in millis which corresponds to the duration before the end_ms.
 * groupUnderscoreid Integer Group ID to query. (optional)
 * returns DvirListResponse
 **/
exports.get_dvirs = function(accessUnderscoretoken,endUnderscorems,durationUnderscorems,groupUnderscoreid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "dvirs" : [ {
    "defectsNeedNotBeCorrected" : false,
    "defectsCorrected" : true,
    "vehicleCondition" : "SATISFACTORY",
    "inspectionType" : "pre trip",
    "trailerDefects" : [ {
      "comment" : "Air Compressor not working",
      "defectType" : "Air Compressor"
    }, {
      "comment" : "Air Compressor not working",
      "defectType" : "Air Compressor"
    } ],
    "mechanicOrAgentSignature" : {
      "mechanicUserId" : 14849,
      "driverId" : 2581,
      "name" : "John Smith",
      "signedAt" : 12535500000,
      "type" : "driver",
      "email" : "j.smith@yahoo.com",
      "username" : "jsmith"
    },
    "mechanicNotes" : "The vehicle is now safe.",
    "vehicle" : {
      "name" : "Storer's vehicle 19",
      "id" : 19
    },
    "authorSignature" : {
      "mechanicUserId" : 14849,
      "driverId" : 2581,
      "name" : "John Smith",
      "signedAt" : 12535500000,
      "type" : "driver",
      "email" : "j.smith@yahoo.com",
      "username" : "jsmith"
    },
    "odometerMiles" : 49912,
    "vehicleDefects" : [ {
      "comment" : "Air Compressor not working",
      "defectType" : "Air Compressor"
    }, {
      "comment" : "Air Compressor not working",
      "defectType" : "Air Compressor"
    } ],
    "nextDriverSignature" : {
      "driverId" : 2581,
      "name" : "John Smith",
      "signedAt" : 12535500000,
      "type" : "driver",
      "email" : "j.smith@yahoo.com",
      "username" : "jsmith"
    },
    "trailerName" : "Storer's Trailer 19",
    "id" : 19,
    "trailerId" : 19,
    "timeMs" : 1453449599999
  }, {
    "defectsNeedNotBeCorrected" : false,
    "defectsCorrected" : true,
    "vehicleCondition" : "SATISFACTORY",
    "inspectionType" : "pre trip",
    "trailerDefects" : [ {
      "comment" : "Air Compressor not working",
      "defectType" : "Air Compressor"
    }, {
      "comment" : "Air Compressor not working",
      "defectType" : "Air Compressor"
    } ],
    "mechanicOrAgentSignature" : {
      "mechanicUserId" : 14849,
      "driverId" : 2581,
      "name" : "John Smith",
      "signedAt" : 12535500000,
      "type" : "driver",
      "email" : "j.smith@yahoo.com",
      "username" : "jsmith"
    },
    "mechanicNotes" : "The vehicle is now safe.",
    "vehicle" : {
      "name" : "Storer's vehicle 19",
      "id" : 19
    },
    "authorSignature" : {
      "mechanicUserId" : 14849,
      "driverId" : 2581,
      "name" : "John Smith",
      "signedAt" : 12535500000,
      "type" : "driver",
      "email" : "j.smith@yahoo.com",
      "username" : "jsmith"
    },
    "odometerMiles" : 49912,
    "vehicleDefects" : [ {
      "comment" : "Air Compressor not working",
      "defectType" : "Air Compressor"
    }, {
      "comment" : "Air Compressor not working",
      "defectType" : "Air Compressor"
    } ],
    "nextDriverSignature" : {
      "driverId" : 2581,
      "name" : "John Smith",
      "signedAt" : 12535500000,
      "type" : "driver",
      "email" : "j.smith@yahoo.com",
      "username" : "jsmith"
    },
    "trailerName" : "Storer's Trailer 19",
    "id" : 19,
    "trailerId" : 19,
    "timeMs" : 1453449599999
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers
 * Get all the drivers for the specified group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupDriversParam InlineObject3 
 * returns DriversResponse
 **/
exports.get_fleet_drivers = function(accessUnderscoretoken,groupDriversParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "drivers" : [ null, null ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
 * Get summarized daily HOS charts for a specified driver.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreid Long ID of the driver with HOS logs.
 * hosLogsParam InlineObject6 
 * returns DriverDailyLogResponse
 **/
exports.get_fleet_drivers_hos_daily_logs = function(accessUnderscoretoken,driverUnderscoreid,hosLogsParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "days" : [ {
    "certifiedAtMs" : 0,
    "endMs" : 1473836400000,
    "startMs" : 1473750000000,
    "trailerIds" : [ 10293, 192933 ],
    "activeHours" : 5.4,
    "distanceMiles" : 123.24,
    "activeMs" : 691200,
    "certified" : true,
    "vehicleIds" : [ 192319, 12958 ]
  }, {
    "certifiedAtMs" : 0,
    "endMs" : 1473836400000,
    "startMs" : 1473750000000,
    "trailerIds" : [ 10293, 192933 ],
    "activeHours" : 5.4,
    "distanceMiles" : 123.24,
    "activeMs" : 691200,
    "certified" : true,
    "vehicleIds" : [ 192319, 12958 ]
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/summary
 * Get the distance and time each driver in an organization has driven in a given time period.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driversSummaryParam InlineObject5 
 * snapUnderscoretoUnderscoredayUnderscorebounds Boolean Snap query result to HOS day boundaries. (optional)
 * returns DriversSummaryResponse
 **/
exports.get_fleet_drivers_summary = function(accessUnderscoretoken,driversSummaryParam,snapUnderscoretoUnderscoredayUnderscorebounds) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "Summaries" : [ {
    "driverId" : 444,
    "distanceMiles" : 123.24,
    "driveMs" : 21600000,
    "activeMs" : 43200000,
    "driverUsername" : "fjacobs",
    "groupId" : 111,
    "driverName" : "Fred Jacobs",
    "onDutyMs" : 21600000
  }, {
    "driverId" : 444,
    "distanceMiles" : 123.24,
    "driveMs" : 21600000,
    "activeMs" : 43200000,
    "driverUsername" : "fjacobs",
    "groupId" : 111,
    "driverName" : "Fred Jacobs",
    "onDutyMs" : 21600000
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/hos_authentication_logs
 * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
 *
 * accessUnderscoretoken String Samsara API access token.
 * hosAuthenticationLogsParam InlineObject7 
 * returns HosAuthenticationLogsResponse
 **/
exports.get_fleet_hos_authentication_logs = function(accessUnderscoretoken,hosAuthenticationLogsParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "authenticationLogs" : [ {
    "actionType" : "signin",
    "address" : "123 Main St., Ahwatukee, Arizona 85044",
    "city" : "Ahwatukee",
    "happenedAtMs" : 1462881998034,
    "addressName" : "Garage Number 3",
    "state" : "Arizona"
  }, {
    "actionType" : "signin",
    "address" : "123 Main St., Ahwatukee, Arizona 85044",
    "city" : "Ahwatukee",
    "happenedAtMs" : 1462881998034,
    "addressName" : "Garage Number 3",
    "state" : "Arizona"
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/hos_logs
 * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
 *
 * accessUnderscoretoken String Samsara API access token.
 * hosLogsParam InlineObject8 
 * returns HosLogsResponse
 **/
exports.get_fleet_hos_logs = function(accessUnderscoretoken,hosLogsParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "logs" : [ {
    "locLng" : -98.502888123,
    "logStartMs" : 1462881998034,
    "driverId" : 444,
    "statusType" : "OFF_DUTY",
    "locCity" : "Ahwatukee",
    "groupId" : 101,
    "locName" : "McLean Site A",
    "locLat" : 23.413702345,
    "remark" : "Lunch Break",
    "locState" : "Arizona",
    "vehicleId" : 112,
    "codriverIds" : [ 445, 445 ]
  }, {
    "locLng" : -98.502888123,
    "logStartMs" : 1462881998034,
    "driverId" : 444,
    "statusType" : "OFF_DUTY",
    "locCity" : "Ahwatukee",
    "groupId" : 101,
    "locName" : "McLean Site A",
    "locLat" : 23.413702345,
    "remark" : "Lunch Break",
    "locState" : "Arizona",
    "vehicleId" : 112,
    "codriverIds" : [ 445, 445 ]
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/hos_logs_summary
 * Get the current HOS status for all drivers in the group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * hosLogsParam InlineObject9 
 * returns HosLogsSummaryResponse
 **/
exports.get_fleet_hos_logs_summary = function(accessUnderscoretoken,hosLogsParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "drivers" : [ {
    "timeUntilBreak" : 28800000,
    "vehicleName" : "Vehicle 1",
    "drivingInViolationToday" : 39600000,
    "driverId" : 444,
    "cycleRemaining" : 252000000,
    "driverName" : "Fred Jacobs",
    "dutyStatus" : "OFF_DUTY",
    "cycleTomorrow" : 252000000,
    "shiftDriveRemaining" : 39600000,
    "timeInCurrentStatus" : 5000,
    "drivingInViolationCycle" : 50400000,
    "shiftRemaining" : 50400000
  }, {
    "timeUntilBreak" : 28800000,
    "vehicleName" : "Vehicle 1",
    "drivingInViolationToday" : 39600000,
    "driverId" : 444,
    "cycleRemaining" : 252000000,
    "driverName" : "Fred Jacobs",
    "dutyStatus" : "OFF_DUTY",
    "cycleTomorrow" : 252000000,
    "shiftDriveRemaining" : 39600000,
    "timeInCurrentStatus" : 5000,
    "drivingInViolationCycle" : 50400000,
    "shiftRemaining" : 50400000
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/locations
 * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupParam InlineObject11 
 * returns inline_response_200_3
 **/
exports.get_fleet_locations = function(accessUnderscoretoken,groupParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "groupId" : 101,
  "vehicles" : [ {
    "heading" : 246.42,
    "latitude" : 123.456,
    "name" : "Truck A7",
    "location" : "1 Main St, Dallas, TX",
    "odometerMeters" : 71774705,
    "vin" : "JTNBB46KX73011966",
    "id" : 112,
    "onTrip" : true,
    "time" : 1462881998034,
    "speed" : 64.37,
    "longitude" : 32.897
  }, {
    "heading" : 246.42,
    "latitude" : 123.456,
    "name" : "Truck A7",
    "location" : "1 Main St, Dallas, TX",
    "odometerMeters" : 71774705,
    "vin" : "JTNBB46KX73011966",
    "id" : 112,
    "onTrip" : true,
    "time" : 1462881998034,
    "speed" : 64.37,
    "longitude" : 32.897
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/maintenance/list
 * Get list of the vehicles with any engine faults or check light data.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupParam InlineObject13 
 * returns inline_response_200_4
 **/
exports.get_fleet_maintenance_list = function(accessUnderscoretoken,groupParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "vehicles" : [ {
    "j1939" : {
      "checkEngineLight" : {
        "protectIsOn" : true,
        "stopIsOn" : true,
        "warningIsOn" : true,
        "emissionsIsOn" : true
      },
      "diagnosticTroubleCodes" : [ {
        "spnDescription" : "spnDescription",
        "fmiText" : "fmiText",
        "spnId" : 0,
        "occurrenceCount" : 6,
        "txId" : 1,
        "fmiId" : 5
      }, {
        "spnDescription" : "spnDescription",
        "fmiText" : "fmiText",
        "spnId" : 0,
        "occurrenceCount" : 6,
        "txId" : 1,
        "fmiId" : 5
      } ]
    },
    "passenger" : {
      "checkEngineLight" : {
        "isOn" : true
      },
      "diagnosticTroubleCodes" : [ {
        "dtcShortCode" : "dtcShortCode",
        "dtcId" : 5,
        "dtcDescription" : "dtcDescription"
      }, {
        "dtcShortCode" : "dtcShortCode",
        "dtcId" : 5,
        "dtcDescription" : "dtcDescription"
      } ]
    },
    "id" : 112
  }, {
    "j1939" : {
      "checkEngineLight" : {
        "protectIsOn" : true,
        "stopIsOn" : true,
        "warningIsOn" : true,
        "emissionsIsOn" : true
      },
      "diagnosticTroubleCodes" : [ {
        "spnDescription" : "spnDescription",
        "fmiText" : "fmiText",
        "spnId" : 0,
        "occurrenceCount" : 6,
        "txId" : 1,
        "fmiId" : 5
      }, {
        "spnDescription" : "spnDescription",
        "fmiText" : "fmiText",
        "spnId" : 0,
        "occurrenceCount" : 6,
        "txId" : 1,
        "fmiId" : 5
      } ]
    },
    "passenger" : {
      "checkEngineLight" : {
        "isOn" : true
      },
      "diagnosticTroubleCodes" : [ {
        "dtcShortCode" : "dtcShortCode",
        "dtcId" : 5,
        "dtcDescription" : "dtcDescription"
      }, {
        "dtcShortCode" : "dtcShortCode",
        "dtcId" : 5,
        "dtcDescription" : "dtcDescription"
      } ]
    },
    "id" : 112
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/trips
 * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
 *
 * accessUnderscoretoken String Samsara API access token.
 * tripsParam InlineObject15 
 * returns TripResponse
 **/
exports.get_fleet_trips = function(accessUnderscoretoken,tripsParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "trips" : [ {
    "endOdometer" : 210430500,
    "distanceMeters" : 2500,
    "endMs" : 1462881998034,
    "startMs" : 1462878398034,
    "fuelConsumedMl" : 75700,
    "startAddress" : "Ramen Tatsunoya",
    "startCoordinates" : {
      "latitude" : 29.443702345,
      "longitude" : -98.502888123
    },
    "endCoordinates" : {
      "latitude" : 23.413702345,
      "longitude" : -91.502888123
    },
    "startOdometer" : 210430450,
    "driverId" : 719,
    "startLocation" : "16 N Fair Oaks Ave, Pasadena, CA 91103",
    "tollMeters" : 32000,
    "endAddress" : "Winchell's Donuts House",
    "endLocation" : "571 S Lake Ave, Pasadena, CA 91101"
  }, {
    "endOdometer" : 210430500,
    "distanceMeters" : 2500,
    "endMs" : 1462881998034,
    "startMs" : 1462878398034,
    "fuelConsumedMl" : 75700,
    "startAddress" : "Ramen Tatsunoya",
    "startCoordinates" : {
      "latitude" : 29.443702345,
      "longitude" : -98.502888123
    },
    "endCoordinates" : {
      "latitude" : 23.413702345,
      "longitude" : -91.502888123
    },
    "startOdometer" : 210430450,
    "driverId" : 719,
    "startLocation" : "16 N Fair Oaks Ave, Pasadena, CA 91103",
    "tollMeters" : 32000,
    "endAddress" : "Winchell's Donuts House",
    "endLocation" : "571 S Lake Ave, Pasadena, CA 91101"
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /contacts
 * Fetch all contacts for the organization.
 *
 * accessUnderscoretoken String Samsara API access token.
 * returns List
 **/
exports.listContacts = function(accessUnderscoretoken) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "firstName" : "Jane",
  "lastName" : "Jones",
  "phone" : "111-222-3344",
  "id" : 123,
  "email" : "jane.jones@yahoo.com"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/list
 * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupParam InlineObject10 
 * startingAfter String Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. (optional)
 * endingBefore String Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. (optional)
 * limit Long Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. (optional)
 * returns inline_response_200_2
 **/
exports.list_fleet = function(accessUnderscoretoken,groupParam,startingAfter,endingBefore,limit) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "pagination" : {
    "hasPrevPage" : true,
    "hasNextPage" : true,
    "endCursor" : "MTU5MTEzNjA2OTU0MzQ3",
    "startCursor" : "MTU5MTEzNjA2OTU0MzQ3"
  },
  "groupId" : 101,
  "vehicles" : [ {
    "note" : "Red truck 2015 M16",
    "engineHours" : 1500,
    "name" : "Truck A7",
    "fuelLevelPercent" : 0.3,
    "odometerMeters" : 60130000,
    "vin" : "1FUJA6BD31LJ09646",
    "id" : 112
  }, {
    "note" : "Red truck 2015 M16",
    "engineHours" : 1500,
    "name" : "Truck A7",
    "fuelLevelPercent" : 0.3,
    "odometerMeters" : 60130000,
    "vin" : "1FUJA6BD31LJ09646",
    "id" : 112
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
 *
 * accessUnderscoretoken String Samsara API access token.
 * vehicleUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid String ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
 * data InlineObject16 
 * returns FleetVehicleResponse
 **/
exports.patchFleetVehicle = function(accessUnderscoretoken,vehicleUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid,data) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "harshAccelSetting" : "Heavy",
  "externalIds" : {
    "maintenanceId" : "ABFS18600"
  },
  "name" : "Truck A7",
  "vehicleInfo" : {
    "year" : 1997,
    "model" : "Odyssey",
    "vin" : "1FUJA6BD31LJ09646",
    "make" : "Honda"
  },
  "id" : 112
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Reactivate the inactive driver having id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * reactivateDriverParam InlineObject4 
 * returns Driver
 **/
exports.reactivateDriverById = function(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid,reactivateDriverParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /fleet/dispatch/routes/{route_id:[0-9]+}/
 * Update a dispatch route and its associated jobs.
 *
 * accessUnderscoretoken String Samsara API access token.
 * routeUnderscoreid Long ID of the dispatch route.
 * updateDispatchRouteParams DispatchRoute 
 * returns DispatchRoute
 **/
exports.updateDispatchRouteById = function(accessUnderscoretoken,routeUnderscoreid,updateDispatchRouteParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /addresses/{addressId}
 * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
 *
 * accessUnderscoretoken String Samsara API access token.
 * addressId Long ID of the address/geofence
 * address InlineObject1 
 * no response value expected for this operation
 **/
exports.updateOrganizationAddress = function(accessUnderscoretoken,addressId,address) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /fleet/set_data
 * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
 *
 * accessUnderscoretoken String Samsara API access token.
 * vehicleUpdateParam InlineObject14 
 * no response value expected for this operation
 **/
exports.update_vehicles = function(accessUnderscoretoken,vehicleUpdateParam) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

