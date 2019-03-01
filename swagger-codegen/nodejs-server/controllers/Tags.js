'use strict';

var utils = require('../utils/writer.js');
var Tags = require('../service/TagsService');

module.exports.createTag = function createTag (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var tagCreateParams = req.swagger.params['tagCreateParams'].value;
  Tags.createTag(access_token,tagCreateParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deleteTagById = function deleteTagById (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var tag_id = req.swagger.params['tag_id'].value;
  Tags.deleteTagById(access_token,tag_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAllTags = function getAllTags (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var group_id = req.swagger.params['group_id'].value;
  Tags.getAllTags(access_token,group_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getTagById = function getTagById (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var tag_id = req.swagger.params['tag_id'].value;
  Tags.getTagById(access_token,tag_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modifyTagById = function modifyTagById (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var tag_id = req.swagger.params['tag_id'].value;
  var tagModifyParams = req.swagger.params['tagModifyParams'].value;
  Tags.modifyTagById(access_token,tag_id,tagModifyParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.updateTagById = function updateTagById (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var tag_id = req.swagger.params['tag_id'].value;
  var updateTagParams = req.swagger.params['updateTagParams'].value;
  Tags.updateTagById(access_token,tag_id,updateTagParams)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
