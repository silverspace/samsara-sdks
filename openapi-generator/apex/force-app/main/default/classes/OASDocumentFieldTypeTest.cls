@isTest
private class OASDocumentFieldTypeTest {
    @isTest
    private static void equalsSameInstance() {
        OASDocumentFieldType documentFieldType1 = OASDocumentFieldType.getExample();
        OASDocumentFieldType documentFieldType2 = documentFieldType1;
        OASDocumentFieldType documentFieldType3 = new OASDocumentFieldType();
        OASDocumentFieldType documentFieldType4 = documentFieldType3;

        System.assert(documentFieldType1.equals(documentFieldType2));
        System.assert(documentFieldType2.equals(documentFieldType1));
        System.assert(documentFieldType1.equals(documentFieldType1));
        System.assert(documentFieldType3.equals(documentFieldType4));
        System.assert(documentFieldType4.equals(documentFieldType3));
        System.assert(documentFieldType3.equals(documentFieldType3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDocumentFieldType documentFieldType1 = OASDocumentFieldType.getExample();
        OASDocumentFieldType documentFieldType2 = OASDocumentFieldType.getExample();
        OASDocumentFieldType documentFieldType3 = new OASDocumentFieldType();
        OASDocumentFieldType documentFieldType4 = new OASDocumentFieldType();

        System.assert(documentFieldType1.equals(documentFieldType2));
        System.assert(documentFieldType2.equals(documentFieldType1));
        System.assert(documentFieldType3.equals(documentFieldType4));
        System.assert(documentFieldType4.equals(documentFieldType3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDocumentFieldType documentFieldType1 = OASDocumentFieldType.getExample();
        OASDocumentFieldType documentFieldType2 = new OASDocumentFieldType();

        System.assertEquals(false, documentFieldType1.equals('foo'));
        System.assertEquals(false, documentFieldType2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDocumentFieldType documentFieldType1 = OASDocumentFieldType.getExample();
        OASDocumentFieldType documentFieldType2 = new OASDocumentFieldType();
        OASDocumentFieldType documentFieldType3;

        System.assertEquals(false, documentFieldType1.equals(documentFieldType3));
        System.assertEquals(false, documentFieldType2.equals(documentFieldType3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDocumentFieldType documentFieldType1 = OASDocumentFieldType.getExample();
        OASDocumentFieldType documentFieldType2 = new OASDocumentFieldType();

        System.assertEquals(documentFieldType1.hashCode(), documentFieldType1.hashCode());
        System.assertEquals(documentFieldType2.hashCode(), documentFieldType2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDocumentFieldType documentFieldType1 = OASDocumentFieldType.getExample();
        OASDocumentFieldType documentFieldType2 = OASDocumentFieldType.getExample();
        OASDocumentFieldType documentFieldType3 = new OASDocumentFieldType();
        OASDocumentFieldType documentFieldType4 = new OASDocumentFieldType();

        System.assert(documentFieldType1.equals(documentFieldType2));
        System.assert(documentFieldType3.equals(documentFieldType4));
        System.assertEquals(documentFieldType1.hashCode(), documentFieldType2.hashCode());
        System.assertEquals(documentFieldType3.hashCode(), documentFieldType4.hashCode());
    }
}
