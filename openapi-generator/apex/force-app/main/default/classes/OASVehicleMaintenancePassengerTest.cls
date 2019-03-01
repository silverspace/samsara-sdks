@isTest
private class OASVehicleMaintenancePassengerTest {
    @isTest
    private static void equalsSameInstance() {
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger1 = OASVehicleMaintenancePassenger.getExample();
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger2 = vehicleMaintenancePassenger1;
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger3 = new OASVehicleMaintenancePassenger();
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger4 = vehicleMaintenancePassenger3;

        System.assert(vehicleMaintenancePassenger1.equals(vehicleMaintenancePassenger2));
        System.assert(vehicleMaintenancePassenger2.equals(vehicleMaintenancePassenger1));
        System.assert(vehicleMaintenancePassenger1.equals(vehicleMaintenancePassenger1));
        System.assert(vehicleMaintenancePassenger3.equals(vehicleMaintenancePassenger4));
        System.assert(vehicleMaintenancePassenger4.equals(vehicleMaintenancePassenger3));
        System.assert(vehicleMaintenancePassenger3.equals(vehicleMaintenancePassenger3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger1 = OASVehicleMaintenancePassenger.getExample();
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger2 = OASVehicleMaintenancePassenger.getExample();
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger3 = new OASVehicleMaintenancePassenger();
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger4 = new OASVehicleMaintenancePassenger();

        System.assert(vehicleMaintenancePassenger1.equals(vehicleMaintenancePassenger2));
        System.assert(vehicleMaintenancePassenger2.equals(vehicleMaintenancePassenger1));
        System.assert(vehicleMaintenancePassenger3.equals(vehicleMaintenancePassenger4));
        System.assert(vehicleMaintenancePassenger4.equals(vehicleMaintenancePassenger3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger1 = OASVehicleMaintenancePassenger.getExample();
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger2 = new OASVehicleMaintenancePassenger();

        System.assertEquals(false, vehicleMaintenancePassenger1.equals('foo'));
        System.assertEquals(false, vehicleMaintenancePassenger2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger1 = OASVehicleMaintenancePassenger.getExample();
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger2 = new OASVehicleMaintenancePassenger();
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger3;

        System.assertEquals(false, vehicleMaintenancePassenger1.equals(vehicleMaintenancePassenger3));
        System.assertEquals(false, vehicleMaintenancePassenger2.equals(vehicleMaintenancePassenger3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger1 = OASVehicleMaintenancePassenger.getExample();
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger2 = new OASVehicleMaintenancePassenger();

        System.assertEquals(vehicleMaintenancePassenger1.hashCode(), vehicleMaintenancePassenger1.hashCode());
        System.assertEquals(vehicleMaintenancePassenger2.hashCode(), vehicleMaintenancePassenger2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger1 = OASVehicleMaintenancePassenger.getExample();
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger2 = OASVehicleMaintenancePassenger.getExample();
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger3 = new OASVehicleMaintenancePassenger();
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger4 = new OASVehicleMaintenancePassenger();

        System.assert(vehicleMaintenancePassenger1.equals(vehicleMaintenancePassenger2));
        System.assert(vehicleMaintenancePassenger3.equals(vehicleMaintenancePassenger4));
        System.assertEquals(vehicleMaintenancePassenger1.hashCode(), vehicleMaintenancePassenger2.hashCode());
        System.assertEquals(vehicleMaintenancePassenger3.hashCode(), vehicleMaintenancePassenger4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASVehicleMaintenancePassenger vehicleMaintenancePassenger = new OASVehicleMaintenancePassenger();
        System.assertEquals(new List<OASVehicleMaintenancePassengerDiagno>(), vehicleMaintenancePassenger.diagnosticTroubleCodes);
        System.assertEquals(null, vehicleMaintenancePassenger.checkEngineLight);
    }
}
