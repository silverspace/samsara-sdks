@isTest
private class OASRoutesApiTest {
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
        OASRoutesApi api;
        OASDispatchRoute response;
        OASDispatchRoute expectedResponse;
        String js = '';

        api = new OASRoutesApi(new OASClient());

        js = JSON.serialize(OASDispatchRoute.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDispatchRoute.getExample();
        response = (OASDispatchRoute) api.createDispatchRoute(params);
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
        OASRoutesApi api;
        OASDispatchRoute response;
        OASDispatchRoute expectedResponse;
        String js = '';

        api = new OASRoutesApi(new OASClient());

        js = JSON.serialize(OASDispatchRoute.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDispatchRoute.getExample();
        response = (OASDispatchRoute) api.createDriverDispatchRoute(params);
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
        OASRoutesApi api;
        OASDispatchRoute response;
        OASDispatchRoute expectedResponse;
        String js = '';

        api = new OASRoutesApi(new OASClient());

        js = JSON.serialize(OASDispatchRoute.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDispatchRoute.getExample();
        response = (OASDispatchRoute) api.createVehicleDispatchRoute(params);
        System.assertEquals(expectedResponse, response);
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
        OASRoutesApi api;
        String js = '';

        api = new OASRoutesApi(new OASClient());

        api.deleteDispatchRouteById(params);
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
        OASRoutesApi api;
        List<OASDispatchRoute> response;
        List<OASDispatchRoute> expectedResponse;
        String js = '';

        api = new OASRoutesApi(new OASClient());

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
        OASRoutesApi api;
        OASAllRouteJobUpdates response;
        OASAllRouteJobUpdates expectedResponse;
        String js = '';

        api = new OASRoutesApi(new OASClient());

        js = JSON.serialize(OASAllRouteJobUpdates.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAllRouteJobUpdates.getExample();
        response = (OASAllRouteJobUpdates) api.fetchAllRouteJobUpdates(params);
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
        OASRoutesApi api;
        OASDispatchRoute response;
        OASDispatchRoute expectedResponse;
        String js = '';

        api = new OASRoutesApi(new OASClient());

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
        OASRoutesApi api;
        OASDispatchRouteHistory response;
        OASDispatchRouteHistory expectedResponse;
        String js = '';

        api = new OASRoutesApi(new OASClient());

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
        OASRoutesApi api;
        List<OASDispatchRoute> response;
        List<OASDispatchRoute> expectedResponse;
        String js = '';

        api = new OASRoutesApi(new OASClient());

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
        OASRoutesApi api;
        List<OASDispatchRoute> response;
        List<OASDispatchRoute> expectedResponse;
        String js = '';

        api = new OASRoutesApi(new OASClient());

        js = JSON.serialize(List.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = List.getExample();
        response = (List<OASDispatchRoute>) api.getDispatchRoutesByVehicleId(params);
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
        OASRoutesApi api;
        OASDispatchRoute response;
        OASDispatchRoute expectedResponse;
        String js = '';

        api = new OASRoutesApi(new OASClient());

        js = JSON.serialize(OASDispatchRoute.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDispatchRoute.getExample();
        response = (OASDispatchRoute) api.updateDispatchRouteById(params);
        System.assertEquals(expectedResponse, response);
    }
}