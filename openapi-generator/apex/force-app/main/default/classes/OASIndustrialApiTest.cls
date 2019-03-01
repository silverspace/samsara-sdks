@isTest
private class OASIndustrialApiTest {
    /**
     * /industrial/data
     *
     * Fetch all of the data inputs for a group.
     */
    @isTest
    private static void getAllDataInputsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupId' => 2147483648L,
            'startMs' => 2147483648L,
            'endMs' => 2147483648L
        };

        OASClient client;
        OASIndustrialApi api;
        OASInlineResponse2006 response;
        OASInlineResponse2006 expectedResponse;
        String js = '';

        api = new OASIndustrialApi(new OASClient());

        js = JSON.serialize(OASInlineResponse2006.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse2006.getExample();
        response = (OASInlineResponse2006) api.getAllDataInputs(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /industrial/data/{data_input_id:[0-9]+}
     *
     * Fetch datapoints from a given data input.
     */
    @isTest
    private static void getDataInputTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'dataInputId' => 2147483648L,
            'startMs' => 2147483648L,
            'endMs' => 2147483648L
        };

        OASClient client;
        OASIndustrialApi api;
        OASDataInputHistoryResponse response;
        OASDataInputHistoryResponse expectedResponse;
        String js = '';

        api = new OASIndustrialApi(new OASClient());

        js = JSON.serialize(OASDataInputHistoryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDataInputHistoryResponse.getExample();
        response = (OASDataInputHistoryResponse) api.getDataInput(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /machines/list
     *
     * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
     */
    @isTest
    private static void getMachinesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupParam' => OASInlineObject18.getExample()
        };

        OASClient client;
        OASIndustrialApi api;
        OASInlineResponse2007 response;
        OASInlineResponse2007 expectedResponse;
        String js = '';

        api = new OASIndustrialApi(new OASClient());

        js = JSON.serialize(OASInlineResponse2007.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse2007.getExample();
        response = (OASInlineResponse2007) api.getMachines(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /machines/history
     *
     * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
     */
    @isTest
    private static void getMachinesHistoryTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'historyParam' => OASInlineObject17.getExample()
        };

        OASClient client;
        OASIndustrialApi api;
        OASMachineHistoryResponse response;
        OASMachineHistoryResponse expectedResponse;
        String js = '';

        api = new OASIndustrialApi(new OASClient());

        js = JSON.serialize(OASMachineHistoryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMachineHistoryResponse.getExample();
        response = (OASMachineHistoryResponse) api.getMachinesHistory(params);
        System.assertEquals(expectedResponse, response);
    }
}