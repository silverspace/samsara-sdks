@isTest
private class OASInlineObject20Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject20 inlineObject201 = OASInlineObject20.getExample();
        OASInlineObject20 inlineObject202 = inlineObject201;
        OASInlineObject20 inlineObject203 = new OASInlineObject20();
        OASInlineObject20 inlineObject204 = inlineObject203;

        System.assert(inlineObject201.equals(inlineObject202));
        System.assert(inlineObject202.equals(inlineObject201));
        System.assert(inlineObject201.equals(inlineObject201));
        System.assert(inlineObject203.equals(inlineObject204));
        System.assert(inlineObject204.equals(inlineObject203));
        System.assert(inlineObject203.equals(inlineObject203));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject20 inlineObject201 = OASInlineObject20.getExample();
        OASInlineObject20 inlineObject202 = OASInlineObject20.getExample();
        OASInlineObject20 inlineObject203 = new OASInlineObject20();
        OASInlineObject20 inlineObject204 = new OASInlineObject20();

        System.assert(inlineObject201.equals(inlineObject202));
        System.assert(inlineObject202.equals(inlineObject201));
        System.assert(inlineObject203.equals(inlineObject204));
        System.assert(inlineObject204.equals(inlineObject203));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject20 inlineObject201 = OASInlineObject20.getExample();
        OASInlineObject20 inlineObject202 = new OASInlineObject20();

        System.assertEquals(false, inlineObject201.equals('foo'));
        System.assertEquals(false, inlineObject202.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject20 inlineObject201 = OASInlineObject20.getExample();
        OASInlineObject20 inlineObject202 = new OASInlineObject20();
        OASInlineObject20 inlineObject203;

        System.assertEquals(false, inlineObject201.equals(inlineObject203));
        System.assertEquals(false, inlineObject202.equals(inlineObject203));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject20 inlineObject201 = OASInlineObject20.getExample();
        OASInlineObject20 inlineObject202 = new OASInlineObject20();

        System.assertEquals(inlineObject201.hashCode(), inlineObject201.hashCode());
        System.assertEquals(inlineObject202.hashCode(), inlineObject202.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject20 inlineObject201 = OASInlineObject20.getExample();
        OASInlineObject20 inlineObject202 = OASInlineObject20.getExample();
        OASInlineObject20 inlineObject203 = new OASInlineObject20();
        OASInlineObject20 inlineObject204 = new OASInlineObject20();

        System.assert(inlineObject201.equals(inlineObject202));
        System.assert(inlineObject203.equals(inlineObject204));
        System.assertEquals(inlineObject201.hashCode(), inlineObject202.hashCode());
        System.assertEquals(inlineObject203.hashCode(), inlineObject204.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineObject20 inlineObject20 = new OASInlineObject20();
        System.assertEquals(new List<Long>(), inlineObject20.sensors);
        System.assertEquals(null, inlineObject20.groupId);
    }
}
