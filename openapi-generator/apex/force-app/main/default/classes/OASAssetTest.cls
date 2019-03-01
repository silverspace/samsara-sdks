@isTest
private class OASAssetTest {
    @isTest
    private static void equalsSameInstance() {
        OASAsset asset1 = OASAsset.getExample();
        OASAsset asset2 = asset1;
        OASAsset asset3 = new OASAsset();
        OASAsset asset4 = asset3;

        System.assert(asset1.equals(asset2));
        System.assert(asset2.equals(asset1));
        System.assert(asset1.equals(asset1));
        System.assert(asset3.equals(asset4));
        System.assert(asset4.equals(asset3));
        System.assert(asset3.equals(asset3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAsset asset1 = OASAsset.getExample();
        OASAsset asset2 = OASAsset.getExample();
        OASAsset asset3 = new OASAsset();
        OASAsset asset4 = new OASAsset();

        System.assert(asset1.equals(asset2));
        System.assert(asset2.equals(asset1));
        System.assert(asset3.equals(asset4));
        System.assert(asset4.equals(asset3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAsset asset1 = OASAsset.getExample();
        OASAsset asset2 = new OASAsset();

        System.assertEquals(false, asset1.equals('foo'));
        System.assertEquals(false, asset2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAsset asset1 = OASAsset.getExample();
        OASAsset asset2 = new OASAsset();
        OASAsset asset3;

        System.assertEquals(false, asset1.equals(asset3));
        System.assertEquals(false, asset2.equals(asset3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAsset asset1 = OASAsset.getExample();
        OASAsset asset2 = new OASAsset();

        System.assertEquals(asset1.hashCode(), asset1.hashCode());
        System.assertEquals(asset2.hashCode(), asset2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAsset asset1 = OASAsset.getExample();
        OASAsset asset2 = OASAsset.getExample();
        OASAsset asset3 = new OASAsset();
        OASAsset asset4 = new OASAsset();

        System.assert(asset1.equals(asset2));
        System.assert(asset3.equals(asset4));
        System.assertEquals(asset1.hashCode(), asset2.hashCode());
        System.assertEquals(asset3.hashCode(), asset4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAsset asset = new OASAsset();
        System.assertEquals(new List<OASAssetCable>(), asset.cable);
        System.assertEquals(null, asset.assetSerialNumber);
        System.assertEquals(null, asset.engineHours);
        System.assertEquals(null, asset.id);
        System.assertEquals(null, asset.name);
    }
}
