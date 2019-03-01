'use strict';


/**
 * /fleet/drivers/create
 * Create a new driver.
 *
 * accessUnderscoretoken String Samsara API access token.
 * createDriverParam DriverForCreate Driver creation body
 * returns Driver
 **/
exports.createDriver = function(accessUnderscoretoken,createDriverParam) {
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
 * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Deactivate a driver with the given id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * no response value expected for this operation
 **/
exports.deactivateDriver = function(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /fleet/drivers/inactive
 * Fetch all deactivated drivers for the group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupUnderscoreid Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * returns List
 **/
exports.getAllDeactivatedDrivers = function(accessUnderscoretoken,groupUnderscoreid) {
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
 * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Fetch deactivated driver by id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * returns Driver
 **/
exports.getDeactivatedDriverById = function(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid) {
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
 * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Fetch driver by id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * returns Driver
 **/
exports.getDriverById = function(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid) {
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
 * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Reactivate the inactive driver having id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * reactivateDriverParam InlineObject4 
 * returns Driver
 **/
exports.reactivateDriverById = function(accessUnderscoretoken,driverUnderscoreidUnderscoreorUnderscoreexternalUnderscoreid,reactivateDriverParam) {
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
