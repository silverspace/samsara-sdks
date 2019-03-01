@isTest
private class OASMachineHistoryResponseVibrationsTest {
    @isTest
    private static void equalsSameInstance() {
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations1 = OASMachineHistoryResponseVibrations.getExample();
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations2 = machineHistoryResponseVibrations1;
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations3 = new OASMachineHistoryResponseVibrations();
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations4 = machineHistoryResponseVibrations3;

        System.assert(machineHistoryResponseVibrations1.equals(machineHistoryResponseVibrations2));
        System.assert(machineHistoryResponseVibrations2.equals(machineHistoryResponseVibrations1));
        System.assert(machineHistoryResponseVibrations1.equals(machineHistoryResponseVibrations1));
        System.assert(machineHistoryResponseVibrations3.equals(machineHistoryResponseVibrations4));
        System.assert(machineHistoryResponseVibrations4.equals(machineHistoryResponseVibrations3));
        System.assert(machineHistoryResponseVibrations3.equals(machineHistoryResponseVibrations3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations1 = OASMachineHistoryResponseVibrations.getExample();
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations2 = OASMachineHistoryResponseVibrations.getExample();
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations3 = new OASMachineHistoryResponseVibrations();
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations4 = new OASMachineHistoryResponseVibrations();

        System.assert(machineHistoryResponseVibrations1.equals(machineHistoryResponseVibrations2));
        System.assert(machineHistoryResponseVibrations2.equals(machineHistoryResponseVibrations1));
        System.assert(machineHistoryResponseVibrations3.equals(machineHistoryResponseVibrations4));
        System.assert(machineHistoryResponseVibrations4.equals(machineHistoryResponseVibrations3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations1 = OASMachineHistoryResponseVibrations.getExample();
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations2 = new OASMachineHistoryResponseVibrations();

        System.assertEquals(false, machineHistoryResponseVibrations1.equals('foo'));
        System.assertEquals(false, machineHistoryResponseVibrations2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations1 = OASMachineHistoryResponseVibrations.getExample();
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations2 = new OASMachineHistoryResponseVibrations();
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations3;

        System.assertEquals(false, machineHistoryResponseVibrations1.equals(machineHistoryResponseVibrations3));
        System.assertEquals(false, machineHistoryResponseVibrations2.equals(machineHistoryResponseVibrations3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations1 = OASMachineHistoryResponseVibrations.getExample();
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations2 = new OASMachineHistoryResponseVibrations();

        System.assertEquals(machineHistoryResponseVibrations1.hashCode(), machineHistoryResponseVibrations1.hashCode());
        System.assertEquals(machineHistoryResponseVibrations2.hashCode(), machineHistoryResponseVibrations2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations1 = OASMachineHistoryResponseVibrations.getExample();
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations2 = OASMachineHistoryResponseVibrations.getExample();
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations3 = new OASMachineHistoryResponseVibrations();
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations4 = new OASMachineHistoryResponseVibrations();

        System.assert(machineHistoryResponseVibrations1.equals(machineHistoryResponseVibrations2));
        System.assert(machineHistoryResponseVibrations3.equals(machineHistoryResponseVibrations4));
        System.assertEquals(machineHistoryResponseVibrations1.hashCode(), machineHistoryResponseVibrations2.hashCode());
        System.assertEquals(machineHistoryResponseVibrations3.hashCode(), machineHistoryResponseVibrations4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMachineHistoryResponseVibrations machineHistoryResponseVibrations = new OASMachineHistoryResponseVibrations();
        Map<String, String> propertyMappings = machineHistoryResponseVibrations.getPropertyMappings();
        System.assertEquals('r_time', propertyMappings.get('time'));
    }
}
