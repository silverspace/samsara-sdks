@isTest
private class OASAddressGeofenceCircleTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddressGeofenceCircle addressGeofenceCircle1 = OASAddressGeofenceCircle.getExample();
        OASAddressGeofenceCircle addressGeofenceCircle2 = addressGeofenceCircle1;
        OASAddressGeofenceCircle addressGeofenceCircle3 = new OASAddressGeofenceCircle();
        OASAddressGeofenceCircle addressGeofenceCircle4 = addressGeofenceCircle3;

        System.assert(addressGeofenceCircle1.equals(addressGeofenceCircle2));
        System.assert(addressGeofenceCircle2.equals(addressGeofenceCircle1));
        System.assert(addressGeofenceCircle1.equals(addressGeofenceCircle1));
        System.assert(addressGeofenceCircle3.equals(addressGeofenceCircle4));
        System.assert(addressGeofenceCircle4.equals(addressGeofenceCircle3));
        System.assert(addressGeofenceCircle3.equals(addressGeofenceCircle3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddressGeofenceCircle addressGeofenceCircle1 = OASAddressGeofenceCircle.getExample();
        OASAddressGeofenceCircle addressGeofenceCircle2 = OASAddressGeofenceCircle.getExample();
        OASAddressGeofenceCircle addressGeofenceCircle3 = new OASAddressGeofenceCircle();
        OASAddressGeofenceCircle addressGeofenceCircle4 = new OASAddressGeofenceCircle();

        System.assert(addressGeofenceCircle1.equals(addressGeofenceCircle2));
        System.assert(addressGeofenceCircle2.equals(addressGeofenceCircle1));
        System.assert(addressGeofenceCircle3.equals(addressGeofenceCircle4));
        System.assert(addressGeofenceCircle4.equals(addressGeofenceCircle3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddressGeofenceCircle addressGeofenceCircle1 = OASAddressGeofenceCircle.getExample();
        OASAddressGeofenceCircle addressGeofenceCircle2 = new OASAddressGeofenceCircle();

        System.assertEquals(false, addressGeofenceCircle1.equals('foo'));
        System.assertEquals(false, addressGeofenceCircle2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddressGeofenceCircle addressGeofenceCircle1 = OASAddressGeofenceCircle.getExample();
        OASAddressGeofenceCircle addressGeofenceCircle2 = new OASAddressGeofenceCircle();
        OASAddressGeofenceCircle addressGeofenceCircle3;

        System.assertEquals(false, addressGeofenceCircle1.equals(addressGeofenceCircle3));
        System.assertEquals(false, addressGeofenceCircle2.equals(addressGeofenceCircle3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddressGeofenceCircle addressGeofenceCircle1 = OASAddressGeofenceCircle.getExample();
        OASAddressGeofenceCircle addressGeofenceCircle2 = new OASAddressGeofenceCircle();

        System.assertEquals(addressGeofenceCircle1.hashCode(), addressGeofenceCircle1.hashCode());
        System.assertEquals(addressGeofenceCircle2.hashCode(), addressGeofenceCircle2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddressGeofenceCircle addressGeofenceCircle1 = OASAddressGeofenceCircle.getExample();
        OASAddressGeofenceCircle addressGeofenceCircle2 = OASAddressGeofenceCircle.getExample();
        OASAddressGeofenceCircle addressGeofenceCircle3 = new OASAddressGeofenceCircle();
        OASAddressGeofenceCircle addressGeofenceCircle4 = new OASAddressGeofenceCircle();

        System.assert(addressGeofenceCircle1.equals(addressGeofenceCircle2));
        System.assert(addressGeofenceCircle3.equals(addressGeofenceCircle4));
        System.assertEquals(addressGeofenceCircle1.hashCode(), addressGeofenceCircle2.hashCode());
        System.assertEquals(addressGeofenceCircle3.hashCode(), addressGeofenceCircle4.hashCode());
    }
}
