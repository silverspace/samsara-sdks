@isTest
private class OASHumidityResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASHumidityResponse humidityResponse1 = OASHumidityResponse.getExample();
        OASHumidityResponse humidityResponse2 = humidityResponse1;
        OASHumidityResponse humidityResponse3 = new OASHumidityResponse();
        OASHumidityResponse humidityResponse4 = humidityResponse3;

        System.assert(humidityResponse1.equals(humidityResponse2));
        System.assert(humidityResponse2.equals(humidityResponse1));
        System.assert(humidityResponse1.equals(humidityResponse1));
        System.assert(humidityResponse3.equals(humidityResponse4));
        System.assert(humidityResponse4.equals(humidityResponse3));
        System.assert(humidityResponse3.equals(humidityResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHumidityResponse humidityResponse1 = OASHumidityResponse.getExample();
        OASHumidityResponse humidityResponse2 = OASHumidityResponse.getExample();
        OASHumidityResponse humidityResponse3 = new OASHumidityResponse();
        OASHumidityResponse humidityResponse4 = new OASHumidityResponse();

        System.assert(humidityResponse1.equals(humidityResponse2));
        System.assert(humidityResponse2.equals(humidityResponse1));
        System.assert(humidityResponse3.equals(humidityResponse4));
        System.assert(humidityResponse4.equals(humidityResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHumidityResponse humidityResponse1 = OASHumidityResponse.getExample();
        OASHumidityResponse humidityResponse2 = new OASHumidityResponse();

        System.assertEquals(false, humidityResponse1.equals('foo'));
        System.assertEquals(false, humidityResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHumidityResponse humidityResponse1 = OASHumidityResponse.getExample();
        OASHumidityResponse humidityResponse2 = new OASHumidityResponse();
        OASHumidityResponse humidityResponse3;

        System.assertEquals(false, humidityResponse1.equals(humidityResponse3));
        System.assertEquals(false, humidityResponse2.equals(humidityResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHumidityResponse humidityResponse1 = OASHumidityResponse.getExample();
        OASHumidityResponse humidityResponse2 = new OASHumidityResponse();

        System.assertEquals(humidityResponse1.hashCode(), humidityResponse1.hashCode());
        System.assertEquals(humidityResponse2.hashCode(), humidityResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHumidityResponse humidityResponse1 = OASHumidityResponse.getExample();
        OASHumidityResponse humidityResponse2 = OASHumidityResponse.getExample();
        OASHumidityResponse humidityResponse3 = new OASHumidityResponse();
        OASHumidityResponse humidityResponse4 = new OASHumidityResponse();

        System.assert(humidityResponse1.equals(humidityResponse2));
        System.assert(humidityResponse3.equals(humidityResponse4));
        System.assertEquals(humidityResponse1.hashCode(), humidityResponse2.hashCode());
        System.assertEquals(humidityResponse3.hashCode(), humidityResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASHumidityResponse humidityResponse = new OASHumidityResponse();
        System.assertEquals(new List<OASHumidityResponseSensors>(), humidityResponse.sensors);
        System.assertEquals(null, humidityResponse.groupId);
    }
}
