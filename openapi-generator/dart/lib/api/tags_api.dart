part of openapi.api;



class TagsApi {
  final ApiClient apiClient;

  TagsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// /tags
  ///
  /// Create a new tag for the group.
  Future<Tag> createTag(String accessToken, TagCreate tagCreateParams) async {
    Object postBody = tagCreateParams;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(tagCreateParams == null) {
     throw new ApiException(400, "Missing required param: tagCreateParams");
    }

    // create path and map variables
    String path = "/tags".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));

    List<String> contentTypes = ["application/json"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Tag') as Tag;
    } else {
      return null;
    }
  }
  /// /tags/{tag_id:[0-9]+}
  ///
  /// Permanently deletes a tag.
  Future deleteTagById(String accessToken, int tagId) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(tagId == null) {
     throw new ApiException(400, "Missing required param: tagId");
    }

    // create path and map variables
    String path = "/tags/{tag_id}".replaceAll("{format}","json").replaceAll("{" + "tag_id" + "}", tagId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'DELETE',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
    } else {
      return;
    }
  }
  /// /tags
  ///
  /// Fetch all of the tags for a group.
  Future<InlineResponse2009> getAllTags(String accessToken, { int groupId }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }

    // create path and map variables
    String path = "/tags".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
    if(groupId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "group_id", groupId));
    }

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'InlineResponse2009') as InlineResponse2009;
    } else {
      return null;
    }
  }
  /// /tags/{tag_id:[0-9]+}
  ///
  /// Fetch a tag by id.
  Future<Tag> getTagById(String accessToken, int tagId) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(tagId == null) {
     throw new ApiException(400, "Missing required param: tagId");
    }

    // create path and map variables
    String path = "/tags/{tag_id}".replaceAll("{format}","json").replaceAll("{" + "tag_id" + "}", tagId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Tag') as Tag;
    } else {
      return null;
    }
  }
  /// /tags/{tag_id:[0-9]+}
  ///
  /// Add or delete specific members from a tag, or modify the name of a tag.
  Future<Tag> modifyTagById(String accessToken, int tagId, TagModify tagModifyParams) async {
    Object postBody = tagModifyParams;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(tagId == null) {
     throw new ApiException(400, "Missing required param: tagId");
    }
    if(tagModifyParams == null) {
     throw new ApiException(400, "Missing required param: tagModifyParams");
    }

    // create path and map variables
    String path = "/tags/{tag_id}".replaceAll("{format}","json").replaceAll("{" + "tag_id" + "}", tagId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));

    List<String> contentTypes = ["application/json"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'PATCH',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Tag') as Tag;
    } else {
      return null;
    }
  }
  /// /tags/{tag_id:[0-9]+}
  ///
  /// Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
  Future<Tag> updateTagById(String accessToken, int tagId, TagUpdate updateTagParams) async {
    Object postBody = updateTagParams;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(tagId == null) {
     throw new ApiException(400, "Missing required param: tagId");
    }
    if(updateTagParams == null) {
     throw new ApiException(400, "Missing required param: updateTagParams");
    }

    // create path and map variables
    String path = "/tags/{tag_id}".replaceAll("{format}","json").replaceAll("{" + "tag_id" + "}", tagId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));

    List<String> contentTypes = ["application/json"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'PUT',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Tag') as Tag;
    } else {
      return null;
    }
  }
}
