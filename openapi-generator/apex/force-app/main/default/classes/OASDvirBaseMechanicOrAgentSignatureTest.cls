@isTest
private class OASDvirBaseMechanicOrAgentSignatureTest {
    @isTest
    private static void equalsSameInstance() {
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature1 = OASDvirBaseMechanicOrAgentSignature.getExample();
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature2 = dvirBaseMechanicOrAgentSignature1;
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature3 = new OASDvirBaseMechanicOrAgentSignature();
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature4 = dvirBaseMechanicOrAgentSignature3;

        System.assert(dvirBaseMechanicOrAgentSignature1.equals(dvirBaseMechanicOrAgentSignature2));
        System.assert(dvirBaseMechanicOrAgentSignature2.equals(dvirBaseMechanicOrAgentSignature1));
        System.assert(dvirBaseMechanicOrAgentSignature1.equals(dvirBaseMechanicOrAgentSignature1));
        System.assert(dvirBaseMechanicOrAgentSignature3.equals(dvirBaseMechanicOrAgentSignature4));
        System.assert(dvirBaseMechanicOrAgentSignature4.equals(dvirBaseMechanicOrAgentSignature3));
        System.assert(dvirBaseMechanicOrAgentSignature3.equals(dvirBaseMechanicOrAgentSignature3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature1 = OASDvirBaseMechanicOrAgentSignature.getExample();
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature2 = OASDvirBaseMechanicOrAgentSignature.getExample();
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature3 = new OASDvirBaseMechanicOrAgentSignature();
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature4 = new OASDvirBaseMechanicOrAgentSignature();

        System.assert(dvirBaseMechanicOrAgentSignature1.equals(dvirBaseMechanicOrAgentSignature2));
        System.assert(dvirBaseMechanicOrAgentSignature2.equals(dvirBaseMechanicOrAgentSignature1));
        System.assert(dvirBaseMechanicOrAgentSignature3.equals(dvirBaseMechanicOrAgentSignature4));
        System.assert(dvirBaseMechanicOrAgentSignature4.equals(dvirBaseMechanicOrAgentSignature3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature1 = OASDvirBaseMechanicOrAgentSignature.getExample();
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature2 = new OASDvirBaseMechanicOrAgentSignature();

        System.assertEquals(false, dvirBaseMechanicOrAgentSignature1.equals('foo'));
        System.assertEquals(false, dvirBaseMechanicOrAgentSignature2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature1 = OASDvirBaseMechanicOrAgentSignature.getExample();
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature2 = new OASDvirBaseMechanicOrAgentSignature();
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature3;

        System.assertEquals(false, dvirBaseMechanicOrAgentSignature1.equals(dvirBaseMechanicOrAgentSignature3));
        System.assertEquals(false, dvirBaseMechanicOrAgentSignature2.equals(dvirBaseMechanicOrAgentSignature3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature1 = OASDvirBaseMechanicOrAgentSignature.getExample();
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature2 = new OASDvirBaseMechanicOrAgentSignature();

        System.assertEquals(dvirBaseMechanicOrAgentSignature1.hashCode(), dvirBaseMechanicOrAgentSignature1.hashCode());
        System.assertEquals(dvirBaseMechanicOrAgentSignature2.hashCode(), dvirBaseMechanicOrAgentSignature2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature1 = OASDvirBaseMechanicOrAgentSignature.getExample();
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature2 = OASDvirBaseMechanicOrAgentSignature.getExample();
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature3 = new OASDvirBaseMechanicOrAgentSignature();
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature4 = new OASDvirBaseMechanicOrAgentSignature();

        System.assert(dvirBaseMechanicOrAgentSignature1.equals(dvirBaseMechanicOrAgentSignature2));
        System.assert(dvirBaseMechanicOrAgentSignature3.equals(dvirBaseMechanicOrAgentSignature4));
        System.assertEquals(dvirBaseMechanicOrAgentSignature1.hashCode(), dvirBaseMechanicOrAgentSignature2.hashCode());
        System.assertEquals(dvirBaseMechanicOrAgentSignature3.hashCode(), dvirBaseMechanicOrAgentSignature4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDvirBaseMechanicOrAgentSignature dvirBaseMechanicOrAgentSignature = new OASDvirBaseMechanicOrAgentSignature();
        Map<String, String> propertyMappings = dvirBaseMechanicOrAgentSignature.getPropertyMappings();
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
