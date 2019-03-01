@isTest
private class OASTemperatureResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTemperatureResponse temperatureResponse1 = OASTemperatureResponse.getExample();
        OASTemperatureResponse temperatureResponse2 = temperatureResponse1;
        OASTemperatureResponse temperatureResponse3 = new OASTemperatureResponse();
        OASTemperatureResponse temperatureResponse4 = temperatureResponse3;

        System.assert(temperatureResponse1.equals(temperatureResponse2));
        System.assert(temperatureResponse2.equals(temperatureResponse1));
        System.assert(temperatureResponse1.equals(temperatureResponse1));
        System.assert(temperatureResponse3.equals(temperatureResponse4));
        System.assert(temperatureResponse4.equals(temperatureResponse3));
        System.assert(temperatureResponse3.equals(temperatureResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTemperatureResponse temperatureResponse1 = OASTemperatureResponse.getExample();
        OASTemperatureResponse temperatureResponse2 = OASTemperatureResponse.getExample();
        OASTemperatureResponse temperatureResponse3 = new OASTemperatureResponse();
        OASTemperatureResponse temperatureResponse4 = new OASTemperatureResponse();

        System.assert(temperatureResponse1.equals(temperatureResponse2));
        System.assert(temperatureResponse2.equals(temperatureResponse1));
        System.assert(temperatureResponse3.equals(temperatureResponse4));
        System.assert(temperatureResponse4.equals(temperatureResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTemperatureResponse temperatureResponse1 = OASTemperatureResponse.getExample();
        OASTemperatureResponse temperatureResponse2 = new OASTemperatureResponse();

        System.assertEquals(false, temperatureResponse1.equals('foo'));
        System.assertEquals(false, temperatureResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTemperatureResponse temperatureResponse1 = OASTemperatureResponse.getExample();
        OASTemperatureResponse temperatureResponse2 = new OASTemperatureResponse();
        OASTemperatureResponse temperatureResponse3;

        System.assertEquals(false, temperatureResponse1.equals(temperatureResponse3));
        System.assertEquals(false, temperatureResponse2.equals(temperatureResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTemperatureResponse temperatureResponse1 = OASTemperatureResponse.getExample();
        OASTemperatureResponse temperatureResponse2 = new OASTemperatureResponse();

        System.assertEquals(temperatureResponse1.hashCode(), temperatureResponse1.hashCode());
        System.assertEquals(temperatureResponse2.hashCode(), temperatureResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTemperatureResponse temperatureResponse1 = OASTemperatureResponse.getExample();
        OASTemperatureResponse temperatureResponse2 = OASTemperatureResponse.getExample();
        OASTemperatureResponse temperatureResponse3 = new OASTemperatureResponse();
        OASTemperatureResponse temperatureResponse4 = new OASTemperatureResponse();

        System.assert(temperatureResponse1.equals(temperatureResponse2));
        System.assert(temperatureResponse3.equals(temperatureResponse4));
        System.assertEquals(temperatureResponse1.hashCode(), temperatureResponse2.hashCode());
        System.assertEquals(temperatureResponse3.hashCode(), temperatureResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTemperatureResponse temperatureResponse = new OASTemperatureResponse();
        System.assertEquals(new List<OASTemperatureResponseSensors>(), temperatureResponse.sensors);
        System.assertEquals(null, temperatureResponse.groupId);
    }
}
