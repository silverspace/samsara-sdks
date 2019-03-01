@isTest
private class OASAuxInputSeriesTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuxInputSeries auxInputSeries1 = OASAuxInputSeries.getExample();
        OASAuxInputSeries auxInputSeries2 = auxInputSeries1;
        OASAuxInputSeries auxInputSeries3 = new OASAuxInputSeries();
        OASAuxInputSeries auxInputSeries4 = auxInputSeries3;

        System.assert(auxInputSeries1.equals(auxInputSeries2));
        System.assert(auxInputSeries2.equals(auxInputSeries1));
        System.assert(auxInputSeries1.equals(auxInputSeries1));
        System.assert(auxInputSeries3.equals(auxInputSeries4));
        System.assert(auxInputSeries4.equals(auxInputSeries3));
        System.assert(auxInputSeries3.equals(auxInputSeries3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuxInputSeries auxInputSeries1 = OASAuxInputSeries.getExample();
        OASAuxInputSeries auxInputSeries2 = OASAuxInputSeries.getExample();
        OASAuxInputSeries auxInputSeries3 = new OASAuxInputSeries();
        OASAuxInputSeries auxInputSeries4 = new OASAuxInputSeries();

        System.assert(auxInputSeries1.equals(auxInputSeries2));
        System.assert(auxInputSeries2.equals(auxInputSeries1));
        System.assert(auxInputSeries3.equals(auxInputSeries4));
        System.assert(auxInputSeries4.equals(auxInputSeries3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuxInputSeries auxInputSeries1 = OASAuxInputSeries.getExample();
        OASAuxInputSeries auxInputSeries2 = new OASAuxInputSeries();

        System.assertEquals(false, auxInputSeries1.equals('foo'));
        System.assertEquals(false, auxInputSeries2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuxInputSeries auxInputSeries1 = OASAuxInputSeries.getExample();
        OASAuxInputSeries auxInputSeries2 = new OASAuxInputSeries();
        OASAuxInputSeries auxInputSeries3;

        System.assertEquals(false, auxInputSeries1.equals(auxInputSeries3));
        System.assertEquals(false, auxInputSeries2.equals(auxInputSeries3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuxInputSeries auxInputSeries1 = OASAuxInputSeries.getExample();
        OASAuxInputSeries auxInputSeries2 = new OASAuxInputSeries();

        System.assertEquals(auxInputSeries1.hashCode(), auxInputSeries1.hashCode());
        System.assertEquals(auxInputSeries2.hashCode(), auxInputSeries2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuxInputSeries auxInputSeries1 = OASAuxInputSeries.getExample();
        OASAuxInputSeries auxInputSeries2 = OASAuxInputSeries.getExample();
        OASAuxInputSeries auxInputSeries3 = new OASAuxInputSeries();
        OASAuxInputSeries auxInputSeries4 = new OASAuxInputSeries();

        System.assert(auxInputSeries1.equals(auxInputSeries2));
        System.assert(auxInputSeries3.equals(auxInputSeries4));
        System.assertEquals(auxInputSeries1.hashCode(), auxInputSeries2.hashCode());
        System.assertEquals(auxInputSeries3.hashCode(), auxInputSeries4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAuxInputSeries auxInputSeries = new OASAuxInputSeries();
        System.assertEquals(new List<OASAuxInput>(), auxInputSeries.values);
        System.assertEquals(null, auxInputSeries.name);
    }
}
