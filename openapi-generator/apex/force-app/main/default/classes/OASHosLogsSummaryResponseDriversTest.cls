@isTest
private class OASHosLogsSummaryResponseDriversTest {
    @isTest
    private static void equalsSameInstance() {
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers1 = OASHosLogsSummaryResponseDrivers.getExample();
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers2 = hosLogsSummaryResponseDrivers1;
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers3 = new OASHosLogsSummaryResponseDrivers();
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers4 = hosLogsSummaryResponseDrivers3;

        System.assert(hosLogsSummaryResponseDrivers1.equals(hosLogsSummaryResponseDrivers2));
        System.assert(hosLogsSummaryResponseDrivers2.equals(hosLogsSummaryResponseDrivers1));
        System.assert(hosLogsSummaryResponseDrivers1.equals(hosLogsSummaryResponseDrivers1));
        System.assert(hosLogsSummaryResponseDrivers3.equals(hosLogsSummaryResponseDrivers4));
        System.assert(hosLogsSummaryResponseDrivers4.equals(hosLogsSummaryResponseDrivers3));
        System.assert(hosLogsSummaryResponseDrivers3.equals(hosLogsSummaryResponseDrivers3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers1 = OASHosLogsSummaryResponseDrivers.getExample();
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers2 = OASHosLogsSummaryResponseDrivers.getExample();
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers3 = new OASHosLogsSummaryResponseDrivers();
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers4 = new OASHosLogsSummaryResponseDrivers();

        System.assert(hosLogsSummaryResponseDrivers1.equals(hosLogsSummaryResponseDrivers2));
        System.assert(hosLogsSummaryResponseDrivers2.equals(hosLogsSummaryResponseDrivers1));
        System.assert(hosLogsSummaryResponseDrivers3.equals(hosLogsSummaryResponseDrivers4));
        System.assert(hosLogsSummaryResponseDrivers4.equals(hosLogsSummaryResponseDrivers3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers1 = OASHosLogsSummaryResponseDrivers.getExample();
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers2 = new OASHosLogsSummaryResponseDrivers();

        System.assertEquals(false, hosLogsSummaryResponseDrivers1.equals('foo'));
        System.assertEquals(false, hosLogsSummaryResponseDrivers2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers1 = OASHosLogsSummaryResponseDrivers.getExample();
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers2 = new OASHosLogsSummaryResponseDrivers();
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers3;

        System.assertEquals(false, hosLogsSummaryResponseDrivers1.equals(hosLogsSummaryResponseDrivers3));
        System.assertEquals(false, hosLogsSummaryResponseDrivers2.equals(hosLogsSummaryResponseDrivers3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers1 = OASHosLogsSummaryResponseDrivers.getExample();
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers2 = new OASHosLogsSummaryResponseDrivers();

        System.assertEquals(hosLogsSummaryResponseDrivers1.hashCode(), hosLogsSummaryResponseDrivers1.hashCode());
        System.assertEquals(hosLogsSummaryResponseDrivers2.hashCode(), hosLogsSummaryResponseDrivers2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers1 = OASHosLogsSummaryResponseDrivers.getExample();
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers2 = OASHosLogsSummaryResponseDrivers.getExample();
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers3 = new OASHosLogsSummaryResponseDrivers();
        OASHosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers4 = new OASHosLogsSummaryResponseDrivers();

        System.assert(hosLogsSummaryResponseDrivers1.equals(hosLogsSummaryResponseDrivers2));
        System.assert(hosLogsSummaryResponseDrivers3.equals(hosLogsSummaryResponseDrivers4));
        System.assertEquals(hosLogsSummaryResponseDrivers1.hashCode(), hosLogsSummaryResponseDrivers2.hashCode());
        System.assertEquals(hosLogsSummaryResponseDrivers3.hashCode(), hosLogsSummaryResponseDrivers4.hashCode());
    }
}
