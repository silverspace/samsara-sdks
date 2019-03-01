@isTest
private class OASTaggedAddressTest {
    @isTest
    private static void equalsSameInstance() {
        OASTaggedAddress taggedAddress1 = OASTaggedAddress.getExample();
        OASTaggedAddress taggedAddress2 = taggedAddress1;
        OASTaggedAddress taggedAddress3 = new OASTaggedAddress();
        OASTaggedAddress taggedAddress4 = taggedAddress3;

        System.assert(taggedAddress1.equals(taggedAddress2));
        System.assert(taggedAddress2.equals(taggedAddress1));
        System.assert(taggedAddress1.equals(taggedAddress1));
        System.assert(taggedAddress3.equals(taggedAddress4));
        System.assert(taggedAddress4.equals(taggedAddress3));
        System.assert(taggedAddress3.equals(taggedAddress3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTaggedAddress taggedAddress1 = OASTaggedAddress.getExample();
        OASTaggedAddress taggedAddress2 = OASTaggedAddress.getExample();
        OASTaggedAddress taggedAddress3 = new OASTaggedAddress();
        OASTaggedAddress taggedAddress4 = new OASTaggedAddress();

        System.assert(taggedAddress1.equals(taggedAddress2));
        System.assert(taggedAddress2.equals(taggedAddress1));
        System.assert(taggedAddress3.equals(taggedAddress4));
        System.assert(taggedAddress4.equals(taggedAddress3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTaggedAddress taggedAddress1 = OASTaggedAddress.getExample();
        OASTaggedAddress taggedAddress2 = new OASTaggedAddress();

        System.assertEquals(false, taggedAddress1.equals('foo'));
        System.assertEquals(false, taggedAddress2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTaggedAddress taggedAddress1 = OASTaggedAddress.getExample();
        OASTaggedAddress taggedAddress2 = new OASTaggedAddress();
        OASTaggedAddress taggedAddress3;

        System.assertEquals(false, taggedAddress1.equals(taggedAddress3));
        System.assertEquals(false, taggedAddress2.equals(taggedAddress3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTaggedAddress taggedAddress1 = OASTaggedAddress.getExample();
        OASTaggedAddress taggedAddress2 = new OASTaggedAddress();

        System.assertEquals(taggedAddress1.hashCode(), taggedAddress1.hashCode());
        System.assertEquals(taggedAddress2.hashCode(), taggedAddress2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTaggedAddress taggedAddress1 = OASTaggedAddress.getExample();
        OASTaggedAddress taggedAddress2 = OASTaggedAddress.getExample();
        OASTaggedAddress taggedAddress3 = new OASTaggedAddress();
        OASTaggedAddress taggedAddress4 = new OASTaggedAddress();

        System.assert(taggedAddress1.equals(taggedAddress2));
        System.assert(taggedAddress3.equals(taggedAddress4));
        System.assertEquals(taggedAddress1.hashCode(), taggedAddress2.hashCode());
        System.assertEquals(taggedAddress3.hashCode(), taggedAddress4.hashCode());
    }
}
