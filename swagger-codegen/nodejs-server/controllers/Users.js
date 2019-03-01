'use strict';

var utils = require('../utils/writer.js');
var Users = require('../service/UsersService');

module.exports.deleteUserById = function deleteUserById (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var userId = req.swagger.params['userId'].value;
  Users.deleteUserById(access_token,userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getUserById = function getUserById (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var userId = req.swagger.params['userId'].value;
  Users.getUserById(access_token,userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.listUserRoles = function listUserRoles (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  Users.listUserRoles(access_token)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.list_users = function list_users (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  Users.list_users(access_token)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
