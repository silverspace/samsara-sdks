part of openapi.api;



class DriversApi {
  final ApiClient apiClient;

  DriversApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// /fleet/drivers/create
  ///
  /// Create a new driver.
  Future<Driver> createDriver(String accessToken, DriverForCreate createDriverParam) async {
    Object postBody = createDriverParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(createDriverParam == null) {
     throw new ApiException(400, "Missing required param: createDriverParam");
    }

    // create path and map variables
    String path = "/fleet/drivers/create".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'Driver') as Driver;
    } else {
      return null;
    }
  }
  /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ///
  /// Deactivate a driver with the given id.
  Future deactivateDriver(String accessToken, String driverIdOrExternalId) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(driverIdOrExternalId == null) {
     throw new ApiException(400, "Missing required param: driverIdOrExternalId");
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id_or_external_id}".replaceAll("{format}","json").replaceAll("{" + "driver_id_or_external_id" + "}", driverIdOrExternalId.toString());

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
  /// /fleet/drivers/inactive
  ///
  /// Fetch all deactivated drivers for the group.
  Future<List<Driver>> getAllDeactivatedDrivers(String accessToken, { int groupId }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }

    // create path and map variables
    String path = "/fleet/drivers/inactive".replaceAll("{format}","json");

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
      return (apiClient.deserialize(_decodeBodyBytes(response), 'List<Driver>') as List).map((item) => item as Driver).toList();
    } else {
      return null;
    }
  }
  /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ///
  /// Fetch deactivated driver by id.
  Future<Driver> getDeactivatedDriverById(String accessToken, String driverIdOrExternalId) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(driverIdOrExternalId == null) {
     throw new ApiException(400, "Missing required param: driverIdOrExternalId");
    }

    // create path and map variables
    String path = "/fleet/drivers/inactive/{driver_id_or_external_id}".replaceAll("{format}","json").replaceAll("{" + "driver_id_or_external_id" + "}", driverIdOrExternalId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'Driver') as Driver;
    } else {
      return null;
    }
  }
  /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ///
  /// Fetch driver by id.
  Future<Driver> getDriverById(String accessToken, String driverIdOrExternalId) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(driverIdOrExternalId == null) {
     throw new ApiException(400, "Missing required param: driverIdOrExternalId");
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id_or_external_id}".replaceAll("{format}","json").replaceAll("{" + "driver_id_or_external_id" + "}", driverIdOrExternalId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'Driver') as Driver;
    } else {
      return null;
    }
  }
  /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ///
  /// Reactivate the inactive driver having id.
  Future<Driver> reactivateDriverById(String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam) async {
    Object postBody = reactivateDriverParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(driverIdOrExternalId == null) {
     throw new ApiException(400, "Missing required param: driverIdOrExternalId");
    }
    if(reactivateDriverParam == null) {
     throw new ApiException(400, "Missing required param: reactivateDriverParam");
    }

    // create path and map variables
    String path = "/fleet/drivers/inactive/{driver_id_or_external_id}".replaceAll("{format}","json").replaceAll("{" + "driver_id_or_external_id" + "}", driverIdOrExternalId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'Driver') as Driver;
    } else {
      return null;
    }
  }
}
