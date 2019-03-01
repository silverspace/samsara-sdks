@isTest
private class OASDispatchRouteHistoryTest {
    @isTest
    private static void equalsSameInstance() {
        OASDispatchRouteHistory dispatchRouteHistory1 = OASDispatchRouteHistory.getExample();
        OASDispatchRouteHistory dispatchRouteHistory2 = dispatchRouteHistory1;
        OASDispatchRouteHistory dispatchRouteHistory3 = new OASDispatchRouteHistory();
        OASDispatchRouteHistory dispatchRouteHistory4 = dispatchRouteHistory3;

        System.assert(dispatchRouteHistory1.equals(dispatchRouteHistory2));
        System.assert(dispatchRouteHistory2.equals(dispatchRouteHistory1));
        System.assert(dispatchRouteHistory1.equals(dispatchRouteHistory1));
        System.assert(dispatchRouteHistory3.equals(dispatchRouteHistory4));
        System.assert(dispatchRouteHistory4.equals(dispatchRouteHistory3));
        System.assert(dispatchRouteHistory3.equals(dispatchRouteHistory3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDispatchRouteHistory dispatchRouteHistory1 = OASDispatchRouteHistory.getExample();
        OASDispatchRouteHistory dispatchRouteHistory2 = OASDispatchRouteHistory.getExample();
        OASDispatchRouteHistory dispatchRouteHistory3 = new OASDispatchRouteHistory();
        OASDispatchRouteHistory dispatchRouteHistory4 = new OASDispatchRouteHistory();

        System.assert(dispatchRouteHistory1.equals(dispatchRouteHistory2));
        System.assert(dispatchRouteHistory2.equals(dispatchRouteHistory1));
        System.assert(dispatchRouteHistory3.equals(dispatchRouteHistory4));
        System.assert(dispatchRouteHistory4.equals(dispatchRouteHistory3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDispatchRouteHistory dispatchRouteHistory1 = OASDispatchRouteHistory.getExample();
        OASDispatchRouteHistory dispatchRouteHistory2 = new OASDispatchRouteHistory();

        System.assertEquals(false, dispatchRouteHistory1.equals('foo'));
        System.assertEquals(false, dispatchRouteHistory2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDispatchRouteHistory dispatchRouteHistory1 = OASDispatchRouteHistory.getExample();
        OASDispatchRouteHistory dispatchRouteHistory2 = new OASDispatchRouteHistory();
        OASDispatchRouteHistory dispatchRouteHistory3;

        System.assertEquals(false, dispatchRouteHistory1.equals(dispatchRouteHistory3));
        System.assertEquals(false, dispatchRouteHistory2.equals(dispatchRouteHistory3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDispatchRouteHistory dispatchRouteHistory1 = OASDispatchRouteHistory.getExample();
        OASDispatchRouteHistory dispatchRouteHistory2 = new OASDispatchRouteHistory();

        System.assertEquals(dispatchRouteHistory1.hashCode(), dispatchRouteHistory1.hashCode());
        System.assertEquals(dispatchRouteHistory2.hashCode(), dispatchRouteHistory2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDispatchRouteHistory dispatchRouteHistory1 = OASDispatchRouteHistory.getExample();
        OASDispatchRouteHistory dispatchRouteHistory2 = OASDispatchRouteHistory.getExample();
        OASDispatchRouteHistory dispatchRouteHistory3 = new OASDispatchRouteHistory();
        OASDispatchRouteHistory dispatchRouteHistory4 = new OASDispatchRouteHistory();

        System.assert(dispatchRouteHistory1.equals(dispatchRouteHistory2));
        System.assert(dispatchRouteHistory3.equals(dispatchRouteHistory4));
        System.assertEquals(dispatchRouteHistory1.hashCode(), dispatchRouteHistory2.hashCode());
        System.assertEquals(dispatchRouteHistory3.hashCode(), dispatchRouteHistory4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDispatchRouteHistory dispatchRouteHistory = new OASDispatchRouteHistory();
        System.assertEquals(new List<OASDispatchRouteHistoricalEntry>(), dispatchRouteHistory.history);
    }
}
