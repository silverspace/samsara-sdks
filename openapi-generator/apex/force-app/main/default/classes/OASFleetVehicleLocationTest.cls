@isTest
private class OASFleetVehicleLocationTest {
    @isTest
    private static void equalsSameInstance() {
        OASFleetVehicleLocation fleetVehicleLocation1 = OASFleetVehicleLocation.getExample();
        OASFleetVehicleLocation fleetVehicleLocation2 = fleetVehicleLocation1;
        OASFleetVehicleLocation fleetVehicleLocation3 = new OASFleetVehicleLocation();
        OASFleetVehicleLocation fleetVehicleLocation4 = fleetVehicleLocation3;

        System.assert(fleetVehicleLocation1.equals(fleetVehicleLocation2));
        System.assert(fleetVehicleLocation2.equals(fleetVehicleLocation1));
        System.assert(fleetVehicleLocation1.equals(fleetVehicleLocation1));
        System.assert(fleetVehicleLocation3.equals(fleetVehicleLocation4));
        System.assert(fleetVehicleLocation4.equals(fleetVehicleLocation3));
        System.assert(fleetVehicleLocation3.equals(fleetVehicleLocation3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFleetVehicleLocation fleetVehicleLocation1 = OASFleetVehicleLocation.getExample();
        OASFleetVehicleLocation fleetVehicleLocation2 = OASFleetVehicleLocation.getExample();
        OASFleetVehicleLocation fleetVehicleLocation3 = new OASFleetVehicleLocation();
        OASFleetVehicleLocation fleetVehicleLocation4 = new OASFleetVehicleLocation();

        System.assert(fleetVehicleLocation1.equals(fleetVehicleLocation2));
        System.assert(fleetVehicleLocation2.equals(fleetVehicleLocation1));
        System.assert(fleetVehicleLocation3.equals(fleetVehicleLocation4));
        System.assert(fleetVehicleLocation4.equals(fleetVehicleLocation3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFleetVehicleLocation fleetVehicleLocation1 = OASFleetVehicleLocation.getExample();
        OASFleetVehicleLocation fleetVehicleLocation2 = new OASFleetVehicleLocation();

        System.assertEquals(false, fleetVehicleLocation1.equals('foo'));
        System.assertEquals(false, fleetVehicleLocation2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFleetVehicleLocation fleetVehicleLocation1 = OASFleetVehicleLocation.getExample();
        OASFleetVehicleLocation fleetVehicleLocation2 = new OASFleetVehicleLocation();
        OASFleetVehicleLocation fleetVehicleLocation3;

        System.assertEquals(false, fleetVehicleLocation1.equals(fleetVehicleLocation3));
        System.assertEquals(false, fleetVehicleLocation2.equals(fleetVehicleLocation3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFleetVehicleLocation fleetVehicleLocation1 = OASFleetVehicleLocation.getExample();
        OASFleetVehicleLocation fleetVehicleLocation2 = new OASFleetVehicleLocation();

        System.assertEquals(fleetVehicleLocation1.hashCode(), fleetVehicleLocation1.hashCode());
        System.assertEquals(fleetVehicleLocation2.hashCode(), fleetVehicleLocation2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFleetVehicleLocation fleetVehicleLocation1 = OASFleetVehicleLocation.getExample();
        OASFleetVehicleLocation fleetVehicleLocation2 = OASFleetVehicleLocation.getExample();
        OASFleetVehicleLocation fleetVehicleLocation3 = new OASFleetVehicleLocation();
        OASFleetVehicleLocation fleetVehicleLocation4 = new OASFleetVehicleLocation();

        System.assert(fleetVehicleLocation1.equals(fleetVehicleLocation2));
        System.assert(fleetVehicleLocation3.equals(fleetVehicleLocation4));
        System.assertEquals(fleetVehicleLocation1.hashCode(), fleetVehicleLocation2.hashCode());
        System.assertEquals(fleetVehicleLocation3.hashCode(), fleetVehicleLocation4.hashCode());
    }
}
