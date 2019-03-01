@isTest
private class OASDispatchRouteTest {
    @isTest
    private static void equalsSameInstance() {
        OASDispatchRoute dispatchRoute1 = OASDispatchRoute.getExample();
        OASDispatchRoute dispatchRoute2 = dispatchRoute1;
        OASDispatchRoute dispatchRoute3 = new OASDispatchRoute();
        OASDispatchRoute dispatchRoute4 = dispatchRoute3;

        System.assert(dispatchRoute1.equals(dispatchRoute2));
        System.assert(dispatchRoute2.equals(dispatchRoute1));
        System.assert(dispatchRoute1.equals(dispatchRoute1));
        System.assert(dispatchRoute3.equals(dispatchRoute4));
        System.assert(dispatchRoute4.equals(dispatchRoute3));
        System.assert(dispatchRoute3.equals(dispatchRoute3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDispatchRoute dispatchRoute1 = OASDispatchRoute.getExample();
        OASDispatchRoute dispatchRoute2 = OASDispatchRoute.getExample();
        OASDispatchRoute dispatchRoute3 = new OASDispatchRoute();
        OASDispatchRoute dispatchRoute4 = new OASDispatchRoute();

        System.assert(dispatchRoute1.equals(dispatchRoute2));
        System.assert(dispatchRoute2.equals(dispatchRoute1));
        System.assert(dispatchRoute3.equals(dispatchRoute4));
        System.assert(dispatchRoute4.equals(dispatchRoute3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDispatchRoute dispatchRoute1 = OASDispatchRoute.getExample();
        OASDispatchRoute dispatchRoute2 = new OASDispatchRoute();

        System.assertEquals(false, dispatchRoute1.equals('foo'));
        System.assertEquals(false, dispatchRoute2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDispatchRoute dispatchRoute1 = OASDispatchRoute.getExample();
        OASDispatchRoute dispatchRoute2 = new OASDispatchRoute();
        OASDispatchRoute dispatchRoute3;

        System.assertEquals(false, dispatchRoute1.equals(dispatchRoute3));
        System.assertEquals(false, dispatchRoute2.equals(dispatchRoute3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDispatchRoute dispatchRoute1 = OASDispatchRoute.getExample();
        OASDispatchRoute dispatchRoute2 = new OASDispatchRoute();

        System.assertEquals(dispatchRoute1.hashCode(), dispatchRoute1.hashCode());
        System.assertEquals(dispatchRoute2.hashCode(), dispatchRoute2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDispatchRoute dispatchRoute1 = OASDispatchRoute.getExample();
        OASDispatchRoute dispatchRoute2 = OASDispatchRoute.getExample();
        OASDispatchRoute dispatchRoute3 = new OASDispatchRoute();
        OASDispatchRoute dispatchRoute4 = new OASDispatchRoute();

        System.assert(dispatchRoute1.equals(dispatchRoute2));
        System.assert(dispatchRoute3.equals(dispatchRoute4));
        System.assertEquals(dispatchRoute1.hashCode(), dispatchRoute2.hashCode());
        System.assertEquals(dispatchRoute3.hashCode(), dispatchRoute4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDispatchRoute dispatchRoute = new OASDispatchRoute();
        Map<String, String> propertyMappings = dispatchRoute.getPropertyMappings();
        System.assertEquals('dispatchJobs', propertyMappings.get('dispatch_jobs'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDispatchRoute dispatchRoute = new OASDispatchRoute();
        System.assertEquals(new List<OASDispatchJob>(), dispatchRoute.dispatchJobs);
        System.assertEquals(null, dispatchRoute.actualEndMs);
        System.assertEquals(null, dispatchRoute.actualStartMs);
        System.assertEquals(null, dispatchRoute.driverId);
        System.assertEquals(null, dispatchRoute.groupId);
        System.assertEquals(null, dispatchRoute.name);
        System.assertEquals(null, dispatchRoute.scheduledEndMs);
        System.assertEquals(null, dispatchRoute.scheduledMeters);
        System.assertEquals(null, dispatchRoute.scheduledStartMs);
        System.assertEquals(null, dispatchRoute.startLocationAddress);
        System.assertEquals(null, dispatchRoute.startLocationAddressId);
        System.assertEquals(null, dispatchRoute.startLocationLat);
        System.assertEquals(null, dispatchRoute.startLocationLng);
        System.assertEquals(null, dispatchRoute.startLocationName);
        System.assertEquals(null, dispatchRoute.trailerId);
        System.assertEquals(null, dispatchRoute.vehicleId);
        System.assertEquals(null, dispatchRoute.id);
    }
}
