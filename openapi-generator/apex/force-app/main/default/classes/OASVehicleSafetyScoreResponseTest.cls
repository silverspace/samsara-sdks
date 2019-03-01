@isTest
private class OASVehicleSafetyScoreResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse1 = OASVehicleSafetyScoreResponse.getExample();
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse2 = vehicleSafetyScoreResponse1;
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse3 = new OASVehicleSafetyScoreResponse();
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse4 = vehicleSafetyScoreResponse3;

        System.assert(vehicleSafetyScoreResponse1.equals(vehicleSafetyScoreResponse2));
        System.assert(vehicleSafetyScoreResponse2.equals(vehicleSafetyScoreResponse1));
        System.assert(vehicleSafetyScoreResponse1.equals(vehicleSafetyScoreResponse1));
        System.assert(vehicleSafetyScoreResponse3.equals(vehicleSafetyScoreResponse4));
        System.assert(vehicleSafetyScoreResponse4.equals(vehicleSafetyScoreResponse3));
        System.assert(vehicleSafetyScoreResponse3.equals(vehicleSafetyScoreResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse1 = OASVehicleSafetyScoreResponse.getExample();
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse2 = OASVehicleSafetyScoreResponse.getExample();
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse3 = new OASVehicleSafetyScoreResponse();
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse4 = new OASVehicleSafetyScoreResponse();

        System.assert(vehicleSafetyScoreResponse1.equals(vehicleSafetyScoreResponse2));
        System.assert(vehicleSafetyScoreResponse2.equals(vehicleSafetyScoreResponse1));
        System.assert(vehicleSafetyScoreResponse3.equals(vehicleSafetyScoreResponse4));
        System.assert(vehicleSafetyScoreResponse4.equals(vehicleSafetyScoreResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse1 = OASVehicleSafetyScoreResponse.getExample();
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse2 = new OASVehicleSafetyScoreResponse();

        System.assertEquals(false, vehicleSafetyScoreResponse1.equals('foo'));
        System.assertEquals(false, vehicleSafetyScoreResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse1 = OASVehicleSafetyScoreResponse.getExample();
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse2 = new OASVehicleSafetyScoreResponse();
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse3;

        System.assertEquals(false, vehicleSafetyScoreResponse1.equals(vehicleSafetyScoreResponse3));
        System.assertEquals(false, vehicleSafetyScoreResponse2.equals(vehicleSafetyScoreResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse1 = OASVehicleSafetyScoreResponse.getExample();
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse2 = new OASVehicleSafetyScoreResponse();

        System.assertEquals(vehicleSafetyScoreResponse1.hashCode(), vehicleSafetyScoreResponse1.hashCode());
        System.assertEquals(vehicleSafetyScoreResponse2.hashCode(), vehicleSafetyScoreResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse1 = OASVehicleSafetyScoreResponse.getExample();
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse2 = OASVehicleSafetyScoreResponse.getExample();
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse3 = new OASVehicleSafetyScoreResponse();
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse4 = new OASVehicleSafetyScoreResponse();

        System.assert(vehicleSafetyScoreResponse1.equals(vehicleSafetyScoreResponse2));
        System.assert(vehicleSafetyScoreResponse3.equals(vehicleSafetyScoreResponse4));
        System.assertEquals(vehicleSafetyScoreResponse1.hashCode(), vehicleSafetyScoreResponse2.hashCode());
        System.assertEquals(vehicleSafetyScoreResponse3.hashCode(), vehicleSafetyScoreResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse = new OASVehicleSafetyScoreResponse();
        System.assertEquals(new List<OASSafetyReportHarshEvent>(), vehicleSafetyScoreResponse.harshEvents);
        System.assertEquals(null, vehicleSafetyScoreResponse.crashCount);
        System.assertEquals(null, vehicleSafetyScoreResponse.harshAccelCount);
        System.assertEquals(null, vehicleSafetyScoreResponse.harshBrakingCount);
        System.assertEquals(null, vehicleSafetyScoreResponse.harshTurningCount);
        System.assertEquals(null, vehicleSafetyScoreResponse.safetyScore);
        System.assertEquals(null, vehicleSafetyScoreResponse.safetyScoreRank);
        System.assertEquals(null, vehicleSafetyScoreResponse.timeOverSpeedLimitMs);
        System.assertEquals(null, vehicleSafetyScoreResponse.totalDistanceDrivenMeters);
        System.assertEquals(null, vehicleSafetyScoreResponse.totalHarshEventCount);
        System.assertEquals(null, vehicleSafetyScoreResponse.totalTimeDrivenMs);
        System.assertEquals(null, vehicleSafetyScoreResponse.vehicleId);
    }
}
