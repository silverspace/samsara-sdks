@isTest
private class OASInlineObject2Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject2 inlineObject21 = OASInlineObject2.getExample();
        OASInlineObject2 inlineObject22 = inlineObject21;
        OASInlineObject2 inlineObject23 = new OASInlineObject2();
        OASInlineObject2 inlineObject24 = inlineObject23;

        System.assert(inlineObject21.equals(inlineObject22));
        System.assert(inlineObject22.equals(inlineObject21));
        System.assert(inlineObject21.equals(inlineObject21));
        System.assert(inlineObject23.equals(inlineObject24));
        System.assert(inlineObject24.equals(inlineObject23));
        System.assert(inlineObject23.equals(inlineObject23));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject2 inlineObject21 = OASInlineObject2.getExample();
        OASInlineObject2 inlineObject22 = OASInlineObject2.getExample();
        OASInlineObject2 inlineObject23 = new OASInlineObject2();
        OASInlineObject2 inlineObject24 = new OASInlineObject2();

        System.assert(inlineObject21.equals(inlineObject22));
        System.assert(inlineObject22.equals(inlineObject21));
        System.assert(inlineObject23.equals(inlineObject24));
        System.assert(inlineObject24.equals(inlineObject23));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject2 inlineObject21 = OASInlineObject2.getExample();
        OASInlineObject2 inlineObject22 = new OASInlineObject2();

        System.assertEquals(false, inlineObject21.equals('foo'));
        System.assertEquals(false, inlineObject22.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject2 inlineObject21 = OASInlineObject2.getExample();
        OASInlineObject2 inlineObject22 = new OASInlineObject2();
        OASInlineObject2 inlineObject23;

        System.assertEquals(false, inlineObject21.equals(inlineObject23));
        System.assertEquals(false, inlineObject22.equals(inlineObject23));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject2 inlineObject21 = OASInlineObject2.getExample();
        OASInlineObject2 inlineObject22 = new OASInlineObject2();

        System.assertEquals(inlineObject21.hashCode(), inlineObject21.hashCode());
        System.assertEquals(inlineObject22.hashCode(), inlineObject22.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject2 inlineObject21 = OASInlineObject2.getExample();
        OASInlineObject2 inlineObject22 = OASInlineObject2.getExample();
        OASInlineObject2 inlineObject23 = new OASInlineObject2();
        OASInlineObject2 inlineObject24 = new OASInlineObject2();

        System.assert(inlineObject21.equals(inlineObject22));
        System.assert(inlineObject23.equals(inlineObject24));
        System.assertEquals(inlineObject21.hashCode(), inlineObject22.hashCode());
        System.assertEquals(inlineObject23.hashCode(), inlineObject24.hashCode());
    }
}
