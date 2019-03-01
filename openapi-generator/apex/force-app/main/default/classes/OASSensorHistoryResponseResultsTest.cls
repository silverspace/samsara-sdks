@isTest
private class OASSensorHistoryResponseResultsTest {
    @isTest
    private static void equalsSameInstance() {
        OASSensorHistoryResponseResults sensorHistoryResponseResults1 = OASSensorHistoryResponseResults.getExample();
        OASSensorHistoryResponseResults sensorHistoryResponseResults2 = sensorHistoryResponseResults1;
        OASSensorHistoryResponseResults sensorHistoryResponseResults3 = new OASSensorHistoryResponseResults();
        OASSensorHistoryResponseResults sensorHistoryResponseResults4 = sensorHistoryResponseResults3;

        System.assert(sensorHistoryResponseResults1.equals(sensorHistoryResponseResults2));
        System.assert(sensorHistoryResponseResults2.equals(sensorHistoryResponseResults1));
        System.assert(sensorHistoryResponseResults1.equals(sensorHistoryResponseResults1));
        System.assert(sensorHistoryResponseResults3.equals(sensorHistoryResponseResults4));
        System.assert(sensorHistoryResponseResults4.equals(sensorHistoryResponseResults3));
        System.assert(sensorHistoryResponseResults3.equals(sensorHistoryResponseResults3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSensorHistoryResponseResults sensorHistoryResponseResults1 = OASSensorHistoryResponseResults.getExample();
        OASSensorHistoryResponseResults sensorHistoryResponseResults2 = OASSensorHistoryResponseResults.getExample();
        OASSensorHistoryResponseResults sensorHistoryResponseResults3 = new OASSensorHistoryResponseResults();
        OASSensorHistoryResponseResults sensorHistoryResponseResults4 = new OASSensorHistoryResponseResults();

        System.assert(sensorHistoryResponseResults1.equals(sensorHistoryResponseResults2));
        System.assert(sensorHistoryResponseResults2.equals(sensorHistoryResponseResults1));
        System.assert(sensorHistoryResponseResults3.equals(sensorHistoryResponseResults4));
        System.assert(sensorHistoryResponseResults4.equals(sensorHistoryResponseResults3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSensorHistoryResponseResults sensorHistoryResponseResults1 = OASSensorHistoryResponseResults.getExample();
        OASSensorHistoryResponseResults sensorHistoryResponseResults2 = new OASSensorHistoryResponseResults();

        System.assertEquals(false, sensorHistoryResponseResults1.equals('foo'));
        System.assertEquals(false, sensorHistoryResponseResults2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSensorHistoryResponseResults sensorHistoryResponseResults1 = OASSensorHistoryResponseResults.getExample();
        OASSensorHistoryResponseResults sensorHistoryResponseResults2 = new OASSensorHistoryResponseResults();
        OASSensorHistoryResponseResults sensorHistoryResponseResults3;

        System.assertEquals(false, sensorHistoryResponseResults1.equals(sensorHistoryResponseResults3));
        System.assertEquals(false, sensorHistoryResponseResults2.equals(sensorHistoryResponseResults3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSensorHistoryResponseResults sensorHistoryResponseResults1 = OASSensorHistoryResponseResults.getExample();
        OASSensorHistoryResponseResults sensorHistoryResponseResults2 = new OASSensorHistoryResponseResults();

        System.assertEquals(sensorHistoryResponseResults1.hashCode(), sensorHistoryResponseResults1.hashCode());
        System.assertEquals(sensorHistoryResponseResults2.hashCode(), sensorHistoryResponseResults2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSensorHistoryResponseResults sensorHistoryResponseResults1 = OASSensorHistoryResponseResults.getExample();
        OASSensorHistoryResponseResults sensorHistoryResponseResults2 = OASSensorHistoryResponseResults.getExample();
        OASSensorHistoryResponseResults sensorHistoryResponseResults3 = new OASSensorHistoryResponseResults();
        OASSensorHistoryResponseResults sensorHistoryResponseResults4 = new OASSensorHistoryResponseResults();

        System.assert(sensorHistoryResponseResults1.equals(sensorHistoryResponseResults2));
        System.assert(sensorHistoryResponseResults3.equals(sensorHistoryResponseResults4));
        System.assertEquals(sensorHistoryResponseResults1.hashCode(), sensorHistoryResponseResults2.hashCode());
        System.assertEquals(sensorHistoryResponseResults3.hashCode(), sensorHistoryResponseResults4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSensorHistoryResponseResults sensorHistoryResponseResults = new OASSensorHistoryResponseResults();
        System.assertEquals(new List<Long>(), sensorHistoryResponseResults.series);
        System.assertEquals(null, sensorHistoryResponseResults.timeMs);
    }
}
