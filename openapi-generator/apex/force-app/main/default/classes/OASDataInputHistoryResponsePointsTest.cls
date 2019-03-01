@isTest
private class OASDataInputHistoryResponsePointsTest {
    @isTest
    private static void equalsSameInstance() {
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints1 = OASDataInputHistoryResponsePoints.getExample();
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints2 = dataInputHistoryResponsePoints1;
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints3 = new OASDataInputHistoryResponsePoints();
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints4 = dataInputHistoryResponsePoints3;

        System.assert(dataInputHistoryResponsePoints1.equals(dataInputHistoryResponsePoints2));
        System.assert(dataInputHistoryResponsePoints2.equals(dataInputHistoryResponsePoints1));
        System.assert(dataInputHistoryResponsePoints1.equals(dataInputHistoryResponsePoints1));
        System.assert(dataInputHistoryResponsePoints3.equals(dataInputHistoryResponsePoints4));
        System.assert(dataInputHistoryResponsePoints4.equals(dataInputHistoryResponsePoints3));
        System.assert(dataInputHistoryResponsePoints3.equals(dataInputHistoryResponsePoints3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints1 = OASDataInputHistoryResponsePoints.getExample();
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints2 = OASDataInputHistoryResponsePoints.getExample();
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints3 = new OASDataInputHistoryResponsePoints();
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints4 = new OASDataInputHistoryResponsePoints();

        System.assert(dataInputHistoryResponsePoints1.equals(dataInputHistoryResponsePoints2));
        System.assert(dataInputHistoryResponsePoints2.equals(dataInputHistoryResponsePoints1));
        System.assert(dataInputHistoryResponsePoints3.equals(dataInputHistoryResponsePoints4));
        System.assert(dataInputHistoryResponsePoints4.equals(dataInputHistoryResponsePoints3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints1 = OASDataInputHistoryResponsePoints.getExample();
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints2 = new OASDataInputHistoryResponsePoints();

        System.assertEquals(false, dataInputHistoryResponsePoints1.equals('foo'));
        System.assertEquals(false, dataInputHistoryResponsePoints2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints1 = OASDataInputHistoryResponsePoints.getExample();
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints2 = new OASDataInputHistoryResponsePoints();
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints3;

        System.assertEquals(false, dataInputHistoryResponsePoints1.equals(dataInputHistoryResponsePoints3));
        System.assertEquals(false, dataInputHistoryResponsePoints2.equals(dataInputHistoryResponsePoints3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints1 = OASDataInputHistoryResponsePoints.getExample();
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints2 = new OASDataInputHistoryResponsePoints();

        System.assertEquals(dataInputHistoryResponsePoints1.hashCode(), dataInputHistoryResponsePoints1.hashCode());
        System.assertEquals(dataInputHistoryResponsePoints2.hashCode(), dataInputHistoryResponsePoints2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints1 = OASDataInputHistoryResponsePoints.getExample();
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints2 = OASDataInputHistoryResponsePoints.getExample();
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints3 = new OASDataInputHistoryResponsePoints();
        OASDataInputHistoryResponsePoints dataInputHistoryResponsePoints4 = new OASDataInputHistoryResponsePoints();

        System.assert(dataInputHistoryResponsePoints1.equals(dataInputHistoryResponsePoints2));
        System.assert(dataInputHistoryResponsePoints3.equals(dataInputHistoryResponsePoints4));
        System.assertEquals(dataInputHistoryResponsePoints1.hashCode(), dataInputHistoryResponsePoints2.hashCode());
        System.assertEquals(dataInputHistoryResponsePoints3.hashCode(), dataInputHistoryResponsePoints4.hashCode());
    }
}
