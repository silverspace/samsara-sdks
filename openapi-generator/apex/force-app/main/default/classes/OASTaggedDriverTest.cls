@isTest
private class OASTaggedDriverTest {
    @isTest
    private static void equalsSameInstance() {
        OASTaggedDriver taggedDriver1 = OASTaggedDriver.getExample();
        OASTaggedDriver taggedDriver2 = taggedDriver1;
        OASTaggedDriver taggedDriver3 = new OASTaggedDriver();
        OASTaggedDriver taggedDriver4 = taggedDriver3;

        System.assert(taggedDriver1.equals(taggedDriver2));
        System.assert(taggedDriver2.equals(taggedDriver1));
        System.assert(taggedDriver1.equals(taggedDriver1));
        System.assert(taggedDriver3.equals(taggedDriver4));
        System.assert(taggedDriver4.equals(taggedDriver3));
        System.assert(taggedDriver3.equals(taggedDriver3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTaggedDriver taggedDriver1 = OASTaggedDriver.getExample();
        OASTaggedDriver taggedDriver2 = OASTaggedDriver.getExample();
        OASTaggedDriver taggedDriver3 = new OASTaggedDriver();
        OASTaggedDriver taggedDriver4 = new OASTaggedDriver();

        System.assert(taggedDriver1.equals(taggedDriver2));
        System.assert(taggedDriver2.equals(taggedDriver1));
        System.assert(taggedDriver3.equals(taggedDriver4));
        System.assert(taggedDriver4.equals(taggedDriver3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTaggedDriver taggedDriver1 = OASTaggedDriver.getExample();
        OASTaggedDriver taggedDriver2 = new OASTaggedDriver();

        System.assertEquals(false, taggedDriver1.equals('foo'));
        System.assertEquals(false, taggedDriver2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTaggedDriver taggedDriver1 = OASTaggedDriver.getExample();
        OASTaggedDriver taggedDriver2 = new OASTaggedDriver();
        OASTaggedDriver taggedDriver3;

        System.assertEquals(false, taggedDriver1.equals(taggedDriver3));
        System.assertEquals(false, taggedDriver2.equals(taggedDriver3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTaggedDriver taggedDriver1 = OASTaggedDriver.getExample();
        OASTaggedDriver taggedDriver2 = new OASTaggedDriver();

        System.assertEquals(taggedDriver1.hashCode(), taggedDriver1.hashCode());
        System.assertEquals(taggedDriver2.hashCode(), taggedDriver2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTaggedDriver taggedDriver1 = OASTaggedDriver.getExample();
        OASTaggedDriver taggedDriver2 = OASTaggedDriver.getExample();
        OASTaggedDriver taggedDriver3 = new OASTaggedDriver();
        OASTaggedDriver taggedDriver4 = new OASTaggedDriver();

        System.assert(taggedDriver1.equals(taggedDriver2));
        System.assert(taggedDriver3.equals(taggedDriver4));
        System.assertEquals(taggedDriver1.hashCode(), taggedDriver2.hashCode());
        System.assertEquals(taggedDriver3.hashCode(), taggedDriver4.hashCode());
    }
}
