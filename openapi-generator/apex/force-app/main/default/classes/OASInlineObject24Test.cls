@isTest
private class OASInlineObject24Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject24 inlineObject241 = OASInlineObject24.getExample();
        OASInlineObject24 inlineObject242 = inlineObject241;
        OASInlineObject24 inlineObject243 = new OASInlineObject24();
        OASInlineObject24 inlineObject244 = inlineObject243;

        System.assert(inlineObject241.equals(inlineObject242));
        System.assert(inlineObject242.equals(inlineObject241));
        System.assert(inlineObject241.equals(inlineObject241));
        System.assert(inlineObject243.equals(inlineObject244));
        System.assert(inlineObject244.equals(inlineObject243));
        System.assert(inlineObject243.equals(inlineObject243));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject24 inlineObject241 = OASInlineObject24.getExample();
        OASInlineObject24 inlineObject242 = OASInlineObject24.getExample();
        OASInlineObject24 inlineObject243 = new OASInlineObject24();
        OASInlineObject24 inlineObject244 = new OASInlineObject24();

        System.assert(inlineObject241.equals(inlineObject242));
        System.assert(inlineObject242.equals(inlineObject241));
        System.assert(inlineObject243.equals(inlineObject244));
        System.assert(inlineObject244.equals(inlineObject243));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject24 inlineObject241 = OASInlineObject24.getExample();
        OASInlineObject24 inlineObject242 = new OASInlineObject24();

        System.assertEquals(false, inlineObject241.equals('foo'));
        System.assertEquals(false, inlineObject242.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject24 inlineObject241 = OASInlineObject24.getExample();
        OASInlineObject24 inlineObject242 = new OASInlineObject24();
        OASInlineObject24 inlineObject243;

        System.assertEquals(false, inlineObject241.equals(inlineObject243));
        System.assertEquals(false, inlineObject242.equals(inlineObject243));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject24 inlineObject241 = OASInlineObject24.getExample();
        OASInlineObject24 inlineObject242 = new OASInlineObject24();

        System.assertEquals(inlineObject241.hashCode(), inlineObject241.hashCode());
        System.assertEquals(inlineObject242.hashCode(), inlineObject242.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject24 inlineObject241 = OASInlineObject24.getExample();
        OASInlineObject24 inlineObject242 = OASInlineObject24.getExample();
        OASInlineObject24 inlineObject243 = new OASInlineObject24();
        OASInlineObject24 inlineObject244 = new OASInlineObject24();

        System.assert(inlineObject241.equals(inlineObject242));
        System.assert(inlineObject243.equals(inlineObject244));
        System.assertEquals(inlineObject241.hashCode(), inlineObject242.hashCode());
        System.assertEquals(inlineObject243.hashCode(), inlineObject244.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineObject24 inlineObject24 = new OASInlineObject24();
        System.assertEquals(new List<Long>(), inlineObject24.sensors);
        System.assertEquals(null, inlineObject24.groupId);
    }
}
