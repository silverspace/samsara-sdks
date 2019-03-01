@isTest
private class OASTaggedMachineBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTaggedMachineBase taggedMachineBase1 = OASTaggedMachineBase.getExample();
        OASTaggedMachineBase taggedMachineBase2 = taggedMachineBase1;
        OASTaggedMachineBase taggedMachineBase3 = new OASTaggedMachineBase();
        OASTaggedMachineBase taggedMachineBase4 = taggedMachineBase3;

        System.assert(taggedMachineBase1.equals(taggedMachineBase2));
        System.assert(taggedMachineBase2.equals(taggedMachineBase1));
        System.assert(taggedMachineBase1.equals(taggedMachineBase1));
        System.assert(taggedMachineBase3.equals(taggedMachineBase4));
        System.assert(taggedMachineBase4.equals(taggedMachineBase3));
        System.assert(taggedMachineBase3.equals(taggedMachineBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTaggedMachineBase taggedMachineBase1 = OASTaggedMachineBase.getExample();
        OASTaggedMachineBase taggedMachineBase2 = OASTaggedMachineBase.getExample();
        OASTaggedMachineBase taggedMachineBase3 = new OASTaggedMachineBase();
        OASTaggedMachineBase taggedMachineBase4 = new OASTaggedMachineBase();

        System.assert(taggedMachineBase1.equals(taggedMachineBase2));
        System.assert(taggedMachineBase2.equals(taggedMachineBase1));
        System.assert(taggedMachineBase3.equals(taggedMachineBase4));
        System.assert(taggedMachineBase4.equals(taggedMachineBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTaggedMachineBase taggedMachineBase1 = OASTaggedMachineBase.getExample();
        OASTaggedMachineBase taggedMachineBase2 = new OASTaggedMachineBase();

        System.assertEquals(false, taggedMachineBase1.equals('foo'));
        System.assertEquals(false, taggedMachineBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTaggedMachineBase taggedMachineBase1 = OASTaggedMachineBase.getExample();
        OASTaggedMachineBase taggedMachineBase2 = new OASTaggedMachineBase();
        OASTaggedMachineBase taggedMachineBase3;

        System.assertEquals(false, taggedMachineBase1.equals(taggedMachineBase3));
        System.assertEquals(false, taggedMachineBase2.equals(taggedMachineBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTaggedMachineBase taggedMachineBase1 = OASTaggedMachineBase.getExample();
        OASTaggedMachineBase taggedMachineBase2 = new OASTaggedMachineBase();

        System.assertEquals(taggedMachineBase1.hashCode(), taggedMachineBase1.hashCode());
        System.assertEquals(taggedMachineBase2.hashCode(), taggedMachineBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTaggedMachineBase taggedMachineBase1 = OASTaggedMachineBase.getExample();
        OASTaggedMachineBase taggedMachineBase2 = OASTaggedMachineBase.getExample();
        OASTaggedMachineBase taggedMachineBase3 = new OASTaggedMachineBase();
        OASTaggedMachineBase taggedMachineBase4 = new OASTaggedMachineBase();

        System.assert(taggedMachineBase1.equals(taggedMachineBase2));
        System.assert(taggedMachineBase3.equals(taggedMachineBase4));
        System.assertEquals(taggedMachineBase1.hashCode(), taggedMachineBase2.hashCode());
        System.assertEquals(taggedMachineBase3.hashCode(), taggedMachineBase4.hashCode());
    }
}
