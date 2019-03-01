'use strict';


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

