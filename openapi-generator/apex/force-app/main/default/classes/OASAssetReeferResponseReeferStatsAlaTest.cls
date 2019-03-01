@isTest
private class OASAssetReeferResponseReeferStatsAlaTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms11 = OASAssetReeferResponseReeferStatsAla.getExample();
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms12 = assetReeferResponseReeferStatsAlarms11;
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms13 = new OASAssetReeferResponseReeferStatsAla();
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms14 = assetReeferResponseReeferStatsAlarms13;

        System.assert(assetReeferResponseReeferStatsAlarms11.equals(assetReeferResponseReeferStatsAlarms12));
        System.assert(assetReeferResponseReeferStatsAlarms12.equals(assetReeferResponseReeferStatsAlarms11));
        System.assert(assetReeferResponseReeferStatsAlarms11.equals(assetReeferResponseReeferStatsAlarms11));
        System.assert(assetReeferResponseReeferStatsAlarms13.equals(assetReeferResponseReeferStatsAlarms14));
        System.assert(assetReeferResponseReeferStatsAlarms14.equals(assetReeferResponseReeferStatsAlarms13));
        System.assert(assetReeferResponseReeferStatsAlarms13.equals(assetReeferResponseReeferStatsAlarms13));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms11 = OASAssetReeferResponseReeferStatsAla.getExample();
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms12 = OASAssetReeferResponseReeferStatsAla.getExample();
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms13 = new OASAssetReeferResponseReeferStatsAla();
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms14 = new OASAssetReeferResponseReeferStatsAla();

        System.assert(assetReeferResponseReeferStatsAlarms11.equals(assetReeferResponseReeferStatsAlarms12));
        System.assert(assetReeferResponseReeferStatsAlarms12.equals(assetReeferResponseReeferStatsAlarms11));
        System.assert(assetReeferResponseReeferStatsAlarms13.equals(assetReeferResponseReeferStatsAlarms14));
        System.assert(assetReeferResponseReeferStatsAlarms14.equals(assetReeferResponseReeferStatsAlarms13));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms11 = OASAssetReeferResponseReeferStatsAla.getExample();
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms12 = new OASAssetReeferResponseReeferStatsAla();

        System.assertEquals(false, assetReeferResponseReeferStatsAlarms11.equals('foo'));
        System.assertEquals(false, assetReeferResponseReeferStatsAlarms12.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms11 = OASAssetReeferResponseReeferStatsAla.getExample();
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms12 = new OASAssetReeferResponseReeferStatsAla();
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms13;

        System.assertEquals(false, assetReeferResponseReeferStatsAlarms11.equals(assetReeferResponseReeferStatsAlarms13));
        System.assertEquals(false, assetReeferResponseReeferStatsAlarms12.equals(assetReeferResponseReeferStatsAlarms13));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms11 = OASAssetReeferResponseReeferStatsAla.getExample();
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms12 = new OASAssetReeferResponseReeferStatsAla();

        System.assertEquals(assetReeferResponseReeferStatsAlarms11.hashCode(), assetReeferResponseReeferStatsAlarms11.hashCode());
        System.assertEquals(assetReeferResponseReeferStatsAlarms12.hashCode(), assetReeferResponseReeferStatsAlarms12.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms11 = OASAssetReeferResponseReeferStatsAla.getExample();
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms12 = OASAssetReeferResponseReeferStatsAla.getExample();
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms13 = new OASAssetReeferResponseReeferStatsAla();
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms14 = new OASAssetReeferResponseReeferStatsAla();

        System.assert(assetReeferResponseReeferStatsAlarms11.equals(assetReeferResponseReeferStatsAlarms12));
        System.assert(assetReeferResponseReeferStatsAlarms13.equals(assetReeferResponseReeferStatsAlarms14));
        System.assertEquals(assetReeferResponseReeferStatsAlarms11.hashCode(), assetReeferResponseReeferStatsAlarms12.hashCode());
        System.assertEquals(assetReeferResponseReeferStatsAlarms13.hashCode(), assetReeferResponseReeferStatsAlarms14.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAssetReeferResponseReeferStatsAla assetReeferResponseReeferStatsAlarms1 = new OASAssetReeferResponseReeferStatsAla();
        System.assertEquals(new List<OASAssetReeferResponseReeferStatsAla>(), assetReeferResponseReeferStatsAlarms1.alarms);
        System.assertEquals(null, assetReeferResponseReeferStatsAlarms1.changedAtMs);
    }
}
