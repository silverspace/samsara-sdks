@isTest
private class OASTaggedAssetTest {
    @isTest
    private static void equalsSameInstance() {
        OASTaggedAsset taggedAsset1 = OASTaggedAsset.getExample();
        OASTaggedAsset taggedAsset2 = taggedAsset1;
        OASTaggedAsset taggedAsset3 = new OASTaggedAsset();
        OASTaggedAsset taggedAsset4 = taggedAsset3;

        System.assert(taggedAsset1.equals(taggedAsset2));
        System.assert(taggedAsset2.equals(taggedAsset1));
        System.assert(taggedAsset1.equals(taggedAsset1));
        System.assert(taggedAsset3.equals(taggedAsset4));
        System.assert(taggedAsset4.equals(taggedAsset3));
        System.assert(taggedAsset3.equals(taggedAsset3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTaggedAsset taggedAsset1 = OASTaggedAsset.getExample();
        OASTaggedAsset taggedAsset2 = OASTaggedAsset.getExample();
        OASTaggedAsset taggedAsset3 = new OASTaggedAsset();
        OASTaggedAsset taggedAsset4 = new OASTaggedAsset();

        System.assert(taggedAsset1.equals(taggedAsset2));
        System.assert(taggedAsset2.equals(taggedAsset1));
        System.assert(taggedAsset3.equals(taggedAsset4));
        System.assert(taggedAsset4.equals(taggedAsset3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTaggedAsset taggedAsset1 = OASTaggedAsset.getExample();
        OASTaggedAsset taggedAsset2 = new OASTaggedAsset();

        System.assertEquals(false, taggedAsset1.equals('foo'));
        System.assertEquals(false, taggedAsset2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTaggedAsset taggedAsset1 = OASTaggedAsset.getExample();
        OASTaggedAsset taggedAsset2 = new OASTaggedAsset();
        OASTaggedAsset taggedAsset3;

        System.assertEquals(false, taggedAsset1.equals(taggedAsset3));
        System.assertEquals(false, taggedAsset2.equals(taggedAsset3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTaggedAsset taggedAsset1 = OASTaggedAsset.getExample();
        OASTaggedAsset taggedAsset2 = new OASTaggedAsset();

        System.assertEquals(taggedAsset1.hashCode(), taggedAsset1.hashCode());
        System.assertEquals(taggedAsset2.hashCode(), taggedAsset2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTaggedAsset taggedAsset1 = OASTaggedAsset.getExample();
        OASTaggedAsset taggedAsset2 = OASTaggedAsset.getExample();
        OASTaggedAsset taggedAsset3 = new OASTaggedAsset();
        OASTaggedAsset taggedAsset4 = new OASTaggedAsset();

        System.assert(taggedAsset1.equals(taggedAsset2));
        System.assert(taggedAsset3.equals(taggedAsset4));
        System.assertEquals(taggedAsset1.hashCode(), taggedAsset2.hashCode());
        System.assertEquals(taggedAsset3.hashCode(), taggedAsset4.hashCode());
    }
}
