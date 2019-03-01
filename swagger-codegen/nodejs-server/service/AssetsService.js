'use strict';


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

