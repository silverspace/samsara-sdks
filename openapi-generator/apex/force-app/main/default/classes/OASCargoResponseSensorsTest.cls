@isTest
private class OASCargoResponseSensorsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCargoResponseSensors cargoResponseSensors1 = OASCargoResponseSensors.getExample();
        OASCargoResponseSensors cargoResponseSensors2 = cargoResponseSensors1;
        OASCargoResponseSensors cargoResponseSensors3 = new OASCargoResponseSensors();
        OASCargoResponseSensors cargoResponseSensors4 = cargoResponseSensors3;

        System.assert(cargoResponseSensors1.equals(cargoResponseSensors2));
        System.assert(cargoResponseSensors2.equals(cargoResponseSensors1));
        System.assert(cargoResponseSensors1.equals(cargoResponseSensors1));
        System.assert(cargoResponseSensors3.equals(cargoResponseSensors4));
        System.assert(cargoResponseSensors4.equals(cargoResponseSensors3));
        System.assert(cargoResponseSensors3.equals(cargoResponseSensors3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCargoResponseSensors cargoResponseSensors1 = OASCargoResponseSensors.getExample();
        OASCargoResponseSensors cargoResponseSensors2 = OASCargoResponseSensors.getExample();
        OASCargoResponseSensors cargoResponseSensors3 = new OASCargoResponseSensors();
        OASCargoResponseSensors cargoResponseSensors4 = new OASCargoResponseSensors();

        System.assert(cargoResponseSensors1.equals(cargoResponseSensors2));
        System.assert(cargoResponseSensors2.equals(cargoResponseSensors1));
        System.assert(cargoResponseSensors3.equals(cargoResponseSensors4));
        System.assert(cargoResponseSensors4.equals(cargoResponseSensors3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCargoResponseSensors cargoResponseSensors1 = OASCargoResponseSensors.getExample();
        OASCargoResponseSensors cargoResponseSensors2 = new OASCargoResponseSensors();

        System.assertEquals(false, cargoResponseSensors1.equals('foo'));
        System.assertEquals(false, cargoResponseSensors2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCargoResponseSensors cargoResponseSensors1 = OASCargoResponseSensors.getExample();
        OASCargoResponseSensors cargoResponseSensors2 = new OASCargoResponseSensors();
        OASCargoResponseSensors cargoResponseSensors3;

        System.assertEquals(false, cargoResponseSensors1.equals(cargoResponseSensors3));
        System.assertEquals(false, cargoResponseSensors2.equals(cargoResponseSensors3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCargoResponseSensors cargoResponseSensors1 = OASCargoResponseSensors.getExample();
        OASCargoResponseSensors cargoResponseSensors2 = new OASCargoResponseSensors();

        System.assertEquals(cargoResponseSensors1.hashCode(), cargoResponseSensors1.hashCode());
        System.assertEquals(cargoResponseSensors2.hashCode(), cargoResponseSensors2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCargoResponseSensors cargoResponseSensors1 = OASCargoResponseSensors.getExample();
        OASCargoResponseSensors cargoResponseSensors2 = OASCargoResponseSensors.getExample();
        OASCargoResponseSensors cargoResponseSensors3 = new OASCargoResponseSensors();
        OASCargoResponseSensors cargoResponseSensors4 = new OASCargoResponseSensors();

        System.assert(cargoResponseSensors1.equals(cargoResponseSensors2));
        System.assert(cargoResponseSensors3.equals(cargoResponseSensors4));
        System.assertEquals(cargoResponseSensors1.hashCode(), cargoResponseSensors2.hashCode());
        System.assertEquals(cargoResponseSensors3.hashCode(), cargoResponseSensors4.hashCode());
    }
}
