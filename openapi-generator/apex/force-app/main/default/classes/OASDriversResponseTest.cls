@isTest
private class OASDriversResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDriversResponse driversResponse1 = OASDriversResponse.getExample();
        OASDriversResponse driversResponse2 = driversResponse1;
        OASDriversResponse driversResponse3 = new OASDriversResponse();
        OASDriversResponse driversResponse4 = driversResponse3;

        System.assert(driversResponse1.equals(driversResponse2));
        System.assert(driversResponse2.equals(driversResponse1));
        System.assert(driversResponse1.equals(driversResponse1));
        System.assert(driversResponse3.equals(driversResponse4));
        System.assert(driversResponse4.equals(driversResponse3));
        System.assert(driversResponse3.equals(driversResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDriversResponse driversResponse1 = OASDriversResponse.getExample();
        OASDriversResponse driversResponse2 = OASDriversResponse.getExample();
        OASDriversResponse driversResponse3 = new OASDriversResponse();
        OASDriversResponse driversResponse4 = new OASDriversResponse();

        System.assert(driversResponse1.equals(driversResponse2));
        System.assert(driversResponse2.equals(driversResponse1));
        System.assert(driversResponse3.equals(driversResponse4));
        System.assert(driversResponse4.equals(driversResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDriversResponse driversResponse1 = OASDriversResponse.getExample();
        OASDriversResponse driversResponse2 = new OASDriversResponse();

        System.assertEquals(false, driversResponse1.equals('foo'));
        System.assertEquals(false, driversResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDriversResponse driversResponse1 = OASDriversResponse.getExample();
        OASDriversResponse driversResponse2 = new OASDriversResponse();
        OASDriversResponse driversResponse3;

        System.assertEquals(false, driversResponse1.equals(driversResponse3));
        System.assertEquals(false, driversResponse2.equals(driversResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDriversResponse driversResponse1 = OASDriversResponse.getExample();
        OASDriversResponse driversResponse2 = new OASDriversResponse();

        System.assertEquals(driversResponse1.hashCode(), driversResponse1.hashCode());
        System.assertEquals(driversResponse2.hashCode(), driversResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDriversResponse driversResponse1 = OASDriversResponse.getExample();
        OASDriversResponse driversResponse2 = OASDriversResponse.getExample();
        OASDriversResponse driversResponse3 = new OASDriversResponse();
        OASDriversResponse driversResponse4 = new OASDriversResponse();

        System.assert(driversResponse1.equals(driversResponse2));
        System.assert(driversResponse3.equals(driversResponse4));
        System.assertEquals(driversResponse1.hashCode(), driversResponse2.hashCode());
        System.assertEquals(driversResponse3.hashCode(), driversResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDriversResponse driversResponse = new OASDriversResponse();
        System.assertEquals(new List<OASDriver>(), driversResponse.drivers);
    }
}
