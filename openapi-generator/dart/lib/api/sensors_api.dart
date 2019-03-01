part of openapi.api;



class SensorsApi {
  final ApiClient apiClient;

  SensorsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// /sensors/list
  ///
  /// Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
  Future<InlineResponse2008> getSensors(String accessToken, InlineObject23 groupParam) async {
    Object postBody = groupParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(groupParam == null) {
     throw new ApiException(400, "Missing required param: groupParam");
    }

    // create path and map variables
    String path = "/sensors/list".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'InlineResponse2008') as InlineResponse2008;
    } else {
      return null;
    }
  }
  /// /sensors/cargo
  ///
  /// Get cargo monitor status (empty / full) for requested sensors.
  Future<CargoResponse> getSensorsCargo(String accessToken, InlineObject19 sensorParam) async {
    Object postBody = sensorParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(sensorParam == null) {
     throw new ApiException(400, "Missing required param: sensorParam");
    }

    // create path and map variables
    String path = "/sensors/cargo".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'CargoResponse') as CargoResponse;
    } else {
      return null;
    }
  }
  /// /sensors/door
  ///
  /// Get door monitor status (closed / open) for requested sensors.
  Future<DoorResponse> getSensorsDoor(String accessToken, InlineObject20 sensorParam) async {
    Object postBody = sensorParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(sensorParam == null) {
     throw new ApiException(400, "Missing required param: sensorParam");
    }

    // create path and map variables
    String path = "/sensors/door".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DoorResponse') as DoorResponse;
    } else {
      return null;
    }
  }
  /// /sensors/history
  ///
  /// Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
  Future<SensorHistoryResponse> getSensorsHistory(String accessToken, InlineObject21 historyParam) async {
    Object postBody = historyParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(historyParam == null) {
     throw new ApiException(400, "Missing required param: historyParam");
    }

    // create path and map variables
    String path = "/sensors/history".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'SensorHistoryResponse') as SensorHistoryResponse;
    } else {
      return null;
    }
  }
  /// /sensors/humidity
  ///
  /// Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
  Future<HumidityResponse> getSensorsHumidity(String accessToken, InlineObject22 sensorParam) async {
    Object postBody = sensorParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(sensorParam == null) {
     throw new ApiException(400, "Missing required param: sensorParam");
    }

    // create path and map variables
    String path = "/sensors/humidity".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'HumidityResponse') as HumidityResponse;
    } else {
      return null;
    }
  }
  /// /sensors/temperature
  ///
  /// Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
  Future<TemperatureResponse> getSensorsTemperature(String accessToken, InlineObject24 sensorParam) async {
    Object postBody = sensorParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(sensorParam == null) {
     throw new ApiException(400, "Missing required param: sensorParam");
    }

    // create path and map variables
    String path = "/sensors/temperature".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'TemperatureResponse') as TemperatureResponse;
    } else {
      return null;
    }
  }
}
