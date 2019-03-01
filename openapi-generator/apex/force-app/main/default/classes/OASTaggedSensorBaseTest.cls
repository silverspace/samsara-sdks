@isTest
private class OASTaggedSensorBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTaggedSensorBase taggedSensorBase1 = OASTaggedSensorBase.getExample();
        OASTaggedSensorBase taggedSensorBase2 = taggedSensorBase1;
        OASTaggedSensorBase taggedSensorBase3 = new OASTaggedSensorBase();
        OASTaggedSensorBase taggedSensorBase4 = taggedSensorBase3;

        System.assert(taggedSensorBase1.equals(taggedSensorBase2));
        System.assert(taggedSensorBase2.equals(taggedSensorBase1));
        System.assert(taggedSensorBase1.equals(taggedSensorBase1));
        System.assert(taggedSensorBase3.equals(taggedSensorBase4));
        System.assert(taggedSensorBase4.equals(taggedSensorBase3));
        System.assert(taggedSensorBase3.equals(taggedSensorBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTaggedSensorBase taggedSensorBase1 = OASTaggedSensorBase.getExample();
        OASTaggedSensorBase taggedSensorBase2 = OASTaggedSensorBase.getExample();
        OASTaggedSensorBase taggedSensorBase3 = new OASTaggedSensorBase();
        OASTaggedSensorBase taggedSensorBase4 = new OASTaggedSensorBase();

        System.assert(taggedSensorBase1.equals(taggedSensorBase2));
        System.assert(taggedSensorBase2.equals(taggedSensorBase1));
        System.assert(taggedSensorBase3.equals(taggedSensorBase4));
        System.assert(taggedSensorBase4.equals(taggedSensorBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTaggedSensorBase taggedSensorBase1 = OASTaggedSensorBase.getExample();
        OASTaggedSensorBase taggedSensorBase2 = new OASTaggedSensorBase();

        System.assertEquals(false, taggedSensorBase1.equals('foo'));
        System.assertEquals(false, taggedSensorBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTaggedSensorBase taggedSensorBase1 = OASTaggedSensorBase.getExample();
        OASTaggedSensorBase taggedSensorBase2 = new OASTaggedSensorBase();
        OASTaggedSensorBase taggedSensorBase3;

        System.assertEquals(false, taggedSensorBase1.equals(taggedSensorBase3));
        System.assertEquals(false, taggedSensorBase2.equals(taggedSensorBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTaggedSensorBase taggedSensorBase1 = OASTaggedSensorBase.getExample();
        OASTaggedSensorBase taggedSensorBase2 = new OASTaggedSensorBase();

        System.assertEquals(taggedSensorBase1.hashCode(), taggedSensorBase1.hashCode());
        System.assertEquals(taggedSensorBase2.hashCode(), taggedSensorBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTaggedSensorBase taggedSensorBase1 = OASTaggedSensorBase.getExample();
        OASTaggedSensorBase taggedSensorBase2 = OASTaggedSensorBase.getExample();
        OASTaggedSensorBase taggedSensorBase3 = new OASTaggedSensorBase();
        OASTaggedSensorBase taggedSensorBase4 = new OASTaggedSensorBase();

        System.assert(taggedSensorBase1.equals(taggedSensorBase2));
        System.assert(taggedSensorBase3.equals(taggedSensorBase4));
        System.assertEquals(taggedSensorBase1.hashCode(), taggedSensorBase2.hashCode());
        System.assertEquals(taggedSensorBase3.hashCode(), taggedSensorBase4.hashCode());
    }
}
