@isTest
private class OASDvirBaseNextDriverSignatureTest {
    @isTest
    private static void equalsSameInstance() {
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature1 = OASDvirBaseNextDriverSignature.getExample();
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature2 = dvirBaseNextDriverSignature1;
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature3 = new OASDvirBaseNextDriverSignature();
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature4 = dvirBaseNextDriverSignature3;

        System.assert(dvirBaseNextDriverSignature1.equals(dvirBaseNextDriverSignature2));
        System.assert(dvirBaseNextDriverSignature2.equals(dvirBaseNextDriverSignature1));
        System.assert(dvirBaseNextDriverSignature1.equals(dvirBaseNextDriverSignature1));
        System.assert(dvirBaseNextDriverSignature3.equals(dvirBaseNextDriverSignature4));
        System.assert(dvirBaseNextDriverSignature4.equals(dvirBaseNextDriverSignature3));
        System.assert(dvirBaseNextDriverSignature3.equals(dvirBaseNextDriverSignature3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature1 = OASDvirBaseNextDriverSignature.getExample();
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature2 = OASDvirBaseNextDriverSignature.getExample();
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature3 = new OASDvirBaseNextDriverSignature();
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature4 = new OASDvirBaseNextDriverSignature();

        System.assert(dvirBaseNextDriverSignature1.equals(dvirBaseNextDriverSignature2));
        System.assert(dvirBaseNextDriverSignature2.equals(dvirBaseNextDriverSignature1));
        System.assert(dvirBaseNextDriverSignature3.equals(dvirBaseNextDriverSignature4));
        System.assert(dvirBaseNextDriverSignature4.equals(dvirBaseNextDriverSignature3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature1 = OASDvirBaseNextDriverSignature.getExample();
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature2 = new OASDvirBaseNextDriverSignature();

        System.assertEquals(false, dvirBaseNextDriverSignature1.equals('foo'));
        System.assertEquals(false, dvirBaseNextDriverSignature2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature1 = OASDvirBaseNextDriverSignature.getExample();
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature2 = new OASDvirBaseNextDriverSignature();
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature3;

        System.assertEquals(false, dvirBaseNextDriverSignature1.equals(dvirBaseNextDriverSignature3));
        System.assertEquals(false, dvirBaseNextDriverSignature2.equals(dvirBaseNextDriverSignature3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature1 = OASDvirBaseNextDriverSignature.getExample();
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature2 = new OASDvirBaseNextDriverSignature();

        System.assertEquals(dvirBaseNextDriverSignature1.hashCode(), dvirBaseNextDriverSignature1.hashCode());
        System.assertEquals(dvirBaseNextDriverSignature2.hashCode(), dvirBaseNextDriverSignature2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature1 = OASDvirBaseNextDriverSignature.getExample();
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature2 = OASDvirBaseNextDriverSignature.getExample();
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature3 = new OASDvirBaseNextDriverSignature();
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature4 = new OASDvirBaseNextDriverSignature();

        System.assert(dvirBaseNextDriverSignature1.equals(dvirBaseNextDriverSignature2));
        System.assert(dvirBaseNextDriverSignature3.equals(dvirBaseNextDriverSignature4));
        System.assertEquals(dvirBaseNextDriverSignature1.hashCode(), dvirBaseNextDriverSignature2.hashCode());
        System.assertEquals(dvirBaseNextDriverSignature3.hashCode(), dvirBaseNextDriverSignature4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDvirBaseNextDriverSignature dvirBaseNextDriverSignature = new OASDvirBaseNextDriverSignature();
        Map<String, String> propertyMappings = dvirBaseNextDriverSignature.getPropertyMappings();
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
