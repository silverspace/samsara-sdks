@isTest
private class OASInlineResponse2008Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineResponse2008 inlineResponse20081 = OASInlineResponse2008.getExample();
        OASInlineResponse2008 inlineResponse20082 = inlineResponse20081;
        OASInlineResponse2008 inlineResponse20083 = new OASInlineResponse2008();
        OASInlineResponse2008 inlineResponse20084 = inlineResponse20083;

        System.assert(inlineResponse20081.equals(inlineResponse20082));
        System.assert(inlineResponse20082.equals(inlineResponse20081));
        System.assert(inlineResponse20081.equals(inlineResponse20081));
        System.assert(inlineResponse20083.equals(inlineResponse20084));
        System.assert(inlineResponse20084.equals(inlineResponse20083));
        System.assert(inlineResponse20083.equals(inlineResponse20083));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineResponse2008 inlineResponse20081 = OASInlineResponse2008.getExample();
        OASInlineResponse2008 inlineResponse20082 = OASInlineResponse2008.getExample();
        OASInlineResponse2008 inlineResponse20083 = new OASInlineResponse2008();
        OASInlineResponse2008 inlineResponse20084 = new OASInlineResponse2008();

        System.assert(inlineResponse20081.equals(inlineResponse20082));
        System.assert(inlineResponse20082.equals(inlineResponse20081));
        System.assert(inlineResponse20083.equals(inlineResponse20084));
        System.assert(inlineResponse20084.equals(inlineResponse20083));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineResponse2008 inlineResponse20081 = OASInlineResponse2008.getExample();
        OASInlineResponse2008 inlineResponse20082 = new OASInlineResponse2008();

        System.assertEquals(false, inlineResponse20081.equals('foo'));
        System.assertEquals(false, inlineResponse20082.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineResponse2008 inlineResponse20081 = OASInlineResponse2008.getExample();
        OASInlineResponse2008 inlineResponse20082 = new OASInlineResponse2008();
        OASInlineResponse2008 inlineResponse20083;

        System.assertEquals(false, inlineResponse20081.equals(inlineResponse20083));
        System.assertEquals(false, inlineResponse20082.equals(inlineResponse20083));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineResponse2008 inlineResponse20081 = OASInlineResponse2008.getExample();
        OASInlineResponse2008 inlineResponse20082 = new OASInlineResponse2008();

        System.assertEquals(inlineResponse20081.hashCode(), inlineResponse20081.hashCode());
        System.assertEquals(inlineResponse20082.hashCode(), inlineResponse20082.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineResponse2008 inlineResponse20081 = OASInlineResponse2008.getExample();
        OASInlineResponse2008 inlineResponse20082 = OASInlineResponse2008.getExample();
        OASInlineResponse2008 inlineResponse20083 = new OASInlineResponse2008();
        OASInlineResponse2008 inlineResponse20084 = new OASInlineResponse2008();

        System.assert(inlineResponse20081.equals(inlineResponse20082));
        System.assert(inlineResponse20083.equals(inlineResponse20084));
        System.assertEquals(inlineResponse20081.hashCode(), inlineResponse20082.hashCode());
        System.assertEquals(inlineResponse20083.hashCode(), inlineResponse20084.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineResponse2008 inlineResponse2008 = new OASInlineResponse2008();
        System.assertEquals(new List<OASSensor>(), inlineResponse2008.sensors);
    }
}
