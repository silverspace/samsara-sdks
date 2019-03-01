'use strict';


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

