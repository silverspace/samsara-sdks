@isTest
private class OASAssetCableTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetCable assetCable1 = OASAssetCable.getExample();
        OASAssetCable assetCable2 = assetCable1;
        OASAssetCable assetCable3 = new OASAssetCable();
        OASAssetCable assetCable4 = assetCable3;

        System.assert(assetCable1.equals(assetCable2));
        System.assert(assetCable2.equals(assetCable1));
        System.assert(assetCable1.equals(assetCable1));
        System.assert(assetCable3.equals(assetCable4));
        System.assert(assetCable4.equals(assetCable3));
        System.assert(assetCable3.equals(assetCable3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetCable assetCable1 = OASAssetCable.getExample();
        OASAssetCable assetCable2 = OASAssetCable.getExample();
        OASAssetCable assetCable3 = new OASAssetCable();
        OASAssetCable assetCable4 = new OASAssetCable();

        System.assert(assetCable1.equals(assetCable2));
        System.assert(assetCable2.equals(assetCable1));
        System.assert(assetCable3.equals(assetCable4));
        System.assert(assetCable4.equals(assetCable3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetCable assetCable1 = OASAssetCable.getExample();
        OASAssetCable assetCable2 = new OASAssetCable();

        System.assertEquals(false, assetCable1.equals('foo'));
        System.assertEquals(false, assetCable2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetCable assetCable1 = OASAssetCable.getExample();
        OASAssetCable assetCable2 = new OASAssetCable();
        OASAssetCable assetCable3;

        System.assertEquals(false, assetCable1.equals(assetCable3));
        System.assertEquals(false, assetCable2.equals(assetCable3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetCable assetCable1 = OASAssetCable.getExample();
        OASAssetCable assetCable2 = new OASAssetCable();

        System.assertEquals(assetCable1.hashCode(), assetCable1.hashCode());
        System.assertEquals(assetCable2.hashCode(), assetCable2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetCable assetCable1 = OASAssetCable.getExample();
        OASAssetCable assetCable2 = OASAssetCable.getExample();
        OASAssetCable assetCable3 = new OASAssetCable();
        OASAssetCable assetCable4 = new OASAssetCable();

        System.assert(assetCable1.equals(assetCable2));
        System.assert(assetCable3.equals(assetCable4));
        System.assertEquals(assetCable1.hashCode(), assetCable2.hashCode());
        System.assertEquals(assetCable3.hashCode(), assetCable4.hashCode());
    }
}
