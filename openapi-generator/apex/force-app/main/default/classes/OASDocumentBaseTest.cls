@isTest
private class OASDocumentBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDocumentBase documentBase1 = OASDocumentBase.getExample();
        OASDocumentBase documentBase2 = documentBase1;
        OASDocumentBase documentBase3 = new OASDocumentBase();
        OASDocumentBase documentBase4 = documentBase3;

        System.assert(documentBase1.equals(documentBase2));
        System.assert(documentBase2.equals(documentBase1));
        System.assert(documentBase1.equals(documentBase1));
        System.assert(documentBase3.equals(documentBase4));
        System.assert(documentBase4.equals(documentBase3));
        System.assert(documentBase3.equals(documentBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDocumentBase documentBase1 = OASDocumentBase.getExample();
        OASDocumentBase documentBase2 = OASDocumentBase.getExample();
        OASDocumentBase documentBase3 = new OASDocumentBase();
        OASDocumentBase documentBase4 = new OASDocumentBase();

        System.assert(documentBase1.equals(documentBase2));
        System.assert(documentBase2.equals(documentBase1));
        System.assert(documentBase3.equals(documentBase4));
        System.assert(documentBase4.equals(documentBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDocumentBase documentBase1 = OASDocumentBase.getExample();
        OASDocumentBase documentBase2 = new OASDocumentBase();

        System.assertEquals(false, documentBase1.equals('foo'));
        System.assertEquals(false, documentBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDocumentBase documentBase1 = OASDocumentBase.getExample();
        OASDocumentBase documentBase2 = new OASDocumentBase();
        OASDocumentBase documentBase3;

        System.assertEquals(false, documentBase1.equals(documentBase3));
        System.assertEquals(false, documentBase2.equals(documentBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDocumentBase documentBase1 = OASDocumentBase.getExample();
        OASDocumentBase documentBase2 = new OASDocumentBase();

        System.assertEquals(documentBase1.hashCode(), documentBase1.hashCode());
        System.assertEquals(documentBase2.hashCode(), documentBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDocumentBase documentBase1 = OASDocumentBase.getExample();
        OASDocumentBase documentBase2 = OASDocumentBase.getExample();
        OASDocumentBase documentBase3 = new OASDocumentBase();
        OASDocumentBase documentBase4 = new OASDocumentBase();

        System.assert(documentBase1.equals(documentBase2));
        System.assert(documentBase3.equals(documentBase4));
        System.assertEquals(documentBase1.hashCode(), documentBase2.hashCode());
        System.assertEquals(documentBase3.hashCode(), documentBase4.hashCode());
    }
}
