@isTest
private class OASTaggedMachineTest {
    @isTest
    private static void equalsSameInstance() {
        OASTaggedMachine taggedMachine1 = OASTaggedMachine.getExample();
        OASTaggedMachine taggedMachine2 = taggedMachine1;
        OASTaggedMachine taggedMachine3 = new OASTaggedMachine();
        OASTaggedMachine taggedMachine4 = taggedMachine3;

        System.assert(taggedMachine1.equals(taggedMachine2));
        System.assert(taggedMachine2.equals(taggedMachine1));
        System.assert(taggedMachine1.equals(taggedMachine1));
        System.assert(taggedMachine3.equals(taggedMachine4));
        System.assert(taggedMachine4.equals(taggedMachine3));
        System.assert(taggedMachine3.equals(taggedMachine3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTaggedMachine taggedMachine1 = OASTaggedMachine.getExample();
        OASTaggedMachine taggedMachine2 = OASTaggedMachine.getExample();
        OASTaggedMachine taggedMachine3 = new OASTaggedMachine();
        OASTaggedMachine taggedMachine4 = new OASTaggedMachine();

        System.assert(taggedMachine1.equals(taggedMachine2));
        System.assert(taggedMachine2.equals(taggedMachine1));
        System.assert(taggedMachine3.equals(taggedMachine4));
        System.assert(taggedMachine4.equals(taggedMachine3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTaggedMachine taggedMachine1 = OASTaggedMachine.getExample();
        OASTaggedMachine taggedMachine2 = new OASTaggedMachine();

        System.assertEquals(false, taggedMachine1.equals('foo'));
        System.assertEquals(false, taggedMachine2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTaggedMachine taggedMachine1 = OASTaggedMachine.getExample();
        OASTaggedMachine taggedMachine2 = new OASTaggedMachine();
        OASTaggedMachine taggedMachine3;

        System.assertEquals(false, taggedMachine1.equals(taggedMachine3));
        System.assertEquals(false, taggedMachine2.equals(taggedMachine3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTaggedMachine taggedMachine1 = OASTaggedMachine.getExample();
        OASTaggedMachine taggedMachine2 = new OASTaggedMachine();

        System.assertEquals(taggedMachine1.hashCode(), taggedMachine1.hashCode());
        System.assertEquals(taggedMachine2.hashCode(), taggedMachine2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTaggedMachine taggedMachine1 = OASTaggedMachine.getExample();
        OASTaggedMachine taggedMachine2 = OASTaggedMachine.getExample();
        OASTaggedMachine taggedMachine3 = new OASTaggedMachine();
        OASTaggedMachine taggedMachine4 = new OASTaggedMachine();

        System.assert(taggedMachine1.equals(taggedMachine2));
        System.assert(taggedMachine3.equals(taggedMachine4));
        System.assertEquals(taggedMachine1.hashCode(), taggedMachine2.hashCode());
        System.assertEquals(taggedMachine3.hashCode(), taggedMachine4.hashCode());
    }
}
