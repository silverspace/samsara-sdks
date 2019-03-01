@isTest
private class OASDispatchJobTest {
    @isTest
    private static void equalsSameInstance() {
        OASDispatchJob dispatchJob1 = OASDispatchJob.getExample();
        OASDispatchJob dispatchJob2 = dispatchJob1;
        OASDispatchJob dispatchJob3 = new OASDispatchJob();
        OASDispatchJob dispatchJob4 = dispatchJob3;

        System.assert(dispatchJob1.equals(dispatchJob2));
        System.assert(dispatchJob2.equals(dispatchJob1));
        System.assert(dispatchJob1.equals(dispatchJob1));
        System.assert(dispatchJob3.equals(dispatchJob4));
        System.assert(dispatchJob4.equals(dispatchJob3));
        System.assert(dispatchJob3.equals(dispatchJob3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDispatchJob dispatchJob1 = OASDispatchJob.getExample();
        OASDispatchJob dispatchJob2 = OASDispatchJob.getExample();
        OASDispatchJob dispatchJob3 = new OASDispatchJob();
        OASDispatchJob dispatchJob4 = new OASDispatchJob();

        System.assert(dispatchJob1.equals(dispatchJob2));
        System.assert(dispatchJob2.equals(dispatchJob1));
        System.assert(dispatchJob3.equals(dispatchJob4));
        System.assert(dispatchJob4.equals(dispatchJob3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDispatchJob dispatchJob1 = OASDispatchJob.getExample();
        OASDispatchJob dispatchJob2 = new OASDispatchJob();

        System.assertEquals(false, dispatchJob1.equals('foo'));
        System.assertEquals(false, dispatchJob2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDispatchJob dispatchJob1 = OASDispatchJob.getExample();
        OASDispatchJob dispatchJob2 = new OASDispatchJob();
        OASDispatchJob dispatchJob3;

        System.assertEquals(false, dispatchJob1.equals(dispatchJob3));
        System.assertEquals(false, dispatchJob2.equals(dispatchJob3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDispatchJob dispatchJob1 = OASDispatchJob.getExample();
        OASDispatchJob dispatchJob2 = new OASDispatchJob();

        System.assertEquals(dispatchJob1.hashCode(), dispatchJob1.hashCode());
        System.assertEquals(dispatchJob2.hashCode(), dispatchJob2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDispatchJob dispatchJob1 = OASDispatchJob.getExample();
        OASDispatchJob dispatchJob2 = OASDispatchJob.getExample();
        OASDispatchJob dispatchJob3 = new OASDispatchJob();
        OASDispatchJob dispatchJob4 = new OASDispatchJob();

        System.assert(dispatchJob1.equals(dispatchJob2));
        System.assert(dispatchJob3.equals(dispatchJob4));
        System.assertEquals(dispatchJob1.hashCode(), dispatchJob2.hashCode());
        System.assertEquals(dispatchJob3.hashCode(), dispatchJob4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDispatchJob dispatchJob = new OASDispatchJob();
        Map<String, String> propertyMappings = dispatchJob.getPropertyMappings();
        System.assertEquals('arrivedAtMs', propertyMappings.get('arrived_at_ms'));
        System.assertEquals('completedAtMs', propertyMappings.get('completed_at_ms'));
        System.assertEquals('dispatchRouteId', propertyMappings.get('dispatch_route_id'));
        System.assertEquals('driverId', propertyMappings.get('driver_id'));
        System.assertEquals('enRouteAtMs', propertyMappings.get('en_route_at_ms'));
        System.assertEquals('estimatedArrivalMs', propertyMappings.get('estimated_arrival_ms'));
        System.assertEquals('fleetViewerUrl', propertyMappings.get('fleet_viewer_url'));
        System.assertEquals('groupId', propertyMappings.get('group_id'));
        System.assertEquals('jobState', propertyMappings.get('job_state'));
        System.assertEquals('skippedAtMs', propertyMappings.get('skipped_at_ms'));
        System.assertEquals('vehicleId', propertyMappings.get('vehicle_id'));
    }
}
