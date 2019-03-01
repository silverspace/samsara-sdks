'use strict';

var utils = require('../utils/writer.js');
var Assets = require('../service/AssetsService');

module.exports.getAllAssetCurrentLocations = function getAllAssetCurrentLocations (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupUnderscoreid = req.swagger.params['group_id'].value;
  Assets.getAllAssetCurrentLocations(accessUnderscoretoken,groupUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAllAssets = function getAllAssets (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var groupUnderscoreid = req.swagger.params['group_id'].value;
  Assets.getAllAssets(accessUnderscoretoken,groupUnderscoreid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAssetLocation = function getAssetLocation (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var assetUnderscoreid = req.swagger.params['asset_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Assets.getAssetLocation(accessUnderscoretoken,assetUnderscoreid,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAssetReefer = function getAssetReefer (req, res, next) {
  var accessUnderscoretoken = req.swagger.params['access_token'].value;
  var assetUnderscoreid = req.swagger.params['asset_id'].value;
  var startMs = req.swagger.params['startMs'].value;
  var endMs = req.swagger.params['endMs'].value;
  Assets.getAssetReefer(accessUnderscoretoken,assetUnderscoreid,startMs,endMs)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
