@isTest
private class OASJobStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASJobStatus> expected = new Set<OASJobStatus>{
            OASJobStatus.UNASSIGNED,
            OASJobStatus.SCHEDULED,
            OASJobStatus.ENROUTE,
            OASJobStatus.ARRIVED,
            OASJobStatus.COMPLETED,
            OASJobStatus.SKIPPED
        };
        Set<OASJobStatus> actual  = new Set<OASJobStatus>(OASJobStatus.values());
        System.assertEquals(expected, actual);
    }
}
