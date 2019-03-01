@isTest
private class OASDriverSafetyScoreResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDriverSafetyScoreResponse driverSafetyScoreResponse1 = OASDriverSafetyScoreResponse.getExample();
        OASDriverSafetyScoreResponse driverSafetyScoreResponse2 = driverSafetyScoreResponse1;
        OASDriverSafetyScoreResponse driverSafetyScoreResponse3 = new OASDriverSafetyScoreResponse();
        OASDriverSafetyScoreResponse driverSafetyScoreResponse4 = driverSafetyScoreResponse3;

        System.assert(driverSafetyScoreResponse1.equals(driverSafetyScoreResponse2));
        System.assert(driverSafetyScoreResponse2.equals(driverSafetyScoreResponse1));
        System.assert(driverSafetyScoreResponse1.equals(driverSafetyScoreResponse1));
        System.assert(driverSafetyScoreResponse3.equals(driverSafetyScoreResponse4));
        System.assert(driverSafetyScoreResponse4.equals(driverSafetyScoreResponse3));
        System.assert(driverSafetyScoreResponse3.equals(driverSafetyScoreResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDriverSafetyScoreResponse driverSafetyScoreResponse1 = OASDriverSafetyScoreResponse.getExample();
        OASDriverSafetyScoreResponse driverSafetyScoreResponse2 = OASDriverSafetyScoreResponse.getExample();
        OASDriverSafetyScoreResponse driverSafetyScoreResponse3 = new OASDriverSafetyScoreResponse();
        OASDriverSafetyScoreResponse driverSafetyScoreResponse4 = new OASDriverSafetyScoreResponse();

        System.assert(driverSafetyScoreResponse1.equals(driverSafetyScoreResponse2));
        System.assert(driverSafetyScoreResponse2.equals(driverSafetyScoreResponse1));
        System.assert(driverSafetyScoreResponse3.equals(driverSafetyScoreResponse4));
        System.assert(driverSafetyScoreResponse4.equals(driverSafetyScoreResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDriverSafetyScoreResponse driverSafetyScoreResponse1 = OASDriverSafetyScoreResponse.getExample();
        OASDriverSafetyScoreResponse driverSafetyScoreResponse2 = new OASDriverSafetyScoreResponse();

        System.assertEquals(false, driverSafetyScoreResponse1.equals('foo'));
        System.assertEquals(false, driverSafetyScoreResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDriverSafetyScoreResponse driverSafetyScoreResponse1 = OASDriverSafetyScoreResponse.getExample();
        OASDriverSafetyScoreResponse driverSafetyScoreResponse2 = new OASDriverSafetyScoreResponse();
        OASDriverSafetyScoreResponse driverSafetyScoreResponse3;

        System.assertEquals(false, driverSafetyScoreResponse1.equals(driverSafetyScoreResponse3));
        System.assertEquals(false, driverSafetyScoreResponse2.equals(driverSafetyScoreResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDriverSafetyScoreResponse driverSafetyScoreResponse1 = OASDriverSafetyScoreResponse.getExample();
        OASDriverSafetyScoreResponse driverSafetyScoreResponse2 = new OASDriverSafetyScoreResponse();

        System.assertEquals(driverSafetyScoreResponse1.hashCode(), driverSafetyScoreResponse1.hashCode());
        System.assertEquals(driverSafetyScoreResponse2.hashCode(), driverSafetyScoreResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDriverSafetyScoreResponse driverSafetyScoreResponse1 = OASDriverSafetyScoreResponse.getExample();
        OASDriverSafetyScoreResponse driverSafetyScoreResponse2 = OASDriverSafetyScoreResponse.getExample();
        OASDriverSafetyScoreResponse driverSafetyScoreResponse3 = new OASDriverSafetyScoreResponse();
        OASDriverSafetyScoreResponse driverSafetyScoreResponse4 = new OASDriverSafetyScoreResponse();

        System.assert(driverSafetyScoreResponse1.equals(driverSafetyScoreResponse2));
        System.assert(driverSafetyScoreResponse3.equals(driverSafetyScoreResponse4));
        System.assertEquals(driverSafetyScoreResponse1.hashCode(), driverSafetyScoreResponse2.hashCode());
        System.assertEquals(driverSafetyScoreResponse3.hashCode(), driverSafetyScoreResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDriverSafetyScoreResponse driverSafetyScoreResponse = new OASDriverSafetyScoreResponse();
        System.assertEquals(new List<OASSafetyReportHarshEvent>(), driverSafetyScoreResponse.harshEvents);
        System.assertEquals(null, driverSafetyScoreResponse.crashCount);
        System.assertEquals(null, driverSafetyScoreResponse.driverId);
        System.assertEquals(null, driverSafetyScoreResponse.harshAccelCount);
        System.assertEquals(null, driverSafetyScoreResponse.harshBrakingCount);
        System.assertEquals(null, driverSafetyScoreResponse.harshTurningCount);
        System.assertEquals(null, driverSafetyScoreResponse.safetyScore);
        System.assertEquals(null, driverSafetyScoreResponse.safetyScoreRank);
        System.assertEquals(null, driverSafetyScoreResponse.timeOverSpeedLimitMs);
        System.assertEquals(null, driverSafetyScoreResponse.totalDistanceDrivenMeters);
        System.assertEquals(null, driverSafetyScoreResponse.totalHarshEventCount);
        System.assertEquals(null, driverSafetyScoreResponse.totalTimeDrivenMs);
    }
}
