@isTest
private class OASInlineResponse2009Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineResponse2009 inlineResponse20091 = OASInlineResponse2009.getExample();
        OASInlineResponse2009 inlineResponse20092 = inlineResponse20091;
        OASInlineResponse2009 inlineResponse20093 = new OASInlineResponse2009();
        OASInlineResponse2009 inlineResponse20094 = inlineResponse20093;

        System.assert(inlineResponse20091.equals(inlineResponse20092));
        System.assert(inlineResponse20092.equals(inlineResponse20091));
        System.assert(inlineResponse20091.equals(inlineResponse20091));
        System.assert(inlineResponse20093.equals(inlineResponse20094));
        System.assert(inlineResponse20094.equals(inlineResponse20093));
        System.assert(inlineResponse20093.equals(inlineResponse20093));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineResponse2009 inlineResponse20091 = OASInlineResponse2009.getExample();
        OASInlineResponse2009 inlineResponse20092 = OASInlineResponse2009.getExample();
        OASInlineResponse2009 inlineResponse20093 = new OASInlineResponse2009();
        OASInlineResponse2009 inlineResponse20094 = new OASInlineResponse2009();

        System.assert(inlineResponse20091.equals(inlineResponse20092));
        System.assert(inlineResponse20092.equals(inlineResponse20091));
        System.assert(inlineResponse20093.equals(inlineResponse20094));
        System.assert(inlineResponse20094.equals(inlineResponse20093));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineResponse2009 inlineResponse20091 = OASInlineResponse2009.getExample();
        OASInlineResponse2009 inlineResponse20092 = new OASInlineResponse2009();

        System.assertEquals(false, inlineResponse20091.equals('foo'));
        System.assertEquals(false, inlineResponse20092.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineResponse2009 inlineResponse20091 = OASInlineResponse2009.getExample();
        OASInlineResponse2009 inlineResponse20092 = new OASInlineResponse2009();
        OASInlineResponse2009 inlineResponse20093;

        System.assertEquals(false, inlineResponse20091.equals(inlineResponse20093));
        System.assertEquals(false, inlineResponse20092.equals(inlineResponse20093));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineResponse2009 inlineResponse20091 = OASInlineResponse2009.getExample();
        OASInlineResponse2009 inlineResponse20092 = new OASInlineResponse2009();

        System.assertEquals(inlineResponse20091.hashCode(), inlineResponse20091.hashCode());
        System.assertEquals(inlineResponse20092.hashCode(), inlineResponse20092.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineResponse2009 inlineResponse20091 = OASInlineResponse2009.getExample();
        OASInlineResponse2009 inlineResponse20092 = OASInlineResponse2009.getExample();
        OASInlineResponse2009 inlineResponse20093 = new OASInlineResponse2009();
        OASInlineResponse2009 inlineResponse20094 = new OASInlineResponse2009();

        System.assert(inlineResponse20091.equals(inlineResponse20092));
        System.assert(inlineResponse20093.equals(inlineResponse20094));
        System.assertEquals(inlineResponse20091.hashCode(), inlineResponse20092.hashCode());
        System.assertEquals(inlineResponse20093.hashCode(), inlineResponse20094.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineResponse2009 inlineResponse2009 = new OASInlineResponse2009();
        System.assertEquals(new List<OASTag>(), inlineResponse2009.tags);
    }
}
