@isTest
private class OASDvirBaseVehicleTest {
    @isTest
    private static void equalsSameInstance() {
        OASDvirBaseVehicle dvirBaseVehicle1 = OASDvirBaseVehicle.getExample();
        OASDvirBaseVehicle dvirBaseVehicle2 = dvirBaseVehicle1;
        OASDvirBaseVehicle dvirBaseVehicle3 = new OASDvirBaseVehicle();
        OASDvirBaseVehicle dvirBaseVehicle4 = dvirBaseVehicle3;

        System.assert(dvirBaseVehicle1.equals(dvirBaseVehicle2));
        System.assert(dvirBaseVehicle2.equals(dvirBaseVehicle1));
        System.assert(dvirBaseVehicle1.equals(dvirBaseVehicle1));
        System.assert(dvirBaseVehicle3.equals(dvirBaseVehicle4));
        System.assert(dvirBaseVehicle4.equals(dvirBaseVehicle3));
        System.assert(dvirBaseVehicle3.equals(dvirBaseVehicle3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDvirBaseVehicle dvirBaseVehicle1 = OASDvirBaseVehicle.getExample();
        OASDvirBaseVehicle dvirBaseVehicle2 = OASDvirBaseVehicle.getExample();
        OASDvirBaseVehicle dvirBaseVehicle3 = new OASDvirBaseVehicle();
        OASDvirBaseVehicle dvirBaseVehicle4 = new OASDvirBaseVehicle();

        System.assert(dvirBaseVehicle1.equals(dvirBaseVehicle2));
        System.assert(dvirBaseVehicle2.equals(dvirBaseVehicle1));
        System.assert(dvirBaseVehicle3.equals(dvirBaseVehicle4));
        System.assert(dvirBaseVehicle4.equals(dvirBaseVehicle3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDvirBaseVehicle dvirBaseVehicle1 = OASDvirBaseVehicle.getExample();
        OASDvirBaseVehicle dvirBaseVehicle2 = new OASDvirBaseVehicle();

        System.assertEquals(false, dvirBaseVehicle1.equals('foo'));
        System.assertEquals(false, dvirBaseVehicle2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDvirBaseVehicle dvirBaseVehicle1 = OASDvirBaseVehicle.getExample();
        OASDvirBaseVehicle dvirBaseVehicle2 = new OASDvirBaseVehicle();
        OASDvirBaseVehicle dvirBaseVehicle3;

        System.assertEquals(false, dvirBaseVehicle1.equals(dvirBaseVehicle3));
        System.assertEquals(false, dvirBaseVehicle2.equals(dvirBaseVehicle3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDvirBaseVehicle dvirBaseVehicle1 = OASDvirBaseVehicle.getExample();
        OASDvirBaseVehicle dvirBaseVehicle2 = new OASDvirBaseVehicle();

        System.assertEquals(dvirBaseVehicle1.hashCode(), dvirBaseVehicle1.hashCode());
        System.assertEquals(dvirBaseVehicle2.hashCode(), dvirBaseVehicle2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDvirBaseVehicle dvirBaseVehicle1 = OASDvirBaseVehicle.getExample();
        OASDvirBaseVehicle dvirBaseVehicle2 = OASDvirBaseVehicle.getExample();
        OASDvirBaseVehicle dvirBaseVehicle3 = new OASDvirBaseVehicle();
        OASDvirBaseVehicle dvirBaseVehicle4 = new OASDvirBaseVehicle();

        System.assert(dvirBaseVehicle1.equals(dvirBaseVehicle2));
        System.assert(dvirBaseVehicle3.equals(dvirBaseVehicle4));
        System.assertEquals(dvirBaseVehicle1.hashCode(), dvirBaseVehicle2.hashCode());
        System.assertEquals(dvirBaseVehicle3.hashCode(), dvirBaseVehicle4.hashCode());
    }
}
