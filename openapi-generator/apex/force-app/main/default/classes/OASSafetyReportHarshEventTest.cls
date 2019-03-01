@isTest
private class OASSafetyReportHarshEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASSafetyReportHarshEvent safetyReportHarshEvent1 = OASSafetyReportHarshEvent.getExample();
        OASSafetyReportHarshEvent safetyReportHarshEvent2 = safetyReportHarshEvent1;
        OASSafetyReportHarshEvent safetyReportHarshEvent3 = new OASSafetyReportHarshEvent();
        OASSafetyReportHarshEvent safetyReportHarshEvent4 = safetyReportHarshEvent3;

        System.assert(safetyReportHarshEvent1.equals(safetyReportHarshEvent2));
        System.assert(safetyReportHarshEvent2.equals(safetyReportHarshEvent1));
        System.assert(safetyReportHarshEvent1.equals(safetyReportHarshEvent1));
        System.assert(safetyReportHarshEvent3.equals(safetyReportHarshEvent4));
        System.assert(safetyReportHarshEvent4.equals(safetyReportHarshEvent3));
        System.assert(safetyReportHarshEvent3.equals(safetyReportHarshEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSafetyReportHarshEvent safetyReportHarshEvent1 = OASSafetyReportHarshEvent.getExample();
        OASSafetyReportHarshEvent safetyReportHarshEvent2 = OASSafetyReportHarshEvent.getExample();
        OASSafetyReportHarshEvent safetyReportHarshEvent3 = new OASSafetyReportHarshEvent();
        OASSafetyReportHarshEvent safetyReportHarshEvent4 = new OASSafetyReportHarshEvent();

        System.assert(safetyReportHarshEvent1.equals(safetyReportHarshEvent2));
        System.assert(safetyReportHarshEvent2.equals(safetyReportHarshEvent1));
        System.assert(safetyReportHarshEvent3.equals(safetyReportHarshEvent4));
        System.assert(safetyReportHarshEvent4.equals(safetyReportHarshEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSafetyReportHarshEvent safetyReportHarshEvent1 = OASSafetyReportHarshEvent.getExample();
        OASSafetyReportHarshEvent safetyReportHarshEvent2 = new OASSafetyReportHarshEvent();

        System.assertEquals(false, safetyReportHarshEvent1.equals('foo'));
        System.assertEquals(false, safetyReportHarshEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSafetyReportHarshEvent safetyReportHarshEvent1 = OASSafetyReportHarshEvent.getExample();
        OASSafetyReportHarshEvent safetyReportHarshEvent2 = new OASSafetyReportHarshEvent();
        OASSafetyReportHarshEvent safetyReportHarshEvent3;

        System.assertEquals(false, safetyReportHarshEvent1.equals(safetyReportHarshEvent3));
        System.assertEquals(false, safetyReportHarshEvent2.equals(safetyReportHarshEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSafetyReportHarshEvent safetyReportHarshEvent1 = OASSafetyReportHarshEvent.getExample();
        OASSafetyReportHarshEvent safetyReportHarshEvent2 = new OASSafetyReportHarshEvent();

        System.assertEquals(safetyReportHarshEvent1.hashCode(), safetyReportHarshEvent1.hashCode());
        System.assertEquals(safetyReportHarshEvent2.hashCode(), safetyReportHarshEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSafetyReportHarshEvent safetyReportHarshEvent1 = OASSafetyReportHarshEvent.getExample();
        OASSafetyReportHarshEvent safetyReportHarshEvent2 = OASSafetyReportHarshEvent.getExample();
        OASSafetyReportHarshEvent safetyReportHarshEvent3 = new OASSafetyReportHarshEvent();
        OASSafetyReportHarshEvent safetyReportHarshEvent4 = new OASSafetyReportHarshEvent();

        System.assert(safetyReportHarshEvent1.equals(safetyReportHarshEvent2));
        System.assert(safetyReportHarshEvent3.equals(safetyReportHarshEvent4));
        System.assertEquals(safetyReportHarshEvent1.hashCode(), safetyReportHarshEvent2.hashCode());
        System.assertEquals(safetyReportHarshEvent3.hashCode(), safetyReportHarshEvent4.hashCode());
    }
}
