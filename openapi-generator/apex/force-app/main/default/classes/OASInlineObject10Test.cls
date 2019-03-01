@isTest
private class OASInlineObject10Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject10 inlineObject101 = OASInlineObject10.getExample();
        OASInlineObject10 inlineObject102 = inlineObject101;
        OASInlineObject10 inlineObject103 = new OASInlineObject10();
        OASInlineObject10 inlineObject104 = inlineObject103;

        System.assert(inlineObject101.equals(inlineObject102));
        System.assert(inlineObject102.equals(inlineObject101));
        System.assert(inlineObject101.equals(inlineObject101));
        System.assert(inlineObject103.equals(inlineObject104));
        System.assert(inlineObject104.equals(inlineObject103));
        System.assert(inlineObject103.equals(inlineObject103));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject10 inlineObject101 = OASInlineObject10.getExample();
        OASInlineObject10 inlineObject102 = OASInlineObject10.getExample();
        OASInlineObject10 inlineObject103 = new OASInlineObject10();
        OASInlineObject10 inlineObject104 = new OASInlineObject10();

        System.assert(inlineObject101.equals(inlineObject102));
        System.assert(inlineObject102.equals(inlineObject101));
        System.assert(inlineObject103.equals(inlineObject104));
        System.assert(inlineObject104.equals(inlineObject103));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject10 inlineObject101 = OASInlineObject10.getExample();
        OASInlineObject10 inlineObject102 = new OASInlineObject10();

        System.assertEquals(false, inlineObject101.equals('foo'));
        System.assertEquals(false, inlineObject102.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject10 inlineObject101 = OASInlineObject10.getExample();
        OASInlineObject10 inlineObject102 = new OASInlineObject10();
        OASInlineObject10 inlineObject103;

        System.assertEquals(false, inlineObject101.equals(inlineObject103));
        System.assertEquals(false, inlineObject102.equals(inlineObject103));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject10 inlineObject101 = OASInlineObject10.getExample();
        OASInlineObject10 inlineObject102 = new OASInlineObject10();

        System.assertEquals(inlineObject101.hashCode(), inlineObject101.hashCode());
        System.assertEquals(inlineObject102.hashCode(), inlineObject102.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject10 inlineObject101 = OASInlineObject10.getExample();
        OASInlineObject10 inlineObject102 = OASInlineObject10.getExample();
        OASInlineObject10 inlineObject103 = new OASInlineObject10();
        OASInlineObject10 inlineObject104 = new OASInlineObject10();

        System.assert(inlineObject101.equals(inlineObject102));
        System.assert(inlineObject103.equals(inlineObject104));
        System.assertEquals(inlineObject101.hashCode(), inlineObject102.hashCode());
        System.assertEquals(inlineObject103.hashCode(), inlineObject104.hashCode());
    }
}
