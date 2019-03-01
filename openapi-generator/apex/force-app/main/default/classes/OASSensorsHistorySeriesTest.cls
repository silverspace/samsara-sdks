@isTest
private class OASSensorsHistorySeriesTest {
    @isTest
    private static void equalsSameInstance() {
        OASSensorsHistorySeries sensorsHistorySeries1 = OASSensorsHistorySeries.getExample();
        OASSensorsHistorySeries sensorsHistorySeries2 = sensorsHistorySeries1;
        OASSensorsHistorySeries sensorsHistorySeries3 = new OASSensorsHistorySeries();
        OASSensorsHistorySeries sensorsHistorySeries4 = sensorsHistorySeries3;

        System.assert(sensorsHistorySeries1.equals(sensorsHistorySeries2));
        System.assert(sensorsHistorySeries2.equals(sensorsHistorySeries1));
        System.assert(sensorsHistorySeries1.equals(sensorsHistorySeries1));
        System.assert(sensorsHistorySeries3.equals(sensorsHistorySeries4));
        System.assert(sensorsHistorySeries4.equals(sensorsHistorySeries3));
        System.assert(sensorsHistorySeries3.equals(sensorsHistorySeries3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSensorsHistorySeries sensorsHistorySeries1 = OASSensorsHistorySeries.getExample();
        OASSensorsHistorySeries sensorsHistorySeries2 = OASSensorsHistorySeries.getExample();
        OASSensorsHistorySeries sensorsHistorySeries3 = new OASSensorsHistorySeries();
        OASSensorsHistorySeries sensorsHistorySeries4 = new OASSensorsHistorySeries();

        System.assert(sensorsHistorySeries1.equals(sensorsHistorySeries2));
        System.assert(sensorsHistorySeries2.equals(sensorsHistorySeries1));
        System.assert(sensorsHistorySeries3.equals(sensorsHistorySeries4));
        System.assert(sensorsHistorySeries4.equals(sensorsHistorySeries3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSensorsHistorySeries sensorsHistorySeries1 = OASSensorsHistorySeries.getExample();
        OASSensorsHistorySeries sensorsHistorySeries2 = new OASSensorsHistorySeries();

        System.assertEquals(false, sensorsHistorySeries1.equals('foo'));
        System.assertEquals(false, sensorsHistorySeries2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSensorsHistorySeries sensorsHistorySeries1 = OASSensorsHistorySeries.getExample();
        OASSensorsHistorySeries sensorsHistorySeries2 = new OASSensorsHistorySeries();
        OASSensorsHistorySeries sensorsHistorySeries3;

        System.assertEquals(false, sensorsHistorySeries1.equals(sensorsHistorySeries3));
        System.assertEquals(false, sensorsHistorySeries2.equals(sensorsHistorySeries3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSensorsHistorySeries sensorsHistorySeries1 = OASSensorsHistorySeries.getExample();
        OASSensorsHistorySeries sensorsHistorySeries2 = new OASSensorsHistorySeries();

        System.assertEquals(sensorsHistorySeries1.hashCode(), sensorsHistorySeries1.hashCode());
        System.assertEquals(sensorsHistorySeries2.hashCode(), sensorsHistorySeries2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSensorsHistorySeries sensorsHistorySeries1 = OASSensorsHistorySeries.getExample();
        OASSensorsHistorySeries sensorsHistorySeries2 = OASSensorsHistorySeries.getExample();
        OASSensorsHistorySeries sensorsHistorySeries3 = new OASSensorsHistorySeries();
        OASSensorsHistorySeries sensorsHistorySeries4 = new OASSensorsHistorySeries();

        System.assert(sensorsHistorySeries1.equals(sensorsHistorySeries2));
        System.assert(sensorsHistorySeries3.equals(sensorsHistorySeries4));
        System.assertEquals(sensorsHistorySeries1.hashCode(), sensorsHistorySeries2.hashCode());
        System.assertEquals(sensorsHistorySeries3.hashCode(), sensorsHistorySeries4.hashCode());
    }
}
