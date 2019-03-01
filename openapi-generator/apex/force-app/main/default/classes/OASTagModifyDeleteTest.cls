@isTest
private class OASTagModifyDeleteTest {
    @isTest
    private static void equalsSameInstance() {
        OASTagModifyDelete tagModifyDelete1 = OASTagModifyDelete.getExample();
        OASTagModifyDelete tagModifyDelete2 = tagModifyDelete1;
        OASTagModifyDelete tagModifyDelete3 = new OASTagModifyDelete();
        OASTagModifyDelete tagModifyDelete4 = tagModifyDelete3;

        System.assert(tagModifyDelete1.equals(tagModifyDelete2));
        System.assert(tagModifyDelete2.equals(tagModifyDelete1));
        System.assert(tagModifyDelete1.equals(tagModifyDelete1));
        System.assert(tagModifyDelete3.equals(tagModifyDelete4));
        System.assert(tagModifyDelete4.equals(tagModifyDelete3));
        System.assert(tagModifyDelete3.equals(tagModifyDelete3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTagModifyDelete tagModifyDelete1 = OASTagModifyDelete.getExample();
        OASTagModifyDelete tagModifyDelete2 = OASTagModifyDelete.getExample();
        OASTagModifyDelete tagModifyDelete3 = new OASTagModifyDelete();
        OASTagModifyDelete tagModifyDelete4 = new OASTagModifyDelete();

        System.assert(tagModifyDelete1.equals(tagModifyDelete2));
        System.assert(tagModifyDelete2.equals(tagModifyDelete1));
        System.assert(tagModifyDelete3.equals(tagModifyDelete4));
        System.assert(tagModifyDelete4.equals(tagModifyDelete3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTagModifyDelete tagModifyDelete1 = OASTagModifyDelete.getExample();
        OASTagModifyDelete tagModifyDelete2 = new OASTagModifyDelete();

        System.assertEquals(false, tagModifyDelete1.equals('foo'));
        System.assertEquals(false, tagModifyDelete2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTagModifyDelete tagModifyDelete1 = OASTagModifyDelete.getExample();
        OASTagModifyDelete tagModifyDelete2 = new OASTagModifyDelete();
        OASTagModifyDelete tagModifyDelete3;

        System.assertEquals(false, tagModifyDelete1.equals(tagModifyDelete3));
        System.assertEquals(false, tagModifyDelete2.equals(tagModifyDelete3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTagModifyDelete tagModifyDelete1 = OASTagModifyDelete.getExample();
        OASTagModifyDelete tagModifyDelete2 = new OASTagModifyDelete();

        System.assertEquals(tagModifyDelete1.hashCode(), tagModifyDelete1.hashCode());
        System.assertEquals(tagModifyDelete2.hashCode(), tagModifyDelete2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTagModifyDelete tagModifyDelete1 = OASTagModifyDelete.getExample();
        OASTagModifyDelete tagModifyDelete2 = OASTagModifyDelete.getExample();
        OASTagModifyDelete tagModifyDelete3 = new OASTagModifyDelete();
        OASTagModifyDelete tagModifyDelete4 = new OASTagModifyDelete();

        System.assert(tagModifyDelete1.equals(tagModifyDelete2));
        System.assert(tagModifyDelete3.equals(tagModifyDelete4));
        System.assertEquals(tagModifyDelete1.hashCode(), tagModifyDelete2.hashCode());
        System.assertEquals(tagModifyDelete3.hashCode(), tagModifyDelete4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTagModifyDelete tagModifyDelete = new OASTagModifyDelete();
        System.assertEquals(new List<OASTaggedAssetBase>(), tagModifyDelete.assets);
        System.assertEquals(new List<OASTaggedSensorBase>(), tagModifyDelete.sensors);
        System.assertEquals(new List<OASTaggedVehicleBase>(), tagModifyDelete.vehicles);
        System.assertEquals(new List<OASTaggedMachineBase>(), tagModifyDelete.machines);
        System.assertEquals(new List<OASTaggedDriverBase>(), tagModifyDelete.drivers);
    }
}
