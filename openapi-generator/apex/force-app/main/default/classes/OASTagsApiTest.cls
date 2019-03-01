@isTest
private class OASTagsApiTest {
    /**
     * /tags
     *
     * Create a new tag for the group.
     */
    @isTest
    private static void createTagTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'tagCreateParams' => OASTagCreate.getExample()
        };

        OASClient client;
        OASTagsApi api;
        OASTag response;
        OASTag expectedResponse;
        String js = '';

        api = new OASTagsApi(new OASClient());

        js = JSON.serialize(OASTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTag.getExample();
        response = (OASTag) api.createTag(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /tags/{tag_id:[0-9]+}
     *
     * Permanently deletes a tag.
     */
    @isTest
    private static void deleteTagByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'tagId' => 2147483648L
        };

        OASClient client;
        OASTagsApi api;
        String js = '';

        api = new OASTagsApi(new OASClient());

        api.deleteTagById(params);
    }

    /**
     * /tags
     *
     * Fetch all of the tags for a group.
     */
    @isTest
    private static void getAllTagsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'groupId' => 2147483648L
        };

        OASClient client;
        OASTagsApi api;
        OASInlineResponse2009 response;
        OASInlineResponse2009 expectedResponse;
        String js = '';

        api = new OASTagsApi(new OASClient());

        js = JSON.serialize(OASInlineResponse2009.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInlineResponse2009.getExample();
        response = (OASInlineResponse2009) api.getAllTags(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /tags/{tag_id:[0-9]+}
     *
     * Fetch a tag by id.
     */
    @isTest
    private static void getTagByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'tagId' => 2147483648L
        };

        OASClient client;
        OASTagsApi api;
        OASTag response;
        OASTag expectedResponse;
        String js = '';

        api = new OASTagsApi(new OASClient());

        js = JSON.serialize(OASTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTag.getExample();
        response = (OASTag) api.getTagById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /tags/{tag_id:[0-9]+}
     *
     * Add or delete specific members from a tag, or modify the name of a tag.
     */
    @isTest
    private static void modifyTagByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'tagId' => 2147483648L,
            'tagModifyParams' => OASTagModify.getExample()
        };

        OASClient client;
        OASTagsApi api;
        OASTag response;
        OASTag expectedResponse;
        String js = '';

        api = new OASTagsApi(new OASClient());

        js = JSON.serialize(OASTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTag.getExample();
        response = (OASTag) api.modifyTagById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /tags/{tag_id:[0-9]+}
     *
     * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
     */
    @isTest
    private static void updateTagByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'tagId' => 2147483648L,
            'updateTagParams' => OASTagUpdate.getExample()
        };

        OASClient client;
        OASTagsApi api;
        OASTag response;
        OASTag expectedResponse;
        String js = '';

        api = new OASTagsApi(new OASClient());

        js = JSON.serialize(OASTag.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTag.getExample();
        response = (OASTag) api.updateTagById(params);
        System.assertEquals(expectedResponse, response);
    }
}