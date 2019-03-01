part of openapi.api;



class FleetApi {
  final ApiClient apiClient;

  FleetApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// /fleet/add_address
  ///
  /// This method adds an address book entry to the specified group.
  Future addFleetAddress(String accessToken, InlineObject2 addressParam) async {
    Object postBody = addressParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(addressParam == null) {
     throw new ApiException(400, "Missing required param: addressParam");
    }

    // create path and map variables
    String path = "/fleet/add_address".replaceAll("{format}","json");

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
    } else {
      return;
    }
  }
  /// /addresses
  ///
  /// Add one or more addresses to the organization
  Future<List<Address>> addOrganizationAddresses(String accessToken, InlineObject addresses) async {
    Object postBody = addresses;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(addresses == null) {
     throw new ApiException(400, "Missing required param: addresses");
    }

    // create path and map variables
    String path = "/addresses".replaceAll("{format}","json");

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
      return (apiClient.deserialize(_decodeBodyBytes(response), 'List<Address>') as List).map((item) => item as Address).toList();
    } else {
      return null;
    }
  }
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
  /// /fleet/drivers/{driver_id:[0-9]+}/documents
  ///
  /// Create a driver document for the given driver.
  Future<Document> createDriverDocument(String accessToken, int driverId, DocumentCreate createDocumentParams) async {
    Object postBody = createDocumentParams;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(driverId == null) {
     throw new ApiException(400, "Missing required param: driverId");
    }
    if(createDocumentParams == null) {
     throw new ApiException(400, "Missing required param: createDocumentParams");
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id}/documents".replaceAll("{format}","json").replaceAll("{" + "driver_id" + "}", driverId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'Document') as Document;
    } else {
      return null;
    }
  }
  /// /fleet/maintenance/dvirs
  ///
  /// Create a new dvir, marking a vehicle or trailer safe or unsafe.
  Future<DvirBase> createDvir(String accessToken, InlineObject12 createDvirParam) async {
    Object postBody = createDvirParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(createDvirParam == null) {
     throw new ApiException(400, "Missing required param: createDvirParam");
    }

    // create path and map variables
    String path = "/fleet/maintenance/dvirs".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DvirBase') as DvirBase;
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
  /// /addresses/{addressId}
  ///
  /// Delete an address.
  Future deleteOrganizationAddress(String accessToken, int addressId) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(addressId == null) {
     throw new ApiException(400, "Missing required param: addressId");
    }

    // create path and map variables
    String path = "/addresses/{addressId}".replaceAll("{format}","json").replaceAll("{" + "addressId" + "}", addressId.toString());

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
  /// /fleet/drivers/document_types
  ///
  /// Fetch all of the document types.
  Future<List<DocumentType>> getDriverDocumentTypesByOrgId() async {
    Object postBody;

    // verify required params are set

    // create path and map variables
    String path = "/fleet/drivers/document_types".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

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
      return (apiClient.deserialize(_decodeBodyBytes(response), 'List<DocumentType>') as List).map((item) => item as DocumentType).toList();
    } else {
      return null;
    }
  }
  /// /fleet/drivers/documents
  ///
  /// Fetch all of the documents.
  Future<List<Document>> getDriverDocumentsByOrgId(String accessToken, { int endMs, int durationMs }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }

    // create path and map variables
    String path = "/fleet/drivers/documents".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
    if(endMs != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "endMs", endMs));
    }
    if(durationMs != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "durationMs", durationMs));
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
      return (apiClient.deserialize(_decodeBodyBytes(response), 'List<Document>') as List).map((item) => item as Document).toList();
    } else {
      return null;
    }
  }
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
  /// /fleet/maintenance/dvirs
  ///
  /// Get DVIRs for the org within provided time constraints
  Future<DvirListResponse> getDvirs(String accessToken, int endMs, int durationMs, { int groupId }) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(endMs == null) {
     throw new ApiException(400, "Missing required param: endMs");
    }
    if(durationMs == null) {
     throw new ApiException(400, "Missing required param: durationMs");
    }

    // create path and map variables
    String path = "/fleet/maintenance/dvirs".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
      queryParams.addAll(_convertParametersForCollectionFormat("", "end_ms", endMs));
      queryParams.addAll(_convertParametersForCollectionFormat("", "duration_ms", durationMs));
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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DvirListResponse') as DvirListResponse;
    } else {
      return null;
    }
  }
  /// /fleet/drivers
  ///
  /// Get all the drivers for the specified group.
  Future<DriversResponse> getFleetDrivers(String accessToken, InlineObject3 groupDriversParam) async {
    Object postBody = groupDriversParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(groupDriversParam == null) {
     throw new ApiException(400, "Missing required param: groupDriversParam");
    }

    // create path and map variables
    String path = "/fleet/drivers".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DriversResponse') as DriversResponse;
    } else {
      return null;
    }
  }
  /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
  ///
  /// Get summarized daily HOS charts for a specified driver.
  Future<DriverDailyLogResponse> getFleetDriversHosDailyLogs(String accessToken, int driverId, InlineObject6 hosLogsParam) async {
    Object postBody = hosLogsParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(driverId == null) {
     throw new ApiException(400, "Missing required param: driverId");
    }
    if(hosLogsParam == null) {
     throw new ApiException(400, "Missing required param: hosLogsParam");
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id}/hos_daily_logs".replaceAll("{format}","json").replaceAll("{" + "driver_id" + "}", driverId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DriverDailyLogResponse') as DriverDailyLogResponse;
    } else {
      return null;
    }
  }
  /// /fleet/drivers/summary
  ///
  /// Get the distance and time each driver in an organization has driven in a given time period.
  Future<DriversSummaryResponse> getFleetDriversSummary(String accessToken, InlineObject5 driversSummaryParam, { bool snapToDayBounds }) async {
    Object postBody = driversSummaryParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(driversSummaryParam == null) {
     throw new ApiException(400, "Missing required param: driversSummaryParam");
    }

    // create path and map variables
    String path = "/fleet/drivers/summary".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
    if(snapToDayBounds != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "snap_to_day_bounds", snapToDayBounds));
    }

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'DriversSummaryResponse') as DriversSummaryResponse;
    } else {
      return null;
    }
  }
  /// /fleet/hos_authentication_logs
  ///
  /// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
  Future<HosAuthenticationLogsResponse> getFleetHosAuthenticationLogs(String accessToken, InlineObject7 hosAuthenticationLogsParam) async {
    Object postBody = hosAuthenticationLogsParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(hosAuthenticationLogsParam == null) {
     throw new ApiException(400, "Missing required param: hosAuthenticationLogsParam");
    }

    // create path and map variables
    String path = "/fleet/hos_authentication_logs".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'HosAuthenticationLogsResponse') as HosAuthenticationLogsResponse;
    } else {
      return null;
    }
  }
  /// /fleet/hos_logs
  ///
  /// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
  Future<HosLogsResponse> getFleetHosLogs(String accessToken, InlineObject8 hosLogsParam) async {
    Object postBody = hosLogsParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(hosLogsParam == null) {
     throw new ApiException(400, "Missing required param: hosLogsParam");
    }

    // create path and map variables
    String path = "/fleet/hos_logs".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'HosLogsResponse') as HosLogsResponse;
    } else {
      return null;
    }
  }
  /// /fleet/hos_logs_summary
  ///
  /// Get the current HOS status for all drivers in the group.
  Future<HosLogsSummaryResponse> getFleetHosLogsSummary(String accessToken, InlineObject9 hosLogsParam) async {
    Object postBody = hosLogsParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(hosLogsParam == null) {
     throw new ApiException(400, "Missing required param: hosLogsParam");
    }

    // create path and map variables
    String path = "/fleet/hos_logs_summary".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'HosLogsSummaryResponse') as HosLogsSummaryResponse;
    } else {
      return null;
    }
  }
  /// /fleet/locations
  ///
  /// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
  Future<InlineResponse2003> getFleetLocations(String accessToken, InlineObject11 groupParam) async {
    Object postBody = groupParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(groupParam == null) {
     throw new ApiException(400, "Missing required param: groupParam");
    }

    // create path and map variables
    String path = "/fleet/locations".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'InlineResponse2003') as InlineResponse2003;
    } else {
      return null;
    }
  }
  /// /fleet/maintenance/list
  ///
  /// Get list of the vehicles with any engine faults or check light data.
  Future<InlineResponse2004> getFleetMaintenanceList(String accessToken, InlineObject13 groupParam) async {
    Object postBody = groupParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(groupParam == null) {
     throw new ApiException(400, "Missing required param: groupParam");
    }

    // create path and map variables
    String path = "/fleet/maintenance/list".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'InlineResponse2004') as InlineResponse2004;
    } else {
      return null;
    }
  }
  /// /fleet/trips
  ///
  /// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
  Future<TripResponse> getFleetTrips(String accessToken, InlineObject15 tripsParam) async {
    Object postBody = tripsParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(tripsParam == null) {
     throw new ApiException(400, "Missing required param: tripsParam");
    }

    // create path and map variables
    String path = "/fleet/trips".replaceAll("{format}","json");

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'TripResponse') as TripResponse;
    } else {
      return null;
    }
  }
  /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ///
  /// Gets a specific vehicle.
  Future<FleetVehicleResponse> getFleetVehicle(String accessToken, String vehicleIdOrExternalId) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(vehicleIdOrExternalId == null) {
     throw new ApiException(400, "Missing required param: vehicleIdOrExternalId");
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id_or_external_id}".replaceAll("{format}","json").replaceAll("{" + "vehicle_id_or_external_id" + "}", vehicleIdOrExternalId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'FleetVehicleResponse') as FleetVehicleResponse;
    } else {
      return null;
    }
  }
  /// /addresses/{addressId}
  ///
  /// Fetch an address by its id.
  Future<Address> getOrganizationAddress(String accessToken, int addressId) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(addressId == null) {
     throw new ApiException(400, "Missing required param: addressId");
    }

    // create path and map variables
    String path = "/addresses/{addressId}".replaceAll("{format}","json").replaceAll("{" + "addressId" + "}", addressId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'Address') as Address;
    } else {
      return null;
    }
  }
  /// /addresses
  ///
  /// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
  Future<List<Address>> getOrganizationAddresses(String accessToken) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }

    // create path and map variables
    String path = "/addresses".replaceAll("{format}","json");

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
      return (apiClient.deserialize(_decodeBodyBytes(response), 'List<Address>') as List).map((item) => item as Address).toList();
    } else {
      return null;
    }
  }
  /// /contacts/{contact_id}
  ///
  /// Fetch a contact by its id.
  Future<Contact> getOrganizationContact(String accessToken, int contactId) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(contactId == null) {
     throw new ApiException(400, "Missing required param: contactId");
    }

    // create path and map variables
    String path = "/contacts/{contact_id}".replaceAll("{format}","json").replaceAll("{" + "contact_id" + "}", contactId.toString());

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'Contact') as Contact;
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
  /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
  ///
  /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
  Future<List<FleetVehicleLocation>> getVehicleLocations(String accessToken, int vehicleId, int startMs, int endMs) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(vehicleId == null) {
     throw new ApiException(400, "Missing required param: vehicleId");
    }
    if(startMs == null) {
     throw new ApiException(400, "Missing required param: startMs");
    }
    if(endMs == null) {
     throw new ApiException(400, "Missing required param: endMs");
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id}/locations".replaceAll("{format}","json").replaceAll("{" + "vehicle_id" + "}", vehicleId.toString());

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
      return (apiClient.deserialize(_decodeBodyBytes(response), 'List<FleetVehicleLocation>') as List).map((item) => item as FleetVehicleLocation).toList();
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
  /// /fleet/vehicles/stats
  ///
  /// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
  Future<InlineResponse2005> getVehicleStats(String accessToken, int startMs, int endMs, { String series, String tagIds, String startingAfter, String endingBefore, int limit }) async {
    Object postBody;

    // verify required params are set
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
    String path = "/fleet/vehicles/stats".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
      queryParams.addAll(_convertParametersForCollectionFormat("", "startMs", startMs));
      queryParams.addAll(_convertParametersForCollectionFormat("", "endMs", endMs));
    if(series != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "series", series));
    }
    if(tagIds != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "tagIds", tagIds));
    }
    if(startingAfter != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "startingAfter", startingAfter));
    }
    if(endingBefore != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "endingBefore", endingBefore));
    }
    if(limit != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "limit", limit));
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
      return apiClient.deserialize(_decodeBodyBytes(response), 'InlineResponse2005') as InlineResponse2005;
    } else {
      return null;
    }
  }
  /// /fleet/vehicles/locations
  ///
  /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
  Future<List<Object>> getVehiclesLocations(String accessToken, int startMs, int endMs) async {
    Object postBody;

    // verify required params are set
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
    String path = "/fleet/vehicles/locations".replaceAll("{format}","json");

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
  /// /contacts
  ///
  /// Fetch all contacts for the organization.
  Future<List<Contact>> listContacts(String accessToken) async {
    Object postBody;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }

    // create path and map variables
    String path = "/contacts".replaceAll("{format}","json");

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
      return (apiClient.deserialize(_decodeBodyBytes(response), 'List<Contact>') as List).map((item) => item as Contact).toList();
    } else {
      return null;
    }
  }
  /// /fleet/list
  ///
  /// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
  Future<InlineResponse2002> listFleet(String accessToken, InlineObject10 groupParam, { String startingAfter, String endingBefore, int limit }) async {
    Object postBody = groupParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(groupParam == null) {
     throw new ApiException(400, "Missing required param: groupParam");
    }

    // create path and map variables
    String path = "/fleet/list".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));
    if(startingAfter != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "startingAfter", startingAfter));
    }
    if(endingBefore != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "endingBefore", endingBefore));
    }
    if(limit != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "limit", limit));
    }

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'InlineResponse2002') as InlineResponse2002;
    } else {
      return null;
    }
  }
  /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ///
  /// Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
  Future<FleetVehicleResponse> patchFleetVehicle(String accessToken, String vehicleIdOrExternalId, InlineObject16 data) async {
    Object postBody = data;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(vehicleIdOrExternalId == null) {
     throw new ApiException(400, "Missing required param: vehicleIdOrExternalId");
    }
    if(data == null) {
     throw new ApiException(400, "Missing required param: data");
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id_or_external_id}".replaceAll("{format}","json").replaceAll("{" + "vehicle_id_or_external_id" + "}", vehicleIdOrExternalId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "access_token", accessToken));

    List<String> contentTypes = ["application/json","application/merge-patch+json"];

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
      return apiClient.deserialize(_decodeBodyBytes(response), 'FleetVehicleResponse') as FleetVehicleResponse;
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
  /// /addresses/{addressId}
  ///
  /// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
  Future updateOrganizationAddress(String accessToken, int addressId, InlineObject1 address) async {
    Object postBody = address;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(addressId == null) {
     throw new ApiException(400, "Missing required param: addressId");
    }
    if(address == null) {
     throw new ApiException(400, "Missing required param: address");
    }

    // create path and map variables
    String path = "/addresses/{addressId}".replaceAll("{format}","json").replaceAll("{" + "addressId" + "}", addressId.toString());

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
    } else {
      return;
    }
  }
  /// /fleet/set_data
  ///
  /// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
  Future updateVehicles(String accessToken, InlineObject14 vehicleUpdateParam) async {
    Object postBody = vehicleUpdateParam;

    // verify required params are set
    if(accessToken == null) {
     throw new ApiException(400, "Missing required param: accessToken");
    }
    if(vehicleUpdateParam == null) {
     throw new ApiException(400, "Missing required param: vehicleUpdateParam");
    }

    // create path and map variables
    String path = "/fleet/set_data".replaceAll("{format}","json");

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
    } else {
      return;
    }
  }
}
