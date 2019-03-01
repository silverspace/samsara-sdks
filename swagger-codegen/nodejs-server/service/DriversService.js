'use strict';


/**
 * /fleet/drivers/create
 * Create a new driver.
 *
 * access_token String Samsara API access token.
 * createDriverParam DriverForCreate Driver creation body
 * returns Driver
 **/
exports.createDriver = function(access_token,createDriverParam) {
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
 * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Deactivate a driver with the given id.
 *
 * access_token String Samsara API access token.
 * driver_id_or_external_id String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * no response value expected for this operation
 **/
exports.deactivateDriver = function(access_token,driver_id_or_external_id) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /fleet/drivers/inactive
 * Fetch all deactivated drivers for the group.
 *
 * access_token String Samsara API access token.
 * group_id Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * returns List
 **/
exports.getAllDeactivatedDrivers = function(access_token,group_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ "", "" ];
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
 * access_token String Samsara API access token.
 * driver_id_or_external_id String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * returns Driver
 **/
exports.getDeactivatedDriverById = function(access_token,driver_id_or_external_id) {
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
 * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Fetch driver by id.
 *
 * access_token String Samsara API access token.
 * driver_id_or_external_id String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * returns CurrentDriver
 **/
exports.getDriverById = function(access_token,driver_id_or_external_id) {
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
 * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Reactivate the inactive driver having id.
 *
 * access_token String Samsara API access token.
 * driver_id_or_external_id String ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
 * reactivateDriverParam ReactivateDriverParam Driver reactivation body
 * returns CurrentDriver
 **/
exports.reactivateDriverById = function(access_token,driver_id_or_external_id,reactivateDriverParam) {
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
