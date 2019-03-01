@isTest
private class OASTripResponseStartCoordinatesTest {
    @isTest
    private static void equalsSameInstance() {
        OASTripResponseStartCoordinates tripResponseStartCoordinates1 = OASTripResponseStartCoordinates.getExample();
        OASTripResponseStartCoordinates tripResponseStartCoordinates2 = tripResponseStartCoordinates1;
        OASTripResponseStartCoordinates tripResponseStartCoordinates3 = new OASTripResponseStartCoordinates();
        OASTripResponseStartCoordinates tripResponseStartCoordinates4 = tripResponseStartCoordinates3;

        System.assert(tripResponseStartCoordinates1.equals(tripResponseStartCoordinates2));
        System.assert(tripResponseStartCoordinates2.equals(tripResponseStartCoordinates1));
        System.assert(tripResponseStartCoordinates1.equals(tripResponseStartCoordinates1));
        System.assert(tripResponseStartCoordinates3.equals(tripResponseStartCoordinates4));
        System.assert(tripResponseStartCoordinates4.equals(tripResponseStartCoordinates3));
        System.assert(tripResponseStartCoordinates3.equals(tripResponseStartCoordinates3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTripResponseStartCoordinates tripResponseStartCoordinates1 = OASTripResponseStartCoordinates.getExample();
        OASTripResponseStartCoordinates tripResponseStartCoordinates2 = OASTripResponseStartCoordinates.getExample();
        OASTripResponseStartCoordinates tripResponseStartCoordinates3 = new OASTripResponseStartCoordinates();
        OASTripResponseStartCoordinates tripResponseStartCoordinates4 = new OASTripResponseStartCoordinates();

        System.assert(tripResponseStartCoordinates1.equals(tripResponseStartCoordinates2));
        System.assert(tripResponseStartCoordinates2.equals(tripResponseStartCoordinates1));
        System.assert(tripResponseStartCoordinates3.equals(tripResponseStartCoordinates4));
        System.assert(tripResponseStartCoordinates4.equals(tripResponseStartCoordinates3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTripResponseStartCoordinates tripResponseStartCoordinates1 = OASTripResponseStartCoordinates.getExample();
        OASTripResponseStartCoordinates tripResponseStartCoordinates2 = new OASTripResponseStartCoordinates();

        System.assertEquals(false, tripResponseStartCoordinates1.equals('foo'));
        System.assertEquals(false, tripResponseStartCoordinates2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTripResponseStartCoordinates tripResponseStartCoordinates1 = OASTripResponseStartCoordinates.getExample();
        OASTripResponseStartCoordinates tripResponseStartCoordinates2 = new OASTripResponseStartCoordinates();
        OASTripResponseStartCoordinates tripResponseStartCoordinates3;

        System.assertEquals(false, tripResponseStartCoordinates1.equals(tripResponseStartCoordinates3));
        System.assertEquals(false, tripResponseStartCoordinates2.equals(tripResponseStartCoordinates3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTripResponseStartCoordinates tripResponseStartCoordinates1 = OASTripResponseStartCoordinates.getExample();
        OASTripResponseStartCoordinates tripResponseStartCoordinates2 = new OASTripResponseStartCoordinates();

        System.assertEquals(tripResponseStartCoordinates1.hashCode(), tripResponseStartCoordinates1.hashCode());
        System.assertEquals(tripResponseStartCoordinates2.hashCode(), tripResponseStartCoordinates2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTripResponseStartCoordinates tripResponseStartCoordinates1 = OASTripResponseStartCoordinates.getExample();
        OASTripResponseStartCoordinates tripResponseStartCoordinates2 = OASTripResponseStartCoordinates.getExample();
        OASTripResponseStartCoordinates tripResponseStartCoordinates3 = new OASTripResponseStartCoordinates();
        OASTripResponseStartCoordinates tripResponseStartCoordinates4 = new OASTripResponseStartCoordinates();

        System.assert(tripResponseStartCoordinates1.equals(tripResponseStartCoordinates2));
        System.assert(tripResponseStartCoordinates3.equals(tripResponseStartCoordinates4));
        System.assertEquals(tripResponseStartCoordinates1.hashCode(), tripResponseStartCoordinates2.hashCode());
        System.assertEquals(tripResponseStartCoordinates3.hashCode(), tripResponseStartCoordinates4.hashCode());
    }
}
