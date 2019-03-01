@isTest
private class OASInlineObject3Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject3 inlineObject31 = OASInlineObject3.getExample();
        OASInlineObject3 inlineObject32 = inlineObject31;
        OASInlineObject3 inlineObject33 = new OASInlineObject3();
        OASInlineObject3 inlineObject34 = inlineObject33;

        System.assert(inlineObject31.equals(inlineObject32));
        System.assert(inlineObject32.equals(inlineObject31));
        System.assert(inlineObject31.equals(inlineObject31));
        System.assert(inlineObject33.equals(inlineObject34));
        System.assert(inlineObject34.equals(inlineObject33));
        System.assert(inlineObject33.equals(inlineObject33));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject3 inlineObject31 = OASInlineObject3.getExample();
        OASInlineObject3 inlineObject32 = OASInlineObject3.getExample();
        OASInlineObject3 inlineObject33 = new OASInlineObject3();
        OASInlineObject3 inlineObject34 = new OASInlineObject3();

        System.assert(inlineObject31.equals(inlineObject32));
        System.assert(inlineObject32.equals(inlineObject31));
        System.assert(inlineObject33.equals(inlineObject34));
        System.assert(inlineObject34.equals(inlineObject33));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject3 inlineObject31 = OASInlineObject3.getExample();
        OASInlineObject3 inlineObject32 = new OASInlineObject3();

        System.assertEquals(false, inlineObject31.equals('foo'));
        System.assertEquals(false, inlineObject32.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject3 inlineObject31 = OASInlineObject3.getExample();
        OASInlineObject3 inlineObject32 = new OASInlineObject3();
        OASInlineObject3 inlineObject33;

        System.assertEquals(false, inlineObject31.equals(inlineObject33));
        System.assertEquals(false, inlineObject32.equals(inlineObject33));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject3 inlineObject31 = OASInlineObject3.getExample();
        OASInlineObject3 inlineObject32 = new OASInlineObject3();

        System.assertEquals(inlineObject31.hashCode(), inlineObject31.hashCode());
        System.assertEquals(inlineObject32.hashCode(), inlineObject32.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject3 inlineObject31 = OASInlineObject3.getExample();
        OASInlineObject3 inlineObject32 = OASInlineObject3.getExample();
        OASInlineObject3 inlineObject33 = new OASInlineObject3();
        OASInlineObject3 inlineObject34 = new OASInlineObject3();

        System.assert(inlineObject31.equals(inlineObject32));
        System.assert(inlineObject33.equals(inlineObject34));
        System.assertEquals(inlineObject31.hashCode(), inlineObject32.hashCode());
        System.assertEquals(inlineObject33.hashCode(), inlineObject34.hashCode());
    }
}
