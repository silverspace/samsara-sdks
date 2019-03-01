@isTest
private class OASDocumentFieldTypeNumberValueTypeMTest {
    @isTest
    private static void equalsSameInstance() {
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata1 = OASDocumentFieldTypeNumberValueTypeM.getExample();
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata2 = documentFieldTypeNumberValueTypeMetadata1;
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata3 = new OASDocumentFieldTypeNumberValueTypeM();
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata4 = documentFieldTypeNumberValueTypeMetadata3;

        System.assert(documentFieldTypeNumberValueTypeMetadata1.equals(documentFieldTypeNumberValueTypeMetadata2));
        System.assert(documentFieldTypeNumberValueTypeMetadata2.equals(documentFieldTypeNumberValueTypeMetadata1));
        System.assert(documentFieldTypeNumberValueTypeMetadata1.equals(documentFieldTypeNumberValueTypeMetadata1));
        System.assert(documentFieldTypeNumberValueTypeMetadata3.equals(documentFieldTypeNumberValueTypeMetadata4));
        System.assert(documentFieldTypeNumberValueTypeMetadata4.equals(documentFieldTypeNumberValueTypeMetadata3));
        System.assert(documentFieldTypeNumberValueTypeMetadata3.equals(documentFieldTypeNumberValueTypeMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata1 = OASDocumentFieldTypeNumberValueTypeM.getExample();
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata2 = OASDocumentFieldTypeNumberValueTypeM.getExample();
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata3 = new OASDocumentFieldTypeNumberValueTypeM();
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata4 = new OASDocumentFieldTypeNumberValueTypeM();

        System.assert(documentFieldTypeNumberValueTypeMetadata1.equals(documentFieldTypeNumberValueTypeMetadata2));
        System.assert(documentFieldTypeNumberValueTypeMetadata2.equals(documentFieldTypeNumberValueTypeMetadata1));
        System.assert(documentFieldTypeNumberValueTypeMetadata3.equals(documentFieldTypeNumberValueTypeMetadata4));
        System.assert(documentFieldTypeNumberValueTypeMetadata4.equals(documentFieldTypeNumberValueTypeMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata1 = OASDocumentFieldTypeNumberValueTypeM.getExample();
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata2 = new OASDocumentFieldTypeNumberValueTypeM();

        System.assertEquals(false, documentFieldTypeNumberValueTypeMetadata1.equals('foo'));
        System.assertEquals(false, documentFieldTypeNumberValueTypeMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata1 = OASDocumentFieldTypeNumberValueTypeM.getExample();
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata2 = new OASDocumentFieldTypeNumberValueTypeM();
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata3;

        System.assertEquals(false, documentFieldTypeNumberValueTypeMetadata1.equals(documentFieldTypeNumberValueTypeMetadata3));
        System.assertEquals(false, documentFieldTypeNumberValueTypeMetadata2.equals(documentFieldTypeNumberValueTypeMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata1 = OASDocumentFieldTypeNumberValueTypeM.getExample();
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata2 = new OASDocumentFieldTypeNumberValueTypeM();

        System.assertEquals(documentFieldTypeNumberValueTypeMetadata1.hashCode(), documentFieldTypeNumberValueTypeMetadata1.hashCode());
        System.assertEquals(documentFieldTypeNumberValueTypeMetadata2.hashCode(), documentFieldTypeNumberValueTypeMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata1 = OASDocumentFieldTypeNumberValueTypeM.getExample();
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata2 = OASDocumentFieldTypeNumberValueTypeM.getExample();
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata3 = new OASDocumentFieldTypeNumberValueTypeM();
        OASDocumentFieldTypeNumberValueTypeM documentFieldTypeNumberValueTypeMetadata4 = new OASDocumentFieldTypeNumberValueTypeM();

        System.assert(documentFieldTypeNumberValueTypeMetadata1.equals(documentFieldTypeNumberValueTypeMetadata2));
        System.assert(documentFieldTypeNumberValueTypeMetadata3.equals(documentFieldTypeNumberValueTypeMetadata4));
        System.assertEquals(documentFieldTypeNumberValueTypeMetadata1.hashCode(), documentFieldTypeNumberValueTypeMetadata2.hashCode());
        System.assertEquals(documentFieldTypeNumberValueTypeMetadata3.hashCode(), documentFieldTypeNumberValueTypeMetadata4.hashCode());
    }
}
