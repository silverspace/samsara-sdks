@isTest
private class OASDispatchJobCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASDispatchJobCreate dispatchJobCreate1 = OASDispatchJobCreate.getExample();
        OASDispatchJobCreate dispatchJobCreate2 = dispatchJobCreate1;
        OASDispatchJobCreate dispatchJobCreate3 = new OASDispatchJobCreate();
        OASDispatchJobCreate dispatchJobCreate4 = dispatchJobCreate3;

        System.assert(dispatchJobCreate1.equals(dispatchJobCreate2));
        System.assert(dispatchJobCreate2.equals(dispatchJobCreate1));
        System.assert(dispatchJobCreate1.equals(dispatchJobCreate1));
        System.assert(dispatchJobCreate3.equals(dispatchJobCreate4));
        System.assert(dispatchJobCreate4.equals(dispatchJobCreate3));
        System.assert(dispatchJobCreate3.equals(dispatchJobCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDispatchJobCreate dispatchJobCreate1 = OASDispatchJobCreate.getExample();
        OASDispatchJobCreate dispatchJobCreate2 = OASDispatchJobCreate.getExample();
        OASDispatchJobCreate dispatchJobCreate3 = new OASDispatchJobCreate();
        OASDispatchJobCreate dispatchJobCreate4 = new OASDispatchJobCreate();

        System.assert(dispatchJobCreate1.equals(dispatchJobCreate2));
        System.assert(dispatchJobCreate2.equals(dispatchJobCreate1));
        System.assert(dispatchJobCreate3.equals(dispatchJobCreate4));
        System.assert(dispatchJobCreate4.equals(dispatchJobCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDispatchJobCreate dispatchJobCreate1 = OASDispatchJobCreate.getExample();
        OASDispatchJobCreate dispatchJobCreate2 = new OASDispatchJobCreate();

        System.assertEquals(false, dispatchJobCreate1.equals('foo'));
        System.assertEquals(false, dispatchJobCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDispatchJobCreate dispatchJobCreate1 = OASDispatchJobCreate.getExample();
        OASDispatchJobCreate dispatchJobCreate2 = new OASDispatchJobCreate();
        OASDispatchJobCreate dispatchJobCreate3;

        System.assertEquals(false, dispatchJobCreate1.equals(dispatchJobCreate3));
        System.assertEquals(false, dispatchJobCreate2.equals(dispatchJobCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDispatchJobCreate dispatchJobCreate1 = OASDispatchJobCreate.getExample();
        OASDispatchJobCreate dispatchJobCreate2 = new OASDispatchJobCreate();

        System.assertEquals(dispatchJobCreate1.hashCode(), dispatchJobCreate1.hashCode());
        System.assertEquals(dispatchJobCreate2.hashCode(), dispatchJobCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDispatchJobCreate dispatchJobCreate1 = OASDispatchJobCreate.getExample();
        OASDispatchJobCreate dispatchJobCreate2 = OASDispatchJobCreate.getExample();
        OASDispatchJobCreate dispatchJobCreate3 = new OASDispatchJobCreate();
        OASDispatchJobCreate dispatchJobCreate4 = new OASDispatchJobCreate();

        System.assert(dispatchJobCreate1.equals(dispatchJobCreate2));
        System.assert(dispatchJobCreate3.equals(dispatchJobCreate4));
        System.assertEquals(dispatchJobCreate1.hashCode(), dispatchJobCreate2.hashCode());
        System.assertEquals(dispatchJobCreate3.hashCode(), dispatchJobCreate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDispatchJobCreate dispatchJobCreate = new OASDispatchJobCreate();
        Map<String, String> propertyMappings = dispatchJobCreate.getPropertyMappings();
        System.assertEquals('destinationAddress', propertyMappings.get('destination_address'));
        System.assertEquals('destinationAddressId', propertyMappings.get('destination_address_id'));
        System.assertEquals('destinationLat', propertyMappings.get('destination_lat'));
        System.assertEquals('destinationLng', propertyMappings.get('destination_lng'));
        System.assertEquals('destinationName', propertyMappings.get('destination_name'));
        System.assertEquals('scheduledArrivalTimeMs', propertyMappings.get('scheduled_arrival_time_ms'));
        System.assertEquals('scheduledDepartureTimeMs', propertyMappings.get('scheduled_departure_time_ms'));
    }
}
