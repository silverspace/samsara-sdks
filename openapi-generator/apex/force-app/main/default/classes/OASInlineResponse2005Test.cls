@isTest
private class OASInlineResponse2005Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineResponse2005 inlineResponse20051 = OASInlineResponse2005.getExample();
        OASInlineResponse2005 inlineResponse20052 = inlineResponse20051;
        OASInlineResponse2005 inlineResponse20053 = new OASInlineResponse2005();
        OASInlineResponse2005 inlineResponse20054 = inlineResponse20053;

        System.assert(inlineResponse20051.equals(inlineResponse20052));
        System.assert(inlineResponse20052.equals(inlineResponse20051));
        System.assert(inlineResponse20051.equals(inlineResponse20051));
        System.assert(inlineResponse20053.equals(inlineResponse20054));
        System.assert(inlineResponse20054.equals(inlineResponse20053));
        System.assert(inlineResponse20053.equals(inlineResponse20053));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineResponse2005 inlineResponse20051 = OASInlineResponse2005.getExample();
        OASInlineResponse2005 inlineResponse20052 = OASInlineResponse2005.getExample();
        OASInlineResponse2005 inlineResponse20053 = new OASInlineResponse2005();
        OASInlineResponse2005 inlineResponse20054 = new OASInlineResponse2005();

        System.assert(inlineResponse20051.equals(inlineResponse20052));
        System.assert(inlineResponse20052.equals(inlineResponse20051));
        System.assert(inlineResponse20053.equals(inlineResponse20054));
        System.assert(inlineResponse20054.equals(inlineResponse20053));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineResponse2005 inlineResponse20051 = OASInlineResponse2005.getExample();
        OASInlineResponse2005 inlineResponse20052 = new OASInlineResponse2005();

        System.assertEquals(false, inlineResponse20051.equals('foo'));
        System.assertEquals(false, inlineResponse20052.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineResponse2005 inlineResponse20051 = OASInlineResponse2005.getExample();
        OASInlineResponse2005 inlineResponse20052 = new OASInlineResponse2005();
        OASInlineResponse2005 inlineResponse20053;

        System.assertEquals(false, inlineResponse20051.equals(inlineResponse20053));
        System.assertEquals(false, inlineResponse20052.equals(inlineResponse20053));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineResponse2005 inlineResponse20051 = OASInlineResponse2005.getExample();
        OASInlineResponse2005 inlineResponse20052 = new OASInlineResponse2005();

        System.assertEquals(inlineResponse20051.hashCode(), inlineResponse20051.hashCode());
        System.assertEquals(inlineResponse20052.hashCode(), inlineResponse20052.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineResponse2005 inlineResponse20051 = OASInlineResponse2005.getExample();
        OASInlineResponse2005 inlineResponse20052 = OASInlineResponse2005.getExample();
        OASInlineResponse2005 inlineResponse20053 = new OASInlineResponse2005();
        OASInlineResponse2005 inlineResponse20054 = new OASInlineResponse2005();

        System.assert(inlineResponse20051.equals(inlineResponse20052));
        System.assert(inlineResponse20053.equals(inlineResponse20054));
        System.assertEquals(inlineResponse20051.hashCode(), inlineResponse20052.hashCode());
        System.assertEquals(inlineResponse20053.hashCode(), inlineResponse20054.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineResponse2005 inlineResponse2005 = new OASInlineResponse2005();
        System.assertEquals(new List<OASInlineResponse2005VehicleStats>(), inlineResponse2005.vehicleStats);
        System.assertEquals(null, inlineResponse2005.pagination);
    }
}
