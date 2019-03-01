@isTest
private class OASInlineObject17Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject17 inlineObject171 = OASInlineObject17.getExample();
        OASInlineObject17 inlineObject172 = inlineObject171;
        OASInlineObject17 inlineObject173 = new OASInlineObject17();
        OASInlineObject17 inlineObject174 = inlineObject173;

        System.assert(inlineObject171.equals(inlineObject172));
        System.assert(inlineObject172.equals(inlineObject171));
        System.assert(inlineObject171.equals(inlineObject171));
        System.assert(inlineObject173.equals(inlineObject174));
        System.assert(inlineObject174.equals(inlineObject173));
        System.assert(inlineObject173.equals(inlineObject173));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject17 inlineObject171 = OASInlineObject17.getExample();
        OASInlineObject17 inlineObject172 = OASInlineObject17.getExample();
        OASInlineObject17 inlineObject173 = new OASInlineObject17();
        OASInlineObject17 inlineObject174 = new OASInlineObject17();

        System.assert(inlineObject171.equals(inlineObject172));
        System.assert(inlineObject172.equals(inlineObject171));
        System.assert(inlineObject173.equals(inlineObject174));
        System.assert(inlineObject174.equals(inlineObject173));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject17 inlineObject171 = OASInlineObject17.getExample();
        OASInlineObject17 inlineObject172 = new OASInlineObject17();

        System.assertEquals(false, inlineObject171.equals('foo'));
        System.assertEquals(false, inlineObject172.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject17 inlineObject171 = OASInlineObject17.getExample();
        OASInlineObject17 inlineObject172 = new OASInlineObject17();
        OASInlineObject17 inlineObject173;

        System.assertEquals(false, inlineObject171.equals(inlineObject173));
        System.assertEquals(false, inlineObject172.equals(inlineObject173));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject17 inlineObject171 = OASInlineObject17.getExample();
        OASInlineObject17 inlineObject172 = new OASInlineObject17();

        System.assertEquals(inlineObject171.hashCode(), inlineObject171.hashCode());
        System.assertEquals(inlineObject172.hashCode(), inlineObject172.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject17 inlineObject171 = OASInlineObject17.getExample();
        OASInlineObject17 inlineObject172 = OASInlineObject17.getExample();
        OASInlineObject17 inlineObject173 = new OASInlineObject17();
        OASInlineObject17 inlineObject174 = new OASInlineObject17();

        System.assert(inlineObject171.equals(inlineObject172));
        System.assert(inlineObject173.equals(inlineObject174));
        System.assertEquals(inlineObject171.hashCode(), inlineObject172.hashCode());
        System.assertEquals(inlineObject173.hashCode(), inlineObject174.hashCode());
    }
}
