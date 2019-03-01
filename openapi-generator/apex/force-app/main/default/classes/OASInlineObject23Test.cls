@isTest
private class OASInlineObject23Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject23 inlineObject231 = OASInlineObject23.getExample();
        OASInlineObject23 inlineObject232 = inlineObject231;
        OASInlineObject23 inlineObject233 = new OASInlineObject23();
        OASInlineObject23 inlineObject234 = inlineObject233;

        System.assert(inlineObject231.equals(inlineObject232));
        System.assert(inlineObject232.equals(inlineObject231));
        System.assert(inlineObject231.equals(inlineObject231));
        System.assert(inlineObject233.equals(inlineObject234));
        System.assert(inlineObject234.equals(inlineObject233));
        System.assert(inlineObject233.equals(inlineObject233));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject23 inlineObject231 = OASInlineObject23.getExample();
        OASInlineObject23 inlineObject232 = OASInlineObject23.getExample();
        OASInlineObject23 inlineObject233 = new OASInlineObject23();
        OASInlineObject23 inlineObject234 = new OASInlineObject23();

        System.assert(inlineObject231.equals(inlineObject232));
        System.assert(inlineObject232.equals(inlineObject231));
        System.assert(inlineObject233.equals(inlineObject234));
        System.assert(inlineObject234.equals(inlineObject233));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject23 inlineObject231 = OASInlineObject23.getExample();
        OASInlineObject23 inlineObject232 = new OASInlineObject23();

        System.assertEquals(false, inlineObject231.equals('foo'));
        System.assertEquals(false, inlineObject232.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject23 inlineObject231 = OASInlineObject23.getExample();
        OASInlineObject23 inlineObject232 = new OASInlineObject23();
        OASInlineObject23 inlineObject233;

        System.assertEquals(false, inlineObject231.equals(inlineObject233));
        System.assertEquals(false, inlineObject232.equals(inlineObject233));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject23 inlineObject231 = OASInlineObject23.getExample();
        OASInlineObject23 inlineObject232 = new OASInlineObject23();

        System.assertEquals(inlineObject231.hashCode(), inlineObject231.hashCode());
        System.assertEquals(inlineObject232.hashCode(), inlineObject232.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject23 inlineObject231 = OASInlineObject23.getExample();
        OASInlineObject23 inlineObject232 = OASInlineObject23.getExample();
        OASInlineObject23 inlineObject233 = new OASInlineObject23();
        OASInlineObject23 inlineObject234 = new OASInlineObject23();

        System.assert(inlineObject231.equals(inlineObject232));
        System.assert(inlineObject233.equals(inlineObject234));
        System.assertEquals(inlineObject231.hashCode(), inlineObject232.hashCode());
        System.assertEquals(inlineObject233.hashCode(), inlineObject234.hashCode());
    }
}
