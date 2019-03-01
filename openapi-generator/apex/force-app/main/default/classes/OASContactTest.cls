@isTest
private class OASContactTest {
    @isTest
    private static void equalsSameInstance() {
        OASContact contact1 = OASContact.getExample();
        OASContact contact2 = contact1;
        OASContact contact3 = new OASContact();
        OASContact contact4 = contact3;

        System.assert(contact1.equals(contact2));
        System.assert(contact2.equals(contact1));
        System.assert(contact1.equals(contact1));
        System.assert(contact3.equals(contact4));
        System.assert(contact4.equals(contact3));
        System.assert(contact3.equals(contact3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASContact contact1 = OASContact.getExample();
        OASContact contact2 = OASContact.getExample();
        OASContact contact3 = new OASContact();
        OASContact contact4 = new OASContact();

        System.assert(contact1.equals(contact2));
        System.assert(contact2.equals(contact1));
        System.assert(contact3.equals(contact4));
        System.assert(contact4.equals(contact3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASContact contact1 = OASContact.getExample();
        OASContact contact2 = new OASContact();

        System.assertEquals(false, contact1.equals('foo'));
        System.assertEquals(false, contact2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASContact contact1 = OASContact.getExample();
        OASContact contact2 = new OASContact();
        OASContact contact3;

        System.assertEquals(false, contact1.equals(contact3));
        System.assertEquals(false, contact2.equals(contact3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASContact contact1 = OASContact.getExample();
        OASContact contact2 = new OASContact();

        System.assertEquals(contact1.hashCode(), contact1.hashCode());
        System.assertEquals(contact2.hashCode(), contact2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASContact contact1 = OASContact.getExample();
        OASContact contact2 = OASContact.getExample();
        OASContact contact3 = new OASContact();
        OASContact contact4 = new OASContact();

        System.assert(contact1.equals(contact2));
        System.assert(contact3.equals(contact4));
        System.assertEquals(contact1.hashCode(), contact2.hashCode());
        System.assertEquals(contact3.hashCode(), contact4.hashCode());
    }
}
