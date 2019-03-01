@isTest
private class OASInlineResponse2005VehicleStatsTest {
    @isTest
    private static void equalsSameInstance() {
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats1 = OASInlineResponse2005VehicleStats.getExample();
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats2 = inlineResponse2005VehicleStats1;
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats3 = new OASInlineResponse2005VehicleStats();
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats4 = inlineResponse2005VehicleStats3;

        System.assert(inlineResponse2005VehicleStats1.equals(inlineResponse2005VehicleStats2));
        System.assert(inlineResponse2005VehicleStats2.equals(inlineResponse2005VehicleStats1));
        System.assert(inlineResponse2005VehicleStats1.equals(inlineResponse2005VehicleStats1));
        System.assert(inlineResponse2005VehicleStats3.equals(inlineResponse2005VehicleStats4));
        System.assert(inlineResponse2005VehicleStats4.equals(inlineResponse2005VehicleStats3));
        System.assert(inlineResponse2005VehicleStats3.equals(inlineResponse2005VehicleStats3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats1 = OASInlineResponse2005VehicleStats.getExample();
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats2 = OASInlineResponse2005VehicleStats.getExample();
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats3 = new OASInlineResponse2005VehicleStats();
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats4 = new OASInlineResponse2005VehicleStats();

        System.assert(inlineResponse2005VehicleStats1.equals(inlineResponse2005VehicleStats2));
        System.assert(inlineResponse2005VehicleStats2.equals(inlineResponse2005VehicleStats1));
        System.assert(inlineResponse2005VehicleStats3.equals(inlineResponse2005VehicleStats4));
        System.assert(inlineResponse2005VehicleStats4.equals(inlineResponse2005VehicleStats3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats1 = OASInlineResponse2005VehicleStats.getExample();
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats2 = new OASInlineResponse2005VehicleStats();

        System.assertEquals(false, inlineResponse2005VehicleStats1.equals('foo'));
        System.assertEquals(false, inlineResponse2005VehicleStats2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats1 = OASInlineResponse2005VehicleStats.getExample();
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats2 = new OASInlineResponse2005VehicleStats();
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats3;

        System.assertEquals(false, inlineResponse2005VehicleStats1.equals(inlineResponse2005VehicleStats3));
        System.assertEquals(false, inlineResponse2005VehicleStats2.equals(inlineResponse2005VehicleStats3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats1 = OASInlineResponse2005VehicleStats.getExample();
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats2 = new OASInlineResponse2005VehicleStats();

        System.assertEquals(inlineResponse2005VehicleStats1.hashCode(), inlineResponse2005VehicleStats1.hashCode());
        System.assertEquals(inlineResponse2005VehicleStats2.hashCode(), inlineResponse2005VehicleStats2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats1 = OASInlineResponse2005VehicleStats.getExample();
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats2 = OASInlineResponse2005VehicleStats.getExample();
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats3 = new OASInlineResponse2005VehicleStats();
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats4 = new OASInlineResponse2005VehicleStats();

        System.assert(inlineResponse2005VehicleStats1.equals(inlineResponse2005VehicleStats2));
        System.assert(inlineResponse2005VehicleStats3.equals(inlineResponse2005VehicleStats4));
        System.assertEquals(inlineResponse2005VehicleStats1.hashCode(), inlineResponse2005VehicleStats2.hashCode());
        System.assertEquals(inlineResponse2005VehicleStats3.hashCode(), inlineResponse2005VehicleStats4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineResponse2005VehicleStats inlineResponse2005VehicleStats = new OASInlineResponse2005VehicleStats();
        System.assertEquals(new List<OASEngineState>(), inlineResponse2005VehicleStats.engineState);
        System.assertEquals(null, inlineResponse2005VehicleStats.auxInput2);
        System.assertEquals(null, inlineResponse2005VehicleStats.vehicleId);
        System.assertEquals(null, inlineResponse2005VehicleStats.auxInput1);
    }
}
