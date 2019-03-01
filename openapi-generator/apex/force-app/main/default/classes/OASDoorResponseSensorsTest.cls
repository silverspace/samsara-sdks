@isTest
private class OASDoorResponseSensorsTest {
    @isTest
    private static void equalsSameInstance() {
        OASDoorResponseSensors doorResponseSensors1 = OASDoorResponseSensors.getExample();
        OASDoorResponseSensors doorResponseSensors2 = doorResponseSensors1;
        OASDoorResponseSensors doorResponseSensors3 = new OASDoorResponseSensors();
        OASDoorResponseSensors doorResponseSensors4 = doorResponseSensors3;

        System.assert(doorResponseSensors1.equals(doorResponseSensors2));
        System.assert(doorResponseSensors2.equals(doorResponseSensors1));
        System.assert(doorResponseSensors1.equals(doorResponseSensors1));
        System.assert(doorResponseSensors3.equals(doorResponseSensors4));
        System.assert(doorResponseSensors4.equals(doorResponseSensors3));
        System.assert(doorResponseSensors3.equals(doorResponseSensors3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDoorResponseSensors doorResponseSensors1 = OASDoorResponseSensors.getExample();
        OASDoorResponseSensors doorResponseSensors2 = OASDoorResponseSensors.getExample();
        OASDoorResponseSensors doorResponseSensors3 = new OASDoorResponseSensors();
        OASDoorResponseSensors doorResponseSensors4 = new OASDoorResponseSensors();

        System.assert(doorResponseSensors1.equals(doorResponseSensors2));
        System.assert(doorResponseSensors2.equals(doorResponseSensors1));
        System.assert(doorResponseSensors3.equals(doorResponseSensors4));
        System.assert(doorResponseSensors4.equals(doorResponseSensors3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDoorResponseSensors doorResponseSensors1 = OASDoorResponseSensors.getExample();
        OASDoorResponseSensors doorResponseSensors2 = new OASDoorResponseSensors();

        System.assertEquals(false, doorResponseSensors1.equals('foo'));
        System.assertEquals(false, doorResponseSensors2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDoorResponseSensors doorResponseSensors1 = OASDoorResponseSensors.getExample();
        OASDoorResponseSensors doorResponseSensors2 = new OASDoorResponseSensors();
        OASDoorResponseSensors doorResponseSensors3;

        System.assertEquals(false, doorResponseSensors1.equals(doorResponseSensors3));
        System.assertEquals(false, doorResponseSensors2.equals(doorResponseSensors3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDoorResponseSensors doorResponseSensors1 = OASDoorResponseSensors.getExample();
        OASDoorResponseSensors doorResponseSensors2 = new OASDoorResponseSensors();

        System.assertEquals(doorResponseSensors1.hashCode(), doorResponseSensors1.hashCode());
        System.assertEquals(doorResponseSensors2.hashCode(), doorResponseSensors2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDoorResponseSensors doorResponseSensors1 = OASDoorResponseSensors.getExample();
        OASDoorResponseSensors doorResponseSensors2 = OASDoorResponseSensors.getExample();
        OASDoorResponseSensors doorResponseSensors3 = new OASDoorResponseSensors();
        OASDoorResponseSensors doorResponseSensors4 = new OASDoorResponseSensors();

        System.assert(doorResponseSensors1.equals(doorResponseSensors2));
        System.assert(doorResponseSensors3.equals(doorResponseSensors4));
        System.assertEquals(doorResponseSensors1.hashCode(), doorResponseSensors2.hashCode());
        System.assertEquals(doorResponseSensors3.hashCode(), doorResponseSensors4.hashCode());
    }
}
