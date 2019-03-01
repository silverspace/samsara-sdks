@isTest
private class OASHosAuthenticationLogsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse1 = OASHosAuthenticationLogsResponse.getExample();
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse2 = hosAuthenticationLogsResponse1;
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse3 = new OASHosAuthenticationLogsResponse();
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse4 = hosAuthenticationLogsResponse3;

        System.assert(hosAuthenticationLogsResponse1.equals(hosAuthenticationLogsResponse2));
        System.assert(hosAuthenticationLogsResponse2.equals(hosAuthenticationLogsResponse1));
        System.assert(hosAuthenticationLogsResponse1.equals(hosAuthenticationLogsResponse1));
        System.assert(hosAuthenticationLogsResponse3.equals(hosAuthenticationLogsResponse4));
        System.assert(hosAuthenticationLogsResponse4.equals(hosAuthenticationLogsResponse3));
        System.assert(hosAuthenticationLogsResponse3.equals(hosAuthenticationLogsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse1 = OASHosAuthenticationLogsResponse.getExample();
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse2 = OASHosAuthenticationLogsResponse.getExample();
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse3 = new OASHosAuthenticationLogsResponse();
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse4 = new OASHosAuthenticationLogsResponse();

        System.assert(hosAuthenticationLogsResponse1.equals(hosAuthenticationLogsResponse2));
        System.assert(hosAuthenticationLogsResponse2.equals(hosAuthenticationLogsResponse1));
        System.assert(hosAuthenticationLogsResponse3.equals(hosAuthenticationLogsResponse4));
        System.assert(hosAuthenticationLogsResponse4.equals(hosAuthenticationLogsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse1 = OASHosAuthenticationLogsResponse.getExample();
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse2 = new OASHosAuthenticationLogsResponse();

        System.assertEquals(false, hosAuthenticationLogsResponse1.equals('foo'));
        System.assertEquals(false, hosAuthenticationLogsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse1 = OASHosAuthenticationLogsResponse.getExample();
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse2 = new OASHosAuthenticationLogsResponse();
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse3;

        System.assertEquals(false, hosAuthenticationLogsResponse1.equals(hosAuthenticationLogsResponse3));
        System.assertEquals(false, hosAuthenticationLogsResponse2.equals(hosAuthenticationLogsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse1 = OASHosAuthenticationLogsResponse.getExample();
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse2 = new OASHosAuthenticationLogsResponse();

        System.assertEquals(hosAuthenticationLogsResponse1.hashCode(), hosAuthenticationLogsResponse1.hashCode());
        System.assertEquals(hosAuthenticationLogsResponse2.hashCode(), hosAuthenticationLogsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse1 = OASHosAuthenticationLogsResponse.getExample();
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse2 = OASHosAuthenticationLogsResponse.getExample();
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse3 = new OASHosAuthenticationLogsResponse();
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse4 = new OASHosAuthenticationLogsResponse();

        System.assert(hosAuthenticationLogsResponse1.equals(hosAuthenticationLogsResponse2));
        System.assert(hosAuthenticationLogsResponse3.equals(hosAuthenticationLogsResponse4));
        System.assertEquals(hosAuthenticationLogsResponse1.hashCode(), hosAuthenticationLogsResponse2.hashCode());
        System.assertEquals(hosAuthenticationLogsResponse3.hashCode(), hosAuthenticationLogsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASHosAuthenticationLogsResponse hosAuthenticationLogsResponse = new OASHosAuthenticationLogsResponse();
        System.assertEquals(new List<OASHosAuthenticationLogsResponseAuth>(), hosAuthenticationLogsResponse.authenticationLogs);
    }
}
