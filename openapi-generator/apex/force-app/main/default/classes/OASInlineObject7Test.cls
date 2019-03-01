@isTest
private class OASInlineObject7Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject7 inlineObject71 = OASInlineObject7.getExample();
        OASInlineObject7 inlineObject72 = inlineObject71;
        OASInlineObject7 inlineObject73 = new OASInlineObject7();
        OASInlineObject7 inlineObject74 = inlineObject73;

        System.assert(inlineObject71.equals(inlineObject72));
        System.assert(inlineObject72.equals(inlineObject71));
        System.assert(inlineObject71.equals(inlineObject71));
        System.assert(inlineObject73.equals(inlineObject74));
        System.assert(inlineObject74.equals(inlineObject73));
        System.assert(inlineObject73.equals(inlineObject73));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject7 inlineObject71 = OASInlineObject7.getExample();
        OASInlineObject7 inlineObject72 = OASInlineObject7.getExample();
        OASInlineObject7 inlineObject73 = new OASInlineObject7();
        OASInlineObject7 inlineObject74 = new OASInlineObject7();

        System.assert(inlineObject71.equals(inlineObject72));
        System.assert(inlineObject72.equals(inlineObject71));
        System.assert(inlineObject73.equals(inlineObject74));
        System.assert(inlineObject74.equals(inlineObject73));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject7 inlineObject71 = OASInlineObject7.getExample();
        OASInlineObject7 inlineObject72 = new OASInlineObject7();

        System.assertEquals(false, inlineObject71.equals('foo'));
        System.assertEquals(false, inlineObject72.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject7 inlineObject71 = OASInlineObject7.getExample();
        OASInlineObject7 inlineObject72 = new OASInlineObject7();
        OASInlineObject7 inlineObject73;

        System.assertEquals(false, inlineObject71.equals(inlineObject73));
        System.assertEquals(false, inlineObject72.equals(inlineObject73));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject7 inlineObject71 = OASInlineObject7.getExample();
        OASInlineObject7 inlineObject72 = new OASInlineObject7();

        System.assertEquals(inlineObject71.hashCode(), inlineObject71.hashCode());
        System.assertEquals(inlineObject72.hashCode(), inlineObject72.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject7 inlineObject71 = OASInlineObject7.getExample();
        OASInlineObject7 inlineObject72 = OASInlineObject7.getExample();
        OASInlineObject7 inlineObject73 = new OASInlineObject7();
        OASInlineObject7 inlineObject74 = new OASInlineObject7();

        System.assert(inlineObject71.equals(inlineObject72));
        System.assert(inlineObject73.equals(inlineObject74));
        System.assertEquals(inlineObject71.hashCode(), inlineObject72.hashCode());
        System.assertEquals(inlineObject73.hashCode(), inlineObject74.hashCode());
    }
}
