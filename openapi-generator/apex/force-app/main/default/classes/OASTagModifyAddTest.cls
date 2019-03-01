@isTest
private class OASTagModifyAddTest {
    @isTest
    private static void equalsSameInstance() {
        OASTagModifyAdd tagModifyAdd1 = OASTagModifyAdd.getExample();
        OASTagModifyAdd tagModifyAdd2 = tagModifyAdd1;
        OASTagModifyAdd tagModifyAdd3 = new OASTagModifyAdd();
        OASTagModifyAdd tagModifyAdd4 = tagModifyAdd3;

        System.assert(tagModifyAdd1.equals(tagModifyAdd2));
        System.assert(tagModifyAdd2.equals(tagModifyAdd1));
        System.assert(tagModifyAdd1.equals(tagModifyAdd1));
        System.assert(tagModifyAdd3.equals(tagModifyAdd4));
        System.assert(tagModifyAdd4.equals(tagModifyAdd3));
        System.assert(tagModifyAdd3.equals(tagModifyAdd3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTagModifyAdd tagModifyAdd1 = OASTagModifyAdd.getExample();
        OASTagModifyAdd tagModifyAdd2 = OASTagModifyAdd.getExample();
        OASTagModifyAdd tagModifyAdd3 = new OASTagModifyAdd();
        OASTagModifyAdd tagModifyAdd4 = new OASTagModifyAdd();

        System.assert(tagModifyAdd1.equals(tagModifyAdd2));
        System.assert(tagModifyAdd2.equals(tagModifyAdd1));
        System.assert(tagModifyAdd3.equals(tagModifyAdd4));
        System.assert(tagModifyAdd4.equals(tagModifyAdd3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTagModifyAdd tagModifyAdd1 = OASTagModifyAdd.getExample();
        OASTagModifyAdd tagModifyAdd2 = new OASTagModifyAdd();

        System.assertEquals(false, tagModifyAdd1.equals('foo'));
        System.assertEquals(false, tagModifyAdd2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTagModifyAdd tagModifyAdd1 = OASTagModifyAdd.getExample();
        OASTagModifyAdd tagModifyAdd2 = new OASTagModifyAdd();
        OASTagModifyAdd tagModifyAdd3;

        System.assertEquals(false, tagModifyAdd1.equals(tagModifyAdd3));
        System.assertEquals(false, tagModifyAdd2.equals(tagModifyAdd3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTagModifyAdd tagModifyAdd1 = OASTagModifyAdd.getExample();
        OASTagModifyAdd tagModifyAdd2 = new OASTagModifyAdd();

        System.assertEquals(tagModifyAdd1.hashCode(), tagModifyAdd1.hashCode());
        System.assertEquals(tagModifyAdd2.hashCode(), tagModifyAdd2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTagModifyAdd tagModifyAdd1 = OASTagModifyAdd.getExample();
        OASTagModifyAdd tagModifyAdd2 = OASTagModifyAdd.getExample();
        OASTagModifyAdd tagModifyAdd3 = new OASTagModifyAdd();
        OASTagModifyAdd tagModifyAdd4 = new OASTagModifyAdd();

        System.assert(tagModifyAdd1.equals(tagModifyAdd2));
        System.assert(tagModifyAdd3.equals(tagModifyAdd4));
        System.assertEquals(tagModifyAdd1.hashCode(), tagModifyAdd2.hashCode());
        System.assertEquals(tagModifyAdd3.hashCode(), tagModifyAdd4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTagModifyAdd tagModifyAdd = new OASTagModifyAdd();
        System.assertEquals(new List<OASTaggedAssetBase>(), tagModifyAdd.assets);
        System.assertEquals(new List<OASTaggedSensorBase>(), tagModifyAdd.sensors);
        System.assertEquals(new List<OASTaggedVehicleBase>(), tagModifyAdd.vehicles);
        System.assertEquals(new List<OASTaggedMachineBase>(), tagModifyAdd.machines);
        System.assertEquals(new List<OASTaggedDriverBase>(), tagModifyAdd.drivers);
    }
}
