'use strict';


/**
 * /fleet/dispatch/routes
 * Create a new dispatch route.
 *
 * accessUnderscoretoken String Samsara API access token.
 * createDispatchRouteParams DispatchRouteCreate 
 * returns DispatchRoute
 **/
exports.createDispatchRoute = function(accessUnderscoretoken,createDispatchRouteParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
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
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreid Long ID of the driver with the associated routes.
 * createDispatchRouteParams DispatchRouteCreate 
 * returns DispatchRoute
 **/
exports.createDriverDispatchRoute = function(accessUnderscoretoken,driverUnderscoreid,createDispatchRouteParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
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
 * accessUnderscoretoken String Samsara API access token.
 * vehicleUnderscoreid Long ID of the vehicle with the associated routes.
 * createDispatchRouteParams DispatchRouteCreate 
 * returns DispatchRoute
 **/
exports.createVehicleDispatchRoute = function(accessUnderscoretoken,vehicleUnderscoreid,createDispatchRouteParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
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
 * accessUnderscoretoken String Samsara API access token.
 * routeUnderscoreid Long ID of the dispatch route.
 * no response value expected for this operation
 **/
exports.deleteDispatchRouteById = function(accessUnderscoretoken,routeUnderscoreid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /fleet/dispatch/routes
 * Fetch all of the dispatch routes for the group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupUnderscoreid Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * endUnderscoretime Long Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
 * duration Long Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
 * returns List
 **/
exports.fetchAllDispatchRoutes = function(accessUnderscoretoken,groupUnderscoreid,endUnderscoretime,duration) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
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
 * accessUnderscoretoken String Samsara API access token.
 * groupUnderscoreid Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * sequenceUnderscoreid String Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
 * include String Optionally set include=route to include route object in response payload. (optional)
 * returns allRouteJobUpdates
 **/
exports.fetchAllRouteJobUpdates = function(accessUnderscoretoken,groupUnderscoreid,sequenceUnderscoreid,include) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sequence_id" : "eyJpZCI6MywiY3JlYXRlZF9hdCI6MTQ5OTQyOTIyMDAwMn0=",
  "job_updates" : [ {
    "changed_at_ms" : 1462881998034,
    "route_id" : 556,
    "job_id" : 773,
    "prev_job_state" : "JobState_EnRoute",
    "job_state" : "JobState_Arrived"
  }, {
    "changed_at_ms" : 1462881998034,
    "route_id" : 556,
    "job_id" : 773,
    "prev_job_state" : "JobState_EnRoute",
    "job_state" : "JobState_Arrived"
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
 * /fleet/dispatch/routes/{route_id:[0-9]+}
 * Fetch a dispatch route by id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * routeUnderscoreid Long ID of the dispatch route.
 * returns DispatchRoute
 **/
exports.getDispatchRouteById = function(accessUnderscoretoken,routeUnderscoreid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
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
 * accessUnderscoretoken String Samsara API access token.
 * routeUnderscoreid Long ID of the route with history.
 * startUnderscoretime Long Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
 * endUnderscoretime Long Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
 * returns DispatchRouteHistory
 **/
exports.getDispatchRouteHistory = function(accessUnderscoretoken,routeUnderscoreid,startUnderscoretime,endUnderscoretime) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "history" : [ {
    "changed_at_ms" : 1499411220000
  }, {
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
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreid Long ID of the driver with the associated routes.
 * endUnderscoretime Long Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
 * duration Long Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
 * returns List
 **/
exports.getDispatchRoutesByDriverId = function(accessUnderscoretoken,driverUnderscoreid,endUnderscoretime,duration) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
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
 * accessUnderscoretoken String Samsara API access token.
 * vehicleUnderscoreid Long ID of the vehicle with the associated routes.
 * endUnderscoretime Long Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
 * duration Long Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
 * returns List
 **/
exports.getDispatchRoutesByVehicleId = function(accessUnderscoretoken,vehicleUnderscoreid,endUnderscoretime,duration) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
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
 * accessUnderscoretoken String Samsara API access token.
 * routeUnderscoreid Long ID of the dispatch route.
 * updateDispatchRouteParams DispatchRoute 
 * returns DispatchRoute
 **/
exports.updateDispatchRouteById = function(accessUnderscoretoken,routeUnderscoreid,updateDispatchRouteParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = null;
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

