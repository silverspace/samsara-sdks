@isTest
private class OASHosLogsSummaryResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASHosLogsSummaryResponse hosLogsSummaryResponse1 = OASHosLogsSummaryResponse.getExample();
        OASHosLogsSummaryResponse hosLogsSummaryResponse2 = hosLogsSummaryResponse1;
        OASHosLogsSummaryResponse hosLogsSummaryResponse3 = new OASHosLogsSummaryResponse();
        OASHosLogsSummaryResponse hosLogsSummaryResponse4 = hosLogsSummaryResponse3;

        System.assert(hosLogsSummaryResponse1.equals(hosLogsSummaryResponse2));
        System.assert(hosLogsSummaryResponse2.equals(hosLogsSummaryResponse1));
        System.assert(hosLogsSummaryResponse1.equals(hosLogsSummaryResponse1));
        System.assert(hosLogsSummaryResponse3.equals(hosLogsSummaryResponse4));
        System.assert(hosLogsSummaryResponse4.equals(hosLogsSummaryResponse3));
        System.assert(hosLogsSummaryResponse3.equals(hosLogsSummaryResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHosLogsSummaryResponse hosLogsSummaryResponse1 = OASHosLogsSummaryResponse.getExample();
        OASHosLogsSummaryResponse hosLogsSummaryResponse2 = OASHosLogsSummaryResponse.getExample();
        OASHosLogsSummaryResponse hosLogsSummaryResponse3 = new OASHosLogsSummaryResponse();
        OASHosLogsSummaryResponse hosLogsSummaryResponse4 = new OASHosLogsSummaryResponse();

        System.assert(hosLogsSummaryResponse1.equals(hosLogsSummaryResponse2));
        System.assert(hosLogsSummaryResponse2.equals(hosLogsSummaryResponse1));
        System.assert(hosLogsSummaryResponse3.equals(hosLogsSummaryResponse4));
        System.assert(hosLogsSummaryResponse4.equals(hosLogsSummaryResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHosLogsSummaryResponse hosLogsSummaryResponse1 = OASHosLogsSummaryResponse.getExample();
        OASHosLogsSummaryResponse hosLogsSummaryResponse2 = new OASHosLogsSummaryResponse();

        System.assertEquals(false, hosLogsSummaryResponse1.equals('foo'));
        System.assertEquals(false, hosLogsSummaryResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHosLogsSummaryResponse hosLogsSummaryResponse1 = OASHosLogsSummaryResponse.getExample();
        OASHosLogsSummaryResponse hosLogsSummaryResponse2 = new OASHosLogsSummaryResponse();
        OASHosLogsSummaryResponse hosLogsSummaryResponse3;

        System.assertEquals(false, hosLogsSummaryResponse1.equals(hosLogsSummaryResponse3));
        System.assertEquals(false, hosLogsSummaryResponse2.equals(hosLogsSummaryResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHosLogsSummaryResponse hosLogsSummaryResponse1 = OASHosLogsSummaryResponse.getExample();
        OASHosLogsSummaryResponse hosLogsSummaryResponse2 = new OASHosLogsSummaryResponse();

        System.assertEquals(hosLogsSummaryResponse1.hashCode(), hosLogsSummaryResponse1.hashCode());
        System.assertEquals(hosLogsSummaryResponse2.hashCode(), hosLogsSummaryResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHosLogsSummaryResponse hosLogsSummaryResponse1 = OASHosLogsSummaryResponse.getExample();
        OASHosLogsSummaryResponse hosLogsSummaryResponse2 = OASHosLogsSummaryResponse.getExample();
        OASHosLogsSummaryResponse hosLogsSummaryResponse3 = new OASHosLogsSummaryResponse();
        OASHosLogsSummaryResponse hosLogsSummaryResponse4 = new OASHosLogsSummaryResponse();

        System.assert(hosLogsSummaryResponse1.equals(hosLogsSummaryResponse2));
        System.assert(hosLogsSummaryResponse3.equals(hosLogsSummaryResponse4));
        System.assertEquals(hosLogsSummaryResponse1.hashCode(), hosLogsSummaryResponse2.hashCode());
        System.assertEquals(hosLogsSummaryResponse3.hashCode(), hosLogsSummaryResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASHosLogsSummaryResponse hosLogsSummaryResponse = new OASHosLogsSummaryResponse();
        System.assertEquals(new List<OASHosLogsSummaryResponseDrivers>(), hosLogsSummaryResponse.drivers);
    }
}
