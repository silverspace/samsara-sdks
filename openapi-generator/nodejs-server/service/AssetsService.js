'use strict';


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

