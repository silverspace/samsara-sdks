@isTest
private class OASDvirBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDvirBase dvirBase1 = OASDvirBase.getExample();
        OASDvirBase dvirBase2 = dvirBase1;
        OASDvirBase dvirBase3 = new OASDvirBase();
        OASDvirBase dvirBase4 = dvirBase3;

        System.assert(dvirBase1.equals(dvirBase2));
        System.assert(dvirBase2.equals(dvirBase1));
        System.assert(dvirBase1.equals(dvirBase1));
        System.assert(dvirBase3.equals(dvirBase4));
        System.assert(dvirBase4.equals(dvirBase3));
        System.assert(dvirBase3.equals(dvirBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDvirBase dvirBase1 = OASDvirBase.getExample();
        OASDvirBase dvirBase2 = OASDvirBase.getExample();
        OASDvirBase dvirBase3 = new OASDvirBase();
        OASDvirBase dvirBase4 = new OASDvirBase();

        System.assert(dvirBase1.equals(dvirBase2));
        System.assert(dvirBase2.equals(dvirBase1));
        System.assert(dvirBase3.equals(dvirBase4));
        System.assert(dvirBase4.equals(dvirBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDvirBase dvirBase1 = OASDvirBase.getExample();
        OASDvirBase dvirBase2 = new OASDvirBase();

        System.assertEquals(false, dvirBase1.equals('foo'));
        System.assertEquals(false, dvirBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDvirBase dvirBase1 = OASDvirBase.getExample();
        OASDvirBase dvirBase2 = new OASDvirBase();
        OASDvirBase dvirBase3;

        System.assertEquals(false, dvirBase1.equals(dvirBase3));
        System.assertEquals(false, dvirBase2.equals(dvirBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDvirBase dvirBase1 = OASDvirBase.getExample();
        OASDvirBase dvirBase2 = new OASDvirBase();

        System.assertEquals(dvirBase1.hashCode(), dvirBase1.hashCode());
        System.assertEquals(dvirBase2.hashCode(), dvirBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDvirBase dvirBase1 = OASDvirBase.getExample();
        OASDvirBase dvirBase2 = OASDvirBase.getExample();
        OASDvirBase dvirBase3 = new OASDvirBase();
        OASDvirBase dvirBase4 = new OASDvirBase();

        System.assert(dvirBase1.equals(dvirBase2));
        System.assert(dvirBase3.equals(dvirBase4));
        System.assertEquals(dvirBase1.hashCode(), dvirBase2.hashCode());
        System.assertEquals(dvirBase3.hashCode(), dvirBase4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDvirBase dvirBase = new OASDvirBase();
        System.assertEquals(new List<OASDvirBaseTrailerDefects>(), dvirBase.trailerDefects);
        System.assertEquals(new List<OASDvirBaseTrailerDefects>(), dvirBase.vehicleDefects);
        System.assertEquals(null, dvirBase.authorSignature);
        System.assertEquals(null, dvirBase.defectsCorrected);
        System.assertEquals(null, dvirBase.defectsNeedNotBeCorrected);
        System.assertEquals(null, dvirBase.id);
        System.assertEquals(null, dvirBase.inspectionType);
        System.assertEquals(null, dvirBase.mechanicNotes);
        System.assertEquals(null, dvirBase.mechanicOrAgentSignature);
        System.assertEquals(null, dvirBase.nextDriverSignature);
        System.assertEquals(null, dvirBase.odometerMiles);
        System.assertEquals(null, dvirBase.timeMs);
        System.assertEquals(null, dvirBase.trailerId);
        System.assertEquals(null, dvirBase.trailerName);
        System.assertEquals(null, dvirBase.vehicle);
        System.assertEquals(null, dvirBase.vehicleCondition);
    }
}
