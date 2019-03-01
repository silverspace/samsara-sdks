@isTest
private class OASTaggedAssetBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTaggedAssetBase taggedAssetBase1 = OASTaggedAssetBase.getExample();
        OASTaggedAssetBase taggedAssetBase2 = taggedAssetBase1;
        OASTaggedAssetBase taggedAssetBase3 = new OASTaggedAssetBase();
        OASTaggedAssetBase taggedAssetBase4 = taggedAssetBase3;

        System.assert(taggedAssetBase1.equals(taggedAssetBase2));
        System.assert(taggedAssetBase2.equals(taggedAssetBase1));
        System.assert(taggedAssetBase1.equals(taggedAssetBase1));
        System.assert(taggedAssetBase3.equals(taggedAssetBase4));
        System.assert(taggedAssetBase4.equals(taggedAssetBase3));
        System.assert(taggedAssetBase3.equals(taggedAssetBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTaggedAssetBase taggedAssetBase1 = OASTaggedAssetBase.getExample();
        OASTaggedAssetBase taggedAssetBase2 = OASTaggedAssetBase.getExample();
        OASTaggedAssetBase taggedAssetBase3 = new OASTaggedAssetBase();
        OASTaggedAssetBase taggedAssetBase4 = new OASTaggedAssetBase();

        System.assert(taggedAssetBase1.equals(taggedAssetBase2));
        System.assert(taggedAssetBase2.equals(taggedAssetBase1));
        System.assert(taggedAssetBase3.equals(taggedAssetBase4));
        System.assert(taggedAssetBase4.equals(taggedAssetBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTaggedAssetBase taggedAssetBase1 = OASTaggedAssetBase.getExample();
        OASTaggedAssetBase taggedAssetBase2 = new OASTaggedAssetBase();

        System.assertEquals(false, taggedAssetBase1.equals('foo'));
        System.assertEquals(false, taggedAssetBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTaggedAssetBase taggedAssetBase1 = OASTaggedAssetBase.getExample();
        OASTaggedAssetBase taggedAssetBase2 = new OASTaggedAssetBase();
        OASTaggedAssetBase taggedAssetBase3;

        System.assertEquals(false, taggedAssetBase1.equals(taggedAssetBase3));
        System.assertEquals(false, taggedAssetBase2.equals(taggedAssetBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTaggedAssetBase taggedAssetBase1 = OASTaggedAssetBase.getExample();
        OASTaggedAssetBase taggedAssetBase2 = new OASTaggedAssetBase();

        System.assertEquals(taggedAssetBase1.hashCode(), taggedAssetBase1.hashCode());
        System.assertEquals(taggedAssetBase2.hashCode(), taggedAssetBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTaggedAssetBase taggedAssetBase1 = OASTaggedAssetBase.getExample();
        OASTaggedAssetBase taggedAssetBase2 = OASTaggedAssetBase.getExample();
        OASTaggedAssetBase taggedAssetBase3 = new OASTaggedAssetBase();
        OASTaggedAssetBase taggedAssetBase4 = new OASTaggedAssetBase();

        System.assert(taggedAssetBase1.equals(taggedAssetBase2));
        System.assert(taggedAssetBase3.equals(taggedAssetBase4));
        System.assertEquals(taggedAssetBase1.hashCode(), taggedAssetBase2.hashCode());
        System.assertEquals(taggedAssetBase3.hashCode(), taggedAssetBase4.hashCode());
    }
}
