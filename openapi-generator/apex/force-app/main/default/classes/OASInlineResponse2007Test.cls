@isTest
private class OASInlineResponse2007Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineResponse2007 inlineResponse20071 = OASInlineResponse2007.getExample();
        OASInlineResponse2007 inlineResponse20072 = inlineResponse20071;
        OASInlineResponse2007 inlineResponse20073 = new OASInlineResponse2007();
        OASInlineResponse2007 inlineResponse20074 = inlineResponse20073;

        System.assert(inlineResponse20071.equals(inlineResponse20072));
        System.assert(inlineResponse20072.equals(inlineResponse20071));
        System.assert(inlineResponse20071.equals(inlineResponse20071));
        System.assert(inlineResponse20073.equals(inlineResponse20074));
        System.assert(inlineResponse20074.equals(inlineResponse20073));
        System.assert(inlineResponse20073.equals(inlineResponse20073));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineResponse2007 inlineResponse20071 = OASInlineResponse2007.getExample();
        OASInlineResponse2007 inlineResponse20072 = OASInlineResponse2007.getExample();
        OASInlineResponse2007 inlineResponse20073 = new OASInlineResponse2007();
        OASInlineResponse2007 inlineResponse20074 = new OASInlineResponse2007();

        System.assert(inlineResponse20071.equals(inlineResponse20072));
        System.assert(inlineResponse20072.equals(inlineResponse20071));
        System.assert(inlineResponse20073.equals(inlineResponse20074));
        System.assert(inlineResponse20074.equals(inlineResponse20073));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineResponse2007 inlineResponse20071 = OASInlineResponse2007.getExample();
        OASInlineResponse2007 inlineResponse20072 = new OASInlineResponse2007();

        System.assertEquals(false, inlineResponse20071.equals('foo'));
        System.assertEquals(false, inlineResponse20072.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineResponse2007 inlineResponse20071 = OASInlineResponse2007.getExample();
        OASInlineResponse2007 inlineResponse20072 = new OASInlineResponse2007();
        OASInlineResponse2007 inlineResponse20073;

        System.assertEquals(false, inlineResponse20071.equals(inlineResponse20073));
        System.assertEquals(false, inlineResponse20072.equals(inlineResponse20073));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineResponse2007 inlineResponse20071 = OASInlineResponse2007.getExample();
        OASInlineResponse2007 inlineResponse20072 = new OASInlineResponse2007();

        System.assertEquals(inlineResponse20071.hashCode(), inlineResponse20071.hashCode());
        System.assertEquals(inlineResponse20072.hashCode(), inlineResponse20072.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineResponse2007 inlineResponse20071 = OASInlineResponse2007.getExample();
        OASInlineResponse2007 inlineResponse20072 = OASInlineResponse2007.getExample();
        OASInlineResponse2007 inlineResponse20073 = new OASInlineResponse2007();
        OASInlineResponse2007 inlineResponse20074 = new OASInlineResponse2007();

        System.assert(inlineResponse20071.equals(inlineResponse20072));
        System.assert(inlineResponse20073.equals(inlineResponse20074));
        System.assertEquals(inlineResponse20071.hashCode(), inlineResponse20072.hashCode());
        System.assertEquals(inlineResponse20073.hashCode(), inlineResponse20074.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineResponse2007 inlineResponse2007 = new OASInlineResponse2007();
        System.assertEquals(new List<OASMachine>(), inlineResponse2007.machines);
    }
}
