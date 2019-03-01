@isTest
private class OASSafetyApiTest {
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
        OASSafetyApi api;
        OASDriverSafetyScoreResponse response;
        OASDriverSafetyScoreResponse expectedResponse;
        String js = '';

        api = new OASSafetyApi(new OASClient());

        js = JSON.serialize(OASDriverSafetyScoreResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDriverSafetyScoreResponse.getExample();
        response = (OASDriverSafetyScoreResponse) api.getDriverSafetyScore(params);
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
        OASSafetyApi api;
        OASVehicleHarshEventResponse response;
        OASVehicleHarshEventResponse expectedResponse;
        String js = '';

        api = new OASSafetyApi(new OASClient());

        js = JSON.serialize(OASVehicleHarshEventResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVehicleHarshEventResponse.getExample();
        response = (OASVehicleHarshEventResponse) api.getVehicleHarshEvent(params);
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
        OASSafetyApi api;
        OASVehicleSafetyScoreResponse response;
        OASVehicleSafetyScoreResponse expectedResponse;
        String js = '';

        api = new OASSafetyApi(new OASClient());

        js = JSON.serialize(OASVehicleSafetyScoreResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVehicleSafetyScoreResponse.getExample();
        response = (OASVehicleSafetyScoreResponse) api.getVehicleSafetyScore(params);
        System.assertEquals(expectedResponse, response);
    }
}