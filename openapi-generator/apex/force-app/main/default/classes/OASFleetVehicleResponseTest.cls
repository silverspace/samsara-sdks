@isTest
private class OASFleetVehicleResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASFleetVehicleResponse fleetVehicleResponse1 = OASFleetVehicleResponse.getExample();
        OASFleetVehicleResponse fleetVehicleResponse2 = fleetVehicleResponse1;
        OASFleetVehicleResponse fleetVehicleResponse3 = new OASFleetVehicleResponse();
        OASFleetVehicleResponse fleetVehicleResponse4 = fleetVehicleResponse3;

        System.assert(fleetVehicleResponse1.equals(fleetVehicleResponse2));
        System.assert(fleetVehicleResponse2.equals(fleetVehicleResponse1));
        System.assert(fleetVehicleResponse1.equals(fleetVehicleResponse1));
        System.assert(fleetVehicleResponse3.equals(fleetVehicleResponse4));
        System.assert(fleetVehicleResponse4.equals(fleetVehicleResponse3));
        System.assert(fleetVehicleResponse3.equals(fleetVehicleResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFleetVehicleResponse fleetVehicleResponse1 = OASFleetVehicleResponse.getExample();
        OASFleetVehicleResponse fleetVehicleResponse2 = OASFleetVehicleResponse.getExample();
        OASFleetVehicleResponse fleetVehicleResponse3 = new OASFleetVehicleResponse();
        OASFleetVehicleResponse fleetVehicleResponse4 = new OASFleetVehicleResponse();

        System.assert(fleetVehicleResponse1.equals(fleetVehicleResponse2));
        System.assert(fleetVehicleResponse2.equals(fleetVehicleResponse1));
        System.assert(fleetVehicleResponse3.equals(fleetVehicleResponse4));
        System.assert(fleetVehicleResponse4.equals(fleetVehicleResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFleetVehicleResponse fleetVehicleResponse1 = OASFleetVehicleResponse.getExample();
        OASFleetVehicleResponse fleetVehicleResponse2 = new OASFleetVehicleResponse();

        System.assertEquals(false, fleetVehicleResponse1.equals('foo'));
        System.assertEquals(false, fleetVehicleResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFleetVehicleResponse fleetVehicleResponse1 = OASFleetVehicleResponse.getExample();
        OASFleetVehicleResponse fleetVehicleResponse2 = new OASFleetVehicleResponse();
        OASFleetVehicleResponse fleetVehicleResponse3;

        System.assertEquals(false, fleetVehicleResponse1.equals(fleetVehicleResponse3));
        System.assertEquals(false, fleetVehicleResponse2.equals(fleetVehicleResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFleetVehicleResponse fleetVehicleResponse1 = OASFleetVehicleResponse.getExample();
        OASFleetVehicleResponse fleetVehicleResponse2 = new OASFleetVehicleResponse();

        System.assertEquals(fleetVehicleResponse1.hashCode(), fleetVehicleResponse1.hashCode());
        System.assertEquals(fleetVehicleResponse2.hashCode(), fleetVehicleResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFleetVehicleResponse fleetVehicleResponse1 = OASFleetVehicleResponse.getExample();
        OASFleetVehicleResponse fleetVehicleResponse2 = OASFleetVehicleResponse.getExample();
        OASFleetVehicleResponse fleetVehicleResponse3 = new OASFleetVehicleResponse();
        OASFleetVehicleResponse fleetVehicleResponse4 = new OASFleetVehicleResponse();

        System.assert(fleetVehicleResponse1.equals(fleetVehicleResponse2));
        System.assert(fleetVehicleResponse3.equals(fleetVehicleResponse4));
        System.assertEquals(fleetVehicleResponse1.hashCode(), fleetVehicleResponse2.hashCode());
        System.assertEquals(fleetVehicleResponse3.hashCode(), fleetVehicleResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFleetVehicleResponse fleetVehicleResponse = new OASFleetVehicleResponse();
        System.assertEquals(new Map<String, String>(), fleetVehicleResponse.externalIds);
        System.assertEquals(null, fleetVehicleResponse.harshAccelSetting);
        System.assertEquals(null, fleetVehicleResponse.id);
        System.assertEquals(null, fleetVehicleResponse.name);
        System.assertEquals(null, fleetVehicleResponse.vehicleInfo);
    }
}
