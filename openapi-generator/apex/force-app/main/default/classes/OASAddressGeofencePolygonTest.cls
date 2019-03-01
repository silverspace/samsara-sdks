@isTest
private class OASAddressGeofencePolygonTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddressGeofencePolygon addressGeofencePolygon1 = OASAddressGeofencePolygon.getExample();
        OASAddressGeofencePolygon addressGeofencePolygon2 = addressGeofencePolygon1;
        OASAddressGeofencePolygon addressGeofencePolygon3 = new OASAddressGeofencePolygon();
        OASAddressGeofencePolygon addressGeofencePolygon4 = addressGeofencePolygon3;

        System.assert(addressGeofencePolygon1.equals(addressGeofencePolygon2));
        System.assert(addressGeofencePolygon2.equals(addressGeofencePolygon1));
        System.assert(addressGeofencePolygon1.equals(addressGeofencePolygon1));
        System.assert(addressGeofencePolygon3.equals(addressGeofencePolygon4));
        System.assert(addressGeofencePolygon4.equals(addressGeofencePolygon3));
        System.assert(addressGeofencePolygon3.equals(addressGeofencePolygon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddressGeofencePolygon addressGeofencePolygon1 = OASAddressGeofencePolygon.getExample();
        OASAddressGeofencePolygon addressGeofencePolygon2 = OASAddressGeofencePolygon.getExample();
        OASAddressGeofencePolygon addressGeofencePolygon3 = new OASAddressGeofencePolygon();
        OASAddressGeofencePolygon addressGeofencePolygon4 = new OASAddressGeofencePolygon();

        System.assert(addressGeofencePolygon1.equals(addressGeofencePolygon2));
        System.assert(addressGeofencePolygon2.equals(addressGeofencePolygon1));
        System.assert(addressGeofencePolygon3.equals(addressGeofencePolygon4));
        System.assert(addressGeofencePolygon4.equals(addressGeofencePolygon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddressGeofencePolygon addressGeofencePolygon1 = OASAddressGeofencePolygon.getExample();
        OASAddressGeofencePolygon addressGeofencePolygon2 = new OASAddressGeofencePolygon();

        System.assertEquals(false, addressGeofencePolygon1.equals('foo'));
        System.assertEquals(false, addressGeofencePolygon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddressGeofencePolygon addressGeofencePolygon1 = OASAddressGeofencePolygon.getExample();
        OASAddressGeofencePolygon addressGeofencePolygon2 = new OASAddressGeofencePolygon();
        OASAddressGeofencePolygon addressGeofencePolygon3;

        System.assertEquals(false, addressGeofencePolygon1.equals(addressGeofencePolygon3));
        System.assertEquals(false, addressGeofencePolygon2.equals(addressGeofencePolygon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddressGeofencePolygon addressGeofencePolygon1 = OASAddressGeofencePolygon.getExample();
        OASAddressGeofencePolygon addressGeofencePolygon2 = new OASAddressGeofencePolygon();

        System.assertEquals(addressGeofencePolygon1.hashCode(), addressGeofencePolygon1.hashCode());
        System.assertEquals(addressGeofencePolygon2.hashCode(), addressGeofencePolygon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddressGeofencePolygon addressGeofencePolygon1 = OASAddressGeofencePolygon.getExample();
        OASAddressGeofencePolygon addressGeofencePolygon2 = OASAddressGeofencePolygon.getExample();
        OASAddressGeofencePolygon addressGeofencePolygon3 = new OASAddressGeofencePolygon();
        OASAddressGeofencePolygon addressGeofencePolygon4 = new OASAddressGeofencePolygon();

        System.assert(addressGeofencePolygon1.equals(addressGeofencePolygon2));
        System.assert(addressGeofencePolygon3.equals(addressGeofencePolygon4));
        System.assertEquals(addressGeofencePolygon1.hashCode(), addressGeofencePolygon2.hashCode());
        System.assertEquals(addressGeofencePolygon3.hashCode(), addressGeofencePolygon4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAddressGeofencePolygon addressGeofencePolygon = new OASAddressGeofencePolygon();
        System.assertEquals(new List<OASAddressGeofencePolygonVertices>(), addressGeofencePolygon.vertices);
    }
}
