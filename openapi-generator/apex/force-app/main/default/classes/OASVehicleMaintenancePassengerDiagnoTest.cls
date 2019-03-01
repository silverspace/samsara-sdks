@isTest
private class OASVehicleMaintenancePassengerDiagnoTest {
    @isTest
    private static void equalsSameInstance() {
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes1 = OASVehicleMaintenancePassengerDiagno.getExample();
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes2 = vehicleMaintenancePassengerDiagnosticTroubleCodes1;
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes3 = new OASVehicleMaintenancePassengerDiagno();
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes4 = vehicleMaintenancePassengerDiagnosticTroubleCodes3;

        System.assert(vehicleMaintenancePassengerDiagnosticTroubleCodes1.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes2));
        System.assert(vehicleMaintenancePassengerDiagnosticTroubleCodes2.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes1));
        System.assert(vehicleMaintenancePassengerDiagnosticTroubleCodes1.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes1));
        System.assert(vehicleMaintenancePassengerDiagnosticTroubleCodes3.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes4));
        System.assert(vehicleMaintenancePassengerDiagnosticTroubleCodes4.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes3));
        System.assert(vehicleMaintenancePassengerDiagnosticTroubleCodes3.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes1 = OASVehicleMaintenancePassengerDiagno.getExample();
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes2 = OASVehicleMaintenancePassengerDiagno.getExample();
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes3 = new OASVehicleMaintenancePassengerDiagno();
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes4 = new OASVehicleMaintenancePassengerDiagno();

        System.assert(vehicleMaintenancePassengerDiagnosticTroubleCodes1.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes2));
        System.assert(vehicleMaintenancePassengerDiagnosticTroubleCodes2.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes1));
        System.assert(vehicleMaintenancePassengerDiagnosticTroubleCodes3.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes4));
        System.assert(vehicleMaintenancePassengerDiagnosticTroubleCodes4.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes1 = OASVehicleMaintenancePassengerDiagno.getExample();
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes2 = new OASVehicleMaintenancePassengerDiagno();

        System.assertEquals(false, vehicleMaintenancePassengerDiagnosticTroubleCodes1.equals('foo'));
        System.assertEquals(false, vehicleMaintenancePassengerDiagnosticTroubleCodes2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes1 = OASVehicleMaintenancePassengerDiagno.getExample();
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes2 = new OASVehicleMaintenancePassengerDiagno();
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes3;

        System.assertEquals(false, vehicleMaintenancePassengerDiagnosticTroubleCodes1.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes3));
        System.assertEquals(false, vehicleMaintenancePassengerDiagnosticTroubleCodes2.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes1 = OASVehicleMaintenancePassengerDiagno.getExample();
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes2 = new OASVehicleMaintenancePassengerDiagno();

        System.assertEquals(vehicleMaintenancePassengerDiagnosticTroubleCodes1.hashCode(), vehicleMaintenancePassengerDiagnosticTroubleCodes1.hashCode());
        System.assertEquals(vehicleMaintenancePassengerDiagnosticTroubleCodes2.hashCode(), vehicleMaintenancePassengerDiagnosticTroubleCodes2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes1 = OASVehicleMaintenancePassengerDiagno.getExample();
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes2 = OASVehicleMaintenancePassengerDiagno.getExample();
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes3 = new OASVehicleMaintenancePassengerDiagno();
        OASVehicleMaintenancePassengerDiagno vehicleMaintenancePassengerDiagnosticTroubleCodes4 = new OASVehicleMaintenancePassengerDiagno();

        System.assert(vehicleMaintenancePassengerDiagnosticTroubleCodes1.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes2));
        System.assert(vehicleMaintenancePassengerDiagnosticTroubleCodes3.equals(vehicleMaintenancePassengerDiagnosticTroubleCodes4));
        System.assertEquals(vehicleMaintenancePassengerDiagnosticTroubleCodes1.hashCode(), vehicleMaintenancePassengerDiagnosticTroubleCodes2.hashCode());
        System.assertEquals(vehicleMaintenancePassengerDiagnosticTroubleCodes3.hashCode(), vehicleMaintenancePassengerDiagnosticTroubleCodes4.hashCode());
    }
}
