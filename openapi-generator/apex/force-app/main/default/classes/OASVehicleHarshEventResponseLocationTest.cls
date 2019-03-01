@isTest
private class OASVehicleHarshEventResponseLocationTest {
    @isTest
    private static void equalsSameInstance() {
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation1 = OASVehicleHarshEventResponseLocation.getExample();
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation2 = vehicleHarshEventResponseLocation1;
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation3 = new OASVehicleHarshEventResponseLocation();
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation4 = vehicleHarshEventResponseLocation3;

        System.assert(vehicleHarshEventResponseLocation1.equals(vehicleHarshEventResponseLocation2));
        System.assert(vehicleHarshEventResponseLocation2.equals(vehicleHarshEventResponseLocation1));
        System.assert(vehicleHarshEventResponseLocation1.equals(vehicleHarshEventResponseLocation1));
        System.assert(vehicleHarshEventResponseLocation3.equals(vehicleHarshEventResponseLocation4));
        System.assert(vehicleHarshEventResponseLocation4.equals(vehicleHarshEventResponseLocation3));
        System.assert(vehicleHarshEventResponseLocation3.equals(vehicleHarshEventResponseLocation3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation1 = OASVehicleHarshEventResponseLocation.getExample();
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation2 = OASVehicleHarshEventResponseLocation.getExample();
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation3 = new OASVehicleHarshEventResponseLocation();
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation4 = new OASVehicleHarshEventResponseLocation();

        System.assert(vehicleHarshEventResponseLocation1.equals(vehicleHarshEventResponseLocation2));
        System.assert(vehicleHarshEventResponseLocation2.equals(vehicleHarshEventResponseLocation1));
        System.assert(vehicleHarshEventResponseLocation3.equals(vehicleHarshEventResponseLocation4));
        System.assert(vehicleHarshEventResponseLocation4.equals(vehicleHarshEventResponseLocation3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation1 = OASVehicleHarshEventResponseLocation.getExample();
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation2 = new OASVehicleHarshEventResponseLocation();

        System.assertEquals(false, vehicleHarshEventResponseLocation1.equals('foo'));
        System.assertEquals(false, vehicleHarshEventResponseLocation2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation1 = OASVehicleHarshEventResponseLocation.getExample();
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation2 = new OASVehicleHarshEventResponseLocation();
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation3;

        System.assertEquals(false, vehicleHarshEventResponseLocation1.equals(vehicleHarshEventResponseLocation3));
        System.assertEquals(false, vehicleHarshEventResponseLocation2.equals(vehicleHarshEventResponseLocation3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation1 = OASVehicleHarshEventResponseLocation.getExample();
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation2 = new OASVehicleHarshEventResponseLocation();

        System.assertEquals(vehicleHarshEventResponseLocation1.hashCode(), vehicleHarshEventResponseLocation1.hashCode());
        System.assertEquals(vehicleHarshEventResponseLocation2.hashCode(), vehicleHarshEventResponseLocation2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation1 = OASVehicleHarshEventResponseLocation.getExample();
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation2 = OASVehicleHarshEventResponseLocation.getExample();
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation3 = new OASVehicleHarshEventResponseLocation();
        OASVehicleHarshEventResponseLocation vehicleHarshEventResponseLocation4 = new OASVehicleHarshEventResponseLocation();

        System.assert(vehicleHarshEventResponseLocation1.equals(vehicleHarshEventResponseLocation2));
        System.assert(vehicleHarshEventResponseLocation3.equals(vehicleHarshEventResponseLocation4));
        System.assertEquals(vehicleHarshEventResponseLocation1.hashCode(), vehicleHarshEventResponseLocation2.hashCode());
        System.assertEquals(vehicleHarshEventResponseLocation3.hashCode(), vehicleHarshEventResponseLocation4.hashCode());
    }
}
