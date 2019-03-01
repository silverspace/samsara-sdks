@isTest
private class OASDispatchRouteHistoricalEntryTest {
    @isTest
    private static void equalsSameInstance() {
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry1 = OASDispatchRouteHistoricalEntry.getExample();
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry2 = dispatchRouteHistoricalEntry1;
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry3 = new OASDispatchRouteHistoricalEntry();
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry4 = dispatchRouteHistoricalEntry3;

        System.assert(dispatchRouteHistoricalEntry1.equals(dispatchRouteHistoricalEntry2));
        System.assert(dispatchRouteHistoricalEntry2.equals(dispatchRouteHistoricalEntry1));
        System.assert(dispatchRouteHistoricalEntry1.equals(dispatchRouteHistoricalEntry1));
        System.assert(dispatchRouteHistoricalEntry3.equals(dispatchRouteHistoricalEntry4));
        System.assert(dispatchRouteHistoricalEntry4.equals(dispatchRouteHistoricalEntry3));
        System.assert(dispatchRouteHistoricalEntry3.equals(dispatchRouteHistoricalEntry3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry1 = OASDispatchRouteHistoricalEntry.getExample();
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry2 = OASDispatchRouteHistoricalEntry.getExample();
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry3 = new OASDispatchRouteHistoricalEntry();
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry4 = new OASDispatchRouteHistoricalEntry();

        System.assert(dispatchRouteHistoricalEntry1.equals(dispatchRouteHistoricalEntry2));
        System.assert(dispatchRouteHistoricalEntry2.equals(dispatchRouteHistoricalEntry1));
        System.assert(dispatchRouteHistoricalEntry3.equals(dispatchRouteHistoricalEntry4));
        System.assert(dispatchRouteHistoricalEntry4.equals(dispatchRouteHistoricalEntry3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry1 = OASDispatchRouteHistoricalEntry.getExample();
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry2 = new OASDispatchRouteHistoricalEntry();

        System.assertEquals(false, dispatchRouteHistoricalEntry1.equals('foo'));
        System.assertEquals(false, dispatchRouteHistoricalEntry2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry1 = OASDispatchRouteHistoricalEntry.getExample();
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry2 = new OASDispatchRouteHistoricalEntry();
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry3;

        System.assertEquals(false, dispatchRouteHistoricalEntry1.equals(dispatchRouteHistoricalEntry3));
        System.assertEquals(false, dispatchRouteHistoricalEntry2.equals(dispatchRouteHistoricalEntry3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry1 = OASDispatchRouteHistoricalEntry.getExample();
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry2 = new OASDispatchRouteHistoricalEntry();

        System.assertEquals(dispatchRouteHistoricalEntry1.hashCode(), dispatchRouteHistoricalEntry1.hashCode());
        System.assertEquals(dispatchRouteHistoricalEntry2.hashCode(), dispatchRouteHistoricalEntry2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry1 = OASDispatchRouteHistoricalEntry.getExample();
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry2 = OASDispatchRouteHistoricalEntry.getExample();
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry3 = new OASDispatchRouteHistoricalEntry();
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry4 = new OASDispatchRouteHistoricalEntry();

        System.assert(dispatchRouteHistoricalEntry1.equals(dispatchRouteHistoricalEntry2));
        System.assert(dispatchRouteHistoricalEntry3.equals(dispatchRouteHistoricalEntry4));
        System.assertEquals(dispatchRouteHistoricalEntry1.hashCode(), dispatchRouteHistoricalEntry2.hashCode());
        System.assertEquals(dispatchRouteHistoricalEntry3.hashCode(), dispatchRouteHistoricalEntry4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDispatchRouteHistoricalEntry dispatchRouteHistoricalEntry = new OASDispatchRouteHistoricalEntry();
        Map<String, String> propertyMappings = dispatchRouteHistoricalEntry.getPropertyMappings();
        System.assertEquals('changedAtMs', propertyMappings.get('changed_at_ms'));
    }
}
