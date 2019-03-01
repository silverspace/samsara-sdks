@isTest
private class OASAddressGeofencePolygonVerticesTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices1 = OASAddressGeofencePolygonVertices.getExample();
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices2 = addressGeofencePolygonVertices1;
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices3 = new OASAddressGeofencePolygonVertices();
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices4 = addressGeofencePolygonVertices3;

        System.assert(addressGeofencePolygonVertices1.equals(addressGeofencePolygonVertices2));
        System.assert(addressGeofencePolygonVertices2.equals(addressGeofencePolygonVertices1));
        System.assert(addressGeofencePolygonVertices1.equals(addressGeofencePolygonVertices1));
        System.assert(addressGeofencePolygonVertices3.equals(addressGeofencePolygonVertices4));
        System.assert(addressGeofencePolygonVertices4.equals(addressGeofencePolygonVertices3));
        System.assert(addressGeofencePolygonVertices3.equals(addressGeofencePolygonVertices3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices1 = OASAddressGeofencePolygonVertices.getExample();
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices2 = OASAddressGeofencePolygonVertices.getExample();
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices3 = new OASAddressGeofencePolygonVertices();
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices4 = new OASAddressGeofencePolygonVertices();

        System.assert(addressGeofencePolygonVertices1.equals(addressGeofencePolygonVertices2));
        System.assert(addressGeofencePolygonVertices2.equals(addressGeofencePolygonVertices1));
        System.assert(addressGeofencePolygonVertices3.equals(addressGeofencePolygonVertices4));
        System.assert(addressGeofencePolygonVertices4.equals(addressGeofencePolygonVertices3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices1 = OASAddressGeofencePolygonVertices.getExample();
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices2 = new OASAddressGeofencePolygonVertices();

        System.assertEquals(false, addressGeofencePolygonVertices1.equals('foo'));
        System.assertEquals(false, addressGeofencePolygonVertices2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices1 = OASAddressGeofencePolygonVertices.getExample();
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices2 = new OASAddressGeofencePolygonVertices();
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices3;

        System.assertEquals(false, addressGeofencePolygonVertices1.equals(addressGeofencePolygonVertices3));
        System.assertEquals(false, addressGeofencePolygonVertices2.equals(addressGeofencePolygonVertices3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices1 = OASAddressGeofencePolygonVertices.getExample();
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices2 = new OASAddressGeofencePolygonVertices();

        System.assertEquals(addressGeofencePolygonVertices1.hashCode(), addressGeofencePolygonVertices1.hashCode());
        System.assertEquals(addressGeofencePolygonVertices2.hashCode(), addressGeofencePolygonVertices2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices1 = OASAddressGeofencePolygonVertices.getExample();
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices2 = OASAddressGeofencePolygonVertices.getExample();
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices3 = new OASAddressGeofencePolygonVertices();
        OASAddressGeofencePolygonVertices addressGeofencePolygonVertices4 = new OASAddressGeofencePolygonVertices();

        System.assert(addressGeofencePolygonVertices1.equals(addressGeofencePolygonVertices2));
        System.assert(addressGeofencePolygonVertices3.equals(addressGeofencePolygonVertices4));
        System.assertEquals(addressGeofencePolygonVertices1.hashCode(), addressGeofencePolygonVertices2.hashCode());
        System.assertEquals(addressGeofencePolygonVertices3.hashCode(), addressGeofencePolygonVertices4.hashCode());
    }
}
