@isTest
private class OASAssetCurrentLocationsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse1 = OASAssetCurrentLocationsResponse.getExample();
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse2 = assetCurrentLocationsResponse1;
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse3 = new OASAssetCurrentLocationsResponse();
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse4 = assetCurrentLocationsResponse3;

        System.assert(assetCurrentLocationsResponse1.equals(assetCurrentLocationsResponse2));
        System.assert(assetCurrentLocationsResponse2.equals(assetCurrentLocationsResponse1));
        System.assert(assetCurrentLocationsResponse1.equals(assetCurrentLocationsResponse1));
        System.assert(assetCurrentLocationsResponse3.equals(assetCurrentLocationsResponse4));
        System.assert(assetCurrentLocationsResponse4.equals(assetCurrentLocationsResponse3));
        System.assert(assetCurrentLocationsResponse3.equals(assetCurrentLocationsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse1 = OASAssetCurrentLocationsResponse.getExample();
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse2 = OASAssetCurrentLocationsResponse.getExample();
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse3 = new OASAssetCurrentLocationsResponse();
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse4 = new OASAssetCurrentLocationsResponse();

        System.assert(assetCurrentLocationsResponse1.equals(assetCurrentLocationsResponse2));
        System.assert(assetCurrentLocationsResponse2.equals(assetCurrentLocationsResponse1));
        System.assert(assetCurrentLocationsResponse3.equals(assetCurrentLocationsResponse4));
        System.assert(assetCurrentLocationsResponse4.equals(assetCurrentLocationsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse1 = OASAssetCurrentLocationsResponse.getExample();
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse2 = new OASAssetCurrentLocationsResponse();

        System.assertEquals(false, assetCurrentLocationsResponse1.equals('foo'));
        System.assertEquals(false, assetCurrentLocationsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse1 = OASAssetCurrentLocationsResponse.getExample();
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse2 = new OASAssetCurrentLocationsResponse();
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse3;

        System.assertEquals(false, assetCurrentLocationsResponse1.equals(assetCurrentLocationsResponse3));
        System.assertEquals(false, assetCurrentLocationsResponse2.equals(assetCurrentLocationsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse1 = OASAssetCurrentLocationsResponse.getExample();
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse2 = new OASAssetCurrentLocationsResponse();

        System.assertEquals(assetCurrentLocationsResponse1.hashCode(), assetCurrentLocationsResponse1.hashCode());
        System.assertEquals(assetCurrentLocationsResponse2.hashCode(), assetCurrentLocationsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse1 = OASAssetCurrentLocationsResponse.getExample();
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse2 = OASAssetCurrentLocationsResponse.getExample();
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse3 = new OASAssetCurrentLocationsResponse();
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse4 = new OASAssetCurrentLocationsResponse();

        System.assert(assetCurrentLocationsResponse1.equals(assetCurrentLocationsResponse2));
        System.assert(assetCurrentLocationsResponse3.equals(assetCurrentLocationsResponse4));
        System.assertEquals(assetCurrentLocationsResponse1.hashCode(), assetCurrentLocationsResponse2.hashCode());
        System.assertEquals(assetCurrentLocationsResponse3.hashCode(), assetCurrentLocationsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAssetCurrentLocationsResponse assetCurrentLocationsResponse = new OASAssetCurrentLocationsResponse();
        System.assertEquals(new List<OASAssetCable>(), assetCurrentLocationsResponse.cable);
        System.assertEquals(new List<OASAssetCurrentLocation>(), assetCurrentLocationsResponse.location);
        System.assertEquals(null, assetCurrentLocationsResponse.engineHours);
        System.assertEquals(null, assetCurrentLocationsResponse.id);
        System.assertEquals(null, assetCurrentLocationsResponse.name);
    }
}
