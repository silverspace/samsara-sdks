@isTest
private class OASAssetReeferResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetReeferResponse assetReeferResponse1 = OASAssetReeferResponse.getExample();
        OASAssetReeferResponse assetReeferResponse2 = assetReeferResponse1;
        OASAssetReeferResponse assetReeferResponse3 = new OASAssetReeferResponse();
        OASAssetReeferResponse assetReeferResponse4 = assetReeferResponse3;

        System.assert(assetReeferResponse1.equals(assetReeferResponse2));
        System.assert(assetReeferResponse2.equals(assetReeferResponse1));
        System.assert(assetReeferResponse1.equals(assetReeferResponse1));
        System.assert(assetReeferResponse3.equals(assetReeferResponse4));
        System.assert(assetReeferResponse4.equals(assetReeferResponse3));
        System.assert(assetReeferResponse3.equals(assetReeferResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetReeferResponse assetReeferResponse1 = OASAssetReeferResponse.getExample();
        OASAssetReeferResponse assetReeferResponse2 = OASAssetReeferResponse.getExample();
        OASAssetReeferResponse assetReeferResponse3 = new OASAssetReeferResponse();
        OASAssetReeferResponse assetReeferResponse4 = new OASAssetReeferResponse();

        System.assert(assetReeferResponse1.equals(assetReeferResponse2));
        System.assert(assetReeferResponse2.equals(assetReeferResponse1));
        System.assert(assetReeferResponse3.equals(assetReeferResponse4));
        System.assert(assetReeferResponse4.equals(assetReeferResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetReeferResponse assetReeferResponse1 = OASAssetReeferResponse.getExample();
        OASAssetReeferResponse assetReeferResponse2 = new OASAssetReeferResponse();

        System.assertEquals(false, assetReeferResponse1.equals('foo'));
        System.assertEquals(false, assetReeferResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetReeferResponse assetReeferResponse1 = OASAssetReeferResponse.getExample();
        OASAssetReeferResponse assetReeferResponse2 = new OASAssetReeferResponse();
        OASAssetReeferResponse assetReeferResponse3;

        System.assertEquals(false, assetReeferResponse1.equals(assetReeferResponse3));
        System.assertEquals(false, assetReeferResponse2.equals(assetReeferResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetReeferResponse assetReeferResponse1 = OASAssetReeferResponse.getExample();
        OASAssetReeferResponse assetReeferResponse2 = new OASAssetReeferResponse();

        System.assertEquals(assetReeferResponse1.hashCode(), assetReeferResponse1.hashCode());
        System.assertEquals(assetReeferResponse2.hashCode(), assetReeferResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetReeferResponse assetReeferResponse1 = OASAssetReeferResponse.getExample();
        OASAssetReeferResponse assetReeferResponse2 = OASAssetReeferResponse.getExample();
        OASAssetReeferResponse assetReeferResponse3 = new OASAssetReeferResponse();
        OASAssetReeferResponse assetReeferResponse4 = new OASAssetReeferResponse();

        System.assert(assetReeferResponse1.equals(assetReeferResponse2));
        System.assert(assetReeferResponse3.equals(assetReeferResponse4));
        System.assertEquals(assetReeferResponse1.hashCode(), assetReeferResponse2.hashCode());
        System.assertEquals(assetReeferResponse3.hashCode(), assetReeferResponse4.hashCode());
    }
}
