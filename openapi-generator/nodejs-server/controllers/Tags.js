'use strict';

var utils = require('../utils/writer.js');
var Tags = require('../service/TagsService');

module.exports.createTag = function createTag (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var tagCreateParams = req.swagger.params['tagCreateParams'].value;
  Tags.createTag(accessUnderscoretoken,tagCreateParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deleteTagById = function deleteTagById (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var tagUnderscoreid = req.swagger.params['tag_id'].value;
  Tags.deleteTagById(accessUnderscoretoken,tagUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAllTags = function getAllTags (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupUnderscoreid = req.swagger.params['group_id'].value;
  Tags.getAllTags(accessUnderscoretoken,groupUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getTagById = function getTagById (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var tagUnderscoreid = req.swagger.params['tag_id'].value;
  Tags.getTagById(accessUnderscoretoken,tagUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modifyTagById = function modifyTagById (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var tagUnderscoreid = req.swagger.params['tag_id'].value;
  var tagModifyParams = req.swagger.params['tagModifyParams'].value;
  Tags.modifyTagById(accessUnderscoretoken,tagUnderscoreid,tagModifyParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.updateTagById = function updateTagById (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var tagUnderscoreid = req.swagger.params['tag_id'].value;
  var updateTagParams = req.swagger.params['updateTagParams'].value;
  Tags.updateTagById(accessUnderscoretoken,tagUnderscoreid,updateTagParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
