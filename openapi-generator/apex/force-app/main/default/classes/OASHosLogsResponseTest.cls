@isTest
private class OASHosLogsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASHosLogsResponse hosLogsResponse1 = OASHosLogsResponse.getExample();
        OASHosLogsResponse hosLogsResponse2 = hosLogsResponse1;
        OASHosLogsResponse hosLogsResponse3 = new OASHosLogsResponse();
        OASHosLogsResponse hosLogsResponse4 = hosLogsResponse3;

        System.assert(hosLogsResponse1.equals(hosLogsResponse2));
        System.assert(hosLogsResponse2.equals(hosLogsResponse1));
        System.assert(hosLogsResponse1.equals(hosLogsResponse1));
        System.assert(hosLogsResponse3.equals(hosLogsResponse4));
        System.assert(hosLogsResponse4.equals(hosLogsResponse3));
        System.assert(hosLogsResponse3.equals(hosLogsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHosLogsResponse hosLogsResponse1 = OASHosLogsResponse.getExample();
        OASHosLogsResponse hosLogsResponse2 = OASHosLogsResponse.getExample();
        OASHosLogsResponse hosLogsResponse3 = new OASHosLogsResponse();
        OASHosLogsResponse hosLogsResponse4 = new OASHosLogsResponse();

        System.assert(hosLogsResponse1.equals(hosLogsResponse2));
        System.assert(hosLogsResponse2.equals(hosLogsResponse1));
        System.assert(hosLogsResponse3.equals(hosLogsResponse4));
        System.assert(hosLogsResponse4.equals(hosLogsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHosLogsResponse hosLogsResponse1 = OASHosLogsResponse.getExample();
        OASHosLogsResponse hosLogsResponse2 = new OASHosLogsResponse();

        System.assertEquals(false, hosLogsResponse1.equals('foo'));
        System.assertEquals(false, hosLogsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHosLogsResponse hosLogsResponse1 = OASHosLogsResponse.getExample();
        OASHosLogsResponse hosLogsResponse2 = new OASHosLogsResponse();
        OASHosLogsResponse hosLogsResponse3;

        System.assertEquals(false, hosLogsResponse1.equals(hosLogsResponse3));
        System.assertEquals(false, hosLogsResponse2.equals(hosLogsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHosLogsResponse hosLogsResponse1 = OASHosLogsResponse.getExample();
        OASHosLogsResponse hosLogsResponse2 = new OASHosLogsResponse();

        System.assertEquals(hosLogsResponse1.hashCode(), hosLogsResponse1.hashCode());
        System.assertEquals(hosLogsResponse2.hashCode(), hosLogsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHosLogsResponse hosLogsResponse1 = OASHosLogsResponse.getExample();
        OASHosLogsResponse hosLogsResponse2 = OASHosLogsResponse.getExample();
        OASHosLogsResponse hosLogsResponse3 = new OASHosLogsResponse();
        OASHosLogsResponse hosLogsResponse4 = new OASHosLogsResponse();

        System.assert(hosLogsResponse1.equals(hosLogsResponse2));
        System.assert(hosLogsResponse3.equals(hosLogsResponse4));
        System.assertEquals(hosLogsResponse1.hashCode(), hosLogsResponse2.hashCode());
        System.assertEquals(hosLogsResponse3.hashCode(), hosLogsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASHosLogsResponse hosLogsResponse = new OASHosLogsResponse();
        System.assertEquals(new List<OASHosLogsResponseLogs>(), hosLogsResponse.logs);
    }
}
