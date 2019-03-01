@isTest
private class OASSensorHistoryResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSensorHistoryResponse sensorHistoryResponse1 = OASSensorHistoryResponse.getExample();
        OASSensorHistoryResponse sensorHistoryResponse2 = sensorHistoryResponse1;
        OASSensorHistoryResponse sensorHistoryResponse3 = new OASSensorHistoryResponse();
        OASSensorHistoryResponse sensorHistoryResponse4 = sensorHistoryResponse3;

        System.assert(sensorHistoryResponse1.equals(sensorHistoryResponse2));
        System.assert(sensorHistoryResponse2.equals(sensorHistoryResponse1));
        System.assert(sensorHistoryResponse1.equals(sensorHistoryResponse1));
        System.assert(sensorHistoryResponse3.equals(sensorHistoryResponse4));
        System.assert(sensorHistoryResponse4.equals(sensorHistoryResponse3));
        System.assert(sensorHistoryResponse3.equals(sensorHistoryResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSensorHistoryResponse sensorHistoryResponse1 = OASSensorHistoryResponse.getExample();
        OASSensorHistoryResponse sensorHistoryResponse2 = OASSensorHistoryResponse.getExample();
        OASSensorHistoryResponse sensorHistoryResponse3 = new OASSensorHistoryResponse();
        OASSensorHistoryResponse sensorHistoryResponse4 = new OASSensorHistoryResponse();

        System.assert(sensorHistoryResponse1.equals(sensorHistoryResponse2));
        System.assert(sensorHistoryResponse2.equals(sensorHistoryResponse1));
        System.assert(sensorHistoryResponse3.equals(sensorHistoryResponse4));
        System.assert(sensorHistoryResponse4.equals(sensorHistoryResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSensorHistoryResponse sensorHistoryResponse1 = OASSensorHistoryResponse.getExample();
        OASSensorHistoryResponse sensorHistoryResponse2 = new OASSensorHistoryResponse();

        System.assertEquals(false, sensorHistoryResponse1.equals('foo'));
        System.assertEquals(false, sensorHistoryResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSensorHistoryResponse sensorHistoryResponse1 = OASSensorHistoryResponse.getExample();
        OASSensorHistoryResponse sensorHistoryResponse2 = new OASSensorHistoryResponse();
        OASSensorHistoryResponse sensorHistoryResponse3;

        System.assertEquals(false, sensorHistoryResponse1.equals(sensorHistoryResponse3));
        System.assertEquals(false, sensorHistoryResponse2.equals(sensorHistoryResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSensorHistoryResponse sensorHistoryResponse1 = OASSensorHistoryResponse.getExample();
        OASSensorHistoryResponse sensorHistoryResponse2 = new OASSensorHistoryResponse();

        System.assertEquals(sensorHistoryResponse1.hashCode(), sensorHistoryResponse1.hashCode());
        System.assertEquals(sensorHistoryResponse2.hashCode(), sensorHistoryResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSensorHistoryResponse sensorHistoryResponse1 = OASSensorHistoryResponse.getExample();
        OASSensorHistoryResponse sensorHistoryResponse2 = OASSensorHistoryResponse.getExample();
        OASSensorHistoryResponse sensorHistoryResponse3 = new OASSensorHistoryResponse();
        OASSensorHistoryResponse sensorHistoryResponse4 = new OASSensorHistoryResponse();

        System.assert(sensorHistoryResponse1.equals(sensorHistoryResponse2));
        System.assert(sensorHistoryResponse3.equals(sensorHistoryResponse4));
        System.assertEquals(sensorHistoryResponse1.hashCode(), sensorHistoryResponse2.hashCode());
        System.assertEquals(sensorHistoryResponse3.hashCode(), sensorHistoryResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSensorHistoryResponse sensorHistoryResponse = new OASSensorHistoryResponse();
        System.assertEquals(new List<OASSensorHistoryResponseResults>(), sensorHistoryResponse.results);
    }
}
