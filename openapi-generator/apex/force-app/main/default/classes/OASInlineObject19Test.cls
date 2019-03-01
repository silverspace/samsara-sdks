@isTest
private class OASInlineObject19Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject19 inlineObject191 = OASInlineObject19.getExample();
        OASInlineObject19 inlineObject192 = inlineObject191;
        OASInlineObject19 inlineObject193 = new OASInlineObject19();
        OASInlineObject19 inlineObject194 = inlineObject193;

        System.assert(inlineObject191.equals(inlineObject192));
        System.assert(inlineObject192.equals(inlineObject191));
        System.assert(inlineObject191.equals(inlineObject191));
        System.assert(inlineObject193.equals(inlineObject194));
        System.assert(inlineObject194.equals(inlineObject193));
        System.assert(inlineObject193.equals(inlineObject193));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject19 inlineObject191 = OASInlineObject19.getExample();
        OASInlineObject19 inlineObject192 = OASInlineObject19.getExample();
        OASInlineObject19 inlineObject193 = new OASInlineObject19();
        OASInlineObject19 inlineObject194 = new OASInlineObject19();

        System.assert(inlineObject191.equals(inlineObject192));
        System.assert(inlineObject192.equals(inlineObject191));
        System.assert(inlineObject193.equals(inlineObject194));
        System.assert(inlineObject194.equals(inlineObject193));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject19 inlineObject191 = OASInlineObject19.getExample();
        OASInlineObject19 inlineObject192 = new OASInlineObject19();

        System.assertEquals(false, inlineObject191.equals('foo'));
        System.assertEquals(false, inlineObject192.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject19 inlineObject191 = OASInlineObject19.getExample();
        OASInlineObject19 inlineObject192 = new OASInlineObject19();
        OASInlineObject19 inlineObject193;

        System.assertEquals(false, inlineObject191.equals(inlineObject193));
        System.assertEquals(false, inlineObject192.equals(inlineObject193));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject19 inlineObject191 = OASInlineObject19.getExample();
        OASInlineObject19 inlineObject192 = new OASInlineObject19();

        System.assertEquals(inlineObject191.hashCode(), inlineObject191.hashCode());
        System.assertEquals(inlineObject192.hashCode(), inlineObject192.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject19 inlineObject191 = OASInlineObject19.getExample();
        OASInlineObject19 inlineObject192 = OASInlineObject19.getExample();
        OASInlineObject19 inlineObject193 = new OASInlineObject19();
        OASInlineObject19 inlineObject194 = new OASInlineObject19();

        System.assert(inlineObject191.equals(inlineObject192));
        System.assert(inlineObject193.equals(inlineObject194));
        System.assertEquals(inlineObject191.hashCode(), inlineObject192.hashCode());
        System.assertEquals(inlineObject193.hashCode(), inlineObject194.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineObject19 inlineObject19 = new OASInlineObject19();
        System.assertEquals(new List<Long>(), inlineObject19.sensors);
        System.assertEquals(null, inlineObject19.groupId);
    }
}
