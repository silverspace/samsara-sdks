@isTest
private class OASVehicleHarshEventResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASVehicleHarshEventResponse vehicleHarshEventResponse1 = OASVehicleHarshEventResponse.getExample();
        OASVehicleHarshEventResponse vehicleHarshEventResponse2 = vehicleHarshEventResponse1;
        OASVehicleHarshEventResponse vehicleHarshEventResponse3 = new OASVehicleHarshEventResponse();
        OASVehicleHarshEventResponse vehicleHarshEventResponse4 = vehicleHarshEventResponse3;

        System.assert(vehicleHarshEventResponse1.equals(vehicleHarshEventResponse2));
        System.assert(vehicleHarshEventResponse2.equals(vehicleHarshEventResponse1));
        System.assert(vehicleHarshEventResponse1.equals(vehicleHarshEventResponse1));
        System.assert(vehicleHarshEventResponse3.equals(vehicleHarshEventResponse4));
        System.assert(vehicleHarshEventResponse4.equals(vehicleHarshEventResponse3));
        System.assert(vehicleHarshEventResponse3.equals(vehicleHarshEventResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVehicleHarshEventResponse vehicleHarshEventResponse1 = OASVehicleHarshEventResponse.getExample();
        OASVehicleHarshEventResponse vehicleHarshEventResponse2 = OASVehicleHarshEventResponse.getExample();
        OASVehicleHarshEventResponse vehicleHarshEventResponse3 = new OASVehicleHarshEventResponse();
        OASVehicleHarshEventResponse vehicleHarshEventResponse4 = new OASVehicleHarshEventResponse();

        System.assert(vehicleHarshEventResponse1.equals(vehicleHarshEventResponse2));
        System.assert(vehicleHarshEventResponse2.equals(vehicleHarshEventResponse1));
        System.assert(vehicleHarshEventResponse3.equals(vehicleHarshEventResponse4));
        System.assert(vehicleHarshEventResponse4.equals(vehicleHarshEventResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVehicleHarshEventResponse vehicleHarshEventResponse1 = OASVehicleHarshEventResponse.getExample();
        OASVehicleHarshEventResponse vehicleHarshEventResponse2 = new OASVehicleHarshEventResponse();

        System.assertEquals(false, vehicleHarshEventResponse1.equals('foo'));
        System.assertEquals(false, vehicleHarshEventResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVehicleHarshEventResponse vehicleHarshEventResponse1 = OASVehicleHarshEventResponse.getExample();
        OASVehicleHarshEventResponse vehicleHarshEventResponse2 = new OASVehicleHarshEventResponse();
        OASVehicleHarshEventResponse vehicleHarshEventResponse3;

        System.assertEquals(false, vehicleHarshEventResponse1.equals(vehicleHarshEventResponse3));
        System.assertEquals(false, vehicleHarshEventResponse2.equals(vehicleHarshEventResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVehicleHarshEventResponse vehicleHarshEventResponse1 = OASVehicleHarshEventResponse.getExample();
        OASVehicleHarshEventResponse vehicleHarshEventResponse2 = new OASVehicleHarshEventResponse();

        System.assertEquals(vehicleHarshEventResponse1.hashCode(), vehicleHarshEventResponse1.hashCode());
        System.assertEquals(vehicleHarshEventResponse2.hashCode(), vehicleHarshEventResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVehicleHarshEventResponse vehicleHarshEventResponse1 = OASVehicleHarshEventResponse.getExample();
        OASVehicleHarshEventResponse vehicleHarshEventResponse2 = OASVehicleHarshEventResponse.getExample();
        OASVehicleHarshEventResponse vehicleHarshEventResponse3 = new OASVehicleHarshEventResponse();
        OASVehicleHarshEventResponse vehicleHarshEventResponse4 = new OASVehicleHarshEventResponse();

        System.assert(vehicleHarshEventResponse1.equals(vehicleHarshEventResponse2));
        System.assert(vehicleHarshEventResponse3.equals(vehicleHarshEventResponse4));
        System.assertEquals(vehicleHarshEventResponse1.hashCode(), vehicleHarshEventResponse2.hashCode());
        System.assertEquals(vehicleHarshEventResponse3.hashCode(), vehicleHarshEventResponse4.hashCode());
    }
}
