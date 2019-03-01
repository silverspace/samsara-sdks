@isTest
private class OASMachineHistoryResponseMachinesTest {
    @isTest
    private static void equalsSameInstance() {
        OASMachineHistoryResponseMachines machineHistoryResponseMachines1 = OASMachineHistoryResponseMachines.getExample();
        OASMachineHistoryResponseMachines machineHistoryResponseMachines2 = machineHistoryResponseMachines1;
        OASMachineHistoryResponseMachines machineHistoryResponseMachines3 = new OASMachineHistoryResponseMachines();
        OASMachineHistoryResponseMachines machineHistoryResponseMachines4 = machineHistoryResponseMachines3;

        System.assert(machineHistoryResponseMachines1.equals(machineHistoryResponseMachines2));
        System.assert(machineHistoryResponseMachines2.equals(machineHistoryResponseMachines1));
        System.assert(machineHistoryResponseMachines1.equals(machineHistoryResponseMachines1));
        System.assert(machineHistoryResponseMachines3.equals(machineHistoryResponseMachines4));
        System.assert(machineHistoryResponseMachines4.equals(machineHistoryResponseMachines3));
        System.assert(machineHistoryResponseMachines3.equals(machineHistoryResponseMachines3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMachineHistoryResponseMachines machineHistoryResponseMachines1 = OASMachineHistoryResponseMachines.getExample();
        OASMachineHistoryResponseMachines machineHistoryResponseMachines2 = OASMachineHistoryResponseMachines.getExample();
        OASMachineHistoryResponseMachines machineHistoryResponseMachines3 = new OASMachineHistoryResponseMachines();
        OASMachineHistoryResponseMachines machineHistoryResponseMachines4 = new OASMachineHistoryResponseMachines();

        System.assert(machineHistoryResponseMachines1.equals(machineHistoryResponseMachines2));
        System.assert(machineHistoryResponseMachines2.equals(machineHistoryResponseMachines1));
        System.assert(machineHistoryResponseMachines3.equals(machineHistoryResponseMachines4));
        System.assert(machineHistoryResponseMachines4.equals(machineHistoryResponseMachines3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMachineHistoryResponseMachines machineHistoryResponseMachines1 = OASMachineHistoryResponseMachines.getExample();
        OASMachineHistoryResponseMachines machineHistoryResponseMachines2 = new OASMachineHistoryResponseMachines();

        System.assertEquals(false, machineHistoryResponseMachines1.equals('foo'));
        System.assertEquals(false, machineHistoryResponseMachines2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMachineHistoryResponseMachines machineHistoryResponseMachines1 = OASMachineHistoryResponseMachines.getExample();
        OASMachineHistoryResponseMachines machineHistoryResponseMachines2 = new OASMachineHistoryResponseMachines();
        OASMachineHistoryResponseMachines machineHistoryResponseMachines3;

        System.assertEquals(false, machineHistoryResponseMachines1.equals(machineHistoryResponseMachines3));
        System.assertEquals(false, machineHistoryResponseMachines2.equals(machineHistoryResponseMachines3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMachineHistoryResponseMachines machineHistoryResponseMachines1 = OASMachineHistoryResponseMachines.getExample();
        OASMachineHistoryResponseMachines machineHistoryResponseMachines2 = new OASMachineHistoryResponseMachines();

        System.assertEquals(machineHistoryResponseMachines1.hashCode(), machineHistoryResponseMachines1.hashCode());
        System.assertEquals(machineHistoryResponseMachines2.hashCode(), machineHistoryResponseMachines2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMachineHistoryResponseMachines machineHistoryResponseMachines1 = OASMachineHistoryResponseMachines.getExample();
        OASMachineHistoryResponseMachines machineHistoryResponseMachines2 = OASMachineHistoryResponseMachines.getExample();
        OASMachineHistoryResponseMachines machineHistoryResponseMachines3 = new OASMachineHistoryResponseMachines();
        OASMachineHistoryResponseMachines machineHistoryResponseMachines4 = new OASMachineHistoryResponseMachines();

        System.assert(machineHistoryResponseMachines1.equals(machineHistoryResponseMachines2));
        System.assert(machineHistoryResponseMachines3.equals(machineHistoryResponseMachines4));
        System.assertEquals(machineHistoryResponseMachines1.hashCode(), machineHistoryResponseMachines2.hashCode());
        System.assertEquals(machineHistoryResponseMachines3.hashCode(), machineHistoryResponseMachines4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMachineHistoryResponseMachines machineHistoryResponseMachines = new OASMachineHistoryResponseMachines();
        System.assertEquals(new List<OASMachineHistoryResponseVibrations>(), machineHistoryResponseMachines.vibrations);
        System.assertEquals(null, machineHistoryResponseMachines.name);
        System.assertEquals(null, machineHistoryResponseMachines.id);
    }
}
