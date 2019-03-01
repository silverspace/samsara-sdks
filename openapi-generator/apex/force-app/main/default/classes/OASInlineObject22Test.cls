@isTest
private class OASInlineObject22Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject22 inlineObject221 = OASInlineObject22.getExample();
        OASInlineObject22 inlineObject222 = inlineObject221;
        OASInlineObject22 inlineObject223 = new OASInlineObject22();
        OASInlineObject22 inlineObject224 = inlineObject223;

        System.assert(inlineObject221.equals(inlineObject222));
        System.assert(inlineObject222.equals(inlineObject221));
        System.assert(inlineObject221.equals(inlineObject221));
        System.assert(inlineObject223.equals(inlineObject224));
        System.assert(inlineObject224.equals(inlineObject223));
        System.assert(inlineObject223.equals(inlineObject223));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject22 inlineObject221 = OASInlineObject22.getExample();
        OASInlineObject22 inlineObject222 = OASInlineObject22.getExample();
        OASInlineObject22 inlineObject223 = new OASInlineObject22();
        OASInlineObject22 inlineObject224 = new OASInlineObject22();

        System.assert(inlineObject221.equals(inlineObject222));
        System.assert(inlineObject222.equals(inlineObject221));
        System.assert(inlineObject223.equals(inlineObject224));
        System.assert(inlineObject224.equals(inlineObject223));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject22 inlineObject221 = OASInlineObject22.getExample();
        OASInlineObject22 inlineObject222 = new OASInlineObject22();

        System.assertEquals(false, inlineObject221.equals('foo'));
        System.assertEquals(false, inlineObject222.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject22 inlineObject221 = OASInlineObject22.getExample();
        OASInlineObject22 inlineObject222 = new OASInlineObject22();
        OASInlineObject22 inlineObject223;

        System.assertEquals(false, inlineObject221.equals(inlineObject223));
        System.assertEquals(false, inlineObject222.equals(inlineObject223));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject22 inlineObject221 = OASInlineObject22.getExample();
        OASInlineObject22 inlineObject222 = new OASInlineObject22();

        System.assertEquals(inlineObject221.hashCode(), inlineObject221.hashCode());
        System.assertEquals(inlineObject222.hashCode(), inlineObject222.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject22 inlineObject221 = OASInlineObject22.getExample();
        OASInlineObject22 inlineObject222 = OASInlineObject22.getExample();
        OASInlineObject22 inlineObject223 = new OASInlineObject22();
        OASInlineObject22 inlineObject224 = new OASInlineObject22();

        System.assert(inlineObject221.equals(inlineObject222));
        System.assert(inlineObject223.equals(inlineObject224));
        System.assertEquals(inlineObject221.hashCode(), inlineObject222.hashCode());
        System.assertEquals(inlineObject223.hashCode(), inlineObject224.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineObject22 inlineObject22 = new OASInlineObject22();
        System.assertEquals(new List<Long>(), inlineObject22.sensors);
        System.assertEquals(null, inlineObject22.groupId);
    }
}
