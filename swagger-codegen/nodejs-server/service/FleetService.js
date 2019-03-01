'use strict';


/**
 * /addresses
 * Add one or more addresses to the organization
 *
 * access_token String Samsara API access token.
 * addresses Addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of 'circle' or 'polygon' should be provided. If both are provided, the geofence will be saved as a polygon.
 * returns List
 **/
exports.addOrganizationAddresses = function(access_token,addresses) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "tags" : [ {
    "id" : 12345,
    "name" : "Broken Vehicles"
  }, {
    "id" : 12345,
    "name" : "Broken Vehicles"
  } ],
  "id" : 123,
  "geofence" : {
    "polygon" : {
      "vertices" : [ {
        "longitude" : -122.403098,
        "latitude" : 37.765363
      }, {
        "longitude" : -122.403098,
        "latitude" : 37.765363
      } ]
    },
    "circle" : {
      "radiusMeters" : 250,
      "longitude" : -122.403098,
      "latitude" : 37.765363
    }
  },
  "name" : "Samsara HQ",
  "formattedAddress" : "350 Rhode Island St, San Francisco, CA",
  "notes" : "Delivery site 1",
  "contacts" : [ {
    "id" : 123,
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "email" : "jane.jones@yahoo.com",
    "firstName" : "Jane"
  }, {
    "id" : 123,
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "email" : "jane.jones@yahoo.com",
    "firstName" : "Jane"
  } ]
}, {
  "tags" : [ {
    "id" : 12345,
    "name" : "Broken Vehicles"
  }, {
    "id" : 12345,
    "name" : "Broken Vehicles"
  } ],
  "id" : 123,
  "geofence" : {
    "polygon" : {
      "vertices" : [ {
        "longitude" : -122.403098,
        "latitude" : 37.765363
      }, {
        "longitude" : -122.403098,
        "latitude" : 37.765363
      } ]
    },
    "circle" : {
      "radiusMeters" : 250,
      "longitude" : -122.403098,
      "latitude" : 37.765363
    }
  },
  "name" : "Samsara HQ",
  "formattedAddress" : "350 Rhode Island St, San Francisco, CA",
  "notes" : "Delivery site 1",
  "contacts" : [ {
    "id" : 123,
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "email" : "jane.jones@yahoo.com",
    "firstName" : "Jane"
  }, {
    "id" : 123,
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "email" : "jane.jones@yahoo.com",
    "firstName" : "Jane"
  } ]
} ];
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
 * access_token String Samsara API access token.
 * addressParam AddressParam 
 * no response value expected for this operation
 **/
exports.add_fleet_address = function(access_token,addressParam) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /fleet/dispatch/routes
 * Create a new dispatch route.
 *
 * access_token String Samsara API access token.
 * createDispatchRouteParams DispatchRouteCreate 
 * returns DispatchRoute
 **/
exports.createDispatchRoute = function(access_token,createDispatchRouteParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * createDriverParam DriverForCreate Driver creation body
 * returns Driver
 **/
exports.createDriver = function(access_token,createDriverParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * driver_id Long ID of the driver with the associated routes.
 * createDispatchRouteParams DispatchRouteCreate 
 * returns DispatchRoute
 **/
exports.createDriverDispatchRoute = function(access_token,driver_id,createDispatchRouteParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * driver_id Long ID of the driver for whom the document is created.
 * createDocumentParams DocumentCreate To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
 * returns Document
 **/
exports.createDriverDocument = function(access_token,driver_id,createDocumentParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * vehicle_id Long ID of the vehicle with the associated routes.
 * createDispatchRouteParams DispatchRouteCreate 
 * returns DispatchRoute
 **/
exports.createVehicleDispatchRoute = function(access_token,vehicle_id,createDispatchRouteParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * createDvirParam CreateDvirParam DVIR creation body
 * returns DvirBase
 **/
exports.create_dvir = function(access_token,createDvirParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "vehicleDefects" : [ {
    "defectType" : "Air Compressor",
    "comment" : "Air Compressor not working"
  }, {
    "defectType" : "Air Compressor",
    "comment" : "Air Compressor not working"
  } ],
  "defectsNeedNotBeCorrected" : false,
  "authorSignature" : {
    "username" : "jsmith",
    "mechanicUserId" : 14849,
    "email" : "j.smith@yahoo.com",
    "signedAt" : 12535500000,
    "name" : "John Smith",
    "driverId" : 2581,
    "type" : "driver"
  },
  "inspectionType" : "pre trip",
  "odometerMiles" : 49912,
  "vehicle" : {
    "id" : 19,
    "name" : "Storer's vehicle 19"
  },
  "timeMs" : 1453449599999,
  "defectsCorrected" : true,
  "mechanicNotes" : "The vehicle is now safe.",
  "id" : 19,
  "nextDriverSignature" : {
    "username" : "jsmith",
    "email" : "j.smith@yahoo.com",
    "signedAt" : 12535500000,
    "name" : "John Smith",
    "driverId" : 2581,
    "type" : "driver"
  },
  "trailerName" : "Storer's Trailer 19",
  "vehicleCondition" : "SATISFACTORY",
  "mechanicOrAgentSignature" : {
    "username" : "jsmith",
    "mechanicUserId" : 14849,
    "email" : "j.smith@yahoo.com",
    "signedAt" : 12535500000,
    "name" : "John Smith",
    "driverId" : 2581,
    "type" : "driver"
  },
  "trailerDefects" : [ {
    "defectType" : "Air Compressor",
    "comment" : "Air Compressor not working"
  }, {
    "defectType" : "Air Compressor",
    "comment" : "Air Compressor not working"
  } ],
  "trailerId" : 19
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
 * access_token String Samsara API access token.
 * driver_id_or_external_id String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * no response value expected for this operation
 **/
exports.deactivateDriver = function(access_token,driver_id_or_external_id) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /fleet/dispatch/routes/{route_id:[0-9]+}/
 * Delete a dispatch route and its associated jobs.
 *
 * access_token String Samsara API access token.
 * route_id Long ID of the dispatch route.
 * no response value expected for this operation
 **/
exports.deleteDispatchRouteById = function(access_token,route_id) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /addresses/{addressId}
 * Delete an address.
 *
 * access_token String Samsara API access token.
 * addressId Long ID of the address/geofence
 * no response value expected for this operation
 **/
exports.deleteOrganizationAddress = function(access_token,addressId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /fleet/dispatch/routes
 * Fetch all of the dispatch routes for the group.
 *
 * access_token String Samsara API access token.
 * group_id Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * end_time Long Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
 * duration Long Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
 * returns DispatchRoutes
 **/
exports.fetchAllDispatchRoutes = function(access_token,group_id,end_time,duration) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * group_id Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * sequence_id String Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
 * include String Optionally set include=route to include route object in response payload. (optional)
 * returns allRouteJobUpdates
 **/
exports.fetchAllRouteJobUpdates = function(access_token,group_id,sequence_id,include) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "job_updates" : [ {
    "prev_job_state" : "JobState_EnRoute",
    "route_id" : 556,
    "route" : "",
    "changed_at_ms" : 1462881998034,
    "job_state" : "JobState_Arrived",
    "job_id" : 773
  }, {
    "prev_job_state" : "JobState_EnRoute",
    "route_id" : 556,
    "route" : "",
    "changed_at_ms" : 1462881998034,
    "job_state" : "JobState_Arrived",
    "job_id" : 773
  } ],
  "sequence_id" : "eyJpZCI6MywiY3JlYXRlZF9hdCI6MTQ5OTQyOTIyMDAwMn0="
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
 * access_token String Samsara API access token.
 * group_id Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * returns inline_response_200_1
 **/
exports.getAllAssetCurrentLocations = function(access_token,group_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "assets" : [ {
    "id" : 1,
    "engineHours" : 104,
    "location" : [ {
      "speedMilesPerHour" : 35.0,
      "location" : "525 York, San Francisco, CA",
      "longitude" : -122.7,
      "latitude" : 37.0,
      "timeMs" : 12314151
    }, {
      "speedMilesPerHour" : 35.0,
      "location" : "525 York, San Francisco, CA",
      "longitude" : -122.7,
      "latitude" : 37.0,
      "timeMs" : 12314151
    } ],
    "name" : "Trailer 123",
    "cable" : [ {
      "assetType" : "Reefer (Thermo King)"
    }, {
      "assetType" : "Reefer (Thermo King)"
    } ]
  }, {
    "id" : 1,
    "engineHours" : 104,
    "location" : [ {
      "speedMilesPerHour" : 35.0,
      "location" : "525 York, San Francisco, CA",
      "longitude" : -122.7,
      "latitude" : 37.0,
      "timeMs" : 12314151
    }, {
      "speedMilesPerHour" : 35.0,
      "location" : "525 York, San Francisco, CA",
      "longitude" : -122.7,
      "latitude" : 37.0,
      "timeMs" : 12314151
    } ],
    "name" : "Trailer 123",
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
 * access_token String Samsara API access token.
 * group_id Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * returns inline_response_200
 **/
exports.getAllAssets = function(access_token,group_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "assets" : [ {
    "id" : 1,
    "assetSerialNumber" : "SNTEST123",
    "engineHours" : 104,
    "name" : "Trailer 123",
    "cable" : [ {
      "assetType" : "Reefer (Thermo King)"
    }, {
      "assetType" : "Reefer (Thermo King)"
    } ]
  }, {
    "id" : 1,
    "assetSerialNumber" : "SNTEST123",
    "engineHours" : 104,
    "name" : "Trailer 123",
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
 * access_token String Samsara API access token.
 * group_id Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * returns List
 **/
exports.getAllDeactivatedDrivers = function(access_token,group_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ "", "" ];
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
 * access_token String Samsara API access token.
 * asset_id Long ID of the asset
 * startMs Long Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
 * endMs Long Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
 * returns AssetLocationResponse
 **/
exports.getAssetLocation = function(access_token,asset_id,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * asset_id Long ID of the asset
 * startMs Long Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
 * endMs Long Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
 * returns AssetReeferResponse
 **/
exports.getAssetReefer = function(access_token,asset_id,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "id" : 1,
  "reeferStats" : {
    "powerStatus" : [ {
      "status" : "Active (Continuous)",
      "changedAtMs" : 1453449599999
    }, {
      "status" : "Active (Continuous)",
      "changedAtMs" : 1453449599999
    } ],
    "engineHours" : [ {
      "engineHours" : 1200,
      "changedAtMs" : 1453449599999
    }, {
      "engineHours" : 1200,
      "changedAtMs" : 1453449599999
    } ],
    "returnAirTemp" : [ {
      "changedAtMs" : 1453449599999,
      "tempInMilliC" : 31110
    }, {
      "changedAtMs" : 1453449599999,
      "tempInMilliC" : 31110
    } ],
    "fuelPercentage" : [ {
      "fuelPercentage" : 99,
      "changedAtMs" : 1453449599999
    }, {
      "fuelPercentage" : 99,
      "changedAtMs" : 1453449599999
    } ],
    "setPoint" : [ {
      "changedAtMs" : 1453449599999,
      "tempInMilliC" : 31110
    }, {
      "changedAtMs" : 1453449599999,
      "tempInMilliC" : 31110
    } ],
    "alarms" : [ {
      "changedAtMs" : 1453449599999,
      "alarms" : [ {
        "description" : "Check Return Air Sensor",
        "severity" : 1,
        "operatorAction" : "Check and repair at end of trip",
        "alarmCode" : 102
      }, {
        "description" : "Check Return Air Sensor",
        "severity" : 1,
        "operatorAction" : "Check and repair at end of trip",
        "alarmCode" : 102
      } ]
    }, {
      "changedAtMs" : 1453449599999,
      "alarms" : [ {
        "description" : "Check Return Air Sensor",
        "severity" : 1,
        "operatorAction" : "Check and repair at end of trip",
        "alarmCode" : 102
      }, {
        "description" : "Check Return Air Sensor",
        "severity" : 1,
        "operatorAction" : "Check and repair at end of trip",
        "alarmCode" : 102
      } ]
    } ]
  },
  "assetType" : "Reefer (Thermo King)",
  "name" : "Reefer 123"
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
 * access_token String Samsara API access token.
 * driver_id_or_external_id String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * returns Driver
 **/
exports.getDeactivatedDriverById = function(access_token,driver_id_or_external_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * route_id Long ID of the dispatch route.
 * returns DispatchRoute
 **/
exports.getDispatchRouteById = function(access_token,route_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * route_id Long ID of the route with history.
 * start_time Long Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
 * end_time Long Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
 * returns DispatchRouteHistory
 **/
exports.getDispatchRouteHistory = function(access_token,route_id,start_time,end_time) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "history" : [ {
    "route" : "",
    "changed_at_ms" : 1499411220000
  }, {
    "route" : "",
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
 * access_token String Samsara API access token.
 * driver_id Long ID of the driver with the associated routes.
 * end_time Long Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
 * duration Long Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
 * returns DispatchRoutes
 **/
exports.getDispatchRoutesByDriverId = function(access_token,driver_id,end_time,duration) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * vehicle_id Long ID of the vehicle with the associated routes.
 * end_time Long Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
 * duration Long Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
 * returns DispatchRoutes
 **/
exports.getDispatchRoutesByVehicleId = function(access_token,vehicle_id,end_time,duration) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * driver_id_or_external_id String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * returns CurrentDriver
 **/
exports.getDriverById = function(access_token,driver_id_or_external_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * returns DocumentTypes
 **/
exports.getDriverDocumentTypesByOrgId = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * endMs Long Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
 * durationMs Long Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
 * returns Documents
 **/
exports.getDriverDocumentsByOrgId = function(access_token,endMs,durationMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * startMs Long Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
 * endMs Long Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
 * returns DriverSafetyScoreResponse
 **/
exports.getDriverSafetyScore = function(driverId,access_token,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "totalTimeDrivenMs" : 19708293,
  "timeOverSpeedLimitMs" : 3769,
  "harshBrakingCount" : 2,
  "harshEvents" : [ {
    "harshEventType" : "Harsh Braking",
    "vehicleId" : 212014918086169,
    "timestampMs" : 1535590776000
  }, {
    "harshEventType" : "Harsh Braking",
    "vehicleId" : 212014918086169,
    "timestampMs" : 1535590776000
  } ],
  "harshTurningCount" : 0,
  "totalHarshEventCount" : 3,
  "driverId" : 1234,
  "safetyScore" : 97,
  "crashCount" : 0,
  "harshAccelCount" : 1,
  "safetyScoreRank" : "26",
  "totalDistanceDrivenMeters" : 291836
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
 * access_token String Samsara API access token.
 * vehicle_id_or_external_id String ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
 * returns FleetVehicleResponse
 **/
exports.getFleetVehicle = function(access_token,vehicle_id_or_external_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "id" : 112,
  "externalIds" : {
    "maintenanceId" : "ABFS18600"
  },
  "harshAccelSetting" : "Heavy",
  "name" : "Truck A7",
  "vehicleInfo" : {
    "model" : "Odyssey",
    "vin" : "1FUJA6BD31LJ09646",
    "year" : 1997,
    "make" : "Honda"
  }
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
 * access_token String Samsara API access token.
 * addressId Long ID of the address/geofence
 * returns Address
 **/
exports.getOrganizationAddress = function(access_token,addressId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "tags" : [ {
    "id" : 12345,
    "name" : "Broken Vehicles"
  }, {
    "id" : 12345,
    "name" : "Broken Vehicles"
  } ],
  "id" : 123,
  "geofence" : {
    "polygon" : {
      "vertices" : [ {
        "longitude" : -122.403098,
        "latitude" : 37.765363
      }, {
        "longitude" : -122.403098,
        "latitude" : 37.765363
      } ]
    },
    "circle" : {
      "radiusMeters" : 250,
      "longitude" : -122.403098,
      "latitude" : 37.765363
    }
  },
  "name" : "Samsara HQ",
  "formattedAddress" : "350 Rhode Island St, San Francisco, CA",
  "notes" : "Delivery site 1",
  "contacts" : [ {
    "id" : 123,
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "email" : "jane.jones@yahoo.com",
    "firstName" : "Jane"
  }, {
    "id" : 123,
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "email" : "jane.jones@yahoo.com",
    "firstName" : "Jane"
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
 * access_token String Samsara API access token.
 * returns List
 **/
exports.getOrganizationAddresses = function(access_token) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "tags" : [ {
    "id" : 12345,
    "name" : "Broken Vehicles"
  }, {
    "id" : 12345,
    "name" : "Broken Vehicles"
  } ],
  "id" : 123,
  "geofence" : {
    "polygon" : {
      "vertices" : [ {
        "longitude" : -122.403098,
        "latitude" : 37.765363
      }, {
        "longitude" : -122.403098,
        "latitude" : 37.765363
      } ]
    },
    "circle" : {
      "radiusMeters" : 250,
      "longitude" : -122.403098,
      "latitude" : 37.765363
    }
  },
  "name" : "Samsara HQ",
  "formattedAddress" : "350 Rhode Island St, San Francisco, CA",
  "notes" : "Delivery site 1",
  "contacts" : [ {
    "id" : 123,
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "email" : "jane.jones@yahoo.com",
    "firstName" : "Jane"
  }, {
    "id" : 123,
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "email" : "jane.jones@yahoo.com",
    "firstName" : "Jane"
  } ]
}, {
  "tags" : [ {
    "id" : 12345,
    "name" : "Broken Vehicles"
  }, {
    "id" : 12345,
    "name" : "Broken Vehicles"
  } ],
  "id" : 123,
  "geofence" : {
    "polygon" : {
      "vertices" : [ {
        "longitude" : -122.403098,
        "latitude" : 37.765363
      }, {
        "longitude" : -122.403098,
        "latitude" : 37.765363
      } ]
    },
    "circle" : {
      "radiusMeters" : 250,
      "longitude" : -122.403098,
      "latitude" : 37.765363
    }
  },
  "name" : "Samsara HQ",
  "formattedAddress" : "350 Rhode Island St, San Francisco, CA",
  "notes" : "Delivery site 1",
  "contacts" : [ {
    "id" : 123,
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "email" : "jane.jones@yahoo.com",
    "firstName" : "Jane"
  }, {
    "id" : 123,
    "lastName" : "Jones",
    "phone" : "111-222-3344",
    "email" : "jane.jones@yahoo.com",
    "firstName" : "Jane"
  } ]
} ];
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
 * access_token String Samsara API access token.
 * contact_id Long ID of the contact
 * returns Contact
 **/
exports.getOrganizationContact = function(access_token,contact_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "id" : 123,
  "lastName" : "Jones",
  "phone" : "111-222-3344",
  "email" : "jane.jones@yahoo.com",
  "firstName" : "Jane"
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
 * access_token String Samsara API access token.
 * timestamp Long Timestamp in milliseconds representing the timestamp of a harsh event.
 * returns VehicleHarshEventResponse
 **/
exports.getVehicleHarshEvent = function(vehicleId,access_token,timestamp) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "harshEventType" : "Harsh Braking",
  "location" : {
    "address" : "350 Rhode Island St, San Francisco, CA",
    "longitude" : "-96.14907287",
    "latitude" : "33.07614328"
  },
  "incidentReportUrl" : "https://cloud.samsara.com/groups/1234/fleet/reports/safety/vehicle/212123456789012/incident/1539201882984",
  "downloadTrackedInwardVideoUrl" : "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.tracked.mp4?...",
  "isDistracted" : true,
  "downloadInwardVideoUrl" : "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.mp4?...",
  "downloadForwardVideoUrl" : "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-123456789.mp4?..."
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
 * access_token String Samsara API access token.
 * vehicle_id Long ID of the vehicle with the associated routes.
 * startMs Long Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
 * endMs Long Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
 * returns FleetVehicleLocations
 **/
exports.getVehicleLocations = function(access_token,vehicle_id,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * startMs Long Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
 * endMs Long Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
 * returns VehicleSafetyScoreResponse
 **/
exports.getVehicleSafetyScore = function(vehicleId,access_token,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "totalTimeDrivenMs" : 19708293,
  "timeOverSpeedLimitMs" : 3769,
  "harshBrakingCount" : 2,
  "harshEvents" : [ {
    "harshEventType" : "Harsh Braking",
    "vehicleId" : 212014918086169,
    "timestampMs" : 1535590776000
  }, {
    "harshEventType" : "Harsh Braking",
    "vehicleId" : 212014918086169,
    "timestampMs" : 1535590776000
  } ],
  "vehicleId" : 4321,
  "harshTurningCount" : 0,
  "totalHarshEventCount" : 3,
  "safetyScore" : 97,
  "crashCount" : 0,
  "harshAccelCount" : 1,
  "safetyScoreRank" : "26",
  "totalDistanceDrivenMeters" : 291836
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
 * access_token String Samsara API access token.
 * startMs Integer Time in Unix epoch milliseconds for the start of the query.
 * endMs Integer Time in Unix epoch milliseconds for the end of the query.
 * series String Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2 (optional)
 * tagIds String Comma-separated list of tag ids. Example: tagIds=1,2,3 (optional)
 * startingAfter String Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. (optional)
 * endingBefore String Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. (optional)
 * limit Long Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. (optional)
 * returns inline_response_200_5
 **/
exports.getVehicleStats = function(access_token,startMs,endMs,series,tagIds,startingAfter,endingBefore,limit) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "vehicleStats" : [ {
    "auxInput1" : {
      "values" : [ {
        "value" : true,
        "timeMs" : 1.546542978484E12
      }, {
        "value" : true,
        "timeMs" : 1.546542978484E12
      } ],
      "name" : "Boom"
    },
    "vehicleId" : 112,
    "auxInput2" : {
      "values" : [ {
        "value" : true,
        "timeMs" : 1.546542978484E12
      }, {
        "value" : true,
        "timeMs" : 1.546542978484E12
      } ],
      "name" : "Boom"
    },
    "engineState" : [ {
      "value" : "Running",
      "timeMs" : 1.546542978484E12
    }, {
      "value" : "Running",
      "timeMs" : 1.546542978484E12
    } ]
  }, {
    "auxInput1" : {
      "values" : [ {
        "value" : true,
        "timeMs" : 1.546542978484E12
      }, {
        "value" : true,
        "timeMs" : 1.546542978484E12
      } ],
      "name" : "Boom"
    },
    "vehicleId" : 112,
    "auxInput2" : {
      "values" : [ {
        "value" : true,
        "timeMs" : 1.546542978484E12
      }, {
        "value" : true,
        "timeMs" : 1.546542978484E12
      } ],
      "name" : "Boom"
    },
    "engineState" : [ {
      "value" : "Running",
      "timeMs" : 1.546542978484E12
    }, {
      "value" : "Running",
      "timeMs" : 1.546542978484E12
    } ]
  } ],
  "pagination" : {
    "hasNextPage" : true,
    "startCursor" : "MTU5MTEzNjA2OTU0MzQ3",
    "endCursor" : "MTU5MTEzNjA2OTU0MzQ3",
    "hasPrevPage" : true
  }
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
 * access_token String Samsara API access token.
 * startMs Integer Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
 * endMs Integer Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
 * returns FleetVehiclesLocations
 **/
exports.getVehiclesLocations = function(access_token,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * end_ms Integer time in millis until the last dvir log.
 * duration_ms Integer time in millis which corresponds to the duration before the end_ms.
 * group_id Integer Group ID to query. (optional)
 * returns DvirListResponse
 **/
exports.get_dvirs = function(access_token,end_ms,duration_ms,group_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "dvirs" : [ {
    "vehicleDefects" : [ {
      "defectType" : "Air Compressor",
      "comment" : "Air Compressor not working"
    }, {
      "defectType" : "Air Compressor",
      "comment" : "Air Compressor not working"
    } ],
    "defectsNeedNotBeCorrected" : false,
    "authorSignature" : {
      "username" : "jsmith",
      "mechanicUserId" : 14849,
      "email" : "j.smith@yahoo.com",
      "signedAt" : 12535500000,
      "name" : "John Smith",
      "driverId" : 2581,
      "type" : "driver"
    },
    "inspectionType" : "pre trip",
    "odometerMiles" : 49912,
    "vehicle" : {
      "id" : 19,
      "name" : "Storer's vehicle 19"
    },
    "timeMs" : 1453449599999,
    "defectsCorrected" : true,
    "mechanicNotes" : "The vehicle is now safe.",
    "id" : 19,
    "nextDriverSignature" : {
      "username" : "jsmith",
      "email" : "j.smith@yahoo.com",
      "signedAt" : 12535500000,
      "name" : "John Smith",
      "driverId" : 2581,
      "type" : "driver"
    },
    "trailerName" : "Storer's Trailer 19",
    "vehicleCondition" : "SATISFACTORY",
    "mechanicOrAgentSignature" : {
      "username" : "jsmith",
      "mechanicUserId" : 14849,
      "email" : "j.smith@yahoo.com",
      "signedAt" : 12535500000,
      "name" : "John Smith",
      "driverId" : 2581,
      "type" : "driver"
    },
    "trailerDefects" : [ {
      "defectType" : "Air Compressor",
      "comment" : "Air Compressor not working"
    }, {
      "defectType" : "Air Compressor",
      "comment" : "Air Compressor not working"
    } ],
    "trailerId" : 19
  }, {
    "vehicleDefects" : [ {
      "defectType" : "Air Compressor",
      "comment" : "Air Compressor not working"
    }, {
      "defectType" : "Air Compressor",
      "comment" : "Air Compressor not working"
    } ],
    "defectsNeedNotBeCorrected" : false,
    "authorSignature" : {
      "username" : "jsmith",
      "mechanicUserId" : 14849,
      "email" : "j.smith@yahoo.com",
      "signedAt" : 12535500000,
      "name" : "John Smith",
      "driverId" : 2581,
      "type" : "driver"
    },
    "inspectionType" : "pre trip",
    "odometerMiles" : 49912,
    "vehicle" : {
      "id" : 19,
      "name" : "Storer's vehicle 19"
    },
    "timeMs" : 1453449599999,
    "defectsCorrected" : true,
    "mechanicNotes" : "The vehicle is now safe.",
    "id" : 19,
    "nextDriverSignature" : {
      "username" : "jsmith",
      "email" : "j.smith@yahoo.com",
      "signedAt" : 12535500000,
      "name" : "John Smith",
      "driverId" : 2581,
      "type" : "driver"
    },
    "trailerName" : "Storer's Trailer 19",
    "vehicleCondition" : "SATISFACTORY",
    "mechanicOrAgentSignature" : {
      "username" : "jsmith",
      "mechanicUserId" : 14849,
      "email" : "j.smith@yahoo.com",
      "signedAt" : 12535500000,
      "name" : "John Smith",
      "driverId" : 2581,
      "type" : "driver"
    },
    "trailerDefects" : [ {
      "defectType" : "Air Compressor",
      "comment" : "Air Compressor not working"
    }, {
      "defectType" : "Air Compressor",
      "comment" : "Air Compressor not working"
    } ],
    "trailerId" : 19
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
 * access_token String Samsara API access token.
 * groupDriversParam GroupDriversParam 
 * returns DriversResponse
 **/
exports.get_fleet_drivers = function(access_token,groupDriversParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "drivers" : [ "", "" ]
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
 * access_token String Samsara API access token.
 * driver_id Long ID of the driver with HOS logs.
 * hosLogsParam HosLogsParam 
 * returns DriverDailyLogResponse
 **/
exports.get_fleet_drivers_hos_daily_logs = function(access_token,driver_id,hosLogsParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "days" : [ {
    "distanceMiles" : 123.24,
    "vehicleIds" : [ 192319, 12958 ],
    "activeMs" : 691200,
    "certified" : true,
    "trailerIds" : [ 10293, 192933 ],
    "certifiedAtMs" : 0,
    "startMs" : 1473750000000,
    "activeHours" : 5.4,
    "endMs" : 1473836400000
  }, {
    "distanceMiles" : 123.24,
    "vehicleIds" : [ 192319, 12958 ],
    "activeMs" : 691200,
    "certified" : true,
    "trailerIds" : [ 10293, 192933 ],
    "certifiedAtMs" : 0,
    "startMs" : 1473750000000,
    "activeHours" : 5.4,
    "endMs" : 1473836400000
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
 * access_token String Samsara API access token.
 * driversSummaryParam DriversSummaryParam Org ID and time range to query.
 * snap_to_day_bounds Boolean Snap query result to HOS day boundaries. (optional)
 * returns DriversSummaryResponse
 **/
exports.get_fleet_drivers_summary = function(access_token,driversSummaryParam,snap_to_day_bounds) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "Summaries" : [ {
    "distanceMiles" : 123.24,
    "groupId" : 111,
    "onDutyMs" : 21600000,
    "activeMs" : 43200000,
    "driverId" : 444,
    "driveMs" : 21600000,
    "driverUsername" : "fjacobs",
    "driverName" : "Fred Jacobs"
  }, {
    "distanceMiles" : 123.24,
    "groupId" : 111,
    "onDutyMs" : 21600000,
    "activeMs" : 43200000,
    "driverId" : 444,
    "driveMs" : 21600000,
    "driverUsername" : "fjacobs",
    "driverName" : "Fred Jacobs"
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
 * access_token String Samsara API access token.
 * hosAuthenticationLogsParam HosAuthenticationLogsParam 
 * returns HosAuthenticationLogsResponse
 **/
exports.get_fleet_hos_authentication_logs = function(access_token,hosAuthenticationLogsParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "authenticationLogs" : [ {
    "happenedAtMs" : 1462881998034,
    "address" : "123 Main St., Ahwatukee, Arizona 85044",
    "state" : "Arizona",
    "actionType" : "signin",
    "city" : "Ahwatukee",
    "addressName" : "Garage Number 3"
  }, {
    "happenedAtMs" : 1462881998034,
    "address" : "123 Main St., Ahwatukee, Arizona 85044",
    "state" : "Arizona",
    "actionType" : "signin",
    "city" : "Ahwatukee",
    "addressName" : "Garage Number 3"
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
 * access_token String Samsara API access token.
 * hosLogsParam HosLogsParam_1 
 * returns HosLogsResponse
 **/
exports.get_fleet_hos_logs = function(access_token,hosLogsParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "logs" : [ {
    "groupId" : 101,
    "logStartMs" : 1462881998034,
    "codriverIds" : [ 445, 445 ],
    "vehicleId" : 112,
    "remark" : "Lunch Break",
    "statusType" : "OFF_DUTY",
    "driverId" : 444,
    "locLng" : -98.502888123,
    "locName" : "McLean Site A",
    "locLat" : 23.413702345,
    "locCity" : "Ahwatukee",
    "locState" : "Arizona"
  }, {
    "groupId" : 101,
    "logStartMs" : 1462881998034,
    "codriverIds" : [ 445, 445 ],
    "vehicleId" : 112,
    "remark" : "Lunch Break",
    "statusType" : "OFF_DUTY",
    "driverId" : 444,
    "locLng" : -98.502888123,
    "locName" : "McLean Site A",
    "locLat" : 23.413702345,
    "locCity" : "Ahwatukee",
    "locState" : "Arizona"
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
 * access_token String Samsara API access token.
 * hosLogsParam HosLogsParam_2 
 * returns HosLogsSummaryResponse
 **/
exports.get_fleet_hos_logs_summary = function(access_token,hosLogsParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "drivers" : [ {
    "timeUntilBreak" : 28800000,
    "dutyStatus" : "OFF_DUTY",
    "vehicleName" : "Vehicle 1",
    "shiftDriveRemaining" : 39600000,
    "driverId" : 444,
    "cycleTomorrow" : 252000000,
    "shiftRemaining" : 50400000,
    "drivingInViolationToday" : 39600000,
    "timeInCurrentStatus" : 5000,
    "cycleRemaining" : 252000000,
    "drivingInViolationCycle" : 50400000,
    "driverName" : "Fred Jacobs"
  }, {
    "timeUntilBreak" : 28800000,
    "dutyStatus" : "OFF_DUTY",
    "vehicleName" : "Vehicle 1",
    "shiftDriveRemaining" : 39600000,
    "driverId" : 444,
    "cycleTomorrow" : 252000000,
    "shiftRemaining" : 50400000,
    "drivingInViolationToday" : 39600000,
    "timeInCurrentStatus" : 5000,
    "cycleRemaining" : 252000000,
    "drivingInViolationCycle" : 50400000,
    "driverName" : "Fred Jacobs"
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
 * access_token String Samsara API access token.
 * groupParam GroupParam Group ID to query.
 * returns inline_response_200_3
 **/
exports.get_fleet_locations = function(access_token,groupParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "groupId" : 101,
  "vehicles" : [ {
    "id" : 112,
    "time" : 1462881998034,
    "onTrip" : true,
    "speed" : 64.37,
    "location" : "1 Main St, Dallas, TX",
    "vin" : "JTNBB46KX73011966",
    "name" : "Truck A7",
    "odometerMeters" : 71774705,
    "longitude" : 32.897,
    "latitude" : 123.456,
    "heading" : 246.42
  }, {
    "id" : 112,
    "time" : 1462881998034,
    "onTrip" : true,
    "speed" : 64.37,
    "location" : "1 Main St, Dallas, TX",
    "vin" : "JTNBB46KX73011966",
    "name" : "Truck A7",
    "odometerMeters" : 71774705,
    "longitude" : 32.897,
    "latitude" : 123.456,
    "heading" : 246.42
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
 * access_token String Samsara API access token.
 * groupParam GroupParam Group ID to query.
 * returns inline_response_200_4
 **/
exports.get_fleet_maintenance_list = function(access_token,groupParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "vehicles" : [ {
    "passenger" : {
      "diagnosticTroubleCodes" : [ {
        "dtcShortCode" : "dtcShortCode",
        "dtcDescription" : "dtcDescription",
        "dtcId" : 5
      }, {
        "dtcShortCode" : "dtcShortCode",
        "dtcDescription" : "dtcDescription",
        "dtcId" : 5
      } ],
      "checkEngineLight" : {
        "isOn" : true
      }
    },
    "id" : 112,
    "j1939" : {
      "diagnosticTroubleCodes" : [ {
        "spnDescription" : "spnDescription",
        "occurrenceCount" : 6,
        "fmiId" : 0,
        "txId" : 5,
        "fmiText" : "fmiText",
        "spnId" : 1
      }, {
        "spnDescription" : "spnDescription",
        "occurrenceCount" : 6,
        "fmiId" : 0,
        "txId" : 5,
        "fmiText" : "fmiText",
        "spnId" : 1
      } ],
      "checkEngineLight" : {
        "emissionsIsOn" : true,
        "stopIsOn" : true,
        "warningIsOn" : true,
        "protectIsOn" : true
      }
    }
  }, {
    "passenger" : {
      "diagnosticTroubleCodes" : [ {
        "dtcShortCode" : "dtcShortCode",
        "dtcDescription" : "dtcDescription",
        "dtcId" : 5
      }, {
        "dtcShortCode" : "dtcShortCode",
        "dtcDescription" : "dtcDescription",
        "dtcId" : 5
      } ],
      "checkEngineLight" : {
        "isOn" : true
      }
    },
    "id" : 112,
    "j1939" : {
      "diagnosticTroubleCodes" : [ {
        "spnDescription" : "spnDescription",
        "occurrenceCount" : 6,
        "fmiId" : 0,
        "txId" : 5,
        "fmiText" : "fmiText",
        "spnId" : 1
      }, {
        "spnDescription" : "spnDescription",
        "occurrenceCount" : 6,
        "fmiId" : 0,
        "txId" : 5,
        "fmiText" : "fmiText",
        "spnId" : 1
      } ],
      "checkEngineLight" : {
        "emissionsIsOn" : true,
        "stopIsOn" : true,
        "warningIsOn" : true,
        "protectIsOn" : true
      }
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
 * /fleet/trips
 * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
 *
 * access_token String Samsara API access token.
 * tripsParam TripsParam Group ID, vehicle ID and time range to query.
 * returns TripResponse
 **/
exports.get_fleet_trips = function(access_token,tripsParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "trips" : [ {
    "startAddress" : "Ramen Tatsunoya",
    "endOdometer" : 210430500,
    "distanceMeters" : 2500,
    "startCoordinates" : {
      "longitude" : -98.502888123,
      "latitude" : 29.443702345
    },
    "startLocation" : "16 N Fair Oaks Ave, Pasadena, CA 91103",
    "fuelConsumedMl" : 75700,
    "endCoordinates" : {
      "longitude" : -91.502888123,
      "latitude" : 23.413702345
    },
    "tollMeters" : 32000,
    "endLocation" : "571 S Lake Ave, Pasadena, CA 91101",
    "driverId" : 719,
    "endAddress" : "Winchell's Donuts House",
    "startOdometer" : 210430450,
    "startMs" : 1462878398034,
    "endMs" : 1462881998034
  }, {
    "startAddress" : "Ramen Tatsunoya",
    "endOdometer" : 210430500,
    "distanceMeters" : 2500,
    "startCoordinates" : {
      "longitude" : -98.502888123,
      "latitude" : 29.443702345
    },
    "startLocation" : "16 N Fair Oaks Ave, Pasadena, CA 91103",
    "fuelConsumedMl" : 75700,
    "endCoordinates" : {
      "longitude" : -91.502888123,
      "latitude" : 23.413702345
    },
    "tollMeters" : 32000,
    "endLocation" : "571 S Lake Ave, Pasadena, CA 91101",
    "driverId" : 719,
    "endAddress" : "Winchell's Donuts House",
    "startOdometer" : 210430450,
    "startMs" : 1462878398034,
    "endMs" : 1462881998034
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
 * access_token String Samsara API access token.
 * returns List
 **/
exports.listContacts = function(access_token) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "id" : 123,
  "lastName" : "Jones",
  "phone" : "111-222-3344",
  "email" : "jane.jones@yahoo.com",
  "firstName" : "Jane"
}, {
  "id" : 123,
  "lastName" : "Jones",
  "phone" : "111-222-3344",
  "email" : "jane.jones@yahoo.com",
  "firstName" : "Jane"
} ];
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
 * access_token String Samsara API access token.
 * groupParam GroupParam Group ID to query.
 * startingAfter String Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. (optional)
 * endingBefore String Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. (optional)
 * limit Long Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. (optional)
 * returns inline_response_200_2
 **/
exports.list_fleet = function(access_token,groupParam,startingAfter,endingBefore,limit) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "groupId" : 101,
  "vehicles" : [ {
    "id" : 112,
    "fuelLevelPercent" : 0.3,
    "engineHours" : 1500,
    "vin" : "1FUJA6BD31LJ09646",
    "name" : "Truck A7",
    "odometerMeters" : 60130000,
    "note" : "Red truck 2015 M16"
  }, {
    "id" : 112,
    "fuelLevelPercent" : 0.3,
    "engineHours" : 1500,
    "vin" : "1FUJA6BD31LJ09646",
    "name" : "Truck A7",
    "odometerMeters" : 60130000,
    "note" : "Red truck 2015 M16"
  } ],
  "pagination" : {
    "hasNextPage" : true,
    "startCursor" : "MTU5MTEzNjA2OTU0MzQ3",
    "endCursor" : "MTU5MTEzNjA2OTU0MzQ3",
    "hasPrevPage" : true
  }
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
 * access_token String Samsara API access token.
 * vehicle_id_or_external_id String ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
 * data Data 
 * returns FleetVehicleResponse
 **/
exports.patchFleetVehicle = function(access_token,vehicle_id_or_external_id,data) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "id" : 112,
  "externalIds" : {
    "maintenanceId" : "ABFS18600"
  },
  "harshAccelSetting" : "Heavy",
  "name" : "Truck A7",
  "vehicleInfo" : {
    "model" : "Odyssey",
    "vin" : "1FUJA6BD31LJ09646",
    "year" : 1997,
    "make" : "Honda"
  }
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
 * access_token String Samsara API access token.
 * driver_id_or_external_id String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * reactivateDriverParam ReactivateDriverParam Driver reactivation body
 * returns CurrentDriver
 **/
exports.reactivateDriverById = function(access_token,driver_id_or_external_id,reactivateDriverParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * route_id Long ID of the dispatch route.
 * updateDispatchRouteParams DispatchRoute 
 * returns DispatchRoute
 **/
exports.updateDispatchRouteById = function(access_token,route_id,updateDispatchRouteParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
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
 * access_token String Samsara API access token.
 * address Address Update parts of an address's value. If the geofence 'circle' or 'polygon' key is specified, the update will change the type of geofence accordingly.
 * addressId Long ID of the address/geofence
 * no response value expected for this operation
 **/
exports.updateOrganizationAddress = function(access_token,address,addressId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /fleet/set_data
 * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
 *
 * access_token String Samsara API access token.
 * vehicleUpdateParam VehicleUpdateParam 
 * no response value expected for this operation
 **/
exports.update_vehicles = function(access_token,vehicleUpdateParam) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

