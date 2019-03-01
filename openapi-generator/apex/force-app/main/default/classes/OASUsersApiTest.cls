@isTest
private class OASUsersApiTest {
    /**
     * /users/{userId:[0-9]+}
     *
     * Remove a user from the organization.
     */
    @isTest
    private static void deleteUserByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'userId' => 2147483648L
        };

        OASClient client;
        OASUsersApi api;
        String js = '';

        api = new OASUsersApi(new OASClient());

        api.deleteUserById(params);
    }

    /**
     * /users/{userId:[0-9]+}
     *
     * Get a user.
     */
    @isTest
    private static void getUserByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null',
            'userId' => 2147483648L
        };

        OASClient client;
        OASUsersApi api;
        OASUser response;
        OASUser expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        js = JSON.serialize(OASUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUser.getExample();
        response = (OASUser) api.getUserById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /user_roles
     *
     * Get all roles in the organization.
     */
    @isTest
    private static void listUserRolesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null'
        };

        OASClient client;
        OASUsersApi api;
        List<OASUserRole> response;
        List<OASUserRole> expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        js = JSON.serialize(new List<OASUserRole>{OASUserRole.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASUserRole>{OASUserRole.getExample()};
        response = (List<OASUserRole>) api.listUserRoles(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * /users
     *
     * List all users in the organization.
     */
    @isTest
    private static void listUsersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accessToken' => 'null'
        };

        OASClient client;
        OASUsersApi api;
        List<OASUser> response;
        List<OASUser> expectedResponse;
        String js = '';

        api = new OASUsersApi(new OASClient());

        js = JSON.serialize(new List<OASUser>{OASUser.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASUser>{OASUser.getExample()};
        response = (List<OASUser>) api.listUsers(params);
        System.assertEquals(expectedResponse, response);
    }
}