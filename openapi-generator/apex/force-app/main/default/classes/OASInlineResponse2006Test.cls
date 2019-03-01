@isTest
private class OASInlineResponse2006Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineResponse2006 inlineResponse20061 = OASInlineResponse2006.getExample();
        OASInlineResponse2006 inlineResponse20062 = inlineResponse20061;
        OASInlineResponse2006 inlineResponse20063 = new OASInlineResponse2006();
        OASInlineResponse2006 inlineResponse20064 = inlineResponse20063;

        System.assert(inlineResponse20061.equals(inlineResponse20062));
        System.assert(inlineResponse20062.equals(inlineResponse20061));
        System.assert(inlineResponse20061.equals(inlineResponse20061));
        System.assert(inlineResponse20063.equals(inlineResponse20064));
        System.assert(inlineResponse20064.equals(inlineResponse20063));
        System.assert(inlineResponse20063.equals(inlineResponse20063));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineResponse2006 inlineResponse20061 = OASInlineResponse2006.getExample();
        OASInlineResponse2006 inlineResponse20062 = OASInlineResponse2006.getExample();
        OASInlineResponse2006 inlineResponse20063 = new OASInlineResponse2006();
        OASInlineResponse2006 inlineResponse20064 = new OASInlineResponse2006();

        System.assert(inlineResponse20061.equals(inlineResponse20062));
        System.assert(inlineResponse20062.equals(inlineResponse20061));
        System.assert(inlineResponse20063.equals(inlineResponse20064));
        System.assert(inlineResponse20064.equals(inlineResponse20063));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineResponse2006 inlineResponse20061 = OASInlineResponse2006.getExample();
        OASInlineResponse2006 inlineResponse20062 = new OASInlineResponse2006();

        System.assertEquals(false, inlineResponse20061.equals('foo'));
        System.assertEquals(false, inlineResponse20062.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineResponse2006 inlineResponse20061 = OASInlineResponse2006.getExample();
        OASInlineResponse2006 inlineResponse20062 = new OASInlineResponse2006();
        OASInlineResponse2006 inlineResponse20063;

        System.assertEquals(false, inlineResponse20061.equals(inlineResponse20063));
        System.assertEquals(false, inlineResponse20062.equals(inlineResponse20063));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineResponse2006 inlineResponse20061 = OASInlineResponse2006.getExample();
        OASInlineResponse2006 inlineResponse20062 = new OASInlineResponse2006();

        System.assertEquals(inlineResponse20061.hashCode(), inlineResponse20061.hashCode());
        System.assertEquals(inlineResponse20062.hashCode(), inlineResponse20062.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineResponse2006 inlineResponse20061 = OASInlineResponse2006.getExample();
        OASInlineResponse2006 inlineResponse20062 = OASInlineResponse2006.getExample();
        OASInlineResponse2006 inlineResponse20063 = new OASInlineResponse2006();
        OASInlineResponse2006 inlineResponse20064 = new OASInlineResponse2006();

        System.assert(inlineResponse20061.equals(inlineResponse20062));
        System.assert(inlineResponse20063.equals(inlineResponse20064));
        System.assertEquals(inlineResponse20061.hashCode(), inlineResponse20062.hashCode());
        System.assertEquals(inlineResponse20063.hashCode(), inlineResponse20064.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineResponse2006 inlineResponse2006 = new OASInlineResponse2006();
        System.assertEquals(new List<OASDataInputHistoryResponse>(), inlineResponse2006.dataInputs);
    }
}
