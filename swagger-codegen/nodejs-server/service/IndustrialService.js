'use strict';


/**
 * /industrial/data
 * Fetch all of the data inputs for a group.
 *
 * access_token String Samsara API access token.
 * group_id Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * startMs Long Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
 * endMs Long Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
 * returns inline_response_200_6
 **/
exports.getAllDataInputs = function(access_token,group_id,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "dataInputs" : [ {
    "id" : 12345,
    "name" : "Pump Flow",
    "points" : [ {
      "value" : 12.332,
      "timeMs" : 1453449599999
    }, {
      "value" : 12.332,
      "timeMs" : 1453449599999
    } ]
  }, {
    "id" : 12345,
    "name" : "Pump Flow",
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
 * access_token String Samsara API access token.
 * data_input_id Long ID of the data input
 * startMs Long Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
 * endMs Long Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
 * returns DataInputHistoryResponse
 **/
exports.getDataInput = function(access_token,data_input_id,startMs,endMs) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "id" : 12345,
  "name" : "Pump Flow",
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
 * access_token String Samsara API access token.
 * groupParam GroupParam Group ID to query.
 * returns inline_response_200_7
 **/
exports.get_machines = function(access_token,groupParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "machines" : [ {
    "id" : 123,
    "name" : "Freezer ABC",
    "notes" : "This is in the left hallway behind the conveyor belt"
  }, {
    "id" : 123,
    "name" : "Freezer ABC",
    "notes" : "This is in the left hallway behind the conveyor belt"
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
 * access_token String Samsara API access token.
 * historyParam HistoryParam Group ID and time range to query for events
 * returns MachineHistoryResponse
 **/
exports.get_machines_history = function(access_token,historyParam) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "machines" : [ {
    "id" : 1,
    "vibrations" : [ {
      "time" : 1453449599999,
      "Y" : 1.23,
      "X" : 0.01,
      "Z" : 2.55
    }, {
      "time" : 1453449599999,
      "Y" : 1.23,
      "X" : 0.01,
      "Z" : 2.55
    } ],
    "name" : "1/3 HP Motor"
  }, {
    "id" : 1,
    "vibrations" : [ {
      "time" : 1453449599999,
      "Y" : 1.23,
      "X" : 0.01,
      "Z" : 2.55
    }, {
      "time" : 1453449599999,
      "Y" : 1.23,
      "X" : 0.01,
      "Z" : 2.55
    } ],
    "name" : "1/3 HP Motor"
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

