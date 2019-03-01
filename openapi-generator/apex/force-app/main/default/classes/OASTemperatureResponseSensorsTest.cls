@isTest
private class OASTemperatureResponseSensorsTest {
    @isTest
    private static void equalsSameInstance() {
        OASTemperatureResponseSensors temperatureResponseSensors1 = OASTemperatureResponseSensors.getExample();
        OASTemperatureResponseSensors temperatureResponseSensors2 = temperatureResponseSensors1;
        OASTemperatureResponseSensors temperatureResponseSensors3 = new OASTemperatureResponseSensors();
        OASTemperatureResponseSensors temperatureResponseSensors4 = temperatureResponseSensors3;

        System.assert(temperatureResponseSensors1.equals(temperatureResponseSensors2));
        System.assert(temperatureResponseSensors2.equals(temperatureResponseSensors1));
        System.assert(temperatureResponseSensors1.equals(temperatureResponseSensors1));
        System.assert(temperatureResponseSensors3.equals(temperatureResponseSensors4));
        System.assert(temperatureResponseSensors4.equals(temperatureResponseSensors3));
        System.assert(temperatureResponseSensors3.equals(temperatureResponseSensors3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTemperatureResponseSensors temperatureResponseSensors1 = OASTemperatureResponseSensors.getExample();
        OASTemperatureResponseSensors temperatureResponseSensors2 = OASTemperatureResponseSensors.getExample();
        OASTemperatureResponseSensors temperatureResponseSensors3 = new OASTemperatureResponseSensors();
        OASTemperatureResponseSensors temperatureResponseSensors4 = new OASTemperatureResponseSensors();

        System.assert(temperatureResponseSensors1.equals(temperatureResponseSensors2));
        System.assert(temperatureResponseSensors2.equals(temperatureResponseSensors1));
        System.assert(temperatureResponseSensors3.equals(temperatureResponseSensors4));
        System.assert(temperatureResponseSensors4.equals(temperatureResponseSensors3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTemperatureResponseSensors temperatureResponseSensors1 = OASTemperatureResponseSensors.getExample();
        OASTemperatureResponseSensors temperatureResponseSensors2 = new OASTemperatureResponseSensors();

        System.assertEquals(false, temperatureResponseSensors1.equals('foo'));
        System.assertEquals(false, temperatureResponseSensors2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTemperatureResponseSensors temperatureResponseSensors1 = OASTemperatureResponseSensors.getExample();
        OASTemperatureResponseSensors temperatureResponseSensors2 = new OASTemperatureResponseSensors();
        OASTemperatureResponseSensors temperatureResponseSensors3;

        System.assertEquals(false, temperatureResponseSensors1.equals(temperatureResponseSensors3));
        System.assertEquals(false, temperatureResponseSensors2.equals(temperatureResponseSensors3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTemperatureResponseSensors temperatureResponseSensors1 = OASTemperatureResponseSensors.getExample();
        OASTemperatureResponseSensors temperatureResponseSensors2 = new OASTemperatureResponseSensors();

        System.assertEquals(temperatureResponseSensors1.hashCode(), temperatureResponseSensors1.hashCode());
        System.assertEquals(temperatureResponseSensors2.hashCode(), temperatureResponseSensors2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTemperatureResponseSensors temperatureResponseSensors1 = OASTemperatureResponseSensors.getExample();
        OASTemperatureResponseSensors temperatureResponseSensors2 = OASTemperatureResponseSensors.getExample();
        OASTemperatureResponseSensors temperatureResponseSensors3 = new OASTemperatureResponseSensors();
        OASTemperatureResponseSensors temperatureResponseSensors4 = new OASTemperatureResponseSensors();

        System.assert(temperatureResponseSensors1.equals(temperatureResponseSensors2));
        System.assert(temperatureResponseSensors3.equals(temperatureResponseSensors4));
        System.assertEquals(temperatureResponseSensors1.hashCode(), temperatureResponseSensors2.hashCode());
        System.assertEquals(temperatureResponseSensors3.hashCode(), temperatureResponseSensors4.hashCode());
    }
}
