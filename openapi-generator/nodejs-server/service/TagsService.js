'use strict';


/**
 * /tags
 * Create a new tag for the group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * tagCreateParams TagCreate 
 * returns Tag
 **/
exports.createTag = function(accessUnderscoretoken,tagCreateParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "addresses" : [ null, null ],
  "assets" : [ null, null ],
  "sensors" : [ null, null ],
  "parentTagId" : 8389,
  "groupId" : 2348,
  "name" : "Broken Vehicles",
  "vehicles" : [ null, null ],
  "id" : 12345,
  "machines" : [ null, null ],
  "drivers" : [ null, null ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /tags/{tag_id:[0-9]+}
 * Permanently deletes a tag.
 *
 * accessUnderscoretoken String Samsara API access token.
 * tagUnderscoreid Long ID of the tag.
 * no response value expected for this operation
 **/
exports.deleteTagById = function(accessUnderscoretoken,tagUnderscoreid) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /tags
 * Fetch all of the tags for a group.
 *
 * accessUnderscoretoken String Samsara API access token.
 * groupUnderscoreid Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * returns inline_response_200_9
 **/
exports.getAllTags = function(accessUnderscoretoken,groupUnderscoreid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "tags" : [ {
    "addresses" : [ null, null ],
    "assets" : [ null, null ],
    "sensors" : [ null, null ],
    "parentTagId" : 8389,
    "groupId" : 2348,
    "name" : "Broken Vehicles",
    "vehicles" : [ null, null ],
    "id" : 12345,
    "machines" : [ null, null ],
    "drivers" : [ null, null ]
  }, {
    "addresses" : [ null, null ],
    "assets" : [ null, null ],
    "sensors" : [ null, null ],
    "parentTagId" : 8389,
    "groupId" : 2348,
    "name" : "Broken Vehicles",
    "vehicles" : [ null, null ],
    "id" : 12345,
    "machines" : [ null, null ],
    "drivers" : [ null, null ]
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
 * /tags/{tag_id:[0-9]+}
 * Fetch a tag by id.
 *
 * accessUnderscoretoken String Samsara API access token.
 * tagUnderscoreid Long ID of the tag.
 * returns Tag
 **/
exports.getTagById = function(accessUnderscoretoken,tagUnderscoreid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "addresses" : [ null, null ],
  "assets" : [ null, null ],
  "sensors" : [ null, null ],
  "parentTagId" : 8389,
  "groupId" : 2348,
  "name" : "Broken Vehicles",
  "vehicles" : [ null, null ],
  "id" : 12345,
  "machines" : [ null, null ],
  "drivers" : [ null, null ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /tags/{tag_id:[0-9]+}
 * Add or delete specific members from a tag, or modify the name of a tag.
 *
 * accessUnderscoretoken String Samsara API access token.
 * tagUnderscoreid Long ID of the tag.
 * tagModifyParams TagModify 
 * returns Tag
 **/
exports.modifyTagById = function(accessUnderscoretoken,tagUnderscoreid,tagModifyParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "addresses" : [ null, null ],
  "assets" : [ null, null ],
  "sensors" : [ null, null ],
  "parentTagId" : 8389,
  "groupId" : 2348,
  "name" : "Broken Vehicles",
  "vehicles" : [ null, null ],
  "id" : 12345,
  "machines" : [ null, null ],
  "drivers" : [ null, null ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * /tags/{tag_id:[0-9]+}
 * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
 *
 * accessUnderscoretoken String Samsara API access token.
 * tagUnderscoreid Long ID of the tag.
 * updateTagParams TagUpdate 
 * returns Tag
 **/
exports.updateTagById = function(accessUnderscoretoken,tagUnderscoreid,updateTagParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "addresses" : [ null, null ],
  "assets" : [ null, null ],
  "sensors" : [ null, null ],
  "parentTagId" : 8389,
  "groupId" : 2348,
  "name" : "Broken Vehicles",
  "vehicles" : [ null, null ],
  "id" : 12345,
  "machines" : [ null, null ],
  "drivers" : [ null, null ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

