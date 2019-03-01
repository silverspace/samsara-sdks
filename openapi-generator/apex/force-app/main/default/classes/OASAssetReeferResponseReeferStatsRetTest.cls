@isTest
private class OASAssetReeferResponseReeferStatsRetTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp1 = OASAssetReeferResponseReeferStatsRet.getExample();
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp2 = assetReeferResponseReeferStatsReturnAirTemp1;
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp3 = new OASAssetReeferResponseReeferStatsRet();
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp4 = assetReeferResponseReeferStatsReturnAirTemp3;

        System.assert(assetReeferResponseReeferStatsReturnAirTemp1.equals(assetReeferResponseReeferStatsReturnAirTemp2));
        System.assert(assetReeferResponseReeferStatsReturnAirTemp2.equals(assetReeferResponseReeferStatsReturnAirTemp1));
        System.assert(assetReeferResponseReeferStatsReturnAirTemp1.equals(assetReeferResponseReeferStatsReturnAirTemp1));
        System.assert(assetReeferResponseReeferStatsReturnAirTemp3.equals(assetReeferResponseReeferStatsReturnAirTemp4));
        System.assert(assetReeferResponseReeferStatsReturnAirTemp4.equals(assetReeferResponseReeferStatsReturnAirTemp3));
        System.assert(assetReeferResponseReeferStatsReturnAirTemp3.equals(assetReeferResponseReeferStatsReturnAirTemp3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp1 = OASAssetReeferResponseReeferStatsRet.getExample();
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp2 = OASAssetReeferResponseReeferStatsRet.getExample();
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp3 = new OASAssetReeferResponseReeferStatsRet();
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp4 = new OASAssetReeferResponseReeferStatsRet();

        System.assert(assetReeferResponseReeferStatsReturnAirTemp1.equals(assetReeferResponseReeferStatsReturnAirTemp2));
        System.assert(assetReeferResponseReeferStatsReturnAirTemp2.equals(assetReeferResponseReeferStatsReturnAirTemp1));
        System.assert(assetReeferResponseReeferStatsReturnAirTemp3.equals(assetReeferResponseReeferStatsReturnAirTemp4));
        System.assert(assetReeferResponseReeferStatsReturnAirTemp4.equals(assetReeferResponseReeferStatsReturnAirTemp3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp1 = OASAssetReeferResponseReeferStatsRet.getExample();
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp2 = new OASAssetReeferResponseReeferStatsRet();

        System.assertEquals(false, assetReeferResponseReeferStatsReturnAirTemp1.equals('foo'));
        System.assertEquals(false, assetReeferResponseReeferStatsReturnAirTemp2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp1 = OASAssetReeferResponseReeferStatsRet.getExample();
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp2 = new OASAssetReeferResponseReeferStatsRet();
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp3;

        System.assertEquals(false, assetReeferResponseReeferStatsReturnAirTemp1.equals(assetReeferResponseReeferStatsReturnAirTemp3));
        System.assertEquals(false, assetReeferResponseReeferStatsReturnAirTemp2.equals(assetReeferResponseReeferStatsReturnAirTemp3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp1 = OASAssetReeferResponseReeferStatsRet.getExample();
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp2 = new OASAssetReeferResponseReeferStatsRet();

        System.assertEquals(assetReeferResponseReeferStatsReturnAirTemp1.hashCode(), assetReeferResponseReeferStatsReturnAirTemp1.hashCode());
        System.assertEquals(assetReeferResponseReeferStatsReturnAirTemp2.hashCode(), assetReeferResponseReeferStatsReturnAirTemp2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp1 = OASAssetReeferResponseReeferStatsRet.getExample();
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp2 = OASAssetReeferResponseReeferStatsRet.getExample();
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp3 = new OASAssetReeferResponseReeferStatsRet();
        OASAssetReeferResponseReeferStatsRet assetReeferResponseReeferStatsReturnAirTemp4 = new OASAssetReeferResponseReeferStatsRet();

        System.assert(assetReeferResponseReeferStatsReturnAirTemp1.equals(assetReeferResponseReeferStatsReturnAirTemp2));
        System.assert(assetReeferResponseReeferStatsReturnAirTemp3.equals(assetReeferResponseReeferStatsReturnAirTemp4));
        System.assertEquals(assetReeferResponseReeferStatsReturnAirTemp1.hashCode(), assetReeferResponseReeferStatsReturnAirTemp2.hashCode());
        System.assertEquals(assetReeferResponseReeferStatsReturnAirTemp3.hashCode(), assetReeferResponseReeferStatsReturnAirTemp4.hashCode());
    }
}
