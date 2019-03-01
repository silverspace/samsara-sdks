@isTest
private class OASDoorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDoorResponse doorResponse1 = OASDoorResponse.getExample();
        OASDoorResponse doorResponse2 = doorResponse1;
        OASDoorResponse doorResponse3 = new OASDoorResponse();
        OASDoorResponse doorResponse4 = doorResponse3;

        System.assert(doorResponse1.equals(doorResponse2));
        System.assert(doorResponse2.equals(doorResponse1));
        System.assert(doorResponse1.equals(doorResponse1));
        System.assert(doorResponse3.equals(doorResponse4));
        System.assert(doorResponse4.equals(doorResponse3));
        System.assert(doorResponse3.equals(doorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDoorResponse doorResponse1 = OASDoorResponse.getExample();
        OASDoorResponse doorResponse2 = OASDoorResponse.getExample();
        OASDoorResponse doorResponse3 = new OASDoorResponse();
        OASDoorResponse doorResponse4 = new OASDoorResponse();

        System.assert(doorResponse1.equals(doorResponse2));
        System.assert(doorResponse2.equals(doorResponse1));
        System.assert(doorResponse3.equals(doorResponse4));
        System.assert(doorResponse4.equals(doorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDoorResponse doorResponse1 = OASDoorResponse.getExample();
        OASDoorResponse doorResponse2 = new OASDoorResponse();

        System.assertEquals(false, doorResponse1.equals('foo'));
        System.assertEquals(false, doorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDoorResponse doorResponse1 = OASDoorResponse.getExample();
        OASDoorResponse doorResponse2 = new OASDoorResponse();
        OASDoorResponse doorResponse3;

        System.assertEquals(false, doorResponse1.equals(doorResponse3));
        System.assertEquals(false, doorResponse2.equals(doorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDoorResponse doorResponse1 = OASDoorResponse.getExample();
        OASDoorResponse doorResponse2 = new OASDoorResponse();

        System.assertEquals(doorResponse1.hashCode(), doorResponse1.hashCode());
        System.assertEquals(doorResponse2.hashCode(), doorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDoorResponse doorResponse1 = OASDoorResponse.getExample();
        OASDoorResponse doorResponse2 = OASDoorResponse.getExample();
        OASDoorResponse doorResponse3 = new OASDoorResponse();
        OASDoorResponse doorResponse4 = new OASDoorResponse();

        System.assert(doorResponse1.equals(doorResponse2));
        System.assert(doorResponse3.equals(doorResponse4));
        System.assertEquals(doorResponse1.hashCode(), doorResponse2.hashCode());
        System.assertEquals(doorResponse3.hashCode(), doorResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDoorResponse doorResponse = new OASDoorResponse();
        System.assertEquals(new List<OASDoorResponseSensors>(), doorResponse.sensors);
        System.assertEquals(null, doorResponse.groupId);
    }
}
