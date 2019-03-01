@isTest
private class OASMachineHistoryResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASMachineHistoryResponse machineHistoryResponse1 = OASMachineHistoryResponse.getExample();
        OASMachineHistoryResponse machineHistoryResponse2 = machineHistoryResponse1;
        OASMachineHistoryResponse machineHistoryResponse3 = new OASMachineHistoryResponse();
        OASMachineHistoryResponse machineHistoryResponse4 = machineHistoryResponse3;

        System.assert(machineHistoryResponse1.equals(machineHistoryResponse2));
        System.assert(machineHistoryResponse2.equals(machineHistoryResponse1));
        System.assert(machineHistoryResponse1.equals(machineHistoryResponse1));
        System.assert(machineHistoryResponse3.equals(machineHistoryResponse4));
        System.assert(machineHistoryResponse4.equals(machineHistoryResponse3));
        System.assert(machineHistoryResponse3.equals(machineHistoryResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMachineHistoryResponse machineHistoryResponse1 = OASMachineHistoryResponse.getExample();
        OASMachineHistoryResponse machineHistoryResponse2 = OASMachineHistoryResponse.getExample();
        OASMachineHistoryResponse machineHistoryResponse3 = new OASMachineHistoryResponse();
        OASMachineHistoryResponse machineHistoryResponse4 = new OASMachineHistoryResponse();

        System.assert(machineHistoryResponse1.equals(machineHistoryResponse2));
        System.assert(machineHistoryResponse2.equals(machineHistoryResponse1));
        System.assert(machineHistoryResponse3.equals(machineHistoryResponse4));
        System.assert(machineHistoryResponse4.equals(machineHistoryResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMachineHistoryResponse machineHistoryResponse1 = OASMachineHistoryResponse.getExample();
        OASMachineHistoryResponse machineHistoryResponse2 = new OASMachineHistoryResponse();

        System.assertEquals(false, machineHistoryResponse1.equals('foo'));
        System.assertEquals(false, machineHistoryResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMachineHistoryResponse machineHistoryResponse1 = OASMachineHistoryResponse.getExample();
        OASMachineHistoryResponse machineHistoryResponse2 = new OASMachineHistoryResponse();
        OASMachineHistoryResponse machineHistoryResponse3;

        System.assertEquals(false, machineHistoryResponse1.equals(machineHistoryResponse3));
        System.assertEquals(false, machineHistoryResponse2.equals(machineHistoryResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMachineHistoryResponse machineHistoryResponse1 = OASMachineHistoryResponse.getExample();
        OASMachineHistoryResponse machineHistoryResponse2 = new OASMachineHistoryResponse();

        System.assertEquals(machineHistoryResponse1.hashCode(), machineHistoryResponse1.hashCode());
        System.assertEquals(machineHistoryResponse2.hashCode(), machineHistoryResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMachineHistoryResponse machineHistoryResponse1 = OASMachineHistoryResponse.getExample();
        OASMachineHistoryResponse machineHistoryResponse2 = OASMachineHistoryResponse.getExample();
        OASMachineHistoryResponse machineHistoryResponse3 = new OASMachineHistoryResponse();
        OASMachineHistoryResponse machineHistoryResponse4 = new OASMachineHistoryResponse();

        System.assert(machineHistoryResponse1.equals(machineHistoryResponse2));
        System.assert(machineHistoryResponse3.equals(machineHistoryResponse4));
        System.assertEquals(machineHistoryResponse1.hashCode(), machineHistoryResponse2.hashCode());
        System.assertEquals(machineHistoryResponse3.hashCode(), machineHistoryResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMachineHistoryResponse machineHistoryResponse = new OASMachineHistoryResponse();
        System.assertEquals(new List<OASMachineHistoryResponseMachines>(), machineHistoryResponse.machines);
    }
}
