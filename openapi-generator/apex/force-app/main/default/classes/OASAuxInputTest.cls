@isTest
private class OASAuxInputTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuxInput auxInput1 = OASAuxInput.getExample();
        OASAuxInput auxInput2 = auxInput1;
        OASAuxInput auxInput3 = new OASAuxInput();
        OASAuxInput auxInput4 = auxInput3;

        System.assert(auxInput1.equals(auxInput2));
        System.assert(auxInput2.equals(auxInput1));
        System.assert(auxInput1.equals(auxInput1));
        System.assert(auxInput3.equals(auxInput4));
        System.assert(auxInput4.equals(auxInput3));
        System.assert(auxInput3.equals(auxInput3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuxInput auxInput1 = OASAuxInput.getExample();
        OASAuxInput auxInput2 = OASAuxInput.getExample();
        OASAuxInput auxInput3 = new OASAuxInput();
        OASAuxInput auxInput4 = new OASAuxInput();

        System.assert(auxInput1.equals(auxInput2));
        System.assert(auxInput2.equals(auxInput1));
        System.assert(auxInput3.equals(auxInput4));
        System.assert(auxInput4.equals(auxInput3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuxInput auxInput1 = OASAuxInput.getExample();
        OASAuxInput auxInput2 = new OASAuxInput();

        System.assertEquals(false, auxInput1.equals('foo'));
        System.assertEquals(false, auxInput2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuxInput auxInput1 = OASAuxInput.getExample();
        OASAuxInput auxInput2 = new OASAuxInput();
        OASAuxInput auxInput3;

        System.assertEquals(false, auxInput1.equals(auxInput3));
        System.assertEquals(false, auxInput2.equals(auxInput3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuxInput auxInput1 = OASAuxInput.getExample();
        OASAuxInput auxInput2 = new OASAuxInput();

        System.assertEquals(auxInput1.hashCode(), auxInput1.hashCode());
        System.assertEquals(auxInput2.hashCode(), auxInput2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuxInput auxInput1 = OASAuxInput.getExample();
        OASAuxInput auxInput2 = OASAuxInput.getExample();
        OASAuxInput auxInput3 = new OASAuxInput();
        OASAuxInput auxInput4 = new OASAuxInput();

        System.assert(auxInput1.equals(auxInput2));
        System.assert(auxInput3.equals(auxInput4));
        System.assertEquals(auxInput1.hashCode(), auxInput2.hashCode());
        System.assertEquals(auxInput3.hashCode(), auxInput4.hashCode());
    }
}
