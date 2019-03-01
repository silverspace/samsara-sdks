@isTest
private class OASDocumentTest {
    @isTest
    private static void equalsSameInstance() {
        OASDocument document1 = OASDocument.getExample();
        OASDocument document2 = document1;
        OASDocument document3 = new OASDocument();
        OASDocument document4 = document3;

        System.assert(document1.equals(document2));
        System.assert(document2.equals(document1));
        System.assert(document1.equals(document1));
        System.assert(document3.equals(document4));
        System.assert(document4.equals(document3));
        System.assert(document3.equals(document3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDocument document1 = OASDocument.getExample();
        OASDocument document2 = OASDocument.getExample();
        OASDocument document3 = new OASDocument();
        OASDocument document4 = new OASDocument();

        System.assert(document1.equals(document2));
        System.assert(document2.equals(document1));
        System.assert(document3.equals(document4));
        System.assert(document4.equals(document3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDocument document1 = OASDocument.getExample();
        OASDocument document2 = new OASDocument();

        System.assertEquals(false, document1.equals('foo'));
        System.assertEquals(false, document2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDocument document1 = OASDocument.getExample();
        OASDocument document2 = new OASDocument();
        OASDocument document3;

        System.assertEquals(false, document1.equals(document3));
        System.assertEquals(false, document2.equals(document3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDocument document1 = OASDocument.getExample();
        OASDocument document2 = new OASDocument();

        System.assertEquals(document1.hashCode(), document1.hashCode());
        System.assertEquals(document2.hashCode(), document2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDocument document1 = OASDocument.getExample();
        OASDocument document2 = OASDocument.getExample();
        OASDocument document3 = new OASDocument();
        OASDocument document4 = new OASDocument();

        System.assert(document1.equals(document2));
        System.assert(document3.equals(document4));
        System.assertEquals(document1.hashCode(), document2.hashCode());
        System.assertEquals(document3.hashCode(), document4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDocument document = new OASDocument();
        System.assertEquals(new List<OASDocumentField>(), document.fields);
        System.assertEquals(null, document.dispatchJobId);
        System.assertEquals(null, document.notes);
        System.assertEquals(null, document.documentType);
        System.assertEquals(null, document.driverCreatedAtMs);
        System.assertEquals(null, document.driverId);
        System.assertEquals(null, document.vehicleId);
    }
}
