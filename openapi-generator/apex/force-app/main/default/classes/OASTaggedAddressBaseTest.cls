@isTest
private class OASTaggedAddressBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTaggedAddressBase taggedAddressBase1 = OASTaggedAddressBase.getExample();
        OASTaggedAddressBase taggedAddressBase2 = taggedAddressBase1;
        OASTaggedAddressBase taggedAddressBase3 = new OASTaggedAddressBase();
        OASTaggedAddressBase taggedAddressBase4 = taggedAddressBase3;

        System.assert(taggedAddressBase1.equals(taggedAddressBase2));
        System.assert(taggedAddressBase2.equals(taggedAddressBase1));
        System.assert(taggedAddressBase1.equals(taggedAddressBase1));
        System.assert(taggedAddressBase3.equals(taggedAddressBase4));
        System.assert(taggedAddressBase4.equals(taggedAddressBase3));
        System.assert(taggedAddressBase3.equals(taggedAddressBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTaggedAddressBase taggedAddressBase1 = OASTaggedAddressBase.getExample();
        OASTaggedAddressBase taggedAddressBase2 = OASTaggedAddressBase.getExample();
        OASTaggedAddressBase taggedAddressBase3 = new OASTaggedAddressBase();
        OASTaggedAddressBase taggedAddressBase4 = new OASTaggedAddressBase();

        System.assert(taggedAddressBase1.equals(taggedAddressBase2));
        System.assert(taggedAddressBase2.equals(taggedAddressBase1));
        System.assert(taggedAddressBase3.equals(taggedAddressBase4));
        System.assert(taggedAddressBase4.equals(taggedAddressBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTaggedAddressBase taggedAddressBase1 = OASTaggedAddressBase.getExample();
        OASTaggedAddressBase taggedAddressBase2 = new OASTaggedAddressBase();

        System.assertEquals(false, taggedAddressBase1.equals('foo'));
        System.assertEquals(false, taggedAddressBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTaggedAddressBase taggedAddressBase1 = OASTaggedAddressBase.getExample();
        OASTaggedAddressBase taggedAddressBase2 = new OASTaggedAddressBase();
        OASTaggedAddressBase taggedAddressBase3;

        System.assertEquals(false, taggedAddressBase1.equals(taggedAddressBase3));
        System.assertEquals(false, taggedAddressBase2.equals(taggedAddressBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTaggedAddressBase taggedAddressBase1 = OASTaggedAddressBase.getExample();
        OASTaggedAddressBase taggedAddressBase2 = new OASTaggedAddressBase();

        System.assertEquals(taggedAddressBase1.hashCode(), taggedAddressBase1.hashCode());
        System.assertEquals(taggedAddressBase2.hashCode(), taggedAddressBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTaggedAddressBase taggedAddressBase1 = OASTaggedAddressBase.getExample();
        OASTaggedAddressBase taggedAddressBase2 = OASTaggedAddressBase.getExample();
        OASTaggedAddressBase taggedAddressBase3 = new OASTaggedAddressBase();
        OASTaggedAddressBase taggedAddressBase4 = new OASTaggedAddressBase();

        System.assert(taggedAddressBase1.equals(taggedAddressBase2));
        System.assert(taggedAddressBase3.equals(taggedAddressBase4));
        System.assertEquals(taggedAddressBase1.hashCode(), taggedAddressBase2.hashCode());
        System.assertEquals(taggedAddressBase3.hashCode(), taggedAddressBase4.hashCode());
    }
}
