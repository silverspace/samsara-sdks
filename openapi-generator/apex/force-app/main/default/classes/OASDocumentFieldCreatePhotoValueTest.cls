@isTest
private class OASDocumentFieldCreatePhotoValueTest {
    @isTest
    private static void equalsSameInstance() {
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue1 = OASDocumentFieldCreatePhotoValue.getExample();
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue2 = documentFieldCreatePhotoValue1;
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue3 = new OASDocumentFieldCreatePhotoValue();
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue4 = documentFieldCreatePhotoValue3;

        System.assert(documentFieldCreatePhotoValue1.equals(documentFieldCreatePhotoValue2));
        System.assert(documentFieldCreatePhotoValue2.equals(documentFieldCreatePhotoValue1));
        System.assert(documentFieldCreatePhotoValue1.equals(documentFieldCreatePhotoValue1));
        System.assert(documentFieldCreatePhotoValue3.equals(documentFieldCreatePhotoValue4));
        System.assert(documentFieldCreatePhotoValue4.equals(documentFieldCreatePhotoValue3));
        System.assert(documentFieldCreatePhotoValue3.equals(documentFieldCreatePhotoValue3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue1 = OASDocumentFieldCreatePhotoValue.getExample();
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue2 = OASDocumentFieldCreatePhotoValue.getExample();
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue3 = new OASDocumentFieldCreatePhotoValue();
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue4 = new OASDocumentFieldCreatePhotoValue();

        System.assert(documentFieldCreatePhotoValue1.equals(documentFieldCreatePhotoValue2));
        System.assert(documentFieldCreatePhotoValue2.equals(documentFieldCreatePhotoValue1));
        System.assert(documentFieldCreatePhotoValue3.equals(documentFieldCreatePhotoValue4));
        System.assert(documentFieldCreatePhotoValue4.equals(documentFieldCreatePhotoValue3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue1 = OASDocumentFieldCreatePhotoValue.getExample();
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue2 = new OASDocumentFieldCreatePhotoValue();

        System.assertEquals(false, documentFieldCreatePhotoValue1.equals('foo'));
        System.assertEquals(false, documentFieldCreatePhotoValue2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue1 = OASDocumentFieldCreatePhotoValue.getExample();
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue2 = new OASDocumentFieldCreatePhotoValue();
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue3;

        System.assertEquals(false, documentFieldCreatePhotoValue1.equals(documentFieldCreatePhotoValue3));
        System.assertEquals(false, documentFieldCreatePhotoValue2.equals(documentFieldCreatePhotoValue3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue1 = OASDocumentFieldCreatePhotoValue.getExample();
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue2 = new OASDocumentFieldCreatePhotoValue();

        System.assertEquals(documentFieldCreatePhotoValue1.hashCode(), documentFieldCreatePhotoValue1.hashCode());
        System.assertEquals(documentFieldCreatePhotoValue2.hashCode(), documentFieldCreatePhotoValue2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue1 = OASDocumentFieldCreatePhotoValue.getExample();
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue2 = OASDocumentFieldCreatePhotoValue.getExample();
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue3 = new OASDocumentFieldCreatePhotoValue();
        OASDocumentFieldCreatePhotoValue documentFieldCreatePhotoValue4 = new OASDocumentFieldCreatePhotoValue();

        System.assert(documentFieldCreatePhotoValue1.equals(documentFieldCreatePhotoValue2));
        System.assert(documentFieldCreatePhotoValue3.equals(documentFieldCreatePhotoValue4));
        System.assertEquals(documentFieldCreatePhotoValue1.hashCode(), documentFieldCreatePhotoValue2.hashCode());
        System.assertEquals(documentFieldCreatePhotoValue3.hashCode(), documentFieldCreatePhotoValue4.hashCode());
    }
}
