@isTest
private class OASVehicleMaintenanceJ1939DiagnosticTest {
    @isTest
    private static void equalsSameInstance() {
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes1 = OASVehicleMaintenanceJ1939Diagnostic.getExample();
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes2 = vehicleMaintenanceJ1939DiagnosticTroubleCodes1;
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes3 = new OASVehicleMaintenanceJ1939Diagnostic();
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes4 = vehicleMaintenanceJ1939DiagnosticTroubleCodes3;

        System.assert(vehicleMaintenanceJ1939DiagnosticTroubleCodes1.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes2));
        System.assert(vehicleMaintenanceJ1939DiagnosticTroubleCodes2.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes1));
        System.assert(vehicleMaintenanceJ1939DiagnosticTroubleCodes1.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes1));
        System.assert(vehicleMaintenanceJ1939DiagnosticTroubleCodes3.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes4));
        System.assert(vehicleMaintenanceJ1939DiagnosticTroubleCodes4.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes3));
        System.assert(vehicleMaintenanceJ1939DiagnosticTroubleCodes3.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes1 = OASVehicleMaintenanceJ1939Diagnostic.getExample();
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes2 = OASVehicleMaintenanceJ1939Diagnostic.getExample();
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes3 = new OASVehicleMaintenanceJ1939Diagnostic();
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes4 = new OASVehicleMaintenanceJ1939Diagnostic();

        System.assert(vehicleMaintenanceJ1939DiagnosticTroubleCodes1.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes2));
        System.assert(vehicleMaintenanceJ1939DiagnosticTroubleCodes2.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes1));
        System.assert(vehicleMaintenanceJ1939DiagnosticTroubleCodes3.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes4));
        System.assert(vehicleMaintenanceJ1939DiagnosticTroubleCodes4.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes1 = OASVehicleMaintenanceJ1939Diagnostic.getExample();
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes2 = new OASVehicleMaintenanceJ1939Diagnostic();

        System.assertEquals(false, vehicleMaintenanceJ1939DiagnosticTroubleCodes1.equals('foo'));
        System.assertEquals(false, vehicleMaintenanceJ1939DiagnosticTroubleCodes2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes1 = OASVehicleMaintenanceJ1939Diagnostic.getExample();
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes2 = new OASVehicleMaintenanceJ1939Diagnostic();
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes3;

        System.assertEquals(false, vehicleMaintenanceJ1939DiagnosticTroubleCodes1.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes3));
        System.assertEquals(false, vehicleMaintenanceJ1939DiagnosticTroubleCodes2.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes1 = OASVehicleMaintenanceJ1939Diagnostic.getExample();
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes2 = new OASVehicleMaintenanceJ1939Diagnostic();

        System.assertEquals(vehicleMaintenanceJ1939DiagnosticTroubleCodes1.hashCode(), vehicleMaintenanceJ1939DiagnosticTroubleCodes1.hashCode());
        System.assertEquals(vehicleMaintenanceJ1939DiagnosticTroubleCodes2.hashCode(), vehicleMaintenanceJ1939DiagnosticTroubleCodes2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes1 = OASVehicleMaintenanceJ1939Diagnostic.getExample();
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes2 = OASVehicleMaintenanceJ1939Diagnostic.getExample();
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes3 = new OASVehicleMaintenanceJ1939Diagnostic();
        OASVehicleMaintenanceJ1939Diagnostic vehicleMaintenanceJ1939DiagnosticTroubleCodes4 = new OASVehicleMaintenanceJ1939Diagnostic();

        System.assert(vehicleMaintenanceJ1939DiagnosticTroubleCodes1.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes2));
        System.assert(vehicleMaintenanceJ1939DiagnosticTroubleCodes3.equals(vehicleMaintenanceJ1939DiagnosticTroubleCodes4));
        System.assertEquals(vehicleMaintenanceJ1939DiagnosticTroubleCodes1.hashCode(), vehicleMaintenanceJ1939DiagnosticTroubleCodes2.hashCode());
        System.assertEquals(vehicleMaintenanceJ1939DiagnosticTroubleCodes3.hashCode(), vehicleMaintenanceJ1939DiagnosticTroubleCodes4.hashCode());
    }
}
