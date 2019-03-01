@isTest
private class OASVehicleTest {
    @isTest
    private static void equalsSameInstance() {
        OASVehicle vehicle1 = OASVehicle.getExample();
        OASVehicle vehicle2 = vehicle1;
        OASVehicle vehicle3 = new OASVehicle();
        OASVehicle vehicle4 = vehicle3;

        System.assert(vehicle1.equals(vehicle2));
        System.assert(vehicle2.equals(vehicle1));
        System.assert(vehicle1.equals(vehicle1));
        System.assert(vehicle3.equals(vehicle4));
        System.assert(vehicle4.equals(vehicle3));
        System.assert(vehicle3.equals(vehicle3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVehicle vehicle1 = OASVehicle.getExample();
        OASVehicle vehicle2 = OASVehicle.getExample();
        OASVehicle vehicle3 = new OASVehicle();
        OASVehicle vehicle4 = new OASVehicle();

        System.assert(vehicle1.equals(vehicle2));
        System.assert(vehicle2.equals(vehicle1));
        System.assert(vehicle3.equals(vehicle4));
        System.assert(vehicle4.equals(vehicle3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVehicle vehicle1 = OASVehicle.getExample();
        OASVehicle vehicle2 = new OASVehicle();

        System.assertEquals(false, vehicle1.equals('foo'));
        System.assertEquals(false, vehicle2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVehicle vehicle1 = OASVehicle.getExample();
        OASVehicle vehicle2 = new OASVehicle();
        OASVehicle vehicle3;

        System.assertEquals(false, vehicle1.equals(vehicle3));
        System.assertEquals(false, vehicle2.equals(vehicle3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVehicle vehicle1 = OASVehicle.getExample();
        OASVehicle vehicle2 = new OASVehicle();

        System.assertEquals(vehicle1.hashCode(), vehicle1.hashCode());
        System.assertEquals(vehicle2.hashCode(), vehicle2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVehicle vehicle1 = OASVehicle.getExample();
        OASVehicle vehicle2 = OASVehicle.getExample();
        OASVehicle vehicle3 = new OASVehicle();
        OASVehicle vehicle4 = new OASVehicle();

        System.assert(vehicle1.equals(vehicle2));
        System.assert(vehicle3.equals(vehicle4));
        System.assertEquals(vehicle1.hashCode(), vehicle2.hashCode());
        System.assertEquals(vehicle3.hashCode(), vehicle4.hashCode());
    }
}
