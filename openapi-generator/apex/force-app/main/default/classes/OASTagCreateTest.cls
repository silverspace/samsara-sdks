@isTest
private class OASTagCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASTagCreate tagCreate1 = OASTagCreate.getExample();
        OASTagCreate tagCreate2 = tagCreate1;
        OASTagCreate tagCreate3 = new OASTagCreate();
        OASTagCreate tagCreate4 = tagCreate3;

        System.assert(tagCreate1.equals(tagCreate2));
        System.assert(tagCreate2.equals(tagCreate1));
        System.assert(tagCreate1.equals(tagCreate1));
        System.assert(tagCreate3.equals(tagCreate4));
        System.assert(tagCreate4.equals(tagCreate3));
        System.assert(tagCreate3.equals(tagCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTagCreate tagCreate1 = OASTagCreate.getExample();
        OASTagCreate tagCreate2 = OASTagCreate.getExample();
        OASTagCreate tagCreate3 = new OASTagCreate();
        OASTagCreate tagCreate4 = new OASTagCreate();

        System.assert(tagCreate1.equals(tagCreate2));
        System.assert(tagCreate2.equals(tagCreate1));
        System.assert(tagCreate3.equals(tagCreate4));
        System.assert(tagCreate4.equals(tagCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTagCreate tagCreate1 = OASTagCreate.getExample();
        OASTagCreate tagCreate2 = new OASTagCreate();

        System.assertEquals(false, tagCreate1.equals('foo'));
        System.assertEquals(false, tagCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTagCreate tagCreate1 = OASTagCreate.getExample();
        OASTagCreate tagCreate2 = new OASTagCreate();
        OASTagCreate tagCreate3;

        System.assertEquals(false, tagCreate1.equals(tagCreate3));
        System.assertEquals(false, tagCreate2.equals(tagCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTagCreate tagCreate1 = OASTagCreate.getExample();
        OASTagCreate tagCreate2 = new OASTagCreate();

        System.assertEquals(tagCreate1.hashCode(), tagCreate1.hashCode());
        System.assertEquals(tagCreate2.hashCode(), tagCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTagCreate tagCreate1 = OASTagCreate.getExample();
        OASTagCreate tagCreate2 = OASTagCreate.getExample();
        OASTagCreate tagCreate3 = new OASTagCreate();
        OASTagCreate tagCreate4 = new OASTagCreate();

        System.assert(tagCreate1.equals(tagCreate2));
        System.assert(tagCreate3.equals(tagCreate4));
        System.assertEquals(tagCreate1.hashCode(), tagCreate2.hashCode());
        System.assertEquals(tagCreate3.hashCode(), tagCreate4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTagCreate tagCreate = new OASTagCreate();
        System.assertEquals(new List<OASTaggedAssetBase>(), tagCreate.assets);
        System.assertEquals(new List<OASTaggedDriverBase>(), tagCreate.drivers);
        System.assertEquals(new List<OASTaggedMachineBase>(), tagCreate.machines);
        System.assertEquals(new List<OASTaggedSensorBase>(), tagCreate.sensors);
        System.assertEquals(new List<OASTaggedVehicleBase>(), tagCreate.vehicles);
        System.assertEquals(null, tagCreate.name);
        System.assertEquals(null, tagCreate.parentTagId);
    }
}
