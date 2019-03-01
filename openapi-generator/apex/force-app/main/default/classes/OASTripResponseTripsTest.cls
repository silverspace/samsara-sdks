@isTest
private class OASTripResponseTripsTest {
    @isTest
    private static void equalsSameInstance() {
        OASTripResponseTrips tripResponseTrips1 = OASTripResponseTrips.getExample();
        OASTripResponseTrips tripResponseTrips2 = tripResponseTrips1;
        OASTripResponseTrips tripResponseTrips3 = new OASTripResponseTrips();
        OASTripResponseTrips tripResponseTrips4 = tripResponseTrips3;

        System.assert(tripResponseTrips1.equals(tripResponseTrips2));
        System.assert(tripResponseTrips2.equals(tripResponseTrips1));
        System.assert(tripResponseTrips1.equals(tripResponseTrips1));
        System.assert(tripResponseTrips3.equals(tripResponseTrips4));
        System.assert(tripResponseTrips4.equals(tripResponseTrips3));
        System.assert(tripResponseTrips3.equals(tripResponseTrips3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTripResponseTrips tripResponseTrips1 = OASTripResponseTrips.getExample();
        OASTripResponseTrips tripResponseTrips2 = OASTripResponseTrips.getExample();
        OASTripResponseTrips tripResponseTrips3 = new OASTripResponseTrips();
        OASTripResponseTrips tripResponseTrips4 = new OASTripResponseTrips();

        System.assert(tripResponseTrips1.equals(tripResponseTrips2));
        System.assert(tripResponseTrips2.equals(tripResponseTrips1));
        System.assert(tripResponseTrips3.equals(tripResponseTrips4));
        System.assert(tripResponseTrips4.equals(tripResponseTrips3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTripResponseTrips tripResponseTrips1 = OASTripResponseTrips.getExample();
        OASTripResponseTrips tripResponseTrips2 = new OASTripResponseTrips();

        System.assertEquals(false, tripResponseTrips1.equals('foo'));
        System.assertEquals(false, tripResponseTrips2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTripResponseTrips tripResponseTrips1 = OASTripResponseTrips.getExample();
        OASTripResponseTrips tripResponseTrips2 = new OASTripResponseTrips();
        OASTripResponseTrips tripResponseTrips3;

        System.assertEquals(false, tripResponseTrips1.equals(tripResponseTrips3));
        System.assertEquals(false, tripResponseTrips2.equals(tripResponseTrips3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTripResponseTrips tripResponseTrips1 = OASTripResponseTrips.getExample();
        OASTripResponseTrips tripResponseTrips2 = new OASTripResponseTrips();

        System.assertEquals(tripResponseTrips1.hashCode(), tripResponseTrips1.hashCode());
        System.assertEquals(tripResponseTrips2.hashCode(), tripResponseTrips2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTripResponseTrips tripResponseTrips1 = OASTripResponseTrips.getExample();
        OASTripResponseTrips tripResponseTrips2 = OASTripResponseTrips.getExample();
        OASTripResponseTrips tripResponseTrips3 = new OASTripResponseTrips();
        OASTripResponseTrips tripResponseTrips4 = new OASTripResponseTrips();

        System.assert(tripResponseTrips1.equals(tripResponseTrips2));
        System.assert(tripResponseTrips3.equals(tripResponseTrips4));
        System.assertEquals(tripResponseTrips1.hashCode(), tripResponseTrips2.hashCode());
        System.assertEquals(tripResponseTrips3.hashCode(), tripResponseTrips4.hashCode());
    }
}
