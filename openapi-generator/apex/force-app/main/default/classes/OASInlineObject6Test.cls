@isTest
private class OASInlineObject6Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject6 inlineObject61 = OASInlineObject6.getExample();
        OASInlineObject6 inlineObject62 = inlineObject61;
        OASInlineObject6 inlineObject63 = new OASInlineObject6();
        OASInlineObject6 inlineObject64 = inlineObject63;

        System.assert(inlineObject61.equals(inlineObject62));
        System.assert(inlineObject62.equals(inlineObject61));
        System.assert(inlineObject61.equals(inlineObject61));
        System.assert(inlineObject63.equals(inlineObject64));
        System.assert(inlineObject64.equals(inlineObject63));
        System.assert(inlineObject63.equals(inlineObject63));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject6 inlineObject61 = OASInlineObject6.getExample();
        OASInlineObject6 inlineObject62 = OASInlineObject6.getExample();
        OASInlineObject6 inlineObject63 = new OASInlineObject6();
        OASInlineObject6 inlineObject64 = new OASInlineObject6();

        System.assert(inlineObject61.equals(inlineObject62));
        System.assert(inlineObject62.equals(inlineObject61));
        System.assert(inlineObject63.equals(inlineObject64));
        System.assert(inlineObject64.equals(inlineObject63));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject6 inlineObject61 = OASInlineObject6.getExample();
        OASInlineObject6 inlineObject62 = new OASInlineObject6();

        System.assertEquals(false, inlineObject61.equals('foo'));
        System.assertEquals(false, inlineObject62.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject6 inlineObject61 = OASInlineObject6.getExample();
        OASInlineObject6 inlineObject62 = new OASInlineObject6();
        OASInlineObject6 inlineObject63;

        System.assertEquals(false, inlineObject61.equals(inlineObject63));
        System.assertEquals(false, inlineObject62.equals(inlineObject63));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject6 inlineObject61 = OASInlineObject6.getExample();
        OASInlineObject6 inlineObject62 = new OASInlineObject6();

        System.assertEquals(inlineObject61.hashCode(), inlineObject61.hashCode());
        System.assertEquals(inlineObject62.hashCode(), inlineObject62.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject6 inlineObject61 = OASInlineObject6.getExample();
        OASInlineObject6 inlineObject62 = OASInlineObject6.getExample();
        OASInlineObject6 inlineObject63 = new OASInlineObject6();
        OASInlineObject6 inlineObject64 = new OASInlineObject6();

        System.assert(inlineObject61.equals(inlineObject62));
        System.assert(inlineObject63.equals(inlineObject64));
        System.assertEquals(inlineObject61.hashCode(), inlineObject62.hashCode());
        System.assertEquals(inlineObject63.hashCode(), inlineObject64.hashCode());
    }
}
