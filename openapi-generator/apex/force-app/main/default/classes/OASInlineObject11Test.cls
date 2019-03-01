@isTest
private class OASInlineObject11Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject11 inlineObject111 = OASInlineObject11.getExample();
        OASInlineObject11 inlineObject112 = inlineObject111;
        OASInlineObject11 inlineObject113 = new OASInlineObject11();
        OASInlineObject11 inlineObject114 = inlineObject113;

        System.assert(inlineObject111.equals(inlineObject112));
        System.assert(inlineObject112.equals(inlineObject111));
        System.assert(inlineObject111.equals(inlineObject111));
        System.assert(inlineObject113.equals(inlineObject114));
        System.assert(inlineObject114.equals(inlineObject113));
        System.assert(inlineObject113.equals(inlineObject113));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject11 inlineObject111 = OASInlineObject11.getExample();
        OASInlineObject11 inlineObject112 = OASInlineObject11.getExample();
        OASInlineObject11 inlineObject113 = new OASInlineObject11();
        OASInlineObject11 inlineObject114 = new OASInlineObject11();

        System.assert(inlineObject111.equals(inlineObject112));
        System.assert(inlineObject112.equals(inlineObject111));
        System.assert(inlineObject113.equals(inlineObject114));
        System.assert(inlineObject114.equals(inlineObject113));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject11 inlineObject111 = OASInlineObject11.getExample();
        OASInlineObject11 inlineObject112 = new OASInlineObject11();

        System.assertEquals(false, inlineObject111.equals('foo'));
        System.assertEquals(false, inlineObject112.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject11 inlineObject111 = OASInlineObject11.getExample();
        OASInlineObject11 inlineObject112 = new OASInlineObject11();
        OASInlineObject11 inlineObject113;

        System.assertEquals(false, inlineObject111.equals(inlineObject113));
        System.assertEquals(false, inlineObject112.equals(inlineObject113));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject11 inlineObject111 = OASInlineObject11.getExample();
        OASInlineObject11 inlineObject112 = new OASInlineObject11();

        System.assertEquals(inlineObject111.hashCode(), inlineObject111.hashCode());
        System.assertEquals(inlineObject112.hashCode(), inlineObject112.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject11 inlineObject111 = OASInlineObject11.getExample();
        OASInlineObject11 inlineObject112 = OASInlineObject11.getExample();
        OASInlineObject11 inlineObject113 = new OASInlineObject11();
        OASInlineObject11 inlineObject114 = new OASInlineObject11();

        System.assert(inlineObject111.equals(inlineObject112));
        System.assert(inlineObject113.equals(inlineObject114));
        System.assertEquals(inlineObject111.hashCode(), inlineObject112.hashCode());
        System.assertEquals(inlineObject113.hashCode(), inlineObject114.hashCode());
    }
}
