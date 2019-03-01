@isTest
private class OASVehicleMaintenanceJ1939CheckEnginTest {
    @isTest
    private static void equalsSameInstance() {
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight1 = OASVehicleMaintenanceJ1939CheckEngin.getExample();
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight2 = vehicleMaintenanceJ1939CheckEngineLight1;
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight3 = new OASVehicleMaintenanceJ1939CheckEngin();
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight4 = vehicleMaintenanceJ1939CheckEngineLight3;

        System.assert(vehicleMaintenanceJ1939CheckEngineLight1.equals(vehicleMaintenanceJ1939CheckEngineLight2));
        System.assert(vehicleMaintenanceJ1939CheckEngineLight2.equals(vehicleMaintenanceJ1939CheckEngineLight1));
        System.assert(vehicleMaintenanceJ1939CheckEngineLight1.equals(vehicleMaintenanceJ1939CheckEngineLight1));
        System.assert(vehicleMaintenanceJ1939CheckEngineLight3.equals(vehicleMaintenanceJ1939CheckEngineLight4));
        System.assert(vehicleMaintenanceJ1939CheckEngineLight4.equals(vehicleMaintenanceJ1939CheckEngineLight3));
        System.assert(vehicleMaintenanceJ1939CheckEngineLight3.equals(vehicleMaintenanceJ1939CheckEngineLight3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight1 = OASVehicleMaintenanceJ1939CheckEngin.getExample();
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight2 = OASVehicleMaintenanceJ1939CheckEngin.getExample();
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight3 = new OASVehicleMaintenanceJ1939CheckEngin();
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight4 = new OASVehicleMaintenanceJ1939CheckEngin();

        System.assert(vehicleMaintenanceJ1939CheckEngineLight1.equals(vehicleMaintenanceJ1939CheckEngineLight2));
        System.assert(vehicleMaintenanceJ1939CheckEngineLight2.equals(vehicleMaintenanceJ1939CheckEngineLight1));
        System.assert(vehicleMaintenanceJ1939CheckEngineLight3.equals(vehicleMaintenanceJ1939CheckEngineLight4));
        System.assert(vehicleMaintenanceJ1939CheckEngineLight4.equals(vehicleMaintenanceJ1939CheckEngineLight3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight1 = OASVehicleMaintenanceJ1939CheckEngin.getExample();
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight2 = new OASVehicleMaintenanceJ1939CheckEngin();

        System.assertEquals(false, vehicleMaintenanceJ1939CheckEngineLight1.equals('foo'));
        System.assertEquals(false, vehicleMaintenanceJ1939CheckEngineLight2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight1 = OASVehicleMaintenanceJ1939CheckEngin.getExample();
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight2 = new OASVehicleMaintenanceJ1939CheckEngin();
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight3;

        System.assertEquals(false, vehicleMaintenanceJ1939CheckEngineLight1.equals(vehicleMaintenanceJ1939CheckEngineLight3));
        System.assertEquals(false, vehicleMaintenanceJ1939CheckEngineLight2.equals(vehicleMaintenanceJ1939CheckEngineLight3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight1 = OASVehicleMaintenanceJ1939CheckEngin.getExample();
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight2 = new OASVehicleMaintenanceJ1939CheckEngin();

        System.assertEquals(vehicleMaintenanceJ1939CheckEngineLight1.hashCode(), vehicleMaintenanceJ1939CheckEngineLight1.hashCode());
        System.assertEquals(vehicleMaintenanceJ1939CheckEngineLight2.hashCode(), vehicleMaintenanceJ1939CheckEngineLight2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight1 = OASVehicleMaintenanceJ1939CheckEngin.getExample();
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight2 = OASVehicleMaintenanceJ1939CheckEngin.getExample();
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight3 = new OASVehicleMaintenanceJ1939CheckEngin();
        OASVehicleMaintenanceJ1939CheckEngin vehicleMaintenanceJ1939CheckEngineLight4 = new OASVehicleMaintenanceJ1939CheckEngin();

        System.assert(vehicleMaintenanceJ1939CheckEngineLight1.equals(vehicleMaintenanceJ1939CheckEngineLight2));
        System.assert(vehicleMaintenanceJ1939CheckEngineLight3.equals(vehicleMaintenanceJ1939CheckEngineLight4));
        System.assertEquals(vehicleMaintenanceJ1939CheckEngineLight1.hashCode(), vehicleMaintenanceJ1939CheckEngineLight2.hashCode());
        System.assertEquals(vehicleMaintenanceJ1939CheckEngineLight3.hashCode(), vehicleMaintenanceJ1939CheckEngineLight4.hashCode());
    }
}
