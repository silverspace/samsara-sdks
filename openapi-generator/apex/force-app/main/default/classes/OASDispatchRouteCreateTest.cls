@isTest
private class OASDispatchRouteCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASDispatchRouteCreate dispatchRouteCreate1 = OASDispatchRouteCreate.getExample();
        OASDispatchRouteCreate dispatchRouteCreate2 = dispatchRouteCreate1;
        OASDispatchRouteCreate dispatchRouteCreate3 = new OASDispatchRouteCreate();
        OASDispatchRouteCreate dispatchRouteCreate4 = dispatchRouteCreate3;

        System.assert(dispatchRouteCreate1.equals(dispatchRouteCreate2));
        System.assert(dispatchRouteCreate2.equals(dispatchRouteCreate1));
        System.assert(dispatchRouteCreate1.equals(dispatchRouteCreate1));
        System.assert(dispatchRouteCreate3.equals(dispatchRouteCreate4));
        System.assert(dispatchRouteCreate4.equals(dispatchRouteCreate3));
        System.assert(dispatchRouteCreate3.equals(dispatchRouteCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDispatchRouteCreate dispatchRouteCreate1 = OASDispatchRouteCreate.getExample();
        OASDispatchRouteCreate dispatchRouteCreate2 = OASDispatchRouteCreate.getExample();
        OASDispatchRouteCreate dispatchRouteCreate3 = new OASDispatchRouteCreate();
        OASDispatchRouteCreate dispatchRouteCreate4 = new OASDispatchRouteCreate();

        System.assert(dispatchRouteCreate1.equals(dispatchRouteCreate2));
        System.assert(dispatchRouteCreate2.equals(dispatchRouteCreate1));
        System.assert(dispatchRouteCreate3.equals(dispatchRouteCreate4));
        System.assert(dispatchRouteCreate4.equals(dispatchRouteCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDispatchRouteCreate dispatchRouteCreate1 = OASDispatchRouteCreate.getExample();
        OASDispatchRouteCreate dispatchRouteCreate2 = new OASDispatchRouteCreate();

        System.assertEquals(false, dispatchRouteCreate1.equals('foo'));
        System.assertEquals(false, dispatchRouteCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDispatchRouteCreate dispatchRouteCreate1 = OASDispatchRouteCreate.getExample();
        OASDispatchRouteCreate dispatchRouteCreate2 = new OASDispatchRouteCreate();
        OASDispatchRouteCreate dispatchRouteCreate3;

        System.assertEquals(false, dispatchRouteCreate1.equals(dispatchRouteCreate3));
        System.assertEquals(false, dispatchRouteCreate2.equals(dispatchRouteCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDispatchRouteCreate dispatchRouteCreate1 = OASDispatchRouteCreate.getExample();
        OASDispatchRouteCreate dispatchRouteCreate2 = new OASDispatchRouteCreate();

        System.assertEquals(dispatchRouteCreate1.hashCode(), dispatchRouteCreate1.hashCode());
        System.assertEquals(dispatchRouteCreate2.hashCode(), dispatchRouteCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDispatchRouteCreate dispatchRouteCreate1 = OASDispatchRouteCreate.getExample();
        OASDispatchRouteCreate dispatchRouteCreate2 = OASDispatchRouteCreate.getExample();
        OASDispatchRouteCreate dispatchRouteCreate3 = new OASDispatchRouteCreate();
        OASDispatchRouteCreate dispatchRouteCreate4 = new OASDispatchRouteCreate();

        System.assert(dispatchRouteCreate1.equals(dispatchRouteCreate2));
        System.assert(dispatchRouteCreate3.equals(dispatchRouteCreate4));
        System.assertEquals(dispatchRouteCreate1.hashCode(), dispatchRouteCreate2.hashCode());
        System.assertEquals(dispatchRouteCreate3.hashCode(), dispatchRouteCreate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDispatchRouteCreate dispatchRouteCreate = new OASDispatchRouteCreate();
        Map<String, String> propertyMappings = dispatchRouteCreate.getPropertyMappings();
        System.assertEquals('dispatchJobs', propertyMappings.get('dispatch_jobs'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDispatchRouteCreate dispatchRouteCreate = new OASDispatchRouteCreate();
        System.assertEquals(new List<OASDispatchJobCreate>(), dispatchRouteCreate.dispatchJobs);
        System.assertEquals(null, dispatchRouteCreate.actualEndMs);
        System.assertEquals(null, dispatchRouteCreate.actualStartMs);
        System.assertEquals(null, dispatchRouteCreate.driverId);
        System.assertEquals(null, dispatchRouteCreate.groupId);
        System.assertEquals(null, dispatchRouteCreate.name);
        System.assertEquals(null, dispatchRouteCreate.scheduledEndMs);
        System.assertEquals(null, dispatchRouteCreate.scheduledMeters);
        System.assertEquals(null, dispatchRouteCreate.scheduledStartMs);
        System.assertEquals(null, dispatchRouteCreate.startLocationAddress);
        System.assertEquals(null, dispatchRouteCreate.startLocationAddressId);
        System.assertEquals(null, dispatchRouteCreate.startLocationLat);
        System.assertEquals(null, dispatchRouteCreate.startLocationLng);
        System.assertEquals(null, dispatchRouteCreate.startLocationName);
        System.assertEquals(null, dispatchRouteCreate.trailerId);
        System.assertEquals(null, dispatchRouteCreate.vehicleId);
    }
}
