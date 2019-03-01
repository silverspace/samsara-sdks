part of openapi.api;



class AssetsApi {
  final ApiClient apiClient;

  AssetsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// /fleet/assets/locations
  ///
  /// Fetch current locations of all assets for the group.
  Future<InlineResponse2001> getAllAssetCurrentLocations(String accessToken, { int groupId }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }

    // create path and map variables
    String path = "/fleet/assets/locations".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'InlineResponse2001') as InlineResponse2001;
    } else {
      return null;
    }
  }
  /// /fleet/assets
  ///
  /// Fetch all of the assets for the group.
  Future<InlineResponse200> getAllAssets(String accessToken, { int groupId }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }

    // create path and map variables
    String path = "/fleet/assets".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'InlineResponse200') as InlineResponse200;
    } else {
      return null;
    }
  }
  /// /fleet/assets/{assetId:[0-9]+}/locations
  ///
  /// Fetch the historical locations for the asset.
  Future<List<Object>> getAssetLocation(String accessToken, int assetId, int startMs, int endMs) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(assetId == null) {
     throw new ApiException(400, "Missing required param: assetId");
    }
    if(startMs == null) {
     throw new ApiException(400, "Missing required param: startMs");
    }
    if(endMs == null) {
     throw new ApiException(400, "Missing required param: endMs");
    }

    // create path and map variables
    String path = "/fleet/assets/{asset_id}/locations".replaceAll("{format}","json").replaceAll("{" + "asset_id" + "}", assetId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
      queryParams.addAll(_convertParametersForCollectionFormat("", "startMs", startMs));
      queryParams.addAll(_convertParametersForCollectionFormat("", "endMs", endMs));

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
      return (apiClient.deserialize(_decodeBodyBytes(response), 'List<Object>') as List).map((item) => item as Object).toList();
    } else {
      return null;
    }
  }
  /// /fleet/assets/{assetId:[0-9]+}/reefer
  ///
  /// Fetch the reefer-specific stats of an asset.
  Future<AssetReeferResponse> getAssetReefer(String accessToken, int assetId, int startMs, int endMs) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(assetId == null) {
     throw new ApiException(400, "Missing required param: assetId");
    }
    if(startMs == null) {
     throw new ApiException(400, "Missing required param: startMs");
    }
    if(endMs == null) {
     throw new ApiException(400, "Missing required param: endMs");
    }

    // create path and map variables
    String path = "/fleet/assets/{asset_id}/reefer".replaceAll("{format}","json").replaceAll("{" + "asset_id" + "}", assetId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
      queryParams.addAll(_convertParametersForCollectionFormat("", "startMs", startMs));
      queryParams.addAll(_convertParametersForCollectionFormat("", "endMs", endMs));

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'AssetReeferResponse') as AssetReeferResponse;
    } else {
      return null;
    }
  }
}
