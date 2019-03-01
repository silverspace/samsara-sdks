@isTest
private class OASInlineResponse200Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineResponse200 inlineResponse2001 = OASInlineResponse200.getExample();
        OASInlineResponse200 inlineResponse2002 = inlineResponse2001;
        OASInlineResponse200 inlineResponse2003 = new OASInlineResponse200();
        OASInlineResponse200 inlineResponse2004 = inlineResponse2003;

        System.assert(inlineResponse2001.equals(inlineResponse2002));
        System.assert(inlineResponse2002.equals(inlineResponse2001));
        System.assert(inlineResponse2001.equals(inlineResponse2001));
        System.assert(inlineResponse2003.equals(inlineResponse2004));
        System.assert(inlineResponse2004.equals(inlineResponse2003));
        System.assert(inlineResponse2003.equals(inlineResponse2003));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineResponse200 inlineResponse2001 = OASInlineResponse200.getExample();
        OASInlineResponse200 inlineResponse2002 = OASInlineResponse200.getExample();
        OASInlineResponse200 inlineResponse2003 = new OASInlineResponse200();
        OASInlineResponse200 inlineResponse2004 = new OASInlineResponse200();

        System.assert(inlineResponse2001.equals(inlineResponse2002));
        System.assert(inlineResponse2002.equals(inlineResponse2001));
        System.assert(inlineResponse2003.equals(inlineResponse2004));
        System.assert(inlineResponse2004.equals(inlineResponse2003));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineResponse200 inlineResponse2001 = OASInlineResponse200.getExample();
        OASInlineResponse200 inlineResponse2002 = new OASInlineResponse200();

        System.assertEquals(false, inlineResponse2001.equals('foo'));
        System.assertEquals(false, inlineResponse2002.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineResponse200 inlineResponse2001 = OASInlineResponse200.getExample();
        OASInlineResponse200 inlineResponse2002 = new OASInlineResponse200();
        OASInlineResponse200 inlineResponse2003;

        System.assertEquals(false, inlineResponse2001.equals(inlineResponse2003));
        System.assertEquals(false, inlineResponse2002.equals(inlineResponse2003));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineResponse200 inlineResponse2001 = OASInlineResponse200.getExample();
        OASInlineResponse200 inlineResponse2002 = new OASInlineResponse200();

        System.assertEquals(inlineResponse2001.hashCode(), inlineResponse2001.hashCode());
        System.assertEquals(inlineResponse2002.hashCode(), inlineResponse2002.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineResponse200 inlineResponse2001 = OASInlineResponse200.getExample();
        OASInlineResponse200 inlineResponse2002 = OASInlineResponse200.getExample();
        OASInlineResponse200 inlineResponse2003 = new OASInlineResponse200();
        OASInlineResponse200 inlineResponse2004 = new OASInlineResponse200();

        System.assert(inlineResponse2001.equals(inlineResponse2002));
        System.assert(inlineResponse2003.equals(inlineResponse2004));
        System.assertEquals(inlineResponse2001.hashCode(), inlineResponse2002.hashCode());
        System.assertEquals(inlineResponse2003.hashCode(), inlineResponse2004.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineResponse200 inlineResponse200 = new OASInlineResponse200();
        System.assertEquals(new List<OASAsset>(), inlineResponse200.assets);
    }
}
