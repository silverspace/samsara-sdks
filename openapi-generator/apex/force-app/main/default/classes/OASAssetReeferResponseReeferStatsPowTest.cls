@isTest
private class OASAssetReeferResponseReeferStatsPowTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus1 = OASAssetReeferResponseReeferStatsPow.getExample();
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus2 = assetReeferResponseReeferStatsPowerStatus1;
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus3 = new OASAssetReeferResponseReeferStatsPow();
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus4 = assetReeferResponseReeferStatsPowerStatus3;

        System.assert(assetReeferResponseReeferStatsPowerStatus1.equals(assetReeferResponseReeferStatsPowerStatus2));
        System.assert(assetReeferResponseReeferStatsPowerStatus2.equals(assetReeferResponseReeferStatsPowerStatus1));
        System.assert(assetReeferResponseReeferStatsPowerStatus1.equals(assetReeferResponseReeferStatsPowerStatus1));
        System.assert(assetReeferResponseReeferStatsPowerStatus3.equals(assetReeferResponseReeferStatsPowerStatus4));
        System.assert(assetReeferResponseReeferStatsPowerStatus4.equals(assetReeferResponseReeferStatsPowerStatus3));
        System.assert(assetReeferResponseReeferStatsPowerStatus3.equals(assetReeferResponseReeferStatsPowerStatus3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus1 = OASAssetReeferResponseReeferStatsPow.getExample();
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus2 = OASAssetReeferResponseReeferStatsPow.getExample();
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus3 = new OASAssetReeferResponseReeferStatsPow();
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus4 = new OASAssetReeferResponseReeferStatsPow();

        System.assert(assetReeferResponseReeferStatsPowerStatus1.equals(assetReeferResponseReeferStatsPowerStatus2));
        System.assert(assetReeferResponseReeferStatsPowerStatus2.equals(assetReeferResponseReeferStatsPowerStatus1));
        System.assert(assetReeferResponseReeferStatsPowerStatus3.equals(assetReeferResponseReeferStatsPowerStatus4));
        System.assert(assetReeferResponseReeferStatsPowerStatus4.equals(assetReeferResponseReeferStatsPowerStatus3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus1 = OASAssetReeferResponseReeferStatsPow.getExample();
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus2 = new OASAssetReeferResponseReeferStatsPow();

        System.assertEquals(false, assetReeferResponseReeferStatsPowerStatus1.equals('foo'));
        System.assertEquals(false, assetReeferResponseReeferStatsPowerStatus2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus1 = OASAssetReeferResponseReeferStatsPow.getExample();
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus2 = new OASAssetReeferResponseReeferStatsPow();
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus3;

        System.assertEquals(false, assetReeferResponseReeferStatsPowerStatus1.equals(assetReeferResponseReeferStatsPowerStatus3));
        System.assertEquals(false, assetReeferResponseReeferStatsPowerStatus2.equals(assetReeferResponseReeferStatsPowerStatus3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus1 = OASAssetReeferResponseReeferStatsPow.getExample();
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus2 = new OASAssetReeferResponseReeferStatsPow();

        System.assertEquals(assetReeferResponseReeferStatsPowerStatus1.hashCode(), assetReeferResponseReeferStatsPowerStatus1.hashCode());
        System.assertEquals(assetReeferResponseReeferStatsPowerStatus2.hashCode(), assetReeferResponseReeferStatsPowerStatus2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus1 = OASAssetReeferResponseReeferStatsPow.getExample();
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus2 = OASAssetReeferResponseReeferStatsPow.getExample();
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus3 = new OASAssetReeferResponseReeferStatsPow();
        OASAssetReeferResponseReeferStatsPow assetReeferResponseReeferStatsPowerStatus4 = new OASAssetReeferResponseReeferStatsPow();

        System.assert(assetReeferResponseReeferStatsPowerStatus1.equals(assetReeferResponseReeferStatsPowerStatus2));
        System.assert(assetReeferResponseReeferStatsPowerStatus3.equals(assetReeferResponseReeferStatsPowerStatus4));
        System.assertEquals(assetReeferResponseReeferStatsPowerStatus1.hashCode(), assetReeferResponseReeferStatsPowerStatus2.hashCode());
        System.assertEquals(assetReeferResponseReeferStatsPowerStatus3.hashCode(), assetReeferResponseReeferStatsPowerStatus4.hashCode());
    }
}
