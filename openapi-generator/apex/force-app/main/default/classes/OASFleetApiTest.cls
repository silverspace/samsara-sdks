@isTest
private class OASFleetApiTest {
    /**
     * /fleet/add_address
     *
     * This method adds an address book entry to the specified group.
     */
    @isTest
    private static void addFleetAddressTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'addressParam' => OASInlineObject2.getExample()
        };

        OASClient client;
        OASFleetApi api;
        String js = '';

        api = new OASFleetApi(new OASClient());

        api.addFleetAddress(params);
    }

    /**
     * /addresses
     *
     * Add one or more addresses to the organization
     */
    @isTest
    private static void addOrganizationAddressesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'addresses' => OASInlineObject.getExample()
        };

        OASClient client;
        OASFleetApi api;
        List<OASAddress> response;
        List<OASAddress> expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(new List<OASAddress>{OASAddress.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAddress>{OASAddress.getExample()};
        response = (List<OASAddress>) api.addOrganizationAddresses(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/dispatch/routes
     *
     * Create a new dispatch route.
     */
    @isTest
    private static void createDispatchRouteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'createDispatchRouteParams' => OASDispatchRouteCreate.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASDispatchRoute response;
        OASDispatchRoute expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDispatchRoute.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDispatchRoute.getExample();
        response = (OASDispatchRoute) api.createDispatchRoute(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/create
     *
     * Create a new driver.
     */
    @isTest
    private static void createDriverTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'createDriverParam' => OASDriverForCreate.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASDriver response;
        OASDriver expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDriver.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriver.getExample();
        response = (OASDriver) api.createDriver(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * Create a new dispatch route for the driver with driver_id.
     */
    @isTest
    private static void createDriverDispatchRouteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'driverId' => 2147483648L,
            'createDispatchRouteParams' => OASDispatchRouteCreate.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASDispatchRoute response;
        OASDispatchRoute expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDispatchRoute.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDispatchRoute.getExample();
        response = (OASDispatchRoute) api.createDriverDispatchRoute(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     *
     * Create a driver document for the given driver.
     */
    @isTest
    private static void createDriverDocumentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'driverId' => 2147483648L,
            'createDocumentParams' => OASDocumentCreate.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASDocument response;
        OASDocument expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDocument.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDocument.getExample();
        response = (OASDocument) api.createDriverDocument(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/maintenance/dvirs
     *
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     */
    @isTest
    private static void createDvirTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'createDvirParam' => OASInlineObject12.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASDvirBase response;
        OASDvirBase expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDvirBase.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDvirBase.getExample();
        response = (OASDvirBase) api.createDvir(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * Create a new dispatch route for the vehicle with vehicle_id.
     */
    @isTest
    private static void createVehicleDispatchRouteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'vehicleId' => 2147483648L,
            'createDispatchRouteParams' => OASDispatchRouteCreate.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASDispatchRoute response;
        OASDispatchRoute expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDispatchRoute.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDispatchRoute.getExample();
        response = (OASDispatchRoute) api.createVehicleDispatchRoute(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Deactivate a driver with the given id.
     */
    @isTest
    private static void deactivateDriverTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'driverIdOrExternalId' => 'null'
        };

        OASClient client;
        OASFleetApi api;
        String js = '';

        api = new OASFleetApi(new OASClient());

        api.deactivateDriver(params);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * Delete a dispatch route and its associated jobs.
     */
    @isTest
    private static void deleteDispatchRouteByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'routeId' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        String js = '';

        api = new OASFleetApi(new OASClient());

        api.deleteDispatchRouteById(params);
    }

    /**
     * /addresses/{addressId}
     *
     * Delete an address.
     */
    @isTest
    private static void deleteOrganizationAddressTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'addressId' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        String js = '';

        api = new OASFleetApi(new OASClient());

        api.deleteOrganizationAddress(params);
    }

    /**
     * /fleet/dispatch/routes
     *
     * Fetch all of the dispatch routes for the group.
     */
    @isTest
    private static void fetchAllDispatchRoutesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupId' => 2147483648L,
            'endTime' => 2147483648L,
            'duration' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        List<OASDispatchRoute> response;
        List<OASDispatchRoute> expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASDispatchRoute>) api.fetchAllDispatchRoutes(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/dispatch/routes/job_updates
     *
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     */
    @isTest
    private static void fetchAllRouteJobUpdatesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupId' => 2147483648L,
            'sequenceId' => 'null',
            'include' => 'null'
        };

        OASClient client;
        OASFleetApi api;
        OASAllRouteJobUpdates response;
        OASAllRouteJobUpdates expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASAllRouteJobUpdates.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAllRouteJobUpdates.getExample();
        response = (OASAllRouteJobUpdates) api.fetchAllRouteJobUpdates(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/assets/locations
     *
     * Fetch current locations of all assets for the group.
     */
    @isTest
    private static void getAllAssetCurrentLocationsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupId' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        OASInlineResponse2001 response;
        OASInlineResponse2001 expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASInlineResponse2001.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse2001.getExample();
        response = (OASInlineResponse2001) api.getAllAssetCurrentLocations(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/assets
     *
     * Fetch all of the assets for the group.
     */
    @isTest
    private static void getAllAssetsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupId' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        OASInlineResponse200 response;
        OASInlineResponse200 expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASInlineResponse200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse200.getExample();
        response = (OASInlineResponse200) api.getAllAssets(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/inactive
     *
     * Fetch all deactivated drivers for the group.
     */
    @isTest
    private static void getAllDeactivatedDriversTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupId' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        List<OASDriver> response;
        List<OASDriver> expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(new List<OASDriver>{OASDriver.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASDriver>{OASDriver.getExample()};
        response = (List<OASDriver>) api.getAllDeactivatedDrivers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     *
     * Fetch the historical locations for the asset.
     */
    @isTest
    private static void getAssetLocationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'assetId' => 2147483648L,
            'startMs' => 2147483648L,
            'endMs' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        List<Object> response;
        List<Object> expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<Object>) api.getAssetLocation(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     *
     * Fetch the reefer-specific stats of an asset.
     */
    @isTest
    private static void getAssetReeferTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'assetId' => 2147483648L,
            'startMs' => 2147483648L,
            'endMs' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        OASAssetReeferResponse response;
        OASAssetReeferResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASAssetReeferResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetReeferResponse.getExample();
        response = (OASAssetReeferResponse) api.getAssetReefer(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Fetch deactivated driver by id.
     */
    @isTest
    private static void getDeactivatedDriverByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'driverIdOrExternalId' => 'null'
        };

        OASClient client;
        OASFleetApi api;
        OASDriver response;
        OASDriver expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDriver.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriver.getExample();
        response = (OASDriver) api.getDeactivatedDriverById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     *
     * Fetch a dispatch route by id.
     */
    @isTest
    private static void getDispatchRouteByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'routeId' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        OASDispatchRoute response;
        OASDispatchRoute expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDispatchRoute.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDispatchRoute.getExample();
        response = (OASDispatchRoute) api.getDispatchRouteById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     *
     * Fetch the history of a dispatch route.
     */
    @isTest
    private static void getDispatchRouteHistoryTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'routeId' => 2147483648L,
            'startTime' => 2147483648L,
            'endTime' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        OASDispatchRouteHistory response;
        OASDispatchRouteHistory expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDispatchRouteHistory.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDispatchRouteHistory.getExample();
        response = (OASDispatchRouteHistory) api.getDispatchRouteHistory(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * Fetch all of the dispatch routes for a given driver.
     */
    @isTest
    private static void getDispatchRoutesByDriverIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'driverId' => 2147483648L,
            'endTime' => 2147483648L,
            'duration' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        List<OASDispatchRoute> response;
        List<OASDispatchRoute> expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASDispatchRoute>) api.getDispatchRoutesByDriverId(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * Fetch all of the dispatch routes for a given vehicle.
     */
    @isTest
    private static void getDispatchRoutesByVehicleIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'vehicleId' => 2147483648L,
            'endTime' => 2147483648L,
            'duration' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        List<OASDispatchRoute> response;
        List<OASDispatchRoute> expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASDispatchRoute>) api.getDispatchRoutesByVehicleId(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Fetch driver by id.
     */
    @isTest
    private static void getDriverByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'driverIdOrExternalId' => 'null'
        };

        OASClient client;
        OASFleetApi api;
        OASDriver response;
        OASDriver expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDriver.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriver.getExample();
        response = (OASDriver) api.getDriverById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/document_types
     *
     * Fetch all of the document types.
     */
    @isTest
    private static void getDriverDocumentTypesByOrgIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASFleetApi api;
        List<OASDocumentType> response;
        List<OASDocumentType> expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASDocumentType>) api.getDriverDocumentTypesByOrgId();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/documents
     *
     * Fetch all of the documents.
     */
    @isTest
    private static void getDriverDocumentsByOrgIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'endMs' => 2147483648L,
            'durationMs' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        List<OASDocument> response;
        List<OASDocument> expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASDocument>) api.getDriverDocumentsByOrgId(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     *
     * Fetch the safety score for the driver.
     */
    @isTest
    private static void getDriverSafetyScoreTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'driverId' => 2147483648L,
            'accessToken' => 'null',
            'startMs' => 2147483648L,
            'endMs' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        OASDriverSafetyScoreResponse response;
        OASDriverSafetyScoreResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDriverSafetyScoreResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriverSafetyScoreResponse.getExample();
        response = (OASDriverSafetyScoreResponse) api.getDriverSafetyScore(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/maintenance/dvirs
     *
     * Get DVIRs for the org within provided time constraints
     */
    @isTest
    private static void getDvirsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'endMs' => Integer.getExample(),
            'durationMs' => Integer.getExample(),
            'groupId' => Integer.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASDvirListResponse response;
        OASDvirListResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDvirListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDvirListResponse.getExample();
        response = (OASDvirListResponse) api.getDvirs(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers
     *
     * Get all the drivers for the specified group.
     */
    @isTest
    private static void getFleetDriversTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupDriversParam' => OASInlineObject3.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASDriversResponse response;
        OASDriversResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDriversResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriversResponse.getExample();
        response = (OASDriversResponse) api.getFleetDrivers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     *
     * Get summarized daily HOS charts for a specified driver.
     */
    @isTest
    private static void getFleetDriversHosDailyLogsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'driverId' => 2147483648L,
            'hosLogsParam' => OASInlineObject6.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASDriverDailyLogResponse response;
        OASDriverDailyLogResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDriverDailyLogResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriverDailyLogResponse.getExample();
        response = (OASDriverDailyLogResponse) api.getFleetDriversHosDailyLogs(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/summary
     *
     * Get the distance and time each driver in an organization has driven in a given time period.
     */
    @isTest
    private static void getFleetDriversSummaryTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'driversSummaryParam' => OASInlineObject5.getExample(),
            'snapToDayBounds' => Boolean.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASDriversSummaryResponse response;
        OASDriversSummaryResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDriversSummaryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriversSummaryResponse.getExample();
        response = (OASDriversSummaryResponse) api.getFleetDriversSummary(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/hos_authentication_logs
     *
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     */
    @isTest
    private static void getFleetHosAuthenticationLogsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'hosAuthenticationLogsParam' => OASInlineObject7.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASHosAuthenticationLogsResponse response;
        OASHosAuthenticationLogsResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASHosAuthenticationLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASHosAuthenticationLogsResponse.getExample();
        response = (OASHosAuthenticationLogsResponse) api.getFleetHosAuthenticationLogs(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/hos_logs
     *
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     */
    @isTest
    private static void getFleetHosLogsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'hosLogsParam' => OASInlineObject8.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASHosLogsResponse response;
        OASHosLogsResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASHosLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASHosLogsResponse.getExample();
        response = (OASHosLogsResponse) api.getFleetHosLogs(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/hos_logs_summary
     *
     * Get the current HOS status for all drivers in the group.
     */
    @isTest
    private static void getFleetHosLogsSummaryTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'hosLogsParam' => OASInlineObject9.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASHosLogsSummaryResponse response;
        OASHosLogsSummaryResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASHosLogsSummaryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASHosLogsSummaryResponse.getExample();
        response = (OASHosLogsSummaryResponse) api.getFleetHosLogsSummary(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/locations
     *
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     */
    @isTest
    private static void getFleetLocationsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupParam' => OASInlineObject11.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASInlineResponse2003 response;
        OASInlineResponse2003 expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASInlineResponse2003.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse2003.getExample();
        response = (OASInlineResponse2003) api.getFleetLocations(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/maintenance/list
     *
     * Get list of the vehicles with any engine faults or check light data.
     */
    @isTest
    private static void getFleetMaintenanceListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupParam' => OASInlineObject13.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASInlineResponse2004 response;
        OASInlineResponse2004 expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASInlineResponse2004.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse2004.getExample();
        response = (OASInlineResponse2004) api.getFleetMaintenanceList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/trips
     *
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     */
    @isTest
    private static void getFleetTripsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'tripsParam' => OASInlineObject15.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASTripResponse response;
        OASTripResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASTripResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTripResponse.getExample();
        response = (OASTripResponse) api.getFleetTrips(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Gets a specific vehicle.
     */
    @isTest
    private static void getFleetVehicleTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'vehicleIdOrExternalId' => 'null'
        };

        OASClient client;
        OASFleetApi api;
        OASFleetVehicleResponse response;
        OASFleetVehicleResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASFleetVehicleResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFleetVehicleResponse.getExample();
        response = (OASFleetVehicleResponse) api.getFleetVehicle(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /addresses/{addressId}
     *
     * Fetch an address by its id.
     */
    @isTest
    private static void getOrganizationAddressTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'addressId' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        OASAddress response;
        OASAddress expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASAddress.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddress.getExample();
        response = (OASAddress) api.getOrganizationAddress(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /addresses
     *
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     */
    @isTest
    private static void getOrganizationAddressesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null'
        };

        OASClient client;
        OASFleetApi api;
        List<OASAddress> response;
        List<OASAddress> expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(new List<OASAddress>{OASAddress.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASAddress>{OASAddress.getExample()};
        response = (List<OASAddress>) api.getOrganizationAddresses(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /contacts/{contact_id}
     *
     * Fetch a contact by its id.
     */
    @isTest
    private static void getOrganizationContactTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'contactId' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        OASContact response;
        OASContact expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASContact.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASContact.getExample();
        response = (OASContact) api.getOrganizationContact(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     *
     * Fetch harsh event details for a vehicle.
     */
    @isTest
    private static void getVehicleHarshEventTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vehicleId' => 2147483648L,
            'accessToken' => 'null',
            'timestamp' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        OASVehicleHarshEventResponse response;
        OASVehicleHarshEventResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASVehicleHarshEventResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVehicleHarshEventResponse.getExample();
        response = (OASVehicleHarshEventResponse) api.getVehicleHarshEvent(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     *
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     */
    @isTest
    private static void getVehicleLocationsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'vehicleId' => 2147483648L,
            'startMs' => 2147483648L,
            'endMs' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        List<OASFleetVehicleLocation> response;
        List<OASFleetVehicleLocation> expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASFleetVehicleLocation>) api.getVehicleLocations(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     *
     * Fetch the safety score for the vehicle.
     */
    @isTest
    private static void getVehicleSafetyScoreTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vehicleId' => 2147483648L,
            'accessToken' => 'null',
            'startMs' => 2147483648L,
            'endMs' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        OASVehicleSafetyScoreResponse response;
        OASVehicleSafetyScoreResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASVehicleSafetyScoreResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVehicleSafetyScoreResponse.getExample();
        response = (OASVehicleSafetyScoreResponse) api.getVehicleSafetyScore(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/vehicles/stats
     *
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     */
    @isTest
    private static void getVehicleStatsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'startMs' => Integer.getExample(),
            'endMs' => Integer.getExample(),
            'series' => engineState,
            'tagIds' => 'null',
            'startingAfter' => 'null',
            'endingBefore' => 'null',
            'r_limit' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        OASInlineResponse2005 response;
        OASInlineResponse2005 expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASInlineResponse2005.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse2005.getExample();
        response = (OASInlineResponse2005) api.getVehicleStats(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/vehicles/locations
     *
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     */
    @isTest
    private static void getVehiclesLocationsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'startMs' => Integer.getExample(),
            'endMs' => Integer.getExample()
        };

        OASClient client;
        OASFleetApi api;
        List<Object> response;
        List<Object> expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<Object>) api.getVehiclesLocations(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /contacts
     *
     * Fetch all contacts for the organization.
     */
    @isTest
    private static void listContactsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null'
        };

        OASClient client;
        OASFleetApi api;
        List<OASContact> response;
        List<OASContact> expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(new List<OASContact>{OASContact.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASContact>{OASContact.getExample()};
        response = (List<OASContact>) api.listContacts(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/list
     *
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     */
    @isTest
    private static void listFleetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupParam' => OASInlineObject10.getExample(),
            'startingAfter' => 'null',
            'endingBefore' => 'null',
            'r_limit' => 2147483648L
        };

        OASClient client;
        OASFleetApi api;
        OASInlineResponse2002 response;
        OASInlineResponse2002 expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASInlineResponse2002.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse2002.getExample();
        response = (OASInlineResponse2002) api.listFleet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     */
    @isTest
    private static void patchFleetVehicleTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'vehicleIdOrExternalId' => 'null',
            'data' => OASInlineObject16.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASFleetVehicleResponse response;
        OASFleetVehicleResponse expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASFleetVehicleResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFleetVehicleResponse.getExample();
        response = (OASFleetVehicleResponse) api.patchFleetVehicle(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Reactivate the inactive driver having id.
     */
    @isTest
    private static void reactivateDriverByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'driverIdOrExternalId' => 'null',
            'reactivateDriverParam' => OASInlineObject4.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASDriver response;
        OASDriver expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDriver.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriver.getExample();
        response = (OASDriver) api.reactivateDriverById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * Update a dispatch route and its associated jobs.
     */
    @isTest
    private static void updateDispatchRouteByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'routeId' => 2147483648L,
            'updateDispatchRouteParams' => OASDispatchRoute.getExample()
        };

        OASClient client;
        OASFleetApi api;
        OASDispatchRoute response;
        OASDispatchRoute expectedResponse;
        String js = '';

        api = new OASFleetApi(new OASClient());

        js = JSON.serialize(OASDispatchRoute.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDispatchRoute.getExample();
        response = (OASDispatchRoute) api.updateDispatchRouteById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /addresses/{addressId}
     *
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     */
    @isTest
    private static void updateOrganizationAddressTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'addressId' => 2147483648L,
            'address' => OASInlineObject1.getExample()
        };

        OASClient client;
        OASFleetApi api;
        String js = '';

        api = new OASFleetApi(new OASClient());

        api.updateOrganizationAddress(params);
    }

    /**
     * /fleet/set_data
     *
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     */
    @isTest
    private static void updateVehiclesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'vehicleUpdateParam' => OASInlineObject14.getExample()
        };

        OASClient client;
        OASFleetApi api;
        String js = '';

        api = new OASFleetApi(new OASClient());

        api.updateVehicles(params);
    }
}