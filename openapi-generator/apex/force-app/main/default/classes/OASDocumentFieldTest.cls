@isTest
private class OASDocumentFieldTest {
    @isTest
    private static void equalsSameInstance() {
        OASDocumentField documentField1 = OASDocumentField.getExample();
        OASDocumentField documentField2 = documentField1;
        OASDocumentField documentField3 = new OASDocumentField();
        OASDocumentField documentField4 = documentField3;

        System.assert(documentField1.equals(documentField2));
        System.assert(documentField2.equals(documentField1));
        System.assert(documentField1.equals(documentField1));
        System.assert(documentField3.equals(documentField4));
        System.assert(documentField4.equals(documentField3));
        System.assert(documentField3.equals(documentField3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDocumentField documentField1 = OASDocumentField.getExample();
        OASDocumentField documentField2 = OASDocumentField.getExample();
        OASDocumentField documentField3 = new OASDocumentField();
        OASDocumentField documentField4 = new OASDocumentField();

        System.assert(documentField1.equals(documentField2));
        System.assert(documentField2.equals(documentField1));
        System.assert(documentField3.equals(documentField4));
        System.assert(documentField4.equals(documentField3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDocumentField documentField1 = OASDocumentField.getExample();
        OASDocumentField documentField2 = new OASDocumentField();

        System.assertEquals(false, documentField1.equals('foo'));
        System.assertEquals(false, documentField2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDocumentField documentField1 = OASDocumentField.getExample();
        OASDocumentField documentField2 = new OASDocumentField();
        OASDocumentField documentField3;

        System.assertEquals(false, documentField1.equals(documentField3));
        System.assertEquals(false, documentField2.equals(documentField3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDocumentField documentField1 = OASDocumentField.getExample();
        OASDocumentField documentField2 = new OASDocumentField();

        System.assertEquals(documentField1.hashCode(), documentField1.hashCode());
        System.assertEquals(documentField2.hashCode(), documentField2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDocumentField documentField1 = OASDocumentField.getExample();
        OASDocumentField documentField2 = OASDocumentField.getExample();
        OASDocumentField documentField3 = new OASDocumentField();
        OASDocumentField documentField4 = new OASDocumentField();

        System.assert(documentField1.equals(documentField2));
        System.assert(documentField3.equals(documentField4));
        System.assertEquals(documentField1.hashCode(), documentField2.hashCode());
        System.assertEquals(documentField3.hashCode(), documentField4.hashCode());
    }
}
