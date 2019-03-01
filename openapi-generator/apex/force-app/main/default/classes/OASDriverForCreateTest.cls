@isTest
private class OASDriverForCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASDriverForCreate driverForCreate1 = OASDriverForCreate.getExample();
        OASDriverForCreate driverForCreate2 = driverForCreate1;
        OASDriverForCreate driverForCreate3 = new OASDriverForCreate();
        OASDriverForCreate driverForCreate4 = driverForCreate3;

        System.assert(driverForCreate1.equals(driverForCreate2));
        System.assert(driverForCreate2.equals(driverForCreate1));
        System.assert(driverForCreate1.equals(driverForCreate1));
        System.assert(driverForCreate3.equals(driverForCreate4));
        System.assert(driverForCreate4.equals(driverForCreate3));
        System.assert(driverForCreate3.equals(driverForCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDriverForCreate driverForCreate1 = OASDriverForCreate.getExample();
        OASDriverForCreate driverForCreate2 = OASDriverForCreate.getExample();
        OASDriverForCreate driverForCreate3 = new OASDriverForCreate();
        OASDriverForCreate driverForCreate4 = new OASDriverForCreate();

        System.assert(driverForCreate1.equals(driverForCreate2));
        System.assert(driverForCreate2.equals(driverForCreate1));
        System.assert(driverForCreate3.equals(driverForCreate4));
        System.assert(driverForCreate4.equals(driverForCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDriverForCreate driverForCreate1 = OASDriverForCreate.getExample();
        OASDriverForCreate driverForCreate2 = new OASDriverForCreate();

        System.assertEquals(false, driverForCreate1.equals('foo'));
        System.assertEquals(false, driverForCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDriverForCreate driverForCreate1 = OASDriverForCreate.getExample();
        OASDriverForCreate driverForCreate2 = new OASDriverForCreate();
        OASDriverForCreate driverForCreate3;

        System.assertEquals(false, driverForCreate1.equals(driverForCreate3));
        System.assertEquals(false, driverForCreate2.equals(driverForCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDriverForCreate driverForCreate1 = OASDriverForCreate.getExample();
        OASDriverForCreate driverForCreate2 = new OASDriverForCreate();

        System.assertEquals(driverForCreate1.hashCode(), driverForCreate1.hashCode());
        System.assertEquals(driverForCreate2.hashCode(), driverForCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDriverForCreate driverForCreate1 = OASDriverForCreate.getExample();
        OASDriverForCreate driverForCreate2 = OASDriverForCreate.getExample();
        OASDriverForCreate driverForCreate3 = new OASDriverForCreate();
        OASDriverForCreate driverForCreate4 = new OASDriverForCreate();

        System.assert(driverForCreate1.equals(driverForCreate2));
        System.assert(driverForCreate3.equals(driverForCreate4));
        System.assertEquals(driverForCreate1.hashCode(), driverForCreate2.hashCode());
        System.assertEquals(driverForCreate3.hashCode(), driverForCreate4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDriverForCreate driverForCreate = new OASDriverForCreate();
        System.assertEquals(false, driverForCreate.eldPcEnabled);
        System.assertEquals(false, driverForCreate.eldYmEnabled);
        System.assertEquals(new Map<String, String>(), driverForCreate.externalIds);
        System.assertEquals(new List<Long>(), driverForCreate.tagIds);
        System.assertEquals(null, driverForCreate.eldAdverseWeatherExemptionEnabled);
        System.assertEquals(null, driverForCreate.eldBigDayExemptionEnabled);
        System.assertEquals(null, driverForCreate.eldDayStartHour);
        System.assertEquals(null, driverForCreate.eldExempt);
        System.assertEquals(null, driverForCreate.eldExemptReason);
        System.assertEquals(null, driverForCreate.groupId);
        System.assertEquals(null, driverForCreate.licenseNumber);
        System.assertEquals(null, driverForCreate.licenseState);
        System.assertEquals(null, driverForCreate.name);
        System.assertEquals(null, driverForCreate.notes);
        System.assertEquals(null, driverForCreate.phone);
        System.assertEquals(null, driverForCreate.username);
        System.assertEquals(null, driverForCreate.vehicleId);
        System.assertEquals(null, driverForCreate.password);
    }
}
