@isTest
private class OASDocumentFieldCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASDocumentFieldCreate documentFieldCreate1 = OASDocumentFieldCreate.getExample();
        OASDocumentFieldCreate documentFieldCreate2 = documentFieldCreate1;
        OASDocumentFieldCreate documentFieldCreate3 = new OASDocumentFieldCreate();
        OASDocumentFieldCreate documentFieldCreate4 = documentFieldCreate3;

        System.assert(documentFieldCreate1.equals(documentFieldCreate2));
        System.assert(documentFieldCreate2.equals(documentFieldCreate1));
        System.assert(documentFieldCreate1.equals(documentFieldCreate1));
        System.assert(documentFieldCreate3.equals(documentFieldCreate4));
        System.assert(documentFieldCreate4.equals(documentFieldCreate3));
        System.assert(documentFieldCreate3.equals(documentFieldCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDocumentFieldCreate documentFieldCreate1 = OASDocumentFieldCreate.getExample();
        OASDocumentFieldCreate documentFieldCreate2 = OASDocumentFieldCreate.getExample();
        OASDocumentFieldCreate documentFieldCreate3 = new OASDocumentFieldCreate();
        OASDocumentFieldCreate documentFieldCreate4 = new OASDocumentFieldCreate();

        System.assert(documentFieldCreate1.equals(documentFieldCreate2));
        System.assert(documentFieldCreate2.equals(documentFieldCreate1));
        System.assert(documentFieldCreate3.equals(documentFieldCreate4));
        System.assert(documentFieldCreate4.equals(documentFieldCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDocumentFieldCreate documentFieldCreate1 = OASDocumentFieldCreate.getExample();
        OASDocumentFieldCreate documentFieldCreate2 = new OASDocumentFieldCreate();

        System.assertEquals(false, documentFieldCreate1.equals('foo'));
        System.assertEquals(false, documentFieldCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDocumentFieldCreate documentFieldCreate1 = OASDocumentFieldCreate.getExample();
        OASDocumentFieldCreate documentFieldCreate2 = new OASDocumentFieldCreate();
        OASDocumentFieldCreate documentFieldCreate3;

        System.assertEquals(false, documentFieldCreate1.equals(documentFieldCreate3));
        System.assertEquals(false, documentFieldCreate2.equals(documentFieldCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDocumentFieldCreate documentFieldCreate1 = OASDocumentFieldCreate.getExample();
        OASDocumentFieldCreate documentFieldCreate2 = new OASDocumentFieldCreate();

        System.assertEquals(documentFieldCreate1.hashCode(), documentFieldCreate1.hashCode());
        System.assertEquals(documentFieldCreate2.hashCode(), documentFieldCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDocumentFieldCreate documentFieldCreate1 = OASDocumentFieldCreate.getExample();
        OASDocumentFieldCreate documentFieldCreate2 = OASDocumentFieldCreate.getExample();
        OASDocumentFieldCreate documentFieldCreate3 = new OASDocumentFieldCreate();
        OASDocumentFieldCreate documentFieldCreate4 = new OASDocumentFieldCreate();

        System.assert(documentFieldCreate1.equals(documentFieldCreate2));
        System.assert(documentFieldCreate3.equals(documentFieldCreate4));
        System.assertEquals(documentFieldCreate1.hashCode(), documentFieldCreate2.hashCode());
        System.assertEquals(documentFieldCreate3.hashCode(), documentFieldCreate4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDocumentFieldCreate documentFieldCreate = new OASDocumentFieldCreate();
        System.assertEquals(new List<OASDocumentFieldCreatePhotoValue>(), documentFieldCreate.photoValue);
        System.assertEquals(null, documentFieldCreate.numberValue);
        System.assertEquals(null, documentFieldCreate.stringValue);
        System.assertEquals(null, documentFieldCreate.valueType);
    }
}
