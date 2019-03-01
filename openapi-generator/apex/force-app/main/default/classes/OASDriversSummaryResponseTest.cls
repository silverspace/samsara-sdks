@isTest
private class OASDriversSummaryResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDriversSummaryResponse driversSummaryResponse1 = OASDriversSummaryResponse.getExample();
        OASDriversSummaryResponse driversSummaryResponse2 = driversSummaryResponse1;
        OASDriversSummaryResponse driversSummaryResponse3 = new OASDriversSummaryResponse();
        OASDriversSummaryResponse driversSummaryResponse4 = driversSummaryResponse3;

        System.assert(driversSummaryResponse1.equals(driversSummaryResponse2));
        System.assert(driversSummaryResponse2.equals(driversSummaryResponse1));
        System.assert(driversSummaryResponse1.equals(driversSummaryResponse1));
        System.assert(driversSummaryResponse3.equals(driversSummaryResponse4));
        System.assert(driversSummaryResponse4.equals(driversSummaryResponse3));
        System.assert(driversSummaryResponse3.equals(driversSummaryResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDriversSummaryResponse driversSummaryResponse1 = OASDriversSummaryResponse.getExample();
        OASDriversSummaryResponse driversSummaryResponse2 = OASDriversSummaryResponse.getExample();
        OASDriversSummaryResponse driversSummaryResponse3 = new OASDriversSummaryResponse();
        OASDriversSummaryResponse driversSummaryResponse4 = new OASDriversSummaryResponse();

        System.assert(driversSummaryResponse1.equals(driversSummaryResponse2));
        System.assert(driversSummaryResponse2.equals(driversSummaryResponse1));
        System.assert(driversSummaryResponse3.equals(driversSummaryResponse4));
        System.assert(driversSummaryResponse4.equals(driversSummaryResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDriversSummaryResponse driversSummaryResponse1 = OASDriversSummaryResponse.getExample();
        OASDriversSummaryResponse driversSummaryResponse2 = new OASDriversSummaryResponse();

        System.assertEquals(false, driversSummaryResponse1.equals('foo'));
        System.assertEquals(false, driversSummaryResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDriversSummaryResponse driversSummaryResponse1 = OASDriversSummaryResponse.getExample();
        OASDriversSummaryResponse driversSummaryResponse2 = new OASDriversSummaryResponse();
        OASDriversSummaryResponse driversSummaryResponse3;

        System.assertEquals(false, driversSummaryResponse1.equals(driversSummaryResponse3));
        System.assertEquals(false, driversSummaryResponse2.equals(driversSummaryResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDriversSummaryResponse driversSummaryResponse1 = OASDriversSummaryResponse.getExample();
        OASDriversSummaryResponse driversSummaryResponse2 = new OASDriversSummaryResponse();

        System.assertEquals(driversSummaryResponse1.hashCode(), driversSummaryResponse1.hashCode());
        System.assertEquals(driversSummaryResponse2.hashCode(), driversSummaryResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDriversSummaryResponse driversSummaryResponse1 = OASDriversSummaryResponse.getExample();
        OASDriversSummaryResponse driversSummaryResponse2 = OASDriversSummaryResponse.getExample();
        OASDriversSummaryResponse driversSummaryResponse3 = new OASDriversSummaryResponse();
        OASDriversSummaryResponse driversSummaryResponse4 = new OASDriversSummaryResponse();

        System.assert(driversSummaryResponse1.equals(driversSummaryResponse2));
        System.assert(driversSummaryResponse3.equals(driversSummaryResponse4));
        System.assertEquals(driversSummaryResponse1.hashCode(), driversSummaryResponse2.hashCode());
        System.assertEquals(driversSummaryResponse3.hashCode(), driversSummaryResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDriversSummaryResponse driversSummaryResponse = new OASDriversSummaryResponse();
        Map<String, String> propertyMappings = driversSummaryResponse.getPropertyMappings();
        System.assertEquals('summaries', propertyMappings.get('Summaries'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDriversSummaryResponse driversSummaryResponse = new OASDriversSummaryResponse();
        System.assertEquals(new List<OASDriversSummaryResponseSummaries>(), driversSummaryResponse.summaries);
    }
}
