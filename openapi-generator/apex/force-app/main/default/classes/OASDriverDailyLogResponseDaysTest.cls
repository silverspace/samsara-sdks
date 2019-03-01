@isTest
private class OASDriverDailyLogResponseDaysTest {
    @isTest
    private static void equalsSameInstance() {
        OASDriverDailyLogResponseDays driverDailyLogResponseDays1 = OASDriverDailyLogResponseDays.getExample();
        OASDriverDailyLogResponseDays driverDailyLogResponseDays2 = driverDailyLogResponseDays1;
        OASDriverDailyLogResponseDays driverDailyLogResponseDays3 = new OASDriverDailyLogResponseDays();
        OASDriverDailyLogResponseDays driverDailyLogResponseDays4 = driverDailyLogResponseDays3;

        System.assert(driverDailyLogResponseDays1.equals(driverDailyLogResponseDays2));
        System.assert(driverDailyLogResponseDays2.equals(driverDailyLogResponseDays1));
        System.assert(driverDailyLogResponseDays1.equals(driverDailyLogResponseDays1));
        System.assert(driverDailyLogResponseDays3.equals(driverDailyLogResponseDays4));
        System.assert(driverDailyLogResponseDays4.equals(driverDailyLogResponseDays3));
        System.assert(driverDailyLogResponseDays3.equals(driverDailyLogResponseDays3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDriverDailyLogResponseDays driverDailyLogResponseDays1 = OASDriverDailyLogResponseDays.getExample();
        OASDriverDailyLogResponseDays driverDailyLogResponseDays2 = OASDriverDailyLogResponseDays.getExample();
        OASDriverDailyLogResponseDays driverDailyLogResponseDays3 = new OASDriverDailyLogResponseDays();
        OASDriverDailyLogResponseDays driverDailyLogResponseDays4 = new OASDriverDailyLogResponseDays();

        System.assert(driverDailyLogResponseDays1.equals(driverDailyLogResponseDays2));
        System.assert(driverDailyLogResponseDays2.equals(driverDailyLogResponseDays1));
        System.assert(driverDailyLogResponseDays3.equals(driverDailyLogResponseDays4));
        System.assert(driverDailyLogResponseDays4.equals(driverDailyLogResponseDays3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDriverDailyLogResponseDays driverDailyLogResponseDays1 = OASDriverDailyLogResponseDays.getExample();
        OASDriverDailyLogResponseDays driverDailyLogResponseDays2 = new OASDriverDailyLogResponseDays();

        System.assertEquals(false, driverDailyLogResponseDays1.equals('foo'));
        System.assertEquals(false, driverDailyLogResponseDays2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDriverDailyLogResponseDays driverDailyLogResponseDays1 = OASDriverDailyLogResponseDays.getExample();
        OASDriverDailyLogResponseDays driverDailyLogResponseDays2 = new OASDriverDailyLogResponseDays();
        OASDriverDailyLogResponseDays driverDailyLogResponseDays3;

        System.assertEquals(false, driverDailyLogResponseDays1.equals(driverDailyLogResponseDays3));
        System.assertEquals(false, driverDailyLogResponseDays2.equals(driverDailyLogResponseDays3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDriverDailyLogResponseDays driverDailyLogResponseDays1 = OASDriverDailyLogResponseDays.getExample();
        OASDriverDailyLogResponseDays driverDailyLogResponseDays2 = new OASDriverDailyLogResponseDays();

        System.assertEquals(driverDailyLogResponseDays1.hashCode(), driverDailyLogResponseDays1.hashCode());
        System.assertEquals(driverDailyLogResponseDays2.hashCode(), driverDailyLogResponseDays2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDriverDailyLogResponseDays driverDailyLogResponseDays1 = OASDriverDailyLogResponseDays.getExample();
        OASDriverDailyLogResponseDays driverDailyLogResponseDays2 = OASDriverDailyLogResponseDays.getExample();
        OASDriverDailyLogResponseDays driverDailyLogResponseDays3 = new OASDriverDailyLogResponseDays();
        OASDriverDailyLogResponseDays driverDailyLogResponseDays4 = new OASDriverDailyLogResponseDays();

        System.assert(driverDailyLogResponseDays1.equals(driverDailyLogResponseDays2));
        System.assert(driverDailyLogResponseDays3.equals(driverDailyLogResponseDays4));
        System.assertEquals(driverDailyLogResponseDays1.hashCode(), driverDailyLogResponseDays2.hashCode());
        System.assertEquals(driverDailyLogResponseDays3.hashCode(), driverDailyLogResponseDays4.hashCode());
    }
}
