@isTest
private class OASHumidityResponseSensorsTest {
    @isTest
    private static void equalsSameInstance() {
        OASHumidityResponseSensors humidityResponseSensors1 = OASHumidityResponseSensors.getExample();
        OASHumidityResponseSensors humidityResponseSensors2 = humidityResponseSensors1;
        OASHumidityResponseSensors humidityResponseSensors3 = new OASHumidityResponseSensors();
        OASHumidityResponseSensors humidityResponseSensors4 = humidityResponseSensors3;

        System.assert(humidityResponseSensors1.equals(humidityResponseSensors2));
        System.assert(humidityResponseSensors2.equals(humidityResponseSensors1));
        System.assert(humidityResponseSensors1.equals(humidityResponseSensors1));
        System.assert(humidityResponseSensors3.equals(humidityResponseSensors4));
        System.assert(humidityResponseSensors4.equals(humidityResponseSensors3));
        System.assert(humidityResponseSensors3.equals(humidityResponseSensors3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHumidityResponseSensors humidityResponseSensors1 = OASHumidityResponseSensors.getExample();
        OASHumidityResponseSensors humidityResponseSensors2 = OASHumidityResponseSensors.getExample();
        OASHumidityResponseSensors humidityResponseSensors3 = new OASHumidityResponseSensors();
        OASHumidityResponseSensors humidityResponseSensors4 = new OASHumidityResponseSensors();

        System.assert(humidityResponseSensors1.equals(humidityResponseSensors2));
        System.assert(humidityResponseSensors2.equals(humidityResponseSensors1));
        System.assert(humidityResponseSensors3.equals(humidityResponseSensors4));
        System.assert(humidityResponseSensors4.equals(humidityResponseSensors3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHumidityResponseSensors humidityResponseSensors1 = OASHumidityResponseSensors.getExample();
        OASHumidityResponseSensors humidityResponseSensors2 = new OASHumidityResponseSensors();

        System.assertEquals(false, humidityResponseSensors1.equals('foo'));
        System.assertEquals(false, humidityResponseSensors2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHumidityResponseSensors humidityResponseSensors1 = OASHumidityResponseSensors.getExample();
        OASHumidityResponseSensors humidityResponseSensors2 = new OASHumidityResponseSensors();
        OASHumidityResponseSensors humidityResponseSensors3;

        System.assertEquals(false, humidityResponseSensors1.equals(humidityResponseSensors3));
        System.assertEquals(false, humidityResponseSensors2.equals(humidityResponseSensors3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHumidityResponseSensors humidityResponseSensors1 = OASHumidityResponseSensors.getExample();
        OASHumidityResponseSensors humidityResponseSensors2 = new OASHumidityResponseSensors();

        System.assertEquals(humidityResponseSensors1.hashCode(), humidityResponseSensors1.hashCode());
        System.assertEquals(humidityResponseSensors2.hashCode(), humidityResponseSensors2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHumidityResponseSensors humidityResponseSensors1 = OASHumidityResponseSensors.getExample();
        OASHumidityResponseSensors humidityResponseSensors2 = OASHumidityResponseSensors.getExample();
        OASHumidityResponseSensors humidityResponseSensors3 = new OASHumidityResponseSensors();
        OASHumidityResponseSensors humidityResponseSensors4 = new OASHumidityResponseSensors();

        System.assert(humidityResponseSensors1.equals(humidityResponseSensors2));
        System.assert(humidityResponseSensors3.equals(humidityResponseSensors4));
        System.assertEquals(humidityResponseSensors1.hashCode(), humidityResponseSensors2.hashCode());
        System.assertEquals(humidityResponseSensors3.hashCode(), humidityResponseSensors4.hashCode());
    }
}
