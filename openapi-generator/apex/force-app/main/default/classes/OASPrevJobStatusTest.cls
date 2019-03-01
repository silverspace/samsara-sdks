@isTest
private class OASPrevJobStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASPrevJobStatus> expected = new Set<OASPrevJobStatus>{
            OASPrevJobStatus.UNASSIGNED,
            OASPrevJobStatus.SCHEDULED,
            OASPrevJobStatus.ENROUTE,
            OASPrevJobStatus.ARRIVED,
            OASPrevJobStatus.COMPLETED,
            OASPrevJobStatus.SKIPPED
        };
        Set<OASPrevJobStatus> actual  = new Set<OASPrevJobStatus>(OASPrevJobStatus.values());
        System.assertEquals(expected, actual);
    }
}
