@isTest
private class OASCargoResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCargoResponse cargoResponse1 = OASCargoResponse.getExample();
        OASCargoResponse cargoResponse2 = cargoResponse1;
        OASCargoResponse cargoResponse3 = new OASCargoResponse();
        OASCargoResponse cargoResponse4 = cargoResponse3;

        System.assert(cargoResponse1.equals(cargoResponse2));
        System.assert(cargoResponse2.equals(cargoResponse1));
        System.assert(cargoResponse1.equals(cargoResponse1));
        System.assert(cargoResponse3.equals(cargoResponse4));
        System.assert(cargoResponse4.equals(cargoResponse3));
        System.assert(cargoResponse3.equals(cargoResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCargoResponse cargoResponse1 = OASCargoResponse.getExample();
        OASCargoResponse cargoResponse2 = OASCargoResponse.getExample();
        OASCargoResponse cargoResponse3 = new OASCargoResponse();
        OASCargoResponse cargoResponse4 = new OASCargoResponse();

        System.assert(cargoResponse1.equals(cargoResponse2));
        System.assert(cargoResponse2.equals(cargoResponse1));
        System.assert(cargoResponse3.equals(cargoResponse4));
        System.assert(cargoResponse4.equals(cargoResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCargoResponse cargoResponse1 = OASCargoResponse.getExample();
        OASCargoResponse cargoResponse2 = new OASCargoResponse();

        System.assertEquals(false, cargoResponse1.equals('foo'));
        System.assertEquals(false, cargoResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCargoResponse cargoResponse1 = OASCargoResponse.getExample();
        OASCargoResponse cargoResponse2 = new OASCargoResponse();
        OASCargoResponse cargoResponse3;

        System.assertEquals(false, cargoResponse1.equals(cargoResponse3));
        System.assertEquals(false, cargoResponse2.equals(cargoResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCargoResponse cargoResponse1 = OASCargoResponse.getExample();
        OASCargoResponse cargoResponse2 = new OASCargoResponse();

        System.assertEquals(cargoResponse1.hashCode(), cargoResponse1.hashCode());
        System.assertEquals(cargoResponse2.hashCode(), cargoResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCargoResponse cargoResponse1 = OASCargoResponse.getExample();
        OASCargoResponse cargoResponse2 = OASCargoResponse.getExample();
        OASCargoResponse cargoResponse3 = new OASCargoResponse();
        OASCargoResponse cargoResponse4 = new OASCargoResponse();

        System.assert(cargoResponse1.equals(cargoResponse2));
        System.assert(cargoResponse3.equals(cargoResponse4));
        System.assertEquals(cargoResponse1.hashCode(), cargoResponse2.hashCode());
        System.assertEquals(cargoResponse3.hashCode(), cargoResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCargoResponse cargoResponse = new OASCargoResponse();
        System.assertEquals(new List<OASCargoResponseSensors>(), cargoResponse.sensors);
        System.assertEquals(null, cargoResponse.groupId);
    }
}
