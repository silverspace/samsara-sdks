@isTest
private class OASInlineObject8Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject8 inlineObject81 = OASInlineObject8.getExample();
        OASInlineObject8 inlineObject82 = inlineObject81;
        OASInlineObject8 inlineObject83 = new OASInlineObject8();
        OASInlineObject8 inlineObject84 = inlineObject83;

        System.assert(inlineObject81.equals(inlineObject82));
        System.assert(inlineObject82.equals(inlineObject81));
        System.assert(inlineObject81.equals(inlineObject81));
        System.assert(inlineObject83.equals(inlineObject84));
        System.assert(inlineObject84.equals(inlineObject83));
        System.assert(inlineObject83.equals(inlineObject83));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject8 inlineObject81 = OASInlineObject8.getExample();
        OASInlineObject8 inlineObject82 = OASInlineObject8.getExample();
        OASInlineObject8 inlineObject83 = new OASInlineObject8();
        OASInlineObject8 inlineObject84 = new OASInlineObject8();

        System.assert(inlineObject81.equals(inlineObject82));
        System.assert(inlineObject82.equals(inlineObject81));
        System.assert(inlineObject83.equals(inlineObject84));
        System.assert(inlineObject84.equals(inlineObject83));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject8 inlineObject81 = OASInlineObject8.getExample();
        OASInlineObject8 inlineObject82 = new OASInlineObject8();

        System.assertEquals(false, inlineObject81.equals('foo'));
        System.assertEquals(false, inlineObject82.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject8 inlineObject81 = OASInlineObject8.getExample();
        OASInlineObject8 inlineObject82 = new OASInlineObject8();
        OASInlineObject8 inlineObject83;

        System.assertEquals(false, inlineObject81.equals(inlineObject83));
        System.assertEquals(false, inlineObject82.equals(inlineObject83));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject8 inlineObject81 = OASInlineObject8.getExample();
        OASInlineObject8 inlineObject82 = new OASInlineObject8();

        System.assertEquals(inlineObject81.hashCode(), inlineObject81.hashCode());
        System.assertEquals(inlineObject82.hashCode(), inlineObject82.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject8 inlineObject81 = OASInlineObject8.getExample();
        OASInlineObject8 inlineObject82 = OASInlineObject8.getExample();
        OASInlineObject8 inlineObject83 = new OASInlineObject8();
        OASInlineObject8 inlineObject84 = new OASInlineObject8();

        System.assert(inlineObject81.equals(inlineObject82));
        System.assert(inlineObject83.equals(inlineObject84));
        System.assertEquals(inlineObject81.hashCode(), inlineObject82.hashCode());
        System.assertEquals(inlineObject83.hashCode(), inlineObject84.hashCode());
    }
}
