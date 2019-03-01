@isTest
private class OASTaggedDriverBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTaggedDriverBase taggedDriverBase1 = OASTaggedDriverBase.getExample();
        OASTaggedDriverBase taggedDriverBase2 = taggedDriverBase1;
        OASTaggedDriverBase taggedDriverBase3 = new OASTaggedDriverBase();
        OASTaggedDriverBase taggedDriverBase4 = taggedDriverBase3;

        System.assert(taggedDriverBase1.equals(taggedDriverBase2));
        System.assert(taggedDriverBase2.equals(taggedDriverBase1));
        System.assert(taggedDriverBase1.equals(taggedDriverBase1));
        System.assert(taggedDriverBase3.equals(taggedDriverBase4));
        System.assert(taggedDriverBase4.equals(taggedDriverBase3));
        System.assert(taggedDriverBase3.equals(taggedDriverBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTaggedDriverBase taggedDriverBase1 = OASTaggedDriverBase.getExample();
        OASTaggedDriverBase taggedDriverBase2 = OASTaggedDriverBase.getExample();
        OASTaggedDriverBase taggedDriverBase3 = new OASTaggedDriverBase();
        OASTaggedDriverBase taggedDriverBase4 = new OASTaggedDriverBase();

        System.assert(taggedDriverBase1.equals(taggedDriverBase2));
        System.assert(taggedDriverBase2.equals(taggedDriverBase1));
        System.assert(taggedDriverBase3.equals(taggedDriverBase4));
        System.assert(taggedDriverBase4.equals(taggedDriverBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTaggedDriverBase taggedDriverBase1 = OASTaggedDriverBase.getExample();
        OASTaggedDriverBase taggedDriverBase2 = new OASTaggedDriverBase();

        System.assertEquals(false, taggedDriverBase1.equals('foo'));
        System.assertEquals(false, taggedDriverBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTaggedDriverBase taggedDriverBase1 = OASTaggedDriverBase.getExample();
        OASTaggedDriverBase taggedDriverBase2 = new OASTaggedDriverBase();
        OASTaggedDriverBase taggedDriverBase3;

        System.assertEquals(false, taggedDriverBase1.equals(taggedDriverBase3));
        System.assertEquals(false, taggedDriverBase2.equals(taggedDriverBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTaggedDriverBase taggedDriverBase1 = OASTaggedDriverBase.getExample();
        OASTaggedDriverBase taggedDriverBase2 = new OASTaggedDriverBase();

        System.assertEquals(taggedDriverBase1.hashCode(), taggedDriverBase1.hashCode());
        System.assertEquals(taggedDriverBase2.hashCode(), taggedDriverBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTaggedDriverBase taggedDriverBase1 = OASTaggedDriverBase.getExample();
        OASTaggedDriverBase taggedDriverBase2 = OASTaggedDriverBase.getExample();
        OASTaggedDriverBase taggedDriverBase3 = new OASTaggedDriverBase();
        OASTaggedDriverBase taggedDriverBase4 = new OASTaggedDriverBase();

        System.assert(taggedDriverBase1.equals(taggedDriverBase2));
        System.assert(taggedDriverBase3.equals(taggedDriverBase4));
        System.assertEquals(taggedDriverBase1.hashCode(), taggedDriverBase2.hashCode());
        System.assertEquals(taggedDriverBase3.hashCode(), taggedDriverBase4.hashCode());
    }
}
