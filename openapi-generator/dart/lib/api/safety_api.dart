part of openapi.api;



class SafetyApi {
  final ApiClient apiClient;

  SafetyApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// /fleet/drivers/{driverId:[0-9]+}/safety/score
  ///
  /// Fetch the safety score for the driver.
  Future<DriverSafetyScoreResponse> getDriverSafetyScore(int driverId, String accessToken, int startMs, int endMs) async {
    Object postBody;

    // verify required params are set
    if(driverId == null) {
     throw new ApiException(400, "Missing required param: driverId");
    }
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(startMs == null) {
     throw new ApiException(400, "Missing required param: startMs");
    }
    if(endMs == null) {
     throw new ApiException(400, "Missing required param: endMs");
    }

    // create path and map variables
    String path = "/fleet/drivers/{driverId}/safety/score".replaceAll("{format}","json").replaceAll("{" + "driverId" + "}", driverId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DriverSafetyScoreResponse') as DriverSafetyScoreResponse;
    } else {
      return null;
    }
  }
  /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
  ///
  /// Fetch harsh event details for a vehicle.
  Future<VehicleHarshEventResponse> getVehicleHarshEvent(int vehicleId, String accessToken, int timestamp) async {
    Object postBody;

    // verify required params are set
    if(vehicleId == null) {
     throw new ApiException(400, "Missing required param: vehicleId");
    }
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(timestamp == null) {
     throw new ApiException(400, "Missing required param: timestamp");
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicleId}/safety/harsh_event".replaceAll("{format}","json").replaceAll("{" + "vehicleId" + "}", vehicleId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
      queryParams.addAll(_convertParametersForCollectionFormat("", "timestamp", timestamp));

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'VehicleHarshEventResponse') as VehicleHarshEventResponse;
    } else {
      return null;
    }
  }
  /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
  ///
  /// Fetch the safety score for the vehicle.
  Future<VehicleSafetyScoreResponse> getVehicleSafetyScore(int vehicleId, String accessToken, int startMs, int endMs) async {
    Object postBody;

    // verify required params are set
    if(vehicleId == null) {
     throw new ApiException(400, "Missing required param: vehicleId");
    }
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(startMs == null) {
     throw new ApiException(400, "Missing required param: startMs");
    }
    if(endMs == null) {
     throw new ApiException(400, "Missing required param: endMs");
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicleId}/safety/score".replaceAll("{format}","json").replaceAll("{" + "vehicleId" + "}", vehicleId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'VehicleSafetyScoreResponse') as VehicleSafetyScoreResponse;
    } else {
      return null;
    }
  }
}
