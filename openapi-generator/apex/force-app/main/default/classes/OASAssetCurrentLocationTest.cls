@isTest
private class OASAssetCurrentLocationTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetCurrentLocation assetCurrentLocation1 = OASAssetCurrentLocation.getExample();
        OASAssetCurrentLocation assetCurrentLocation2 = assetCurrentLocation1;
        OASAssetCurrentLocation assetCurrentLocation3 = new OASAssetCurrentLocation();
        OASAssetCurrentLocation assetCurrentLocation4 = assetCurrentLocation3;

        System.assert(assetCurrentLocation1.equals(assetCurrentLocation2));
        System.assert(assetCurrentLocation2.equals(assetCurrentLocation1));
        System.assert(assetCurrentLocation1.equals(assetCurrentLocation1));
        System.assert(assetCurrentLocation3.equals(assetCurrentLocation4));
        System.assert(assetCurrentLocation4.equals(assetCurrentLocation3));
        System.assert(assetCurrentLocation3.equals(assetCurrentLocation3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetCurrentLocation assetCurrentLocation1 = OASAssetCurrentLocation.getExample();
        OASAssetCurrentLocation assetCurrentLocation2 = OASAssetCurrentLocation.getExample();
        OASAssetCurrentLocation assetCurrentLocation3 = new OASAssetCurrentLocation();
        OASAssetCurrentLocation assetCurrentLocation4 = new OASAssetCurrentLocation();

        System.assert(assetCurrentLocation1.equals(assetCurrentLocation2));
        System.assert(assetCurrentLocation2.equals(assetCurrentLocation1));
        System.assert(assetCurrentLocation3.equals(assetCurrentLocation4));
        System.assert(assetCurrentLocation4.equals(assetCurrentLocation3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetCurrentLocation assetCurrentLocation1 = OASAssetCurrentLocation.getExample();
        OASAssetCurrentLocation assetCurrentLocation2 = new OASAssetCurrentLocation();

        System.assertEquals(false, assetCurrentLocation1.equals('foo'));
        System.assertEquals(false, assetCurrentLocation2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetCurrentLocation assetCurrentLocation1 = OASAssetCurrentLocation.getExample();
        OASAssetCurrentLocation assetCurrentLocation2 = new OASAssetCurrentLocation();
        OASAssetCurrentLocation assetCurrentLocation3;

        System.assertEquals(false, assetCurrentLocation1.equals(assetCurrentLocation3));
        System.assertEquals(false, assetCurrentLocation2.equals(assetCurrentLocation3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetCurrentLocation assetCurrentLocation1 = OASAssetCurrentLocation.getExample();
        OASAssetCurrentLocation assetCurrentLocation2 = new OASAssetCurrentLocation();

        System.assertEquals(assetCurrentLocation1.hashCode(), assetCurrentLocation1.hashCode());
        System.assertEquals(assetCurrentLocation2.hashCode(), assetCurrentLocation2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetCurrentLocation assetCurrentLocation1 = OASAssetCurrentLocation.getExample();
        OASAssetCurrentLocation assetCurrentLocation2 = OASAssetCurrentLocation.getExample();
        OASAssetCurrentLocation assetCurrentLocation3 = new OASAssetCurrentLocation();
        OASAssetCurrentLocation assetCurrentLocation4 = new OASAssetCurrentLocation();

        System.assert(assetCurrentLocation1.equals(assetCurrentLocation2));
        System.assert(assetCurrentLocation3.equals(assetCurrentLocation4));
        System.assertEquals(assetCurrentLocation1.hashCode(), assetCurrentLocation2.hashCode());
        System.assertEquals(assetCurrentLocation3.hashCode(), assetCurrentLocation4.hashCode());
    }
}
