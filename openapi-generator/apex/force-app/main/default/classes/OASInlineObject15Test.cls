@isTest
private class OASInlineObject15Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject15 inlineObject151 = OASInlineObject15.getExample();
        OASInlineObject15 inlineObject152 = inlineObject151;
        OASInlineObject15 inlineObject153 = new OASInlineObject15();
        OASInlineObject15 inlineObject154 = inlineObject153;

        System.assert(inlineObject151.equals(inlineObject152));
        System.assert(inlineObject152.equals(inlineObject151));
        System.assert(inlineObject151.equals(inlineObject151));
        System.assert(inlineObject153.equals(inlineObject154));
        System.assert(inlineObject154.equals(inlineObject153));
        System.assert(inlineObject153.equals(inlineObject153));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject15 inlineObject151 = OASInlineObject15.getExample();
        OASInlineObject15 inlineObject152 = OASInlineObject15.getExample();
        OASInlineObject15 inlineObject153 = new OASInlineObject15();
        OASInlineObject15 inlineObject154 = new OASInlineObject15();

        System.assert(inlineObject151.equals(inlineObject152));
        System.assert(inlineObject152.equals(inlineObject151));
        System.assert(inlineObject153.equals(inlineObject154));
        System.assert(inlineObject154.equals(inlineObject153));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject15 inlineObject151 = OASInlineObject15.getExample();
        OASInlineObject15 inlineObject152 = new OASInlineObject15();

        System.assertEquals(false, inlineObject151.equals('foo'));
        System.assertEquals(false, inlineObject152.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject15 inlineObject151 = OASInlineObject15.getExample();
        OASInlineObject15 inlineObject152 = new OASInlineObject15();
        OASInlineObject15 inlineObject153;

        System.assertEquals(false, inlineObject151.equals(inlineObject153));
        System.assertEquals(false, inlineObject152.equals(inlineObject153));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject15 inlineObject151 = OASInlineObject15.getExample();
        OASInlineObject15 inlineObject152 = new OASInlineObject15();

        System.assertEquals(inlineObject151.hashCode(), inlineObject151.hashCode());
        System.assertEquals(inlineObject152.hashCode(), inlineObject152.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject15 inlineObject151 = OASInlineObject15.getExample();
        OASInlineObject15 inlineObject152 = OASInlineObject15.getExample();
        OASInlineObject15 inlineObject153 = new OASInlineObject15();
        OASInlineObject15 inlineObject154 = new OASInlineObject15();

        System.assert(inlineObject151.equals(inlineObject152));
        System.assert(inlineObject153.equals(inlineObject154));
        System.assertEquals(inlineObject151.hashCode(), inlineObject152.hashCode());
        System.assertEquals(inlineObject153.hashCode(), inlineObject154.hashCode());
    }
}
