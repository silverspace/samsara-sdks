@isTest
private class OASAssetReeferResponseReeferStatsTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats1 = OASAssetReeferResponseReeferStats.getExample();
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats2 = assetReeferResponseReeferStats1;
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats3 = new OASAssetReeferResponseReeferStats();
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats4 = assetReeferResponseReeferStats3;

        System.assert(assetReeferResponseReeferStats1.equals(assetReeferResponseReeferStats2));
        System.assert(assetReeferResponseReeferStats2.equals(assetReeferResponseReeferStats1));
        System.assert(assetReeferResponseReeferStats1.equals(assetReeferResponseReeferStats1));
        System.assert(assetReeferResponseReeferStats3.equals(assetReeferResponseReeferStats4));
        System.assert(assetReeferResponseReeferStats4.equals(assetReeferResponseReeferStats3));
        System.assert(assetReeferResponseReeferStats3.equals(assetReeferResponseReeferStats3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats1 = OASAssetReeferResponseReeferStats.getExample();
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats2 = OASAssetReeferResponseReeferStats.getExample();
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats3 = new OASAssetReeferResponseReeferStats();
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats4 = new OASAssetReeferResponseReeferStats();

        System.assert(assetReeferResponseReeferStats1.equals(assetReeferResponseReeferStats2));
        System.assert(assetReeferResponseReeferStats2.equals(assetReeferResponseReeferStats1));
        System.assert(assetReeferResponseReeferStats3.equals(assetReeferResponseReeferStats4));
        System.assert(assetReeferResponseReeferStats4.equals(assetReeferResponseReeferStats3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats1 = OASAssetReeferResponseReeferStats.getExample();
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats2 = new OASAssetReeferResponseReeferStats();

        System.assertEquals(false, assetReeferResponseReeferStats1.equals('foo'));
        System.assertEquals(false, assetReeferResponseReeferStats2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats1 = OASAssetReeferResponseReeferStats.getExample();
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats2 = new OASAssetReeferResponseReeferStats();
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats3;

        System.assertEquals(false, assetReeferResponseReeferStats1.equals(assetReeferResponseReeferStats3));
        System.assertEquals(false, assetReeferResponseReeferStats2.equals(assetReeferResponseReeferStats3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats1 = OASAssetReeferResponseReeferStats.getExample();
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats2 = new OASAssetReeferResponseReeferStats();

        System.assertEquals(assetReeferResponseReeferStats1.hashCode(), assetReeferResponseReeferStats1.hashCode());
        System.assertEquals(assetReeferResponseReeferStats2.hashCode(), assetReeferResponseReeferStats2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats1 = OASAssetReeferResponseReeferStats.getExample();
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats2 = OASAssetReeferResponseReeferStats.getExample();
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats3 = new OASAssetReeferResponseReeferStats();
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats4 = new OASAssetReeferResponseReeferStats();

        System.assert(assetReeferResponseReeferStats1.equals(assetReeferResponseReeferStats2));
        System.assert(assetReeferResponseReeferStats3.equals(assetReeferResponseReeferStats4));
        System.assertEquals(assetReeferResponseReeferStats1.hashCode(), assetReeferResponseReeferStats2.hashCode());
        System.assertEquals(assetReeferResponseReeferStats3.hashCode(), assetReeferResponseReeferStats4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAssetReeferResponseReeferStats assetReeferResponseReeferStats = new OASAssetReeferResponseReeferStats();
        System.assertEquals(new List<OASAssetReeferResponseReeferStatsFue>(), assetReeferResponseReeferStats.fuelPercentage);
        System.assertEquals(new List<OASAssetReeferResponseReeferStatsPow>(), assetReeferResponseReeferStats.powerStatus);
        System.assertEquals(new List<OASAssetReeferResponseReeferStatsEng>(), assetReeferResponseReeferStats.engineHours);
        System.assertEquals(new List<OASAssetReeferResponseReeferStatsSet>(), assetReeferResponseReeferStats.setPoint);
        System.assertEquals(new List<OASAssetReeferResponseReeferStatsRet>(), assetReeferResponseReeferStats.returnAirTemp);
        System.assertEquals(new List<OASAssetReeferResponseReeferStatsAla>(), assetReeferResponseReeferStats.alarms);
    }
}
