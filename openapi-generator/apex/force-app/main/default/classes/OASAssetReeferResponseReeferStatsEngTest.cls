@isTest
private class OASAssetReeferResponseReeferStatsEngTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours1 = OASAssetReeferResponseReeferStatsEng.getExample();
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours2 = assetReeferResponseReeferStatsEngineHours1;
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours3 = new OASAssetReeferResponseReeferStatsEng();
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours4 = assetReeferResponseReeferStatsEngineHours3;

        System.assert(assetReeferResponseReeferStatsEngineHours1.equals(assetReeferResponseReeferStatsEngineHours2));
        System.assert(assetReeferResponseReeferStatsEngineHours2.equals(assetReeferResponseReeferStatsEngineHours1));
        System.assert(assetReeferResponseReeferStatsEngineHours1.equals(assetReeferResponseReeferStatsEngineHours1));
        System.assert(assetReeferResponseReeferStatsEngineHours3.equals(assetReeferResponseReeferStatsEngineHours4));
        System.assert(assetReeferResponseReeferStatsEngineHours4.equals(assetReeferResponseReeferStatsEngineHours3));
        System.assert(assetReeferResponseReeferStatsEngineHours3.equals(assetReeferResponseReeferStatsEngineHours3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours1 = OASAssetReeferResponseReeferStatsEng.getExample();
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours2 = OASAssetReeferResponseReeferStatsEng.getExample();
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours3 = new OASAssetReeferResponseReeferStatsEng();
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours4 = new OASAssetReeferResponseReeferStatsEng();

        System.assert(assetReeferResponseReeferStatsEngineHours1.equals(assetReeferResponseReeferStatsEngineHours2));
        System.assert(assetReeferResponseReeferStatsEngineHours2.equals(assetReeferResponseReeferStatsEngineHours1));
        System.assert(assetReeferResponseReeferStatsEngineHours3.equals(assetReeferResponseReeferStatsEngineHours4));
        System.assert(assetReeferResponseReeferStatsEngineHours4.equals(assetReeferResponseReeferStatsEngineHours3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours1 = OASAssetReeferResponseReeferStatsEng.getExample();
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours2 = new OASAssetReeferResponseReeferStatsEng();

        System.assertEquals(false, assetReeferResponseReeferStatsEngineHours1.equals('foo'));
        System.assertEquals(false, assetReeferResponseReeferStatsEngineHours2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours1 = OASAssetReeferResponseReeferStatsEng.getExample();
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours2 = new OASAssetReeferResponseReeferStatsEng();
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours3;

        System.assertEquals(false, assetReeferResponseReeferStatsEngineHours1.equals(assetReeferResponseReeferStatsEngineHours3));
        System.assertEquals(false, assetReeferResponseReeferStatsEngineHours2.equals(assetReeferResponseReeferStatsEngineHours3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours1 = OASAssetReeferResponseReeferStatsEng.getExample();
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours2 = new OASAssetReeferResponseReeferStatsEng();

        System.assertEquals(assetReeferResponseReeferStatsEngineHours1.hashCode(), assetReeferResponseReeferStatsEngineHours1.hashCode());
        System.assertEquals(assetReeferResponseReeferStatsEngineHours2.hashCode(), assetReeferResponseReeferStatsEngineHours2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours1 = OASAssetReeferResponseReeferStatsEng.getExample();
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours2 = OASAssetReeferResponseReeferStatsEng.getExample();
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours3 = new OASAssetReeferResponseReeferStatsEng();
        OASAssetReeferResponseReeferStatsEng assetReeferResponseReeferStatsEngineHours4 = new OASAssetReeferResponseReeferStatsEng();

        System.assert(assetReeferResponseReeferStatsEngineHours1.equals(assetReeferResponseReeferStatsEngineHours2));
        System.assert(assetReeferResponseReeferStatsEngineHours3.equals(assetReeferResponseReeferStatsEngineHours4));
        System.assertEquals(assetReeferResponseReeferStatsEngineHours1.hashCode(), assetReeferResponseReeferStatsEngineHours2.hashCode());
        System.assertEquals(assetReeferResponseReeferStatsEngineHours3.hashCode(), assetReeferResponseReeferStatsEngineHours4.hashCode());
    }
}
