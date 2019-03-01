'use strict';


/**
 * /industrial/data
 * Fetch all of the data inputs for a group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupUnderscoreid Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * startMs Long Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
 * endMs Long Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
 * returns inline_response_200_6
 **/
exports.getAllDataInputs = function(accessUnderscoretoken,groupUnderscoreid,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "dataInputs" : [ {
    "name" : "Pump Flow",
    "id" : 12345,
    "points" : [ {
      "value" : 12.332,
      "timeMs" : 1453449599999
    }, {
      "value" : 12.332,
      "timeMs" : 1453449599999
    } ]
  }, {
    "name" : "Pump Flow",
    "id" : 12345,
    "points" : [ {
      "value" : 12.332,
      "timeMs" : 1453449599999
    }, {
      "value" : 12.332,
      "timeMs" : 1453449599999
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
 * /industrial/data/{data_input_id:[0-9]+}
 * Fetch datapoints from a given data input.
 *
 * accessUnderscoretoken String Samsara API access token.
 * dataUnderscoreinputUnderscoreid Long ID of the data input
 * startMs Long Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
 * endMs Long Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
 * returns DataInputHistoryResponse
 **/
exports.getDataInput = function(accessUnderscoretoken,dataUnderscoreinputUnderscoreid,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "name" : "Pump Flow",
  "id" : 12345,
  "points" : [ {
    "value" : 12.332,
    "timeMs" : 1453449599999
  }, {
    "value" : 12.332,
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
 * /machines/list
 * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupParam InlineObject18 
 * returns inline_response_200_7
 **/
exports.get_machines = function(accessUnderscoretoken,groupParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "machines" : [ {
    "notes" : "This is in the left hallway behind the conveyor belt",
    "name" : "Freezer ABC",
    "id" : 123
  }, {
    "notes" : "This is in the left hallway behind the conveyor belt",
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
 * /machines/history
 * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
 *
 * accessUnderscoretoken String Samsara API access token.
 * historyParam InlineObject17 
 * returns MachineHistoryResponse
 **/
exports.get_machines_history = function(accessUnderscoretoken,historyParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "machines" : [ {
    "name" : "1/3 HP Motor",
    "id" : 1,
    "vibrations" : [ {
      "X" : 0.01,
      "Y" : 1.23,
      "Z" : 2.55,
      "time" : 1453449599999
    }, {
      "X" : 0.01,
      "Y" : 1.23,
      "Z" : 2.55,
      "time" : 1453449599999
    } ]
  }, {
    "name" : "1/3 HP Motor",
    "id" : 1,
    "vibrations" : [ {
      "X" : 0.01,
      "Y" : 1.23,
      "Z" : 2.55,
      "time" : 1453449599999
    }, {
      "X" : 0.01,
      "Y" : 1.23,
      "Z" : 2.55,
      "time" : 1453449599999
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

