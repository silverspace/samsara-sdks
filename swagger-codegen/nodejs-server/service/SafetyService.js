'use strict';


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

