@isTest
private class OASInlineObject18Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject18 inlineObject181 = OASInlineObject18.getExample();
        OASInlineObject18 inlineObject182 = inlineObject181;
        OASInlineObject18 inlineObject183 = new OASInlineObject18();
        OASInlineObject18 inlineObject184 = inlineObject183;

        System.assert(inlineObject181.equals(inlineObject182));
        System.assert(inlineObject182.equals(inlineObject181));
        System.assert(inlineObject181.equals(inlineObject181));
        System.assert(inlineObject183.equals(inlineObject184));
        System.assert(inlineObject184.equals(inlineObject183));
        System.assert(inlineObject183.equals(inlineObject183));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject18 inlineObject181 = OASInlineObject18.getExample();
        OASInlineObject18 inlineObject182 = OASInlineObject18.getExample();
        OASInlineObject18 inlineObject183 = new OASInlineObject18();
        OASInlineObject18 inlineObject184 = new OASInlineObject18();

        System.assert(inlineObject181.equals(inlineObject182));
        System.assert(inlineObject182.equals(inlineObject181));
        System.assert(inlineObject183.equals(inlineObject184));
        System.assert(inlineObject184.equals(inlineObject183));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject18 inlineObject181 = OASInlineObject18.getExample();
        OASInlineObject18 inlineObject182 = new OASInlineObject18();

        System.assertEquals(false, inlineObject181.equals('foo'));
        System.assertEquals(false, inlineObject182.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject18 inlineObject181 = OASInlineObject18.getExample();
        OASInlineObject18 inlineObject182 = new OASInlineObject18();
        OASInlineObject18 inlineObject183;

        System.assertEquals(false, inlineObject181.equals(inlineObject183));
        System.assertEquals(false, inlineObject182.equals(inlineObject183));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject18 inlineObject181 = OASInlineObject18.getExample();
        OASInlineObject18 inlineObject182 = new OASInlineObject18();

        System.assertEquals(inlineObject181.hashCode(), inlineObject181.hashCode());
        System.assertEquals(inlineObject182.hashCode(), inlineObject182.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject18 inlineObject181 = OASInlineObject18.getExample();
        OASInlineObject18 inlineObject182 = OASInlineObject18.getExample();
        OASInlineObject18 inlineObject183 = new OASInlineObject18();
        OASInlineObject18 inlineObject184 = new OASInlineObject18();

        System.assert(inlineObject181.equals(inlineObject182));
        System.assert(inlineObject183.equals(inlineObject184));
        System.assertEquals(inlineObject181.hashCode(), inlineObject182.hashCode());
        System.assertEquals(inlineObject183.hashCode(), inlineObject184.hashCode());
    }
}
