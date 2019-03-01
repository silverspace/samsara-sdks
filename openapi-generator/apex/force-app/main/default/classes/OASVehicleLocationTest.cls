@isTest
private class OASVehicleLocationTest {
    @isTest
    private static void equalsSameInstance() {
        OASVehicleLocation vehicleLocation1 = OASVehicleLocation.getExample();
        OASVehicleLocation vehicleLocation2 = vehicleLocation1;
        OASVehicleLocation vehicleLocation3 = new OASVehicleLocation();
        OASVehicleLocation vehicleLocation4 = vehicleLocation3;

        System.assert(vehicleLocation1.equals(vehicleLocation2));
        System.assert(vehicleLocation2.equals(vehicleLocation1));
        System.assert(vehicleLocation1.equals(vehicleLocation1));
        System.assert(vehicleLocation3.equals(vehicleLocation4));
        System.assert(vehicleLocation4.equals(vehicleLocation3));
        System.assert(vehicleLocation3.equals(vehicleLocation3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVehicleLocation vehicleLocation1 = OASVehicleLocation.getExample();
        OASVehicleLocation vehicleLocation2 = OASVehicleLocation.getExample();
        OASVehicleLocation vehicleLocation3 = new OASVehicleLocation();
        OASVehicleLocation vehicleLocation4 = new OASVehicleLocation();

        System.assert(vehicleLocation1.equals(vehicleLocation2));
        System.assert(vehicleLocation2.equals(vehicleLocation1));
        System.assert(vehicleLocation3.equals(vehicleLocation4));
        System.assert(vehicleLocation4.equals(vehicleLocation3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVehicleLocation vehicleLocation1 = OASVehicleLocation.getExample();
        OASVehicleLocation vehicleLocation2 = new OASVehicleLocation();

        System.assertEquals(false, vehicleLocation1.equals('foo'));
        System.assertEquals(false, vehicleLocation2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVehicleLocation vehicleLocation1 = OASVehicleLocation.getExample();
        OASVehicleLocation vehicleLocation2 = new OASVehicleLocation();
        OASVehicleLocation vehicleLocation3;

        System.assertEquals(false, vehicleLocation1.equals(vehicleLocation3));
        System.assertEquals(false, vehicleLocation2.equals(vehicleLocation3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVehicleLocation vehicleLocation1 = OASVehicleLocation.getExample();
        OASVehicleLocation vehicleLocation2 = new OASVehicleLocation();

        System.assertEquals(vehicleLocation1.hashCode(), vehicleLocation1.hashCode());
        System.assertEquals(vehicleLocation2.hashCode(), vehicleLocation2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVehicleLocation vehicleLocation1 = OASVehicleLocation.getExample();
        OASVehicleLocation vehicleLocation2 = OASVehicleLocation.getExample();
        OASVehicleLocation vehicleLocation3 = new OASVehicleLocation();
        OASVehicleLocation vehicleLocation4 = new OASVehicleLocation();

        System.assert(vehicleLocation1.equals(vehicleLocation2));
        System.assert(vehicleLocation3.equals(vehicleLocation4));
        System.assertEquals(vehicleLocation1.hashCode(), vehicleLocation2.hashCode());
        System.assertEquals(vehicleLocation3.hashCode(), vehicleLocation4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVehicleLocation vehicleLocation = new OASVehicleLocation();
        Map<String, String> propertyMappings = vehicleLocation.getPropertyMappings();
        System.assertEquals('r_time', propertyMappings.get('time'));
    }
}
