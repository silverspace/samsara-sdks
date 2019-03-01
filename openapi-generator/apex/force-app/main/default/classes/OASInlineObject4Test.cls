@isTest
private class OASInlineObject4Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject4 inlineObject41 = OASInlineObject4.getExample();
        OASInlineObject4 inlineObject42 = inlineObject41;
        OASInlineObject4 inlineObject43 = new OASInlineObject4();
        OASInlineObject4 inlineObject44 = inlineObject43;

        System.assert(inlineObject41.equals(inlineObject42));
        System.assert(inlineObject42.equals(inlineObject41));
        System.assert(inlineObject41.equals(inlineObject41));
        System.assert(inlineObject43.equals(inlineObject44));
        System.assert(inlineObject44.equals(inlineObject43));
        System.assert(inlineObject43.equals(inlineObject43));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject4 inlineObject41 = OASInlineObject4.getExample();
        OASInlineObject4 inlineObject42 = OASInlineObject4.getExample();
        OASInlineObject4 inlineObject43 = new OASInlineObject4();
        OASInlineObject4 inlineObject44 = new OASInlineObject4();

        System.assert(inlineObject41.equals(inlineObject42));
        System.assert(inlineObject42.equals(inlineObject41));
        System.assert(inlineObject43.equals(inlineObject44));
        System.assert(inlineObject44.equals(inlineObject43));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject4 inlineObject41 = OASInlineObject4.getExample();
        OASInlineObject4 inlineObject42 = new OASInlineObject4();

        System.assertEquals(false, inlineObject41.equals('foo'));
        System.assertEquals(false, inlineObject42.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject4 inlineObject41 = OASInlineObject4.getExample();
        OASInlineObject4 inlineObject42 = new OASInlineObject4();
        OASInlineObject4 inlineObject43;

        System.assertEquals(false, inlineObject41.equals(inlineObject43));
        System.assertEquals(false, inlineObject42.equals(inlineObject43));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject4 inlineObject41 = OASInlineObject4.getExample();
        OASInlineObject4 inlineObject42 = new OASInlineObject4();

        System.assertEquals(inlineObject41.hashCode(), inlineObject41.hashCode());
        System.assertEquals(inlineObject42.hashCode(), inlineObject42.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject4 inlineObject41 = OASInlineObject4.getExample();
        OASInlineObject4 inlineObject42 = OASInlineObject4.getExample();
        OASInlineObject4 inlineObject43 = new OASInlineObject4();
        OASInlineObject4 inlineObject44 = new OASInlineObject4();

        System.assert(inlineObject41.equals(inlineObject42));
        System.assert(inlineObject43.equals(inlineObject44));
        System.assertEquals(inlineObject41.hashCode(), inlineObject42.hashCode());
        System.assertEquals(inlineObject43.hashCode(), inlineObject44.hashCode());
    }
}
