@isTest
private class OASTaggedVehicleBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTaggedVehicleBase taggedVehicleBase1 = OASTaggedVehicleBase.getExample();
        OASTaggedVehicleBase taggedVehicleBase2 = taggedVehicleBase1;
        OASTaggedVehicleBase taggedVehicleBase3 = new OASTaggedVehicleBase();
        OASTaggedVehicleBase taggedVehicleBase4 = taggedVehicleBase3;

        System.assert(taggedVehicleBase1.equals(taggedVehicleBase2));
        System.assert(taggedVehicleBase2.equals(taggedVehicleBase1));
        System.assert(taggedVehicleBase1.equals(taggedVehicleBase1));
        System.assert(taggedVehicleBase3.equals(taggedVehicleBase4));
        System.assert(taggedVehicleBase4.equals(taggedVehicleBase3));
        System.assert(taggedVehicleBase3.equals(taggedVehicleBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTaggedVehicleBase taggedVehicleBase1 = OASTaggedVehicleBase.getExample();
        OASTaggedVehicleBase taggedVehicleBase2 = OASTaggedVehicleBase.getExample();
        OASTaggedVehicleBase taggedVehicleBase3 = new OASTaggedVehicleBase();
        OASTaggedVehicleBase taggedVehicleBase4 = new OASTaggedVehicleBase();

        System.assert(taggedVehicleBase1.equals(taggedVehicleBase2));
        System.assert(taggedVehicleBase2.equals(taggedVehicleBase1));
        System.assert(taggedVehicleBase3.equals(taggedVehicleBase4));
        System.assert(taggedVehicleBase4.equals(taggedVehicleBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTaggedVehicleBase taggedVehicleBase1 = OASTaggedVehicleBase.getExample();
        OASTaggedVehicleBase taggedVehicleBase2 = new OASTaggedVehicleBase();

        System.assertEquals(false, taggedVehicleBase1.equals('foo'));
        System.assertEquals(false, taggedVehicleBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTaggedVehicleBase taggedVehicleBase1 = OASTaggedVehicleBase.getExample();
        OASTaggedVehicleBase taggedVehicleBase2 = new OASTaggedVehicleBase();
        OASTaggedVehicleBase taggedVehicleBase3;

        System.assertEquals(false, taggedVehicleBase1.equals(taggedVehicleBase3));
        System.assertEquals(false, taggedVehicleBase2.equals(taggedVehicleBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTaggedVehicleBase taggedVehicleBase1 = OASTaggedVehicleBase.getExample();
        OASTaggedVehicleBase taggedVehicleBase2 = new OASTaggedVehicleBase();

        System.assertEquals(taggedVehicleBase1.hashCode(), taggedVehicleBase1.hashCode());
        System.assertEquals(taggedVehicleBase2.hashCode(), taggedVehicleBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTaggedVehicleBase taggedVehicleBase1 = OASTaggedVehicleBase.getExample();
        OASTaggedVehicleBase taggedVehicleBase2 = OASTaggedVehicleBase.getExample();
        OASTaggedVehicleBase taggedVehicleBase3 = new OASTaggedVehicleBase();
        OASTaggedVehicleBase taggedVehicleBase4 = new OASTaggedVehicleBase();

        System.assert(taggedVehicleBase1.equals(taggedVehicleBase2));
        System.assert(taggedVehicleBase3.equals(taggedVehicleBase4));
        System.assertEquals(taggedVehicleBase1.hashCode(), taggedVehicleBase2.hashCode());
        System.assertEquals(taggedVehicleBase3.hashCode(), taggedVehicleBase4.hashCode());
    }
}
