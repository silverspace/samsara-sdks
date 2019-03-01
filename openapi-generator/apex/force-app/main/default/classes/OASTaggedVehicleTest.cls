@isTest
private class OASTaggedVehicleTest {
    @isTest
    private static void equalsSameInstance() {
        OASTaggedVehicle taggedVehicle1 = OASTaggedVehicle.getExample();
        OASTaggedVehicle taggedVehicle2 = taggedVehicle1;
        OASTaggedVehicle taggedVehicle3 = new OASTaggedVehicle();
        OASTaggedVehicle taggedVehicle4 = taggedVehicle3;

        System.assert(taggedVehicle1.equals(taggedVehicle2));
        System.assert(taggedVehicle2.equals(taggedVehicle1));
        System.assert(taggedVehicle1.equals(taggedVehicle1));
        System.assert(taggedVehicle3.equals(taggedVehicle4));
        System.assert(taggedVehicle4.equals(taggedVehicle3));
        System.assert(taggedVehicle3.equals(taggedVehicle3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTaggedVehicle taggedVehicle1 = OASTaggedVehicle.getExample();
        OASTaggedVehicle taggedVehicle2 = OASTaggedVehicle.getExample();
        OASTaggedVehicle taggedVehicle3 = new OASTaggedVehicle();
        OASTaggedVehicle taggedVehicle4 = new OASTaggedVehicle();

        System.assert(taggedVehicle1.equals(taggedVehicle2));
        System.assert(taggedVehicle2.equals(taggedVehicle1));
        System.assert(taggedVehicle3.equals(taggedVehicle4));
        System.assert(taggedVehicle4.equals(taggedVehicle3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTaggedVehicle taggedVehicle1 = OASTaggedVehicle.getExample();
        OASTaggedVehicle taggedVehicle2 = new OASTaggedVehicle();

        System.assertEquals(false, taggedVehicle1.equals('foo'));
        System.assertEquals(false, taggedVehicle2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTaggedVehicle taggedVehicle1 = OASTaggedVehicle.getExample();
        OASTaggedVehicle taggedVehicle2 = new OASTaggedVehicle();
        OASTaggedVehicle taggedVehicle3;

        System.assertEquals(false, taggedVehicle1.equals(taggedVehicle3));
        System.assertEquals(false, taggedVehicle2.equals(taggedVehicle3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTaggedVehicle taggedVehicle1 = OASTaggedVehicle.getExample();
        OASTaggedVehicle taggedVehicle2 = new OASTaggedVehicle();

        System.assertEquals(taggedVehicle1.hashCode(), taggedVehicle1.hashCode());
        System.assertEquals(taggedVehicle2.hashCode(), taggedVehicle2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTaggedVehicle taggedVehicle1 = OASTaggedVehicle.getExample();
        OASTaggedVehicle taggedVehicle2 = OASTaggedVehicle.getExample();
        OASTaggedVehicle taggedVehicle3 = new OASTaggedVehicle();
        OASTaggedVehicle taggedVehicle4 = new OASTaggedVehicle();

        System.assert(taggedVehicle1.equals(taggedVehicle2));
        System.assert(taggedVehicle3.equals(taggedVehicle4));
        System.assertEquals(taggedVehicle1.hashCode(), taggedVehicle2.hashCode());
        System.assertEquals(taggedVehicle3.hashCode(), taggedVehicle4.hashCode());
    }
}
