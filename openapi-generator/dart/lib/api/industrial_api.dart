part of openapi.api;



class IndustrialApi {
  final ApiClient apiClient;

  IndustrialApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// /industrial/data
  ///
  /// Fetch all of the data inputs for a group.
  Future<InlineResponse2006> getAllDataInputs(String accessToken, { int groupId, int startMs, int endMs }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }

    // create path and map variables
    String path = "/industrial/data".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
    if(groupId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "group_id", groupId));
    }
    if(startMs != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "startMs", startMs));
    }
    if(endMs != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "endMs", endMs));
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
      return apiClient.deserialize(_decodeBodyBytes(response), 'InlineResponse2006') as InlineResponse2006;
    } else {
      return null;
    }
  }
  /// /industrial/data/{data_input_id:[0-9]+}
  ///
  /// Fetch datapoints from a given data input.
  Future<DataInputHistoryResponse> getDataInput(String accessToken, int dataInputId, { int startMs, int endMs }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(dataInputId == null) {
     throw new ApiException(400, "Missing required param: dataInputId");
    }

    // create path and map variables
    String path = "/industrial/data/{data_input_id}".replaceAll("{format}","json").replaceAll("{" + "data_input_id" + "}", dataInputId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
    if(startMs != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "startMs", startMs));
    }
    if(endMs != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "endMs", endMs));
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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DataInputHistoryResponse') as DataInputHistoryResponse;
    } else {
      return null;
    }
  }
  /// /machines/list
  ///
  /// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
  Future<InlineResponse2007> getMachines(String accessToken, InlineObject18 groupParam) async {
    Object postBody = groupParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(groupParam == null) {
     throw new ApiException(400, "Missing required param: groupParam");
    }

    // create path and map variables
    String path = "/machines/list".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'InlineResponse2007') as InlineResponse2007;
    } else {
      return null;
    }
  }
  /// /machines/history
  ///
  /// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
  Future<MachineHistoryResponse> getMachinesHistory(String accessToken, InlineObject17 historyParam) async {
    Object postBody = historyParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(historyParam == null) {
     throw new ApiException(400, "Missing required param: historyParam");
    }

    // create path and map variables
    String path = "/machines/history".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'MachineHistoryResponse') as MachineHistoryResponse;
    } else {
      return null;
    }
  }
}
