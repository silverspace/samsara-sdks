@isTest
private class OASAddressGeofenceTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddressGeofence addressGeofence1 = OASAddressGeofence.getExample();
        OASAddressGeofence addressGeofence2 = addressGeofence1;
        OASAddressGeofence addressGeofence3 = new OASAddressGeofence();
        OASAddressGeofence addressGeofence4 = addressGeofence3;

        System.assert(addressGeofence1.equals(addressGeofence2));
        System.assert(addressGeofence2.equals(addressGeofence1));
        System.assert(addressGeofence1.equals(addressGeofence1));
        System.assert(addressGeofence3.equals(addressGeofence4));
        System.assert(addressGeofence4.equals(addressGeofence3));
        System.assert(addressGeofence3.equals(addressGeofence3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddressGeofence addressGeofence1 = OASAddressGeofence.getExample();
        OASAddressGeofence addressGeofence2 = OASAddressGeofence.getExample();
        OASAddressGeofence addressGeofence3 = new OASAddressGeofence();
        OASAddressGeofence addressGeofence4 = new OASAddressGeofence();

        System.assert(addressGeofence1.equals(addressGeofence2));
        System.assert(addressGeofence2.equals(addressGeofence1));
        System.assert(addressGeofence3.equals(addressGeofence4));
        System.assert(addressGeofence4.equals(addressGeofence3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddressGeofence addressGeofence1 = OASAddressGeofence.getExample();
        OASAddressGeofence addressGeofence2 = new OASAddressGeofence();

        System.assertEquals(false, addressGeofence1.equals('foo'));
        System.assertEquals(false, addressGeofence2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddressGeofence addressGeofence1 = OASAddressGeofence.getExample();
        OASAddressGeofence addressGeofence2 = new OASAddressGeofence();
        OASAddressGeofence addressGeofence3;

        System.assertEquals(false, addressGeofence1.equals(addressGeofence3));
        System.assertEquals(false, addressGeofence2.equals(addressGeofence3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddressGeofence addressGeofence1 = OASAddressGeofence.getExample();
        OASAddressGeofence addressGeofence2 = new OASAddressGeofence();

        System.assertEquals(addressGeofence1.hashCode(), addressGeofence1.hashCode());
        System.assertEquals(addressGeofence2.hashCode(), addressGeofence2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddressGeofence addressGeofence1 = OASAddressGeofence.getExample();
        OASAddressGeofence addressGeofence2 = OASAddressGeofence.getExample();
        OASAddressGeofence addressGeofence3 = new OASAddressGeofence();
        OASAddressGeofence addressGeofence4 = new OASAddressGeofence();

        System.assert(addressGeofence1.equals(addressGeofence2));
        System.assert(addressGeofence3.equals(addressGeofence4));
        System.assertEquals(addressGeofence1.hashCode(), addressGeofence2.hashCode());
        System.assertEquals(addressGeofence3.hashCode(), addressGeofence4.hashCode());
    }
}
