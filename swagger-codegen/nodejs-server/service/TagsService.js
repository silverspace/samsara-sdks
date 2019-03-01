'use strict';


/**
 * /tags
 * Create a new tag for the group.
 *
 * access_token String Samsara API access token.
 * tagCreateParams TagCreate 
 * returns Tag
 **/
exports.createTag = function(access_token,tagCreateParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ "", "" ],
  "id" : 12345,
  "drivers" : [ "", "" ],
  "groupId" : 2348,
  "assets" : [ "", "" ],
  "parentTagId" : 8389,
  "name" : "Broken Vehicles",
  "vehicles" : [ "", "" ],
  "addresses" : [ "", "" ],
  "machines" : [ "", "" ]
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
 * access_token String Samsara API access token.
 * tag_id Long ID of the tag.
 * no response value expected for this operation
 **/
exports.deleteTagById = function(access_token,tag_id) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * /tags
 * Fetch all of the tags for a group.
 *
 * access_token String Samsara API access token.
 * group_id Long Optional group ID if the organization has multiple groups (uncommon). (optional)
 * returns inline_response_200_9
 **/
exports.getAllTags = function(access_token,group_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "tags" : [ {
    "sensors" : [ "", "" ],
    "id" : 12345,
    "drivers" : [ "", "" ],
    "groupId" : 2348,
    "assets" : [ "", "" ],
    "parentTagId" : 8389,
    "name" : "Broken Vehicles",
    "vehicles" : [ "", "" ],
    "addresses" : [ "", "" ],
    "machines" : [ "", "" ]
  }, {
    "sensors" : [ "", "" ],
    "id" : 12345,
    "drivers" : [ "", "" ],
    "groupId" : 2348,
    "assets" : [ "", "" ],
    "parentTagId" : 8389,
    "name" : "Broken Vehicles",
    "vehicles" : [ "", "" ],
    "addresses" : [ "", "" ],
    "machines" : [ "", "" ]
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
 * access_token String Samsara API access token.
 * tag_id Long ID of the tag.
 * returns Tag
 **/
exports.getTagById = function(access_token,tag_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ "", "" ],
  "id" : 12345,
  "drivers" : [ "", "" ],
  "groupId" : 2348,
  "assets" : [ "", "" ],
  "parentTagId" : 8389,
  "name" : "Broken Vehicles",
  "vehicles" : [ "", "" ],
  "addresses" : [ "", "" ],
  "machines" : [ "", "" ]
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
 * access_token String Samsara API access token.
 * tag_id Long ID of the tag.
 * tagModifyParams TagModify 
 * returns Tag
 **/
exports.modifyTagById = function(access_token,tag_id,tagModifyParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ "", "" ],
  "id" : 12345,
  "drivers" : [ "", "" ],
  "groupId" : 2348,
  "assets" : [ "", "" ],
  "parentTagId" : 8389,
  "name" : "Broken Vehicles",
  "vehicles" : [ "", "" ],
  "addresses" : [ "", "" ],
  "machines" : [ "", "" ]
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
 * access_token String Samsara API access token.
 * tag_id Long ID of the tag.
 * updateTagParams TagUpdate 
 * returns Tag
 **/
exports.updateTagById = function(access_token,tag_id,updateTagParams) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sensors" : [ "", "" ],
  "id" : 12345,
  "drivers" : [ "", "" ],
  "groupId" : 2348,
  "assets" : [ "", "" ],
  "parentTagId" : 8389,
  "name" : "Broken Vehicles",
  "vehicles" : [ "", "" ],
  "addresses" : [ "", "" ],
  "machines" : [ "", "" ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

