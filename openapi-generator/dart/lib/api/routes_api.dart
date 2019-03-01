part of openapi.api;



class RoutesApi {
  final ApiClient apiClient;

  RoutesApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// /fleet/dispatch/routes
  ///
  /// Create a new dispatch route.
  Future<DispatchRoute> createDispatchRoute(String accessToken, DispatchRouteCreate createDispatchRouteParams) async {
    Object postBody = createDispatchRouteParams;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(createDispatchRouteParams == null) {
     throw new ApiException(400, "Missing required param: createDispatchRouteParams");
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DispatchRoute') as DispatchRoute;
    } else {
      return null;
    }
  }
  /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  ///
  /// Create a new dispatch route for the driver with driver_id.
  Future<DispatchRoute> createDriverDispatchRoute(String accessToken, int driverId, DispatchRouteCreate createDispatchRouteParams) async {
    Object postBody = createDispatchRouteParams;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(driverId == null) {
     throw new ApiException(400, "Missing required param: driverId");
    }
    if(createDispatchRouteParams == null) {
     throw new ApiException(400, "Missing required param: createDispatchRouteParams");
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id}/dispatch/routes".replaceAll("{format}","json").replaceAll("{" + "driver_id" + "}", driverId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DispatchRoute') as DispatchRoute;
    } else {
      return null;
    }
  }
  /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  ///
  /// Create a new dispatch route for the vehicle with vehicle_id.
  Future<DispatchRoute> createVehicleDispatchRoute(String accessToken, int vehicleId, DispatchRouteCreate createDispatchRouteParams) async {
    Object postBody = createDispatchRouteParams;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(vehicleId == null) {
     throw new ApiException(400, "Missing required param: vehicleId");
    }
    if(createDispatchRouteParams == null) {
     throw new ApiException(400, "Missing required param: createDispatchRouteParams");
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replaceAll("{format}","json").replaceAll("{" + "vehicle_id" + "}", vehicleId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DispatchRoute') as DispatchRoute;
    } else {
      return null;
    }
  }
  /// /fleet/dispatch/routes/{route_id:[0-9]+}/
  ///
  /// Delete a dispatch route and its associated jobs.
  Future deleteDispatchRouteById(String accessToken, int routeId) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(routeId == null) {
     throw new ApiException(400, "Missing required param: routeId");
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/{route_id}".replaceAll("{format}","json").replaceAll("{" + "route_id" + "}", routeId.toString());

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
  /// /fleet/dispatch/routes
  ///
  /// Fetch all of the dispatch routes for the group.
  Future<List<DispatchRoute>> fetchAllDispatchRoutes(String accessToken, { int groupId, int endTime, int duration }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
    if(groupId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "group_id", groupId));
    }
    if(endTime != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "end_time", endTime));
    }
    if(duration != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "duration", duration));
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
      return (apiClient.deserialize(_decodeBodyBytes(response), 'List<DispatchRoute>') as List).map((item) => item as DispatchRoute).toList();
    } else {
      return null;
    }
  }
  /// /fleet/dispatch/routes/job_updates
  ///
  /// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
  Future<AllRouteJobUpdates> fetchAllRouteJobUpdates(String accessToken, { int groupId, String sequenceId, String include }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/job_updates".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
    if(groupId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "group_id", groupId));
    }
    if(sequenceId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "sequence_id", sequenceId));
    }
    if(include != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "include", include));
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
      return apiClient.deserialize(_decodeBodyBytes(response), 'AllRouteJobUpdates') as AllRouteJobUpdates;
    } else {
      return null;
    }
  }
  /// /fleet/dispatch/routes/{route_id:[0-9]+}
  ///
  /// Fetch a dispatch route by id.
  Future<DispatchRoute> getDispatchRouteById(String accessToken, int routeId) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(routeId == null) {
     throw new ApiException(400, "Missing required param: routeId");
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/{route_id}".replaceAll("{format}","json").replaceAll("{" + "route_id" + "}", routeId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DispatchRoute') as DispatchRoute;
    } else {
      return null;
    }
  }
  /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
  ///
  /// Fetch the history of a dispatch route.
  Future<DispatchRouteHistory> getDispatchRouteHistory(String accessToken, int routeId, { int startTime, int endTime }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(routeId == null) {
     throw new ApiException(400, "Missing required param: routeId");
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/{route_id}/history".replaceAll("{format}","json").replaceAll("{" + "route_id" + "}", routeId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
    if(startTime != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "start_time", startTime));
    }
    if(endTime != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "end_time", endTime));
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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DispatchRouteHistory') as DispatchRouteHistory;
    } else {
      return null;
    }
  }
  /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  ///
  /// Fetch all of the dispatch routes for a given driver.
  Future<List<DispatchRoute>> getDispatchRoutesByDriverId(String accessToken, int driverId, { int endTime, int duration }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(driverId == null) {
     throw new ApiException(400, "Missing required param: driverId");
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id}/dispatch/routes".replaceAll("{format}","json").replaceAll("{" + "driver_id" + "}", driverId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
    if(endTime != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "end_time", endTime));
    }
    if(duration != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "duration", duration));
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
      return (apiClient.deserialize(_decodeBodyBytes(response), 'List<DispatchRoute>') as List).map((item) => item as DispatchRoute).toList();
    } else {
      return null;
    }
  }
  /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  ///
  /// Fetch all of the dispatch routes for a given vehicle.
  Future<List<DispatchRoute>> getDispatchRoutesByVehicleId(String accessToken, int vehicleId, { int endTime, int duration }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(vehicleId == null) {
     throw new ApiException(400, "Missing required param: vehicleId");
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replaceAll("{format}","json").replaceAll("{" + "vehicle_id" + "}", vehicleId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
    if(endTime != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "end_time", endTime));
    }
    if(duration != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "duration", duration));
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
      return (apiClient.deserialize(_decodeBodyBytes(response), 'List<DispatchRoute>') as List).map((item) => item as DispatchRoute).toList();
    } else {
      return null;
    }
  }
  /// /fleet/dispatch/routes/{route_id:[0-9]+}/
  ///
  /// Update a dispatch route and its associated jobs.
  Future<DispatchRoute> updateDispatchRouteById(String accessToken, int routeId, DispatchRoute updateDispatchRouteParams) async {
    Object postBody = updateDispatchRouteParams;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(routeId == null) {
     throw new ApiException(400, "Missing required param: routeId");
    }
    if(updateDispatchRouteParams == null) {
     throw new ApiException(400, "Missing required param: updateDispatchRouteParams");
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/{route_id}".replaceAll("{format}","json").replaceAll("{" + "route_id" + "}", routeId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DispatchRoute') as DispatchRoute;
    } else {
      return null;
    }
  }
}
