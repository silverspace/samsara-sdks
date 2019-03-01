@isTest
private class OASTripResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTripResponse tripResponse1 = OASTripResponse.getExample();
        OASTripResponse tripResponse2 = tripResponse1;
        OASTripResponse tripResponse3 = new OASTripResponse();
        OASTripResponse tripResponse4 = tripResponse3;

        System.assert(tripResponse1.equals(tripResponse2));
        System.assert(tripResponse2.equals(tripResponse1));
        System.assert(tripResponse1.equals(tripResponse1));
        System.assert(tripResponse3.equals(tripResponse4));
        System.assert(tripResponse4.equals(tripResponse3));
        System.assert(tripResponse3.equals(tripResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTripResponse tripResponse1 = OASTripResponse.getExample();
        OASTripResponse tripResponse2 = OASTripResponse.getExample();
        OASTripResponse tripResponse3 = new OASTripResponse();
        OASTripResponse tripResponse4 = new OASTripResponse();

        System.assert(tripResponse1.equals(tripResponse2));
        System.assert(tripResponse2.equals(tripResponse1));
        System.assert(tripResponse3.equals(tripResponse4));
        System.assert(tripResponse4.equals(tripResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTripResponse tripResponse1 = OASTripResponse.getExample();
        OASTripResponse tripResponse2 = new OASTripResponse();

        System.assertEquals(false, tripResponse1.equals('foo'));
        System.assertEquals(false, tripResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTripResponse tripResponse1 = OASTripResponse.getExample();
        OASTripResponse tripResponse2 = new OASTripResponse();
        OASTripResponse tripResponse3;

        System.assertEquals(false, tripResponse1.equals(tripResponse3));
        System.assertEquals(false, tripResponse2.equals(tripResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTripResponse tripResponse1 = OASTripResponse.getExample();
        OASTripResponse tripResponse2 = new OASTripResponse();

        System.assertEquals(tripResponse1.hashCode(), tripResponse1.hashCode());
        System.assertEquals(tripResponse2.hashCode(), tripResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTripResponse tripResponse1 = OASTripResponse.getExample();
        OASTripResponse tripResponse2 = OASTripResponse.getExample();
        OASTripResponse tripResponse3 = new OASTripResponse();
        OASTripResponse tripResponse4 = new OASTripResponse();

        System.assert(tripResponse1.equals(tripResponse2));
        System.assert(tripResponse3.equals(tripResponse4));
        System.assertEquals(tripResponse1.hashCode(), tripResponse2.hashCode());
        System.assertEquals(tripResponse3.hashCode(), tripResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTripResponse tripResponse = new OASTripResponse();
        System.assertEquals(new List<OASTripResponseTrips>(), tripResponse.trips);
    }
}
