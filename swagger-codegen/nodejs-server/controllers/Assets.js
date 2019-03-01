'use strict';

var utils = require('../utils/writer.js');
var Assets = require('../service/AssetsService');

module.exports.getAllAssetCurrentLocations = function getAllAssetCurrentLocations (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var group_id = req.swagger.params['group_id'].value;
  Assets.getAllAssetCurrentLocations(access_token,group_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAllAssets = function getAllAssets (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var group_id = req.swagger.params['group_id'].value;
  Assets.getAllAssets(access_token,group_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAssetLocation = function getAssetLocation (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var asset_id = req.swagger.params['asset_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Assets.getAssetLocation(access_token,asset_id,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAssetReefer = function getAssetReefer (req, res, next) {
  var access_token = req.swagger.params['access_token'].value;
  var asset_id = req.swagger.params['asset_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Assets.getAssetReefer(access_token,asset_id,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
