@isTest
private class OASDriversApiTest {
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
        OASDriversApi api;
        OASDriver response;
        OASDriver expectedResponse;
        String js = '';

        api = new OASDriversApi(new OASClient());

        js = JSON.serialize(OASDriver.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriver.getExample();
        response = (OASDriver) api.createDriver(params);
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
        OASDriversApi api;
        String js = '';

        api = new OASDriversApi(new OASClient());

        api.deactivateDriver(params);
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
        OASDriversApi api;
        List<OASDriver> response;
        List<OASDriver> expectedResponse;
        String js = '';

        api = new OASDriversApi(new OASClient());

        js = JSON.serialize(new List<OASDriver>{OASDriver.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASDriver>{OASDriver.getExample()};
        response = (List<OASDriver>) api.getAllDeactivatedDrivers(params);
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
        OASDriversApi api;
        OASDriver response;
        OASDriver expectedResponse;
        String js = '';

        api = new OASDriversApi(new OASClient());

        js = JSON.serialize(OASDriver.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriver.getExample();
        response = (OASDriver) api.getDeactivatedDriverById(params);
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
        OASDriversApi api;
        OASDriver response;
        OASDriver expectedResponse;
        String js = '';

        api = new OASDriversApi(new OASClient());

        js = JSON.serialize(OASDriver.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriver.getExample();
        response = (OASDriver) api.getDriverById(params);
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
        OASDriversApi api;
        OASDriver response;
        OASDriver expectedResponse;
        String js = '';

        api = new OASDriversApi(new OASClient());

        js = JSON.serialize(OASDriver.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriver.getExample();
        response = (OASDriver) api.reactivateDriverById(params);
        System.assertEquals(expectedResponse, response);
    }
}