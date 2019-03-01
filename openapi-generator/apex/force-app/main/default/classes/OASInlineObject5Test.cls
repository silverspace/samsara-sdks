@isTest
private class OASInlineObject5Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject5 inlineObject51 = OASInlineObject5.getExample();
        OASInlineObject5 inlineObject52 = inlineObject51;
        OASInlineObject5 inlineObject53 = new OASInlineObject5();
        OASInlineObject5 inlineObject54 = inlineObject53;

        System.assert(inlineObject51.equals(inlineObject52));
        System.assert(inlineObject52.equals(inlineObject51));
        System.assert(inlineObject51.equals(inlineObject51));
        System.assert(inlineObject53.equals(inlineObject54));
        System.assert(inlineObject54.equals(inlineObject53));
        System.assert(inlineObject53.equals(inlineObject53));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject5 inlineObject51 = OASInlineObject5.getExample();
        OASInlineObject5 inlineObject52 = OASInlineObject5.getExample();
        OASInlineObject5 inlineObject53 = new OASInlineObject5();
        OASInlineObject5 inlineObject54 = new OASInlineObject5();

        System.assert(inlineObject51.equals(inlineObject52));
        System.assert(inlineObject52.equals(inlineObject51));
        System.assert(inlineObject53.equals(inlineObject54));
        System.assert(inlineObject54.equals(inlineObject53));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject5 inlineObject51 = OASInlineObject5.getExample();
        OASInlineObject5 inlineObject52 = new OASInlineObject5();

        System.assertEquals(false, inlineObject51.equals('foo'));
        System.assertEquals(false, inlineObject52.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject5 inlineObject51 = OASInlineObject5.getExample();
        OASInlineObject5 inlineObject52 = new OASInlineObject5();
        OASInlineObject5 inlineObject53;

        System.assertEquals(false, inlineObject51.equals(inlineObject53));
        System.assertEquals(false, inlineObject52.equals(inlineObject53));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject5 inlineObject51 = OASInlineObject5.getExample();
        OASInlineObject5 inlineObject52 = new OASInlineObject5();

        System.assertEquals(inlineObject51.hashCode(), inlineObject51.hashCode());
        System.assertEquals(inlineObject52.hashCode(), inlineObject52.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject5 inlineObject51 = OASInlineObject5.getExample();
        OASInlineObject5 inlineObject52 = OASInlineObject5.getExample();
        OASInlineObject5 inlineObject53 = new OASInlineObject5();
        OASInlineObject5 inlineObject54 = new OASInlineObject5();

        System.assert(inlineObject51.equals(inlineObject52));
        System.assert(inlineObject53.equals(inlineObject54));
        System.assertEquals(inlineObject51.hashCode(), inlineObject52.hashCode());
        System.assertEquals(inlineObject53.hashCode(), inlineObject54.hashCode());
    }
}
