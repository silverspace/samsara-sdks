@isTest
private class OASTagMetadataTest {
    @isTest
    private static void equalsSameInstance() {
        OASTagMetadata tagMetadata1 = OASTagMetadata.getExample();
        OASTagMetadata tagMetadata2 = tagMetadata1;
        OASTagMetadata tagMetadata3 = new OASTagMetadata();
        OASTagMetadata tagMetadata4 = tagMetadata3;

        System.assert(tagMetadata1.equals(tagMetadata2));
        System.assert(tagMetadata2.equals(tagMetadata1));
        System.assert(tagMetadata1.equals(tagMetadata1));
        System.assert(tagMetadata3.equals(tagMetadata4));
        System.assert(tagMetadata4.equals(tagMetadata3));
        System.assert(tagMetadata3.equals(tagMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTagMetadata tagMetadata1 = OASTagMetadata.getExample();
        OASTagMetadata tagMetadata2 = OASTagMetadata.getExample();
        OASTagMetadata tagMetadata3 = new OASTagMetadata();
        OASTagMetadata tagMetadata4 = new OASTagMetadata();

        System.assert(tagMetadata1.equals(tagMetadata2));
        System.assert(tagMetadata2.equals(tagMetadata1));
        System.assert(tagMetadata3.equals(tagMetadata4));
        System.assert(tagMetadata4.equals(tagMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTagMetadata tagMetadata1 = OASTagMetadata.getExample();
        OASTagMetadata tagMetadata2 = new OASTagMetadata();

        System.assertEquals(false, tagMetadata1.equals('foo'));
        System.assertEquals(false, tagMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTagMetadata tagMetadata1 = OASTagMetadata.getExample();
        OASTagMetadata tagMetadata2 = new OASTagMetadata();
        OASTagMetadata tagMetadata3;

        System.assertEquals(false, tagMetadata1.equals(tagMetadata3));
        System.assertEquals(false, tagMetadata2.equals(tagMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTagMetadata tagMetadata1 = OASTagMetadata.getExample();
        OASTagMetadata tagMetadata2 = new OASTagMetadata();

        System.assertEquals(tagMetadata1.hashCode(), tagMetadata1.hashCode());
        System.assertEquals(tagMetadata2.hashCode(), tagMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTagMetadata tagMetadata1 = OASTagMetadata.getExample();
        OASTagMetadata tagMetadata2 = OASTagMetadata.getExample();
        OASTagMetadata tagMetadata3 = new OASTagMetadata();
        OASTagMetadata tagMetadata4 = new OASTagMetadata();

        System.assert(tagMetadata1.equals(tagMetadata2));
        System.assert(tagMetadata3.equals(tagMetadata4));
        System.assertEquals(tagMetadata1.hashCode(), tagMetadata2.hashCode());
        System.assertEquals(tagMetadata3.hashCode(), tagMetadata4.hashCode());
    }
}
