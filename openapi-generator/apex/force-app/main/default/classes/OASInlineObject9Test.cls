@isTest
private class OASInlineObject9Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject9 inlineObject91 = OASInlineObject9.getExample();
        OASInlineObject9 inlineObject92 = inlineObject91;
        OASInlineObject9 inlineObject93 = new OASInlineObject9();
        OASInlineObject9 inlineObject94 = inlineObject93;

        System.assert(inlineObject91.equals(inlineObject92));
        System.assert(inlineObject92.equals(inlineObject91));
        System.assert(inlineObject91.equals(inlineObject91));
        System.assert(inlineObject93.equals(inlineObject94));
        System.assert(inlineObject94.equals(inlineObject93));
        System.assert(inlineObject93.equals(inlineObject93));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject9 inlineObject91 = OASInlineObject9.getExample();
        OASInlineObject9 inlineObject92 = OASInlineObject9.getExample();
        OASInlineObject9 inlineObject93 = new OASInlineObject9();
        OASInlineObject9 inlineObject94 = new OASInlineObject9();

        System.assert(inlineObject91.equals(inlineObject92));
        System.assert(inlineObject92.equals(inlineObject91));
        System.assert(inlineObject93.equals(inlineObject94));
        System.assert(inlineObject94.equals(inlineObject93));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject9 inlineObject91 = OASInlineObject9.getExample();
        OASInlineObject9 inlineObject92 = new OASInlineObject9();

        System.assertEquals(false, inlineObject91.equals('foo'));
        System.assertEquals(false, inlineObject92.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject9 inlineObject91 = OASInlineObject9.getExample();
        OASInlineObject9 inlineObject92 = new OASInlineObject9();
        OASInlineObject9 inlineObject93;

        System.assertEquals(false, inlineObject91.equals(inlineObject93));
        System.assertEquals(false, inlineObject92.equals(inlineObject93));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject9 inlineObject91 = OASInlineObject9.getExample();
        OASInlineObject9 inlineObject92 = new OASInlineObject9();

        System.assertEquals(inlineObject91.hashCode(), inlineObject91.hashCode());
        System.assertEquals(inlineObject92.hashCode(), inlineObject92.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject9 inlineObject91 = OASInlineObject9.getExample();
        OASInlineObject9 inlineObject92 = OASInlineObject9.getExample();
        OASInlineObject9 inlineObject93 = new OASInlineObject9();
        OASInlineObject9 inlineObject94 = new OASInlineObject9();

        System.assert(inlineObject91.equals(inlineObject92));
        System.assert(inlineObject93.equals(inlineObject94));
        System.assertEquals(inlineObject91.hashCode(), inlineObject92.hashCode());
        System.assertEquals(inlineObject93.hashCode(), inlineObject94.hashCode());
    }
}
