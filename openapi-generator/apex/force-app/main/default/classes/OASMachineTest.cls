@isTest
private class OASMachineTest {
    @isTest
    private static void equalsSameInstance() {
        OASMachine machine1 = OASMachine.getExample();
        OASMachine machine2 = machine1;
        OASMachine machine3 = new OASMachine();
        OASMachine machine4 = machine3;

        System.assert(machine1.equals(machine2));
        System.assert(machine2.equals(machine1));
        System.assert(machine1.equals(machine1));
        System.assert(machine3.equals(machine4));
        System.assert(machine4.equals(machine3));
        System.assert(machine3.equals(machine3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMachine machine1 = OASMachine.getExample();
        OASMachine machine2 = OASMachine.getExample();
        OASMachine machine3 = new OASMachine();
        OASMachine machine4 = new OASMachine();

        System.assert(machine1.equals(machine2));
        System.assert(machine2.equals(machine1));
        System.assert(machine3.equals(machine4));
        System.assert(machine4.equals(machine3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMachine machine1 = OASMachine.getExample();
        OASMachine machine2 = new OASMachine();

        System.assertEquals(false, machine1.equals('foo'));
        System.assertEquals(false, machine2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMachine machine1 = OASMachine.getExample();
        OASMachine machine2 = new OASMachine();
        OASMachine machine3;

        System.assertEquals(false, machine1.equals(machine3));
        System.assertEquals(false, machine2.equals(machine3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMachine machine1 = OASMachine.getExample();
        OASMachine machine2 = new OASMachine();

        System.assertEquals(machine1.hashCode(), machine1.hashCode());
        System.assertEquals(machine2.hashCode(), machine2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMachine machine1 = OASMachine.getExample();
        OASMachine machine2 = OASMachine.getExample();
        OASMachine machine3 = new OASMachine();
        OASMachine machine4 = new OASMachine();

        System.assert(machine1.equals(machine2));
        System.assert(machine3.equals(machine4));
        System.assertEquals(machine1.hashCode(), machine2.hashCode());
        System.assertEquals(machine3.hashCode(), machine4.hashCode());
    }
}
