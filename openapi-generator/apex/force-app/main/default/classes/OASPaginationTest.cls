@isTest
private class OASPaginationTest {
    @isTest
    private static void equalsSameInstance() {
        OASPagination pagination1 = OASPagination.getExample();
        OASPagination pagination2 = pagination1;
        OASPagination pagination3 = new OASPagination();
        OASPagination pagination4 = pagination3;

        System.assert(pagination1.equals(pagination2));
        System.assert(pagination2.equals(pagination1));
        System.assert(pagination1.equals(pagination1));
        System.assert(pagination3.equals(pagination4));
        System.assert(pagination4.equals(pagination3));
        System.assert(pagination3.equals(pagination3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPagination pagination1 = OASPagination.getExample();
        OASPagination pagination2 = OASPagination.getExample();
        OASPagination pagination3 = new OASPagination();
        OASPagination pagination4 = new OASPagination();

        System.assert(pagination1.equals(pagination2));
        System.assert(pagination2.equals(pagination1));
        System.assert(pagination3.equals(pagination4));
        System.assert(pagination4.equals(pagination3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPagination pagination1 = OASPagination.getExample();
        OASPagination pagination2 = new OASPagination();

        System.assertEquals(false, pagination1.equals('foo'));
        System.assertEquals(false, pagination2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPagination pagination1 = OASPagination.getExample();
        OASPagination pagination2 = new OASPagination();
        OASPagination pagination3;

        System.assertEquals(false, pagination1.equals(pagination3));
        System.assertEquals(false, pagination2.equals(pagination3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPagination pagination1 = OASPagination.getExample();
        OASPagination pagination2 = new OASPagination();

        System.assertEquals(pagination1.hashCode(), pagination1.hashCode());
        System.assertEquals(pagination2.hashCode(), pagination2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPagination pagination1 = OASPagination.getExample();
        OASPagination pagination2 = OASPagination.getExample();
        OASPagination pagination3 = new OASPagination();
        OASPagination pagination4 = new OASPagination();

        System.assert(pagination1.equals(pagination2));
        System.assert(pagination3.equals(pagination4));
        System.assertEquals(pagination1.hashCode(), pagination2.hashCode());
        System.assertEquals(pagination3.hashCode(), pagination4.hashCode());
    }
}
