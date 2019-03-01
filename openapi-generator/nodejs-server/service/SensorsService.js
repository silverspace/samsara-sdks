'use strict';


/**
 * /sensors/list
 * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupParam InlineObject23 
 * returns inline_response_200_8
 **/
exports.get_sensors = function(accessUnderscoretoken,groupParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ {
    "macAddress" : "11:11:11:11:11:11",
    "name" : "Freezer ABC",
    "id" : 123
  }, {
    "macAddress" : "11:11:11:11:11:11",
    "name" : "Freezer ABC",
    "id" : 123
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
 * accessUnderscoretoken String Samsara API access token.
 * sensorParam InlineObject19 
 * returns CargoResponse
 **/
exports.get_sensors_cargo = function(accessUnderscoretoken,sensorParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ {
    "cargoEmpty" : true,
    "name" : "Trailer Cargo Sensor",
    "id" : 122
  }, {
    "cargoEmpty" : true,
    "name" : "Trailer Cargo Sensor",
    "id" : 122
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
 * accessUnderscoretoken String Samsara API access token.
 * sensorParam InlineObject20 
 * returns DoorResponse
 **/
exports.get_sensors_door = function(accessUnderscoretoken,sensorParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ {
    "doorClosed" : true,
    "name" : "Trailer Door Sensor",
    "id" : 122
  }, {
    "doorClosed" : true,
    "name" : "Trailer Door Sensor",
    "id" : 122
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
 * accessUnderscoretoken String Samsara API access token.
 * historyParam InlineObject21 
 * returns SensorHistoryResponse
 **/
exports.get_sensors_history = function(accessUnderscoretoken,historyParam) {
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
 * accessUnderscoretoken String Samsara API access token.
 * sensorParam InlineObject22 
 * returns HumidityResponse
 **/
exports.get_sensors_humidity = function(accessUnderscoretoken,sensorParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ {
    "name" : "Freezer Humidity Sensor",
    "humidity" : 53,
    "id" : 122
  }, {
    "name" : "Freezer Humidity Sensor",
    "humidity" : 53,
    "id" : 122
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
 * accessUnderscoretoken String Samsara API access token.
 * sensorParam InlineObject24 
 * returns TemperatureResponse
 **/
exports.get_sensors_temperature = function(accessUnderscoretoken,sensorParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ {
    "probeTemperature" : -20145,
    "name" : "Freezer Temp Sensor",
    "id" : 122,
    "ambientTemperature" : 11057
  }, {
    "probeTemperature" : -20145,
    "name" : "Freezer Temp Sensor",
    "id" : 122,
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

