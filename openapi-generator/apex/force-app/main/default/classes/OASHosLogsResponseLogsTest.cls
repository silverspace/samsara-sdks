@isTest
private class OASHosLogsResponseLogsTest {
    @isTest
    private static void equalsSameInstance() {
        OASHosLogsResponseLogs hosLogsResponseLogs1 = OASHosLogsResponseLogs.getExample();
        OASHosLogsResponseLogs hosLogsResponseLogs2 = hosLogsResponseLogs1;
        OASHosLogsResponseLogs hosLogsResponseLogs3 = new OASHosLogsResponseLogs();
        OASHosLogsResponseLogs hosLogsResponseLogs4 = hosLogsResponseLogs3;

        System.assert(hosLogsResponseLogs1.equals(hosLogsResponseLogs2));
        System.assert(hosLogsResponseLogs2.equals(hosLogsResponseLogs1));
        System.assert(hosLogsResponseLogs1.equals(hosLogsResponseLogs1));
        System.assert(hosLogsResponseLogs3.equals(hosLogsResponseLogs4));
        System.assert(hosLogsResponseLogs4.equals(hosLogsResponseLogs3));
        System.assert(hosLogsResponseLogs3.equals(hosLogsResponseLogs3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHosLogsResponseLogs hosLogsResponseLogs1 = OASHosLogsResponseLogs.getExample();
        OASHosLogsResponseLogs hosLogsResponseLogs2 = OASHosLogsResponseLogs.getExample();
        OASHosLogsResponseLogs hosLogsResponseLogs3 = new OASHosLogsResponseLogs();
        OASHosLogsResponseLogs hosLogsResponseLogs4 = new OASHosLogsResponseLogs();

        System.assert(hosLogsResponseLogs1.equals(hosLogsResponseLogs2));
        System.assert(hosLogsResponseLogs2.equals(hosLogsResponseLogs1));
        System.assert(hosLogsResponseLogs3.equals(hosLogsResponseLogs4));
        System.assert(hosLogsResponseLogs4.equals(hosLogsResponseLogs3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHosLogsResponseLogs hosLogsResponseLogs1 = OASHosLogsResponseLogs.getExample();
        OASHosLogsResponseLogs hosLogsResponseLogs2 = new OASHosLogsResponseLogs();

        System.assertEquals(false, hosLogsResponseLogs1.equals('foo'));
        System.assertEquals(false, hosLogsResponseLogs2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHosLogsResponseLogs hosLogsResponseLogs1 = OASHosLogsResponseLogs.getExample();
        OASHosLogsResponseLogs hosLogsResponseLogs2 = new OASHosLogsResponseLogs();
        OASHosLogsResponseLogs hosLogsResponseLogs3;

        System.assertEquals(false, hosLogsResponseLogs1.equals(hosLogsResponseLogs3));
        System.assertEquals(false, hosLogsResponseLogs2.equals(hosLogsResponseLogs3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHosLogsResponseLogs hosLogsResponseLogs1 = OASHosLogsResponseLogs.getExample();
        OASHosLogsResponseLogs hosLogsResponseLogs2 = new OASHosLogsResponseLogs();

        System.assertEquals(hosLogsResponseLogs1.hashCode(), hosLogsResponseLogs1.hashCode());
        System.assertEquals(hosLogsResponseLogs2.hashCode(), hosLogsResponseLogs2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHosLogsResponseLogs hosLogsResponseLogs1 = OASHosLogsResponseLogs.getExample();
        OASHosLogsResponseLogs hosLogsResponseLogs2 = OASHosLogsResponseLogs.getExample();
        OASHosLogsResponseLogs hosLogsResponseLogs3 = new OASHosLogsResponseLogs();
        OASHosLogsResponseLogs hosLogsResponseLogs4 = new OASHosLogsResponseLogs();

        System.assert(hosLogsResponseLogs1.equals(hosLogsResponseLogs2));
        System.assert(hosLogsResponseLogs3.equals(hosLogsResponseLogs4));
        System.assertEquals(hosLogsResponseLogs1.hashCode(), hosLogsResponseLogs2.hashCode());
        System.assertEquals(hosLogsResponseLogs3.hashCode(), hosLogsResponseLogs4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASHosLogsResponseLogs hosLogsResponseLogs = new OASHosLogsResponseLogs();
        System.assertEquals(new List<Long>(), hosLogsResponseLogs.codriverIds);
        System.assertEquals(null, hosLogsResponseLogs.locLng);
        System.assertEquals(null, hosLogsResponseLogs.logStartMs);
        System.assertEquals(null, hosLogsResponseLogs.driverId);
        System.assertEquals(null, hosLogsResponseLogs.statusType);
        System.assertEquals(null, hosLogsResponseLogs.locCity);
        System.assertEquals(null, hosLogsResponseLogs.groupId);
        System.assertEquals(null, hosLogsResponseLogs.locName);
        System.assertEquals(null, hosLogsResponseLogs.locLat);
        System.assertEquals(null, hosLogsResponseLogs.remark);
        System.assertEquals(null, hosLogsResponseLogs.locState);
        System.assertEquals(null, hosLogsResponseLogs.vehicleId);
    }
}
