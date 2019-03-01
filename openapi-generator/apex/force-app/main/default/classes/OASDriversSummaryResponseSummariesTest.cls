@isTest
private class OASDriversSummaryResponseSummariesTest {
    @isTest
    private static void equalsSameInstance() {
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries1 = OASDriversSummaryResponseSummaries.getExample();
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries2 = driversSummaryResponseSummaries1;
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries3 = new OASDriversSummaryResponseSummaries();
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries4 = driversSummaryResponseSummaries3;

        System.assert(driversSummaryResponseSummaries1.equals(driversSummaryResponseSummaries2));
        System.assert(driversSummaryResponseSummaries2.equals(driversSummaryResponseSummaries1));
        System.assert(driversSummaryResponseSummaries1.equals(driversSummaryResponseSummaries1));
        System.assert(driversSummaryResponseSummaries3.equals(driversSummaryResponseSummaries4));
        System.assert(driversSummaryResponseSummaries4.equals(driversSummaryResponseSummaries3));
        System.assert(driversSummaryResponseSummaries3.equals(driversSummaryResponseSummaries3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries1 = OASDriversSummaryResponseSummaries.getExample();
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries2 = OASDriversSummaryResponseSummaries.getExample();
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries3 = new OASDriversSummaryResponseSummaries();
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries4 = new OASDriversSummaryResponseSummaries();

        System.assert(driversSummaryResponseSummaries1.equals(driversSummaryResponseSummaries2));
        System.assert(driversSummaryResponseSummaries2.equals(driversSummaryResponseSummaries1));
        System.assert(driversSummaryResponseSummaries3.equals(driversSummaryResponseSummaries4));
        System.assert(driversSummaryResponseSummaries4.equals(driversSummaryResponseSummaries3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries1 = OASDriversSummaryResponseSummaries.getExample();
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries2 = new OASDriversSummaryResponseSummaries();

        System.assertEquals(false, driversSummaryResponseSummaries1.equals('foo'));
        System.assertEquals(false, driversSummaryResponseSummaries2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries1 = OASDriversSummaryResponseSummaries.getExample();
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries2 = new OASDriversSummaryResponseSummaries();
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries3;

        System.assertEquals(false, driversSummaryResponseSummaries1.equals(driversSummaryResponseSummaries3));
        System.assertEquals(false, driversSummaryResponseSummaries2.equals(driversSummaryResponseSummaries3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries1 = OASDriversSummaryResponseSummaries.getExample();
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries2 = new OASDriversSummaryResponseSummaries();

        System.assertEquals(driversSummaryResponseSummaries1.hashCode(), driversSummaryResponseSummaries1.hashCode());
        System.assertEquals(driversSummaryResponseSummaries2.hashCode(), driversSummaryResponseSummaries2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries1 = OASDriversSummaryResponseSummaries.getExample();
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries2 = OASDriversSummaryResponseSummaries.getExample();
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries3 = new OASDriversSummaryResponseSummaries();
        OASDriversSummaryResponseSummaries driversSummaryResponseSummaries4 = new OASDriversSummaryResponseSummaries();

        System.assert(driversSummaryResponseSummaries1.equals(driversSummaryResponseSummaries2));
        System.assert(driversSummaryResponseSummaries3.equals(driversSummaryResponseSummaries4));
        System.assertEquals(driversSummaryResponseSummaries1.hashCode(), driversSummaryResponseSummaries2.hashCode());
        System.assertEquals(driversSummaryResponseSummaries3.hashCode(), driversSummaryResponseSummaries4.hashCode());
    }
}
