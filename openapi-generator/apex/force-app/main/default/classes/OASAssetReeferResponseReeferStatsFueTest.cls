@isTest
private class OASAssetReeferResponseReeferStatsFueTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage1 = OASAssetReeferResponseReeferStatsFue.getExample();
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage2 = assetReeferResponseReeferStatsFuelPercentage1;
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage3 = new OASAssetReeferResponseReeferStatsFue();
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage4 = assetReeferResponseReeferStatsFuelPercentage3;

        System.assert(assetReeferResponseReeferStatsFuelPercentage1.equals(assetReeferResponseReeferStatsFuelPercentage2));
        System.assert(assetReeferResponseReeferStatsFuelPercentage2.equals(assetReeferResponseReeferStatsFuelPercentage1));
        System.assert(assetReeferResponseReeferStatsFuelPercentage1.equals(assetReeferResponseReeferStatsFuelPercentage1));
        System.assert(assetReeferResponseReeferStatsFuelPercentage3.equals(assetReeferResponseReeferStatsFuelPercentage4));
        System.assert(assetReeferResponseReeferStatsFuelPercentage4.equals(assetReeferResponseReeferStatsFuelPercentage3));
        System.assert(assetReeferResponseReeferStatsFuelPercentage3.equals(assetReeferResponseReeferStatsFuelPercentage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage1 = OASAssetReeferResponseReeferStatsFue.getExample();
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage2 = OASAssetReeferResponseReeferStatsFue.getExample();
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage3 = new OASAssetReeferResponseReeferStatsFue();
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage4 = new OASAssetReeferResponseReeferStatsFue();

        System.assert(assetReeferResponseReeferStatsFuelPercentage1.equals(assetReeferResponseReeferStatsFuelPercentage2));
        System.assert(assetReeferResponseReeferStatsFuelPercentage2.equals(assetReeferResponseReeferStatsFuelPercentage1));
        System.assert(assetReeferResponseReeferStatsFuelPercentage3.equals(assetReeferResponseReeferStatsFuelPercentage4));
        System.assert(assetReeferResponseReeferStatsFuelPercentage4.equals(assetReeferResponseReeferStatsFuelPercentage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage1 = OASAssetReeferResponseReeferStatsFue.getExample();
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage2 = new OASAssetReeferResponseReeferStatsFue();

        System.assertEquals(false, assetReeferResponseReeferStatsFuelPercentage1.equals('foo'));
        System.assertEquals(false, assetReeferResponseReeferStatsFuelPercentage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage1 = OASAssetReeferResponseReeferStatsFue.getExample();
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage2 = new OASAssetReeferResponseReeferStatsFue();
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage3;

        System.assertEquals(false, assetReeferResponseReeferStatsFuelPercentage1.equals(assetReeferResponseReeferStatsFuelPercentage3));
        System.assertEquals(false, assetReeferResponseReeferStatsFuelPercentage2.equals(assetReeferResponseReeferStatsFuelPercentage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage1 = OASAssetReeferResponseReeferStatsFue.getExample();
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage2 = new OASAssetReeferResponseReeferStatsFue();

        System.assertEquals(assetReeferResponseReeferStatsFuelPercentage1.hashCode(), assetReeferResponseReeferStatsFuelPercentage1.hashCode());
        System.assertEquals(assetReeferResponseReeferStatsFuelPercentage2.hashCode(), assetReeferResponseReeferStatsFuelPercentage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage1 = OASAssetReeferResponseReeferStatsFue.getExample();
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage2 = OASAssetReeferResponseReeferStatsFue.getExample();
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage3 = new OASAssetReeferResponseReeferStatsFue();
        OASAssetReeferResponseReeferStatsFue assetReeferResponseReeferStatsFuelPercentage4 = new OASAssetReeferResponseReeferStatsFue();

        System.assert(assetReeferResponseReeferStatsFuelPercentage1.equals(assetReeferResponseReeferStatsFuelPercentage2));
        System.assert(assetReeferResponseReeferStatsFuelPercentage3.equals(assetReeferResponseReeferStatsFuelPercentage4));
        System.assertEquals(assetReeferResponseReeferStatsFuelPercentage1.hashCode(), assetReeferResponseReeferStatsFuelPercentage2.hashCode());
        System.assertEquals(assetReeferResponseReeferStatsFuelPercentage3.hashCode(), assetReeferResponseReeferStatsFuelPercentage4.hashCode());
    }
}
