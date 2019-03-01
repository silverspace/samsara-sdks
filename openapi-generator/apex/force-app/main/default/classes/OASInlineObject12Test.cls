@isTest
private class OASInlineObject12Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject12 inlineObject121 = OASInlineObject12.getExample();
        OASInlineObject12 inlineObject122 = inlineObject121;
        OASInlineObject12 inlineObject123 = new OASInlineObject12();
        OASInlineObject12 inlineObject124 = inlineObject123;

        System.assert(inlineObject121.equals(inlineObject122));
        System.assert(inlineObject122.equals(inlineObject121));
        System.assert(inlineObject121.equals(inlineObject121));
        System.assert(inlineObject123.equals(inlineObject124));
        System.assert(inlineObject124.equals(inlineObject123));
        System.assert(inlineObject123.equals(inlineObject123));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject12 inlineObject121 = OASInlineObject12.getExample();
        OASInlineObject12 inlineObject122 = OASInlineObject12.getExample();
        OASInlineObject12 inlineObject123 = new OASInlineObject12();
        OASInlineObject12 inlineObject124 = new OASInlineObject12();

        System.assert(inlineObject121.equals(inlineObject122));
        System.assert(inlineObject122.equals(inlineObject121));
        System.assert(inlineObject123.equals(inlineObject124));
        System.assert(inlineObject124.equals(inlineObject123));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject12 inlineObject121 = OASInlineObject12.getExample();
        OASInlineObject12 inlineObject122 = new OASInlineObject12();

        System.assertEquals(false, inlineObject121.equals('foo'));
        System.assertEquals(false, inlineObject122.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject12 inlineObject121 = OASInlineObject12.getExample();
        OASInlineObject12 inlineObject122 = new OASInlineObject12();
        OASInlineObject12 inlineObject123;

        System.assertEquals(false, inlineObject121.equals(inlineObject123));
        System.assertEquals(false, inlineObject122.equals(inlineObject123));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject12 inlineObject121 = OASInlineObject12.getExample();
        OASInlineObject12 inlineObject122 = new OASInlineObject12();

        System.assertEquals(inlineObject121.hashCode(), inlineObject121.hashCode());
        System.assertEquals(inlineObject122.hashCode(), inlineObject122.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject12 inlineObject121 = OASInlineObject12.getExample();
        OASInlineObject12 inlineObject122 = OASInlineObject12.getExample();
        OASInlineObject12 inlineObject123 = new OASInlineObject12();
        OASInlineObject12 inlineObject124 = new OASInlineObject12();

        System.assert(inlineObject121.equals(inlineObject122));
        System.assert(inlineObject123.equals(inlineObject124));
        System.assertEquals(inlineObject121.hashCode(), inlineObject122.hashCode());
        System.assertEquals(inlineObject123.hashCode(), inlineObject124.hashCode());
    }
}
