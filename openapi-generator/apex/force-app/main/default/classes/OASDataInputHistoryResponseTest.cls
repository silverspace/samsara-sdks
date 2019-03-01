@isTest
private class OASDataInputHistoryResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDataInputHistoryResponse dataInputHistoryResponse1 = OASDataInputHistoryResponse.getExample();
        OASDataInputHistoryResponse dataInputHistoryResponse2 = dataInputHistoryResponse1;
        OASDataInputHistoryResponse dataInputHistoryResponse3 = new OASDataInputHistoryResponse();
        OASDataInputHistoryResponse dataInputHistoryResponse4 = dataInputHistoryResponse3;

        System.assert(dataInputHistoryResponse1.equals(dataInputHistoryResponse2));
        System.assert(dataInputHistoryResponse2.equals(dataInputHistoryResponse1));
        System.assert(dataInputHistoryResponse1.equals(dataInputHistoryResponse1));
        System.assert(dataInputHistoryResponse3.equals(dataInputHistoryResponse4));
        System.assert(dataInputHistoryResponse4.equals(dataInputHistoryResponse3));
        System.assert(dataInputHistoryResponse3.equals(dataInputHistoryResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDataInputHistoryResponse dataInputHistoryResponse1 = OASDataInputHistoryResponse.getExample();
        OASDataInputHistoryResponse dataInputHistoryResponse2 = OASDataInputHistoryResponse.getExample();
        OASDataInputHistoryResponse dataInputHistoryResponse3 = new OASDataInputHistoryResponse();
        OASDataInputHistoryResponse dataInputHistoryResponse4 = new OASDataInputHistoryResponse();

        System.assert(dataInputHistoryResponse1.equals(dataInputHistoryResponse2));
        System.assert(dataInputHistoryResponse2.equals(dataInputHistoryResponse1));
        System.assert(dataInputHistoryResponse3.equals(dataInputHistoryResponse4));
        System.assert(dataInputHistoryResponse4.equals(dataInputHistoryResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDataInputHistoryResponse dataInputHistoryResponse1 = OASDataInputHistoryResponse.getExample();
        OASDataInputHistoryResponse dataInputHistoryResponse2 = new OASDataInputHistoryResponse();

        System.assertEquals(false, dataInputHistoryResponse1.equals('foo'));
        System.assertEquals(false, dataInputHistoryResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDataInputHistoryResponse dataInputHistoryResponse1 = OASDataInputHistoryResponse.getExample();
        OASDataInputHistoryResponse dataInputHistoryResponse2 = new OASDataInputHistoryResponse();
        OASDataInputHistoryResponse dataInputHistoryResponse3;

        System.assertEquals(false, dataInputHistoryResponse1.equals(dataInputHistoryResponse3));
        System.assertEquals(false, dataInputHistoryResponse2.equals(dataInputHistoryResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDataInputHistoryResponse dataInputHistoryResponse1 = OASDataInputHistoryResponse.getExample();
        OASDataInputHistoryResponse dataInputHistoryResponse2 = new OASDataInputHistoryResponse();

        System.assertEquals(dataInputHistoryResponse1.hashCode(), dataInputHistoryResponse1.hashCode());
        System.assertEquals(dataInputHistoryResponse2.hashCode(), dataInputHistoryResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDataInputHistoryResponse dataInputHistoryResponse1 = OASDataInputHistoryResponse.getExample();
        OASDataInputHistoryResponse dataInputHistoryResponse2 = OASDataInputHistoryResponse.getExample();
        OASDataInputHistoryResponse dataInputHistoryResponse3 = new OASDataInputHistoryResponse();
        OASDataInputHistoryResponse dataInputHistoryResponse4 = new OASDataInputHistoryResponse();

        System.assert(dataInputHistoryResponse1.equals(dataInputHistoryResponse2));
        System.assert(dataInputHistoryResponse3.equals(dataInputHistoryResponse4));
        System.assertEquals(dataInputHistoryResponse1.hashCode(), dataInputHistoryResponse2.hashCode());
        System.assertEquals(dataInputHistoryResponse3.hashCode(), dataInputHistoryResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDataInputHistoryResponse dataInputHistoryResponse = new OASDataInputHistoryResponse();
        System.assertEquals(new List<OASDataInputHistoryResponsePoints>(), dataInputHistoryResponse.points);
        System.assertEquals(null, dataInputHistoryResponse.id);
        System.assertEquals(null, dataInputHistoryResponse.name);
    }
}
