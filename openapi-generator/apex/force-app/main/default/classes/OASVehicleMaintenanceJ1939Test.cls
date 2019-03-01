@isTest
private class OASVehicleMaintenanceJ1939Test {
    @isTest
    private static void equalsSameInstance() {
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19391 = OASVehicleMaintenanceJ1939.getExample();
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19392 = vehicleMaintenanceJ19391;
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19393 = new OASVehicleMaintenanceJ1939();
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19394 = vehicleMaintenanceJ19393;

        System.assert(vehicleMaintenanceJ19391.equals(vehicleMaintenanceJ19392));
        System.assert(vehicleMaintenanceJ19392.equals(vehicleMaintenanceJ19391));
        System.assert(vehicleMaintenanceJ19391.equals(vehicleMaintenanceJ19391));
        System.assert(vehicleMaintenanceJ19393.equals(vehicleMaintenanceJ19394));
        System.assert(vehicleMaintenanceJ19394.equals(vehicleMaintenanceJ19393));
        System.assert(vehicleMaintenanceJ19393.equals(vehicleMaintenanceJ19393));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19391 = OASVehicleMaintenanceJ1939.getExample();
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19392 = OASVehicleMaintenanceJ1939.getExample();
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19393 = new OASVehicleMaintenanceJ1939();
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19394 = new OASVehicleMaintenanceJ1939();

        System.assert(vehicleMaintenanceJ19391.equals(vehicleMaintenanceJ19392));
        System.assert(vehicleMaintenanceJ19392.equals(vehicleMaintenanceJ19391));
        System.assert(vehicleMaintenanceJ19393.equals(vehicleMaintenanceJ19394));
        System.assert(vehicleMaintenanceJ19394.equals(vehicleMaintenanceJ19393));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19391 = OASVehicleMaintenanceJ1939.getExample();
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19392 = new OASVehicleMaintenanceJ1939();

        System.assertEquals(false, vehicleMaintenanceJ19391.equals('foo'));
        System.assertEquals(false, vehicleMaintenanceJ19392.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19391 = OASVehicleMaintenanceJ1939.getExample();
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19392 = new OASVehicleMaintenanceJ1939();
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19393;

        System.assertEquals(false, vehicleMaintenanceJ19391.equals(vehicleMaintenanceJ19393));
        System.assertEquals(false, vehicleMaintenanceJ19392.equals(vehicleMaintenanceJ19393));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19391 = OASVehicleMaintenanceJ1939.getExample();
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19392 = new OASVehicleMaintenanceJ1939();

        System.assertEquals(vehicleMaintenanceJ19391.hashCode(), vehicleMaintenanceJ19391.hashCode());
        System.assertEquals(vehicleMaintenanceJ19392.hashCode(), vehicleMaintenanceJ19392.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19391 = OASVehicleMaintenanceJ1939.getExample();
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19392 = OASVehicleMaintenanceJ1939.getExample();
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19393 = new OASVehicleMaintenanceJ1939();
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ19394 = new OASVehicleMaintenanceJ1939();

        System.assert(vehicleMaintenanceJ19391.equals(vehicleMaintenanceJ19392));
        System.assert(vehicleMaintenanceJ19393.equals(vehicleMaintenanceJ19394));
        System.assertEquals(vehicleMaintenanceJ19391.hashCode(), vehicleMaintenanceJ19392.hashCode());
        System.assertEquals(vehicleMaintenanceJ19393.hashCode(), vehicleMaintenanceJ19394.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASVehicleMaintenanceJ1939 vehicleMaintenanceJ1939 = new OASVehicleMaintenanceJ1939();
        System.assertEquals(new List<OASVehicleMaintenanceJ1939Diagnostic>(), vehicleMaintenanceJ1939.diagnosticTroubleCodes);
        System.assertEquals(null, vehicleMaintenanceJ1939.checkEngineLight);
    }
}
