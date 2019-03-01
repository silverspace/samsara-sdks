@isTest
private class OASAddressTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddress address1 = OASAddress.getExample();
        OASAddress address2 = address1;
        OASAddress address3 = new OASAddress();
        OASAddress address4 = address3;

        System.assert(address1.equals(address2));
        System.assert(address2.equals(address1));
        System.assert(address1.equals(address1));
        System.assert(address3.equals(address4));
        System.assert(address4.equals(address3));
        System.assert(address3.equals(address3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddress address1 = OASAddress.getExample();
        OASAddress address2 = OASAddress.getExample();
        OASAddress address3 = new OASAddress();
        OASAddress address4 = new OASAddress();

        System.assert(address1.equals(address2));
        System.assert(address2.equals(address1));
        System.assert(address3.equals(address4));
        System.assert(address4.equals(address3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddress address1 = OASAddress.getExample();
        OASAddress address2 = new OASAddress();

        System.assertEquals(false, address1.equals('foo'));
        System.assertEquals(false, address2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddress address1 = OASAddress.getExample();
        OASAddress address2 = new OASAddress();
        OASAddress address3;

        System.assertEquals(false, address1.equals(address3));
        System.assertEquals(false, address2.equals(address3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddress address1 = OASAddress.getExample();
        OASAddress address2 = new OASAddress();

        System.assertEquals(address1.hashCode(), address1.hashCode());
        System.assertEquals(address2.hashCode(), address2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddress address1 = OASAddress.getExample();
        OASAddress address2 = OASAddress.getExample();
        OASAddress address3 = new OASAddress();
        OASAddress address4 = new OASAddress();

        System.assert(address1.equals(address2));
        System.assert(address3.equals(address4));
        System.assertEquals(address1.hashCode(), address2.hashCode());
        System.assertEquals(address3.hashCode(), address4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAddress address = new OASAddress();
        System.assertEquals(new List<OASContact>(), address.contacts);
        System.assertEquals(new List<OASTagMetadata>(), address.tags);
        System.assertEquals(null, address.formattedAddress);
        System.assertEquals(null, address.geofence);
        System.assertEquals(null, address.id);
        System.assertEquals(null, address.name);
        System.assertEquals(null, address.notes);
    }
}
