'use strict';


/**
 * /users/{userId:[0-9]+}
 * Remove a user from the organization.
 *
 * accessUnderscoretoken String Samsara API access token.
 * userId Long ID of the user.
 * no response value expected for this operation
 **/
exports.deleteUserById = function(accessUnderscoretoken,userId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /users/{userId:[0-9]+}
 * Get a user.
 *
 * accessUnderscoretoken String Samsara API access token.
 * userId Long ID of the user.
 * returns User
 **/
exports.getUserById = function(accessUnderscoretoken,userId) {
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
 * /user_roles
 * Get all roles in the organization.
 *
 * accessUnderscoretoken String Samsara API access token.
 * returns List
 **/
exports.listUserRoles = function(accessUnderscoretoken) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "name" : "Full Admin",
  "id" : "8a9371af-82d1-4158-bf91-4ecc8d3a114c"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /users
 * List all users in the organization.
 *
 * accessUnderscoretoken String Samsara API access token.
 * returns List
 **/
exports.list_users = function(accessUnderscoretoken) {
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

