@isTest
private class OASTagUpdateTest {
    @isTest
    private static void equalsSameInstance() {
        OASTagUpdate tagUpdate1 = OASTagUpdate.getExample();
        OASTagUpdate tagUpdate2 = tagUpdate1;
        OASTagUpdate tagUpdate3 = new OASTagUpdate();
        OASTagUpdate tagUpdate4 = tagUpdate3;

        System.assert(tagUpdate1.equals(tagUpdate2));
        System.assert(tagUpdate2.equals(tagUpdate1));
        System.assert(tagUpdate1.equals(tagUpdate1));
        System.assert(tagUpdate3.equals(tagUpdate4));
        System.assert(tagUpdate4.equals(tagUpdate3));
        System.assert(tagUpdate3.equals(tagUpdate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTagUpdate tagUpdate1 = OASTagUpdate.getExample();
        OASTagUpdate tagUpdate2 = OASTagUpdate.getExample();
        OASTagUpdate tagUpdate3 = new OASTagUpdate();
        OASTagUpdate tagUpdate4 = new OASTagUpdate();

        System.assert(tagUpdate1.equals(tagUpdate2));
        System.assert(tagUpdate2.equals(tagUpdate1));
        System.assert(tagUpdate3.equals(tagUpdate4));
        System.assert(tagUpdate4.equals(tagUpdate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTagUpdate tagUpdate1 = OASTagUpdate.getExample();
        OASTagUpdate tagUpdate2 = new OASTagUpdate();

        System.assertEquals(false, tagUpdate1.equals('foo'));
        System.assertEquals(false, tagUpdate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTagUpdate tagUpdate1 = OASTagUpdate.getExample();
        OASTagUpdate tagUpdate2 = new OASTagUpdate();
        OASTagUpdate tagUpdate3;

        System.assertEquals(false, tagUpdate1.equals(tagUpdate3));
        System.assertEquals(false, tagUpdate2.equals(tagUpdate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTagUpdate tagUpdate1 = OASTagUpdate.getExample();
        OASTagUpdate tagUpdate2 = new OASTagUpdate();

        System.assertEquals(tagUpdate1.hashCode(), tagUpdate1.hashCode());
        System.assertEquals(tagUpdate2.hashCode(), tagUpdate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTagUpdate tagUpdate1 = OASTagUpdate.getExample();
        OASTagUpdate tagUpdate2 = OASTagUpdate.getExample();
        OASTagUpdate tagUpdate3 = new OASTagUpdate();
        OASTagUpdate tagUpdate4 = new OASTagUpdate();

        System.assert(tagUpdate1.equals(tagUpdate2));
        System.assert(tagUpdate3.equals(tagUpdate4));
        System.assertEquals(tagUpdate1.hashCode(), tagUpdate2.hashCode());
        System.assertEquals(tagUpdate3.hashCode(), tagUpdate4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTagUpdate tagUpdate = new OASTagUpdate();
        System.assertEquals(new List<OASTaggedAssetBase>(), tagUpdate.assets);
        System.assertEquals(new List<OASTaggedDriverBase>(), tagUpdate.drivers);
        System.assertEquals(new List<OASTaggedMachineBase>(), tagUpdate.machines);
        System.assertEquals(new List<OASTaggedSensorBase>(), tagUpdate.sensors);
        System.assertEquals(new List<OASTaggedVehicleBase>(), tagUpdate.vehicles);
        System.assertEquals(null, tagUpdate.name);
        System.assertEquals(null, tagUpdate.parentTagId);
    }
}
