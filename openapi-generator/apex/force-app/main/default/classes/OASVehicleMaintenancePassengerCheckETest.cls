@isTest
private class OASVehicleMaintenancePassengerCheckETest {
    @isTest
    private static void equalsSameInstance() {
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight1 = OASVehicleMaintenancePassengerCheckE.getExample();
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight2 = vehicleMaintenancePassengerCheckEngineLight1;
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight3 = new OASVehicleMaintenancePassengerCheckE();
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight4 = vehicleMaintenancePassengerCheckEngineLight3;

        System.assert(vehicleMaintenancePassengerCheckEngineLight1.equals(vehicleMaintenancePassengerCheckEngineLight2));
        System.assert(vehicleMaintenancePassengerCheckEngineLight2.equals(vehicleMaintenancePassengerCheckEngineLight1));
        System.assert(vehicleMaintenancePassengerCheckEngineLight1.equals(vehicleMaintenancePassengerCheckEngineLight1));
        System.assert(vehicleMaintenancePassengerCheckEngineLight3.equals(vehicleMaintenancePassengerCheckEngineLight4));
        System.assert(vehicleMaintenancePassengerCheckEngineLight4.equals(vehicleMaintenancePassengerCheckEngineLight3));
        System.assert(vehicleMaintenancePassengerCheckEngineLight3.equals(vehicleMaintenancePassengerCheckEngineLight3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight1 = OASVehicleMaintenancePassengerCheckE.getExample();
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight2 = OASVehicleMaintenancePassengerCheckE.getExample();
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight3 = new OASVehicleMaintenancePassengerCheckE();
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight4 = new OASVehicleMaintenancePassengerCheckE();

        System.assert(vehicleMaintenancePassengerCheckEngineLight1.equals(vehicleMaintenancePassengerCheckEngineLight2));
        System.assert(vehicleMaintenancePassengerCheckEngineLight2.equals(vehicleMaintenancePassengerCheckEngineLight1));
        System.assert(vehicleMaintenancePassengerCheckEngineLight3.equals(vehicleMaintenancePassengerCheckEngineLight4));
        System.assert(vehicleMaintenancePassengerCheckEngineLight4.equals(vehicleMaintenancePassengerCheckEngineLight3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight1 = OASVehicleMaintenancePassengerCheckE.getExample();
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight2 = new OASVehicleMaintenancePassengerCheckE();

        System.assertEquals(false, vehicleMaintenancePassengerCheckEngineLight1.equals('foo'));
        System.assertEquals(false, vehicleMaintenancePassengerCheckEngineLight2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight1 = OASVehicleMaintenancePassengerCheckE.getExample();
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight2 = new OASVehicleMaintenancePassengerCheckE();
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight3;

        System.assertEquals(false, vehicleMaintenancePassengerCheckEngineLight1.equals(vehicleMaintenancePassengerCheckEngineLight3));
        System.assertEquals(false, vehicleMaintenancePassengerCheckEngineLight2.equals(vehicleMaintenancePassengerCheckEngineLight3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight1 = OASVehicleMaintenancePassengerCheckE.getExample();
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight2 = new OASVehicleMaintenancePassengerCheckE();

        System.assertEquals(vehicleMaintenancePassengerCheckEngineLight1.hashCode(), vehicleMaintenancePassengerCheckEngineLight1.hashCode());
        System.assertEquals(vehicleMaintenancePassengerCheckEngineLight2.hashCode(), vehicleMaintenancePassengerCheckEngineLight2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight1 = OASVehicleMaintenancePassengerCheckE.getExample();
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight2 = OASVehicleMaintenancePassengerCheckE.getExample();
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight3 = new OASVehicleMaintenancePassengerCheckE();
        OASVehicleMaintenancePassengerCheckE vehicleMaintenancePassengerCheckEngineLight4 = new OASVehicleMaintenancePassengerCheckE();

        System.assert(vehicleMaintenancePassengerCheckEngineLight1.equals(vehicleMaintenancePassengerCheckEngineLight2));
        System.assert(vehicleMaintenancePassengerCheckEngineLight3.equals(vehicleMaintenancePassengerCheckEngineLight4));
        System.assertEquals(vehicleMaintenancePassengerCheckEngineLight1.hashCode(), vehicleMaintenancePassengerCheckEngineLight2.hashCode());
        System.assertEquals(vehicleMaintenancePassengerCheckEngineLight3.hashCode(), vehicleMaintenancePassengerCheckEngineLight4.hashCode());
    }
}
