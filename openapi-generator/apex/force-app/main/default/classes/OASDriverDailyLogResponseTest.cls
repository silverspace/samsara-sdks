@isTest
private class OASDriverDailyLogResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDriverDailyLogResponse driverDailyLogResponse1 = OASDriverDailyLogResponse.getExample();
        OASDriverDailyLogResponse driverDailyLogResponse2 = driverDailyLogResponse1;
        OASDriverDailyLogResponse driverDailyLogResponse3 = new OASDriverDailyLogResponse();
        OASDriverDailyLogResponse driverDailyLogResponse4 = driverDailyLogResponse3;

        System.assert(driverDailyLogResponse1.equals(driverDailyLogResponse2));
        System.assert(driverDailyLogResponse2.equals(driverDailyLogResponse1));
        System.assert(driverDailyLogResponse1.equals(driverDailyLogResponse1));
        System.assert(driverDailyLogResponse3.equals(driverDailyLogResponse4));
        System.assert(driverDailyLogResponse4.equals(driverDailyLogResponse3));
        System.assert(driverDailyLogResponse3.equals(driverDailyLogResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDriverDailyLogResponse driverDailyLogResponse1 = OASDriverDailyLogResponse.getExample();
        OASDriverDailyLogResponse driverDailyLogResponse2 = OASDriverDailyLogResponse.getExample();
        OASDriverDailyLogResponse driverDailyLogResponse3 = new OASDriverDailyLogResponse();
        OASDriverDailyLogResponse driverDailyLogResponse4 = new OASDriverDailyLogResponse();

        System.assert(driverDailyLogResponse1.equals(driverDailyLogResponse2));
        System.assert(driverDailyLogResponse2.equals(driverDailyLogResponse1));
        System.assert(driverDailyLogResponse3.equals(driverDailyLogResponse4));
        System.assert(driverDailyLogResponse4.equals(driverDailyLogResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDriverDailyLogResponse driverDailyLogResponse1 = OASDriverDailyLogResponse.getExample();
        OASDriverDailyLogResponse driverDailyLogResponse2 = new OASDriverDailyLogResponse();

        System.assertEquals(false, driverDailyLogResponse1.equals('foo'));
        System.assertEquals(false, driverDailyLogResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDriverDailyLogResponse driverDailyLogResponse1 = OASDriverDailyLogResponse.getExample();
        OASDriverDailyLogResponse driverDailyLogResponse2 = new OASDriverDailyLogResponse();
        OASDriverDailyLogResponse driverDailyLogResponse3;

        System.assertEquals(false, driverDailyLogResponse1.equals(driverDailyLogResponse3));
        System.assertEquals(false, driverDailyLogResponse2.equals(driverDailyLogResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDriverDailyLogResponse driverDailyLogResponse1 = OASDriverDailyLogResponse.getExample();
        OASDriverDailyLogResponse driverDailyLogResponse2 = new OASDriverDailyLogResponse();

        System.assertEquals(driverDailyLogResponse1.hashCode(), driverDailyLogResponse1.hashCode());
        System.assertEquals(driverDailyLogResponse2.hashCode(), driverDailyLogResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDriverDailyLogResponse driverDailyLogResponse1 = OASDriverDailyLogResponse.getExample();
        OASDriverDailyLogResponse driverDailyLogResponse2 = OASDriverDailyLogResponse.getExample();
        OASDriverDailyLogResponse driverDailyLogResponse3 = new OASDriverDailyLogResponse();
        OASDriverDailyLogResponse driverDailyLogResponse4 = new OASDriverDailyLogResponse();

        System.assert(driverDailyLogResponse1.equals(driverDailyLogResponse2));
        System.assert(driverDailyLogResponse3.equals(driverDailyLogResponse4));
        System.assertEquals(driverDailyLogResponse1.hashCode(), driverDailyLogResponse2.hashCode());
        System.assertEquals(driverDailyLogResponse3.hashCode(), driverDailyLogResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDriverDailyLogResponse driverDailyLogResponse = new OASDriverDailyLogResponse();
        System.assertEquals(new List<OASDriverDailyLogResponseDays>(), driverDailyLogResponse.days);
    }
}
