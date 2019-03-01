@isTest
private class OASAssetsApiTest {
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
        OASAssetsApi api;
        OASInlineResponse2001 response;
        OASInlineResponse2001 expectedResponse;
        String js = '';

        api = new OASAssetsApi(new OASClient());

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
        OASAssetsApi api;
        OASInlineResponse200 response;
        OASInlineResponse200 expectedResponse;
        String js = '';

        api = new OASAssetsApi(new OASClient());

        js = JSON.serialize(OASInlineResponse200.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse200.getExample();
        response = (OASInlineResponse200) api.getAllAssets(params);
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
        OASAssetsApi api;
        List<Object> response;
        List<Object> expectedResponse;
        String js = '';

        api = new OASAssetsApi(new OASClient());

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
        OASAssetsApi api;
        OASAssetReeferResponse response;
        OASAssetReeferResponse expectedResponse;
        String js = '';

        api = new OASAssetsApi(new OASClient());

        js = JSON.serialize(OASAssetReeferResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssetReeferResponse.getExample();
        response = (OASAssetReeferResponse) api.getAssetReefer(params);
        System.assertEquals(expectedResponse, response);
    }
}