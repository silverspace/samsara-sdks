@isTest
private class OASAddressesAddressesTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddressesAddresses addressesAddresses1 = OASAddressesAddresses.getExample();
        OASAddressesAddresses addressesAddresses2 = addressesAddresses1;
        OASAddressesAddresses addressesAddresses3 = new OASAddressesAddresses();
        OASAddressesAddresses addressesAddresses4 = addressesAddresses3;

        System.assert(addressesAddresses1.equals(addressesAddresses2));
        System.assert(addressesAddresses2.equals(addressesAddresses1));
        System.assert(addressesAddresses1.equals(addressesAddresses1));
        System.assert(addressesAddresses3.equals(addressesAddresses4));
        System.assert(addressesAddresses4.equals(addressesAddresses3));
        System.assert(addressesAddresses3.equals(addressesAddresses3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddressesAddresses addressesAddresses1 = OASAddressesAddresses.getExample();
        OASAddressesAddresses addressesAddresses2 = OASAddressesAddresses.getExample();
        OASAddressesAddresses addressesAddresses3 = new OASAddressesAddresses();
        OASAddressesAddresses addressesAddresses4 = new OASAddressesAddresses();

        System.assert(addressesAddresses1.equals(addressesAddresses2));
        System.assert(addressesAddresses2.equals(addressesAddresses1));
        System.assert(addressesAddresses3.equals(addressesAddresses4));
        System.assert(addressesAddresses4.equals(addressesAddresses3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddressesAddresses addressesAddresses1 = OASAddressesAddresses.getExample();
        OASAddressesAddresses addressesAddresses2 = new OASAddressesAddresses();

        System.assertEquals(false, addressesAddresses1.equals('foo'));
        System.assertEquals(false, addressesAddresses2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddressesAddresses addressesAddresses1 = OASAddressesAddresses.getExample();
        OASAddressesAddresses addressesAddresses2 = new OASAddressesAddresses();
        OASAddressesAddresses addressesAddresses3;

        System.assertEquals(false, addressesAddresses1.equals(addressesAddresses3));
        System.assertEquals(false, addressesAddresses2.equals(addressesAddresses3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddressesAddresses addressesAddresses1 = OASAddressesAddresses.getExample();
        OASAddressesAddresses addressesAddresses2 = new OASAddressesAddresses();

        System.assertEquals(addressesAddresses1.hashCode(), addressesAddresses1.hashCode());
        System.assertEquals(addressesAddresses2.hashCode(), addressesAddresses2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddressesAddresses addressesAddresses1 = OASAddressesAddresses.getExample();
        OASAddressesAddresses addressesAddresses2 = OASAddressesAddresses.getExample();
        OASAddressesAddresses addressesAddresses3 = new OASAddressesAddresses();
        OASAddressesAddresses addressesAddresses4 = new OASAddressesAddresses();

        System.assert(addressesAddresses1.equals(addressesAddresses2));
        System.assert(addressesAddresses3.equals(addressesAddresses4));
        System.assertEquals(addressesAddresses1.hashCode(), addressesAddresses2.hashCode());
        System.assertEquals(addressesAddresses3.hashCode(), addressesAddresses4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAddressesAddresses addressesAddresses = new OASAddressesAddresses();
        System.assertEquals(new List<Long>(), addressesAddresses.tagIds);
        System.assertEquals(new List<Long>(), addressesAddresses.contactIds);
        System.assertEquals(null, addressesAddresses.notes);
        System.assertEquals(null, addressesAddresses.formattedAddress);
        System.assertEquals(null, addressesAddresses.geofence);
        System.assertEquals(null, addressesAddresses.name);
    }
}
