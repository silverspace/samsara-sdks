@isTest
private class OASDocumentCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASDocumentCreate documentCreate1 = OASDocumentCreate.getExample();
        OASDocumentCreate documentCreate2 = documentCreate1;
        OASDocumentCreate documentCreate3 = new OASDocumentCreate();
        OASDocumentCreate documentCreate4 = documentCreate3;

        System.assert(documentCreate1.equals(documentCreate2));
        System.assert(documentCreate2.equals(documentCreate1));
        System.assert(documentCreate1.equals(documentCreate1));
        System.assert(documentCreate3.equals(documentCreate4));
        System.assert(documentCreate4.equals(documentCreate3));
        System.assert(documentCreate3.equals(documentCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDocumentCreate documentCreate1 = OASDocumentCreate.getExample();
        OASDocumentCreate documentCreate2 = OASDocumentCreate.getExample();
        OASDocumentCreate documentCreate3 = new OASDocumentCreate();
        OASDocumentCreate documentCreate4 = new OASDocumentCreate();

        System.assert(documentCreate1.equals(documentCreate2));
        System.assert(documentCreate2.equals(documentCreate1));
        System.assert(documentCreate3.equals(documentCreate4));
        System.assert(documentCreate4.equals(documentCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDocumentCreate documentCreate1 = OASDocumentCreate.getExample();
        OASDocumentCreate documentCreate2 = new OASDocumentCreate();

        System.assertEquals(false, documentCreate1.equals('foo'));
        System.assertEquals(false, documentCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDocumentCreate documentCreate1 = OASDocumentCreate.getExample();
        OASDocumentCreate documentCreate2 = new OASDocumentCreate();
        OASDocumentCreate documentCreate3;

        System.assertEquals(false, documentCreate1.equals(documentCreate3));
        System.assertEquals(false, documentCreate2.equals(documentCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDocumentCreate documentCreate1 = OASDocumentCreate.getExample();
        OASDocumentCreate documentCreate2 = new OASDocumentCreate();

        System.assertEquals(documentCreate1.hashCode(), documentCreate1.hashCode());
        System.assertEquals(documentCreate2.hashCode(), documentCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDocumentCreate documentCreate1 = OASDocumentCreate.getExample();
        OASDocumentCreate documentCreate2 = OASDocumentCreate.getExample();
        OASDocumentCreate documentCreate3 = new OASDocumentCreate();
        OASDocumentCreate documentCreate4 = new OASDocumentCreate();

        System.assert(documentCreate1.equals(documentCreate2));
        System.assert(documentCreate3.equals(documentCreate4));
        System.assertEquals(documentCreate1.hashCode(), documentCreate2.hashCode());
        System.assertEquals(documentCreate3.hashCode(), documentCreate4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDocumentCreate documentCreate = new OASDocumentCreate();
        System.assertEquals(new List<OASDocumentField>(), documentCreate.fields);
        System.assertEquals(null, documentCreate.dispatchJobId);
        System.assertEquals(null, documentCreate.notes);
        System.assertEquals(null, documentCreate.documentTypeUuid);
    }
}
