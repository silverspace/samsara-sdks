@isTest
private class OASDispatchRouteBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDispatchRouteBase dispatchRouteBase1 = OASDispatchRouteBase.getExample();
        OASDispatchRouteBase dispatchRouteBase2 = dispatchRouteBase1;
        OASDispatchRouteBase dispatchRouteBase3 = new OASDispatchRouteBase();
        OASDispatchRouteBase dispatchRouteBase4 = dispatchRouteBase3;

        System.assert(dispatchRouteBase1.equals(dispatchRouteBase2));
        System.assert(dispatchRouteBase2.equals(dispatchRouteBase1));
        System.assert(dispatchRouteBase1.equals(dispatchRouteBase1));
        System.assert(dispatchRouteBase3.equals(dispatchRouteBase4));
        System.assert(dispatchRouteBase4.equals(dispatchRouteBase3));
        System.assert(dispatchRouteBase3.equals(dispatchRouteBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDispatchRouteBase dispatchRouteBase1 = OASDispatchRouteBase.getExample();
        OASDispatchRouteBase dispatchRouteBase2 = OASDispatchRouteBase.getExample();
        OASDispatchRouteBase dispatchRouteBase3 = new OASDispatchRouteBase();
        OASDispatchRouteBase dispatchRouteBase4 = new OASDispatchRouteBase();

        System.assert(dispatchRouteBase1.equals(dispatchRouteBase2));
        System.assert(dispatchRouteBase2.equals(dispatchRouteBase1));
        System.assert(dispatchRouteBase3.equals(dispatchRouteBase4));
        System.assert(dispatchRouteBase4.equals(dispatchRouteBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDispatchRouteBase dispatchRouteBase1 = OASDispatchRouteBase.getExample();
        OASDispatchRouteBase dispatchRouteBase2 = new OASDispatchRouteBase();

        System.assertEquals(false, dispatchRouteBase1.equals('foo'));
        System.assertEquals(false, dispatchRouteBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDispatchRouteBase dispatchRouteBase1 = OASDispatchRouteBase.getExample();
        OASDispatchRouteBase dispatchRouteBase2 = new OASDispatchRouteBase();
        OASDispatchRouteBase dispatchRouteBase3;

        System.assertEquals(false, dispatchRouteBase1.equals(dispatchRouteBase3));
        System.assertEquals(false, dispatchRouteBase2.equals(dispatchRouteBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDispatchRouteBase dispatchRouteBase1 = OASDispatchRouteBase.getExample();
        OASDispatchRouteBase dispatchRouteBase2 = new OASDispatchRouteBase();

        System.assertEquals(dispatchRouteBase1.hashCode(), dispatchRouteBase1.hashCode());
        System.assertEquals(dispatchRouteBase2.hashCode(), dispatchRouteBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDispatchRouteBase dispatchRouteBase1 = OASDispatchRouteBase.getExample();
        OASDispatchRouteBase dispatchRouteBase2 = OASDispatchRouteBase.getExample();
        OASDispatchRouteBase dispatchRouteBase3 = new OASDispatchRouteBase();
        OASDispatchRouteBase dispatchRouteBase4 = new OASDispatchRouteBase();

        System.assert(dispatchRouteBase1.equals(dispatchRouteBase2));
        System.assert(dispatchRouteBase3.equals(dispatchRouteBase4));
        System.assertEquals(dispatchRouteBase1.hashCode(), dispatchRouteBase2.hashCode());
        System.assertEquals(dispatchRouteBase3.hashCode(), dispatchRouteBase4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDispatchRouteBase dispatchRouteBase = new OASDispatchRouteBase();
        Map<String, String> propertyMappings = dispatchRouteBase.getPropertyMappings();
        System.assertEquals('actualEndMs', propertyMappings.get('actual_end_ms'));
        System.assertEquals('actualStartMs', propertyMappings.get('actual_start_ms'));
        System.assertEquals('driverId', propertyMappings.get('driver_id'));
        System.assertEquals('groupId', propertyMappings.get('group_id'));
        System.assertEquals('scheduledEndMs', propertyMappings.get('scheduled_end_ms'));
        System.assertEquals('scheduledMeters', propertyMappings.get('scheduled_meters'));
        System.assertEquals('scheduledStartMs', propertyMappings.get('scheduled_start_ms'));
        System.assertEquals('startLocationAddress', propertyMappings.get('start_location_address'));
        System.assertEquals('startLocationAddressId', propertyMappings.get('start_location_address_id'));
        System.assertEquals('startLocationLat', propertyMappings.get('start_location_lat'));
        System.assertEquals('startLocationLng', propertyMappings.get('start_location_lng'));
        System.assertEquals('startLocationName', propertyMappings.get('start_location_name'));
        System.assertEquals('trailerId', propertyMappings.get('trailer_id'));
        System.assertEquals('vehicleId', propertyMappings.get('vehicle_id'));
    }
}
