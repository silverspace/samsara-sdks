@isTest
private class OASInlineResponse2001Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineResponse2001 inlineResponse20011 = OASInlineResponse2001.getExample();
        OASInlineResponse2001 inlineResponse20012 = inlineResponse20011;
        OASInlineResponse2001 inlineResponse20013 = new OASInlineResponse2001();
        OASInlineResponse2001 inlineResponse20014 = inlineResponse20013;

        System.assert(inlineResponse20011.equals(inlineResponse20012));
        System.assert(inlineResponse20012.equals(inlineResponse20011));
        System.assert(inlineResponse20011.equals(inlineResponse20011));
        System.assert(inlineResponse20013.equals(inlineResponse20014));
        System.assert(inlineResponse20014.equals(inlineResponse20013));
        System.assert(inlineResponse20013.equals(inlineResponse20013));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineResponse2001 inlineResponse20011 = OASInlineResponse2001.getExample();
        OASInlineResponse2001 inlineResponse20012 = OASInlineResponse2001.getExample();
        OASInlineResponse2001 inlineResponse20013 = new OASInlineResponse2001();
        OASInlineResponse2001 inlineResponse20014 = new OASInlineResponse2001();

        System.assert(inlineResponse20011.equals(inlineResponse20012));
        System.assert(inlineResponse20012.equals(inlineResponse20011));
        System.assert(inlineResponse20013.equals(inlineResponse20014));
        System.assert(inlineResponse20014.equals(inlineResponse20013));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineResponse2001 inlineResponse20011 = OASInlineResponse2001.getExample();
        OASInlineResponse2001 inlineResponse20012 = new OASInlineResponse2001();

        System.assertEquals(false, inlineResponse20011.equals('foo'));
        System.assertEquals(false, inlineResponse20012.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineResponse2001 inlineResponse20011 = OASInlineResponse2001.getExample();
        OASInlineResponse2001 inlineResponse20012 = new OASInlineResponse2001();
        OASInlineResponse2001 inlineResponse20013;

        System.assertEquals(false, inlineResponse20011.equals(inlineResponse20013));
        System.assertEquals(false, inlineResponse20012.equals(inlineResponse20013));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineResponse2001 inlineResponse20011 = OASInlineResponse2001.getExample();
        OASInlineResponse2001 inlineResponse20012 = new OASInlineResponse2001();

        System.assertEquals(inlineResponse20011.hashCode(), inlineResponse20011.hashCode());
        System.assertEquals(inlineResponse20012.hashCode(), inlineResponse20012.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineResponse2001 inlineResponse20011 = OASInlineResponse2001.getExample();
        OASInlineResponse2001 inlineResponse20012 = OASInlineResponse2001.getExample();
        OASInlineResponse2001 inlineResponse20013 = new OASInlineResponse2001();
        OASInlineResponse2001 inlineResponse20014 = new OASInlineResponse2001();

        System.assert(inlineResponse20011.equals(inlineResponse20012));
        System.assert(inlineResponse20013.equals(inlineResponse20014));
        System.assertEquals(inlineResponse20011.hashCode(), inlineResponse20012.hashCode());
        System.assertEquals(inlineResponse20013.hashCode(), inlineResponse20014.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineResponse2001 inlineResponse2001 = new OASInlineResponse2001();
        System.assertEquals(new List<OASAssetCurrentLocationsResponse>(), inlineResponse2001.assets);
    }
}
