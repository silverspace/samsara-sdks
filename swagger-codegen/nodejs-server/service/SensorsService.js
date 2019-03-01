'use strict';


/**
 * /sensors/list
 * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
 *
 * access_token String Samsara API access token.
 * groupParam GroupParam Group ID to query.
 * returns inline_response_200_8
 **/
exports.get_sensors = function(access_token,groupParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ {
    "id" : 123,
    "name" : "Freezer ABC",
    "macAddress" : "11:11:11:11:11:11"
  }, {
    "id" : 123,
    "name" : "Freezer ABC",
    "macAddress" : "11:11:11:11:11:11"
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
 * /sensors/cargo
 * Get cargo monitor status (empty / full) for requested sensors.
 *
 * access_token String Samsara API access token.
 * sensorParam SensorParam Group ID and list of sensor IDs to query.
 * returns CargoResponse
 **/
exports.get_sensors_cargo = function(access_token,sensorParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ {
    "id" : 122,
    "name" : "Trailer Cargo Sensor",
    "cargoEmpty" : true
  }, {
    "id" : 122,
    "name" : "Trailer Cargo Sensor",
    "cargoEmpty" : true
  } ],
  "groupId" : 101
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /sensors/door
 * Get door monitor status (closed / open) for requested sensors.
 *
 * access_token String Samsara API access token.
 * sensorParam SensorParam Group ID and list of sensor IDs to query.
 * returns DoorResponse
 **/
exports.get_sensors_door = function(access_token,sensorParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ {
    "id" : 122,
    "doorClosed" : true,
    "name" : "Trailer Door Sensor"
  }, {
    "id" : 122,
    "doorClosed" : true,
    "name" : "Trailer Door Sensor"
  } ],
  "groupId" : 101
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /sensors/history
 * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
 *
 * access_token String Samsara API access token.
 * historyParam HistoryParam_1 Group ID, time range and resolution, and list of sensor ID, field pairs to query.
 * returns SensorHistoryResponse
 **/
exports.get_sensors_history = function(access_token,historyParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "results" : [ {
    "series" : [ 1, 1 ],
    "timeMs" : 1453449599999
  }, {
    "series" : [ 1, 1 ],
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
 * /sensors/humidity
 * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
 *
 * access_token String Samsara API access token.
 * sensorParam SensorParam Group ID and list of sensor IDs to query.
 * returns HumidityResponse
 **/
exports.get_sensors_humidity = function(access_token,sensorParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ {
    "id" : 122,
    "humidity" : 53,
    "name" : "Freezer Humidity Sensor"
  }, {
    "id" : 122,
    "humidity" : 53,
    "name" : "Freezer Humidity Sensor"
  } ],
  "groupId" : 101
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /sensors/temperature
 * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
 *
 * access_token String Samsara API access token.
 * sensorParam SensorParam Group ID and list of sensor IDs to query.
 * returns TemperatureResponse
 **/
exports.get_sensors_temperature = function(access_token,sensorParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ {
    "id" : 122,
    "name" : "Freezer Temp Sensor",
    "probeTemperature" : -20145,
    "ambientTemperature" : 11057
  }, {
    "id" : 122,
    "name" : "Freezer Temp Sensor",
    "probeTemperature" : -20145,
    "ambientTemperature" : 11057
  } ],
  "groupId" : 101
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

