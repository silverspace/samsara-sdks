@isTest
private class OASInlineObject13Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject13 inlineObject131 = OASInlineObject13.getExample();
        OASInlineObject13 inlineObject132 = inlineObject131;
        OASInlineObject13 inlineObject133 = new OASInlineObject13();
        OASInlineObject13 inlineObject134 = inlineObject133;

        System.assert(inlineObject131.equals(inlineObject132));
        System.assert(inlineObject132.equals(inlineObject131));
        System.assert(inlineObject131.equals(inlineObject131));
        System.assert(inlineObject133.equals(inlineObject134));
        System.assert(inlineObject134.equals(inlineObject133));
        System.assert(inlineObject133.equals(inlineObject133));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject13 inlineObject131 = OASInlineObject13.getExample();
        OASInlineObject13 inlineObject132 = OASInlineObject13.getExample();
        OASInlineObject13 inlineObject133 = new OASInlineObject13();
        OASInlineObject13 inlineObject134 = new OASInlineObject13();

        System.assert(inlineObject131.equals(inlineObject132));
        System.assert(inlineObject132.equals(inlineObject131));
        System.assert(inlineObject133.equals(inlineObject134));
        System.assert(inlineObject134.equals(inlineObject133));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject13 inlineObject131 = OASInlineObject13.getExample();
        OASInlineObject13 inlineObject132 = new OASInlineObject13();

        System.assertEquals(false, inlineObject131.equals('foo'));
        System.assertEquals(false, inlineObject132.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject13 inlineObject131 = OASInlineObject13.getExample();
        OASInlineObject13 inlineObject132 = new OASInlineObject13();
        OASInlineObject13 inlineObject133;

        System.assertEquals(false, inlineObject131.equals(inlineObject133));
        System.assertEquals(false, inlineObject132.equals(inlineObject133));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject13 inlineObject131 = OASInlineObject13.getExample();
        OASInlineObject13 inlineObject132 = new OASInlineObject13();

        System.assertEquals(inlineObject131.hashCode(), inlineObject131.hashCode());
        System.assertEquals(inlineObject132.hashCode(), inlineObject132.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject13 inlineObject131 = OASInlineObject13.getExample();
        OASInlineObject13 inlineObject132 = OASInlineObject13.getExample();
        OASInlineObject13 inlineObject133 = new OASInlineObject13();
        OASInlineObject13 inlineObject134 = new OASInlineObject13();

        System.assert(inlineObject131.equals(inlineObject132));
        System.assert(inlineObject133.equals(inlineObject134));
        System.assertEquals(inlineObject131.hashCode(), inlineObject132.hashCode());
        System.assertEquals(inlineObject133.hashCode(), inlineObject134.hashCode());
    }
}
