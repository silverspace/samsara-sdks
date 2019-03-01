@isTest
private class OASDocumentTypeTest {
    @isTest
    private static void equalsSameInstance() {
        OASDocumentType documentType1 = OASDocumentType.getExample();
        OASDocumentType documentType2 = documentType1;
        OASDocumentType documentType3 = new OASDocumentType();
        OASDocumentType documentType4 = documentType3;

        System.assert(documentType1.equals(documentType2));
        System.assert(documentType2.equals(documentType1));
        System.assert(documentType1.equals(documentType1));
        System.assert(documentType3.equals(documentType4));
        System.assert(documentType4.equals(documentType3));
        System.assert(documentType3.equals(documentType3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDocumentType documentType1 = OASDocumentType.getExample();
        OASDocumentType documentType2 = OASDocumentType.getExample();
        OASDocumentType documentType3 = new OASDocumentType();
        OASDocumentType documentType4 = new OASDocumentType();

        System.assert(documentType1.equals(documentType2));
        System.assert(documentType2.equals(documentType1));
        System.assert(documentType3.equals(documentType4));
        System.assert(documentType4.equals(documentType3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDocumentType documentType1 = OASDocumentType.getExample();
        OASDocumentType documentType2 = new OASDocumentType();

        System.assertEquals(false, documentType1.equals('foo'));
        System.assertEquals(false, documentType2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDocumentType documentType1 = OASDocumentType.getExample();
        OASDocumentType documentType2 = new OASDocumentType();
        OASDocumentType documentType3;

        System.assertEquals(false, documentType1.equals(documentType3));
        System.assertEquals(false, documentType2.equals(documentType3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDocumentType documentType1 = OASDocumentType.getExample();
        OASDocumentType documentType2 = new OASDocumentType();

        System.assertEquals(documentType1.hashCode(), documentType1.hashCode());
        System.assertEquals(documentType2.hashCode(), documentType2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDocumentType documentType1 = OASDocumentType.getExample();
        OASDocumentType documentType2 = OASDocumentType.getExample();
        OASDocumentType documentType3 = new OASDocumentType();
        OASDocumentType documentType4 = new OASDocumentType();

        System.assert(documentType1.equals(documentType2));
        System.assert(documentType3.equals(documentType4));
        System.assertEquals(documentType1.hashCode(), documentType2.hashCode());
        System.assertEquals(documentType3.hashCode(), documentType4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDocumentType documentType = new OASDocumentType();
        System.assertEquals(new List<List>(), documentType.fieldTypes);
        System.assertEquals(null, documentType.name);
        System.assertEquals(null, documentType.orgId);
        System.assertEquals(null, documentType.uuid);
    }
}
