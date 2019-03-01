@isTest
private class OASVehicleMaintenanceTest {
    @isTest
    private static void equalsSameInstance() {
        OASVehicleMaintenance vehicleMaintenance1 = OASVehicleMaintenance.getExample();
        OASVehicleMaintenance vehicleMaintenance2 = vehicleMaintenance1;
        OASVehicleMaintenance vehicleMaintenance3 = new OASVehicleMaintenance();
        OASVehicleMaintenance vehicleMaintenance4 = vehicleMaintenance3;

        System.assert(vehicleMaintenance1.equals(vehicleMaintenance2));
        System.assert(vehicleMaintenance2.equals(vehicleMaintenance1));
        System.assert(vehicleMaintenance1.equals(vehicleMaintenance1));
        System.assert(vehicleMaintenance3.equals(vehicleMaintenance4));
        System.assert(vehicleMaintenance4.equals(vehicleMaintenance3));
        System.assert(vehicleMaintenance3.equals(vehicleMaintenance3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVehicleMaintenance vehicleMaintenance1 = OASVehicleMaintenance.getExample();
        OASVehicleMaintenance vehicleMaintenance2 = OASVehicleMaintenance.getExample();
        OASVehicleMaintenance vehicleMaintenance3 = new OASVehicleMaintenance();
        OASVehicleMaintenance vehicleMaintenance4 = new OASVehicleMaintenance();

        System.assert(vehicleMaintenance1.equals(vehicleMaintenance2));
        System.assert(vehicleMaintenance2.equals(vehicleMaintenance1));
        System.assert(vehicleMaintenance3.equals(vehicleMaintenance4));
        System.assert(vehicleMaintenance4.equals(vehicleMaintenance3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVehicleMaintenance vehicleMaintenance1 = OASVehicleMaintenance.getExample();
        OASVehicleMaintenance vehicleMaintenance2 = new OASVehicleMaintenance();

        System.assertEquals(false, vehicleMaintenance1.equals('foo'));
        System.assertEquals(false, vehicleMaintenance2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVehicleMaintenance vehicleMaintenance1 = OASVehicleMaintenance.getExample();
        OASVehicleMaintenance vehicleMaintenance2 = new OASVehicleMaintenance();
        OASVehicleMaintenance vehicleMaintenance3;

        System.assertEquals(false, vehicleMaintenance1.equals(vehicleMaintenance3));
        System.assertEquals(false, vehicleMaintenance2.equals(vehicleMaintenance3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVehicleMaintenance vehicleMaintenance1 = OASVehicleMaintenance.getExample();
        OASVehicleMaintenance vehicleMaintenance2 = new OASVehicleMaintenance();

        System.assertEquals(vehicleMaintenance1.hashCode(), vehicleMaintenance1.hashCode());
        System.assertEquals(vehicleMaintenance2.hashCode(), vehicleMaintenance2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVehicleMaintenance vehicleMaintenance1 = OASVehicleMaintenance.getExample();
        OASVehicleMaintenance vehicleMaintenance2 = OASVehicleMaintenance.getExample();
        OASVehicleMaintenance vehicleMaintenance3 = new OASVehicleMaintenance();
        OASVehicleMaintenance vehicleMaintenance4 = new OASVehicleMaintenance();

        System.assert(vehicleMaintenance1.equals(vehicleMaintenance2));
        System.assert(vehicleMaintenance3.equals(vehicleMaintenance4));
        System.assertEquals(vehicleMaintenance1.hashCode(), vehicleMaintenance2.hashCode());
        System.assertEquals(vehicleMaintenance3.hashCode(), vehicleMaintenance4.hashCode());
    }
}
