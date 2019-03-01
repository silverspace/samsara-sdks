@isTest
private class OASSensorsApiTest {
    /**
     * /sensors/list
     *
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     */
    @isTest
    private static void getSensorsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupParam' => OASInlineObject23.getExample()
        };

        OASClient client;
        OASSensorsApi api;
        OASInlineResponse2008 response;
        OASInlineResponse2008 expectedResponse;
        String js = '';

        api = new OASSensorsApi(new OASClient());

        js = JSON.serialize(OASInlineResponse2008.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse2008.getExample();
        response = (OASInlineResponse2008) api.getSensors(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /sensors/cargo
     *
     * Get cargo monitor status (empty / full) for requested sensors.
     */
    @isTest
    private static void getSensorsCargoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'sensorParam' => OASInlineObject19.getExample()
        };

        OASClient client;
        OASSensorsApi api;
        OASCargoResponse response;
        OASCargoResponse expectedResponse;
        String js = '';

        api = new OASSensorsApi(new OASClient());

        js = JSON.serialize(OASCargoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCargoResponse.getExample();
        response = (OASCargoResponse) api.getSensorsCargo(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /sensors/door
     *
     * Get door monitor status (closed / open) for requested sensors.
     */
    @isTest
    private static void getSensorsDoorTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'sensorParam' => OASInlineObject20.getExample()
        };

        OASClient client;
        OASSensorsApi api;
        OASDoorResponse response;
        OASDoorResponse expectedResponse;
        String js = '';

        api = new OASSensorsApi(new OASClient());

        js = JSON.serialize(OASDoorResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDoorResponse.getExample();
        response = (OASDoorResponse) api.getSensorsDoor(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /sensors/history
     *
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     */
    @isTest
    private static void getSensorsHistoryTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'historyParam' => OASInlineObject21.getExample()
        };

        OASClient client;
        OASSensorsApi api;
        OASSensorHistoryResponse response;
        OASSensorHistoryResponse expectedResponse;
        String js = '';

        api = new OASSensorsApi(new OASClient());

        js = JSON.serialize(OASSensorHistoryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSensorHistoryResponse.getExample();
        response = (OASSensorHistoryResponse) api.getSensorsHistory(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /sensors/humidity
     *
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     */
    @isTest
    private static void getSensorsHumidityTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'sensorParam' => OASInlineObject22.getExample()
        };

        OASClient client;
        OASSensorsApi api;
        OASHumidityResponse response;
        OASHumidityResponse expectedResponse;
        String js = '';

        api = new OASSensorsApi(new OASClient());

        js = JSON.serialize(OASHumidityResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASHumidityResponse.getExample();
        response = (OASHumidityResponse) api.getSensorsHumidity(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /sensors/temperature
     *
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     */
    @isTest
    private static void getSensorsTemperatureTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'sensorParam' => OASInlineObject24.getExample()
        };

        OASClient client;
        OASSensorsApi api;
        OASTemperatureResponse response;
        OASTemperatureResponse expectedResponse;
        String js = '';

        api = new OASSensorsApi(new OASClient());

        js = JSON.serialize(OASTemperatureResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTemperatureResponse.getExample();
        response = (OASTemperatureResponse) api.getSensorsTemperature(params);
        System.assertEquals(expectedResponse, response);
    }
}