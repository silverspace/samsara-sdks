@isTest
private class OASDriverBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDriverBase driverBase1 = OASDriverBase.getExample();
        OASDriverBase driverBase2 = driverBase1;
        OASDriverBase driverBase3 = new OASDriverBase();
        OASDriverBase driverBase4 = driverBase3;

        System.assert(driverBase1.equals(driverBase2));
        System.assert(driverBase2.equals(driverBase1));
        System.assert(driverBase1.equals(driverBase1));
        System.assert(driverBase3.equals(driverBase4));
        System.assert(driverBase4.equals(driverBase3));
        System.assert(driverBase3.equals(driverBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDriverBase driverBase1 = OASDriverBase.getExample();
        OASDriverBase driverBase2 = OASDriverBase.getExample();
        OASDriverBase driverBase3 = new OASDriverBase();
        OASDriverBase driverBase4 = new OASDriverBase();

        System.assert(driverBase1.equals(driverBase2));
        System.assert(driverBase2.equals(driverBase1));
        System.assert(driverBase3.equals(driverBase4));
        System.assert(driverBase4.equals(driverBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDriverBase driverBase1 = OASDriverBase.getExample();
        OASDriverBase driverBase2 = new OASDriverBase();

        System.assertEquals(false, driverBase1.equals('foo'));
        System.assertEquals(false, driverBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDriverBase driverBase1 = OASDriverBase.getExample();
        OASDriverBase driverBase2 = new OASDriverBase();
        OASDriverBase driverBase3;

        System.assertEquals(false, driverBase1.equals(driverBase3));
        System.assertEquals(false, driverBase2.equals(driverBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDriverBase driverBase1 = OASDriverBase.getExample();
        OASDriverBase driverBase2 = new OASDriverBase();

        System.assertEquals(driverBase1.hashCode(), driverBase1.hashCode());
        System.assertEquals(driverBase2.hashCode(), driverBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDriverBase driverBase1 = OASDriverBase.getExample();
        OASDriverBase driverBase2 = OASDriverBase.getExample();
        OASDriverBase driverBase3 = new OASDriverBase();
        OASDriverBase driverBase4 = new OASDriverBase();

        System.assert(driverBase1.equals(driverBase2));
        System.assert(driverBase3.equals(driverBase4));
        System.assertEquals(driverBase1.hashCode(), driverBase2.hashCode());
        System.assertEquals(driverBase3.hashCode(), driverBase4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDriverBase driverBase = new OASDriverBase();
        System.assertEquals(false, driverBase.eldPcEnabled);
        System.assertEquals(false, driverBase.eldYmEnabled);
        System.assertEquals(new Map<String, String>(), driverBase.externalIds);
        System.assertEquals(null, driverBase.eldAdverseWeatherExemptionEnabled);
        System.assertEquals(null, driverBase.eldBigDayExemptionEnabled);
        System.assertEquals(null, driverBase.eldDayStartHour);
        System.assertEquals(null, driverBase.eldExempt);
        System.assertEquals(null, driverBase.eldExemptReason);
        System.assertEquals(null, driverBase.groupId);
        System.assertEquals(null, driverBase.licenseNumber);
        System.assertEquals(null, driverBase.licenseState);
        System.assertEquals(null, driverBase.name);
        System.assertEquals(null, driverBase.notes);
        System.assertEquals(null, driverBase.phone);
        System.assertEquals(null, driverBase.username);
        System.assertEquals(null, driverBase.vehicleId);
    }
}
