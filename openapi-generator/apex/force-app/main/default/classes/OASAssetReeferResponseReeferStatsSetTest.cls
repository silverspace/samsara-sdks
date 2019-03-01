@isTest
private class OASAssetReeferResponseReeferStatsSetTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint1 = OASAssetReeferResponseReeferStatsSet.getExample();
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint2 = assetReeferResponseReeferStatsSetPoint1;
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint3 = new OASAssetReeferResponseReeferStatsSet();
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint4 = assetReeferResponseReeferStatsSetPoint3;

        System.assert(assetReeferResponseReeferStatsSetPoint1.equals(assetReeferResponseReeferStatsSetPoint2));
        System.assert(assetReeferResponseReeferStatsSetPoint2.equals(assetReeferResponseReeferStatsSetPoint1));
        System.assert(assetReeferResponseReeferStatsSetPoint1.equals(assetReeferResponseReeferStatsSetPoint1));
        System.assert(assetReeferResponseReeferStatsSetPoint3.equals(assetReeferResponseReeferStatsSetPoint4));
        System.assert(assetReeferResponseReeferStatsSetPoint4.equals(assetReeferResponseReeferStatsSetPoint3));
        System.assert(assetReeferResponseReeferStatsSetPoint3.equals(assetReeferResponseReeferStatsSetPoint3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint1 = OASAssetReeferResponseReeferStatsSet.getExample();
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint2 = OASAssetReeferResponseReeferStatsSet.getExample();
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint3 = new OASAssetReeferResponseReeferStatsSet();
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint4 = new OASAssetReeferResponseReeferStatsSet();

        System.assert(assetReeferResponseReeferStatsSetPoint1.equals(assetReeferResponseReeferStatsSetPoint2));
        System.assert(assetReeferResponseReeferStatsSetPoint2.equals(assetReeferResponseReeferStatsSetPoint1));
        System.assert(assetReeferResponseReeferStatsSetPoint3.equals(assetReeferResponseReeferStatsSetPoint4));
        System.assert(assetReeferResponseReeferStatsSetPoint4.equals(assetReeferResponseReeferStatsSetPoint3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint1 = OASAssetReeferResponseReeferStatsSet.getExample();
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint2 = new OASAssetReeferResponseReeferStatsSet();

        System.assertEquals(false, assetReeferResponseReeferStatsSetPoint1.equals('foo'));
        System.assertEquals(false, assetReeferResponseReeferStatsSetPoint2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint1 = OASAssetReeferResponseReeferStatsSet.getExample();
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint2 = new OASAssetReeferResponseReeferStatsSet();
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint3;

        System.assertEquals(false, assetReeferResponseReeferStatsSetPoint1.equals(assetReeferResponseReeferStatsSetPoint3));
        System.assertEquals(false, assetReeferResponseReeferStatsSetPoint2.equals(assetReeferResponseReeferStatsSetPoint3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint1 = OASAssetReeferResponseReeferStatsSet.getExample();
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint2 = new OASAssetReeferResponseReeferStatsSet();

        System.assertEquals(assetReeferResponseReeferStatsSetPoint1.hashCode(), assetReeferResponseReeferStatsSetPoint1.hashCode());
        System.assertEquals(assetReeferResponseReeferStatsSetPoint2.hashCode(), assetReeferResponseReeferStatsSetPoint2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint1 = OASAssetReeferResponseReeferStatsSet.getExample();
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint2 = OASAssetReeferResponseReeferStatsSet.getExample();
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint3 = new OASAssetReeferResponseReeferStatsSet();
        OASAssetReeferResponseReeferStatsSet assetReeferResponseReeferStatsSetPoint4 = new OASAssetReeferResponseReeferStatsSet();

        System.assert(assetReeferResponseReeferStatsSetPoint1.equals(assetReeferResponseReeferStatsSetPoint2));
        System.assert(assetReeferResponseReeferStatsSetPoint3.equals(assetReeferResponseReeferStatsSetPoint4));
        System.assertEquals(assetReeferResponseReeferStatsSetPoint1.hashCode(), assetReeferResponseReeferStatsSetPoint2.hashCode());
        System.assertEquals(assetReeferResponseReeferStatsSetPoint3.hashCode(), assetReeferResponseReeferStatsSetPoint4.hashCode());
    }
}
