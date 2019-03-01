@isTest
private class OASTripResponseEndCoordinatesTest {
    @isTest
    private static void equalsSameInstance() {
        OASTripResponseEndCoordinates tripResponseEndCoordinates1 = OASTripResponseEndCoordinates.getExample();
        OASTripResponseEndCoordinates tripResponseEndCoordinates2 = tripResponseEndCoordinates1;
        OASTripResponseEndCoordinates tripResponseEndCoordinates3 = new OASTripResponseEndCoordinates();
        OASTripResponseEndCoordinates tripResponseEndCoordinates4 = tripResponseEndCoordinates3;

        System.assert(tripResponseEndCoordinates1.equals(tripResponseEndCoordinates2));
        System.assert(tripResponseEndCoordinates2.equals(tripResponseEndCoordinates1));
        System.assert(tripResponseEndCoordinates1.equals(tripResponseEndCoordinates1));
        System.assert(tripResponseEndCoordinates3.equals(tripResponseEndCoordinates4));
        System.assert(tripResponseEndCoordinates4.equals(tripResponseEndCoordinates3));
        System.assert(tripResponseEndCoordinates3.equals(tripResponseEndCoordinates3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTripResponseEndCoordinates tripResponseEndCoordinates1 = OASTripResponseEndCoordinates.getExample();
        OASTripResponseEndCoordinates tripResponseEndCoordinates2 = OASTripResponseEndCoordinates.getExample();
        OASTripResponseEndCoordinates tripResponseEndCoordinates3 = new OASTripResponseEndCoordinates();
        OASTripResponseEndCoordinates tripResponseEndCoordinates4 = new OASTripResponseEndCoordinates();

        System.assert(tripResponseEndCoordinates1.equals(tripResponseEndCoordinates2));
        System.assert(tripResponseEndCoordinates2.equals(tripResponseEndCoordinates1));
        System.assert(tripResponseEndCoordinates3.equals(tripResponseEndCoordinates4));
        System.assert(tripResponseEndCoordinates4.equals(tripResponseEndCoordinates3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTripResponseEndCoordinates tripResponseEndCoordinates1 = OASTripResponseEndCoordinates.getExample();
        OASTripResponseEndCoordinates tripResponseEndCoordinates2 = new OASTripResponseEndCoordinates();

        System.assertEquals(false, tripResponseEndCoordinates1.equals('foo'));
        System.assertEquals(false, tripResponseEndCoordinates2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTripResponseEndCoordinates tripResponseEndCoordinates1 = OASTripResponseEndCoordinates.getExample();
        OASTripResponseEndCoordinates tripResponseEndCoordinates2 = new OASTripResponseEndCoordinates();
        OASTripResponseEndCoordinates tripResponseEndCoordinates3;

        System.assertEquals(false, tripResponseEndCoordinates1.equals(tripResponseEndCoordinates3));
        System.assertEquals(false, tripResponseEndCoordinates2.equals(tripResponseEndCoordinates3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTripResponseEndCoordinates tripResponseEndCoordinates1 = OASTripResponseEndCoordinates.getExample();
        OASTripResponseEndCoordinates tripResponseEndCoordinates2 = new OASTripResponseEndCoordinates();

        System.assertEquals(tripResponseEndCoordinates1.hashCode(), tripResponseEndCoordinates1.hashCode());
        System.assertEquals(tripResponseEndCoordinates2.hashCode(), tripResponseEndCoordinates2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTripResponseEndCoordinates tripResponseEndCoordinates1 = OASTripResponseEndCoordinates.getExample();
        OASTripResponseEndCoordinates tripResponseEndCoordinates2 = OASTripResponseEndCoordinates.getExample();
        OASTripResponseEndCoordinates tripResponseEndCoordinates3 = new OASTripResponseEndCoordinates();
        OASTripResponseEndCoordinates tripResponseEndCoordinates4 = new OASTripResponseEndCoordinates();

        System.assert(tripResponseEndCoordinates1.equals(tripResponseEndCoordinates2));
        System.assert(tripResponseEndCoordinates3.equals(tripResponseEndCoordinates4));
        System.assertEquals(tripResponseEndCoordinates1.hashCode(), tripResponseEndCoordinates2.hashCode());
        System.assertEquals(tripResponseEndCoordinates3.hashCode(), tripResponseEndCoordinates4.hashCode());
    }
}
