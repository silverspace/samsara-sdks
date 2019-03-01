@isTest
private class OASDvirBaseAuthorSignatureTest {
    @isTest
    private static void equalsSameInstance() {
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature1 = OASDvirBaseAuthorSignature.getExample();
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature2 = dvirBaseAuthorSignature1;
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature3 = new OASDvirBaseAuthorSignature();
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature4 = dvirBaseAuthorSignature3;

        System.assert(dvirBaseAuthorSignature1.equals(dvirBaseAuthorSignature2));
        System.assert(dvirBaseAuthorSignature2.equals(dvirBaseAuthorSignature1));
        System.assert(dvirBaseAuthorSignature1.equals(dvirBaseAuthorSignature1));
        System.assert(dvirBaseAuthorSignature3.equals(dvirBaseAuthorSignature4));
        System.assert(dvirBaseAuthorSignature4.equals(dvirBaseAuthorSignature3));
        System.assert(dvirBaseAuthorSignature3.equals(dvirBaseAuthorSignature3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature1 = OASDvirBaseAuthorSignature.getExample();
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature2 = OASDvirBaseAuthorSignature.getExample();
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature3 = new OASDvirBaseAuthorSignature();
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature4 = new OASDvirBaseAuthorSignature();

        System.assert(dvirBaseAuthorSignature1.equals(dvirBaseAuthorSignature2));
        System.assert(dvirBaseAuthorSignature2.equals(dvirBaseAuthorSignature1));
        System.assert(dvirBaseAuthorSignature3.equals(dvirBaseAuthorSignature4));
        System.assert(dvirBaseAuthorSignature4.equals(dvirBaseAuthorSignature3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature1 = OASDvirBaseAuthorSignature.getExample();
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature2 = new OASDvirBaseAuthorSignature();

        System.assertEquals(false, dvirBaseAuthorSignature1.equals('foo'));
        System.assertEquals(false, dvirBaseAuthorSignature2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature1 = OASDvirBaseAuthorSignature.getExample();
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature2 = new OASDvirBaseAuthorSignature();
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature3;

        System.assertEquals(false, dvirBaseAuthorSignature1.equals(dvirBaseAuthorSignature3));
        System.assertEquals(false, dvirBaseAuthorSignature2.equals(dvirBaseAuthorSignature3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature1 = OASDvirBaseAuthorSignature.getExample();
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature2 = new OASDvirBaseAuthorSignature();

        System.assertEquals(dvirBaseAuthorSignature1.hashCode(), dvirBaseAuthorSignature1.hashCode());
        System.assertEquals(dvirBaseAuthorSignature2.hashCode(), dvirBaseAuthorSignature2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature1 = OASDvirBaseAuthorSignature.getExample();
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature2 = OASDvirBaseAuthorSignature.getExample();
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature3 = new OASDvirBaseAuthorSignature();
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature4 = new OASDvirBaseAuthorSignature();

        System.assert(dvirBaseAuthorSignature1.equals(dvirBaseAuthorSignature2));
        System.assert(dvirBaseAuthorSignature3.equals(dvirBaseAuthorSignature4));
        System.assertEquals(dvirBaseAuthorSignature1.hashCode(), dvirBaseAuthorSignature2.hashCode());
        System.assertEquals(dvirBaseAuthorSignature3.hashCode(), dvirBaseAuthorSignature4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDvirBaseAuthorSignature dvirBaseAuthorSignature = new OASDvirBaseAuthorSignature();
        Map<String, String> propertyMappings = dvirBaseAuthorSignature.getPropertyMappings();
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
