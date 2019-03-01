@isTest
private class OASHosAuthenticationLogsResponseAuthTest {
    @isTest
    private static void equalsSameInstance() {
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs1 = OASHosAuthenticationLogsResponseAuth.getExample();
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs2 = hosAuthenticationLogsResponseAuthenticationLogs1;
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs3 = new OASHosAuthenticationLogsResponseAuth();
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs4 = hosAuthenticationLogsResponseAuthenticationLogs3;

        System.assert(hosAuthenticationLogsResponseAuthenticationLogs1.equals(hosAuthenticationLogsResponseAuthenticationLogs2));
        System.assert(hosAuthenticationLogsResponseAuthenticationLogs2.equals(hosAuthenticationLogsResponseAuthenticationLogs1));
        System.assert(hosAuthenticationLogsResponseAuthenticationLogs1.equals(hosAuthenticationLogsResponseAuthenticationLogs1));
        System.assert(hosAuthenticationLogsResponseAuthenticationLogs3.equals(hosAuthenticationLogsResponseAuthenticationLogs4));
        System.assert(hosAuthenticationLogsResponseAuthenticationLogs4.equals(hosAuthenticationLogsResponseAuthenticationLogs3));
        System.assert(hosAuthenticationLogsResponseAuthenticationLogs3.equals(hosAuthenticationLogsResponseAuthenticationLogs3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs1 = OASHosAuthenticationLogsResponseAuth.getExample();
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs2 = OASHosAuthenticationLogsResponseAuth.getExample();
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs3 = new OASHosAuthenticationLogsResponseAuth();
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs4 = new OASHosAuthenticationLogsResponseAuth();

        System.assert(hosAuthenticationLogsResponseAuthenticationLogs1.equals(hosAuthenticationLogsResponseAuthenticationLogs2));
        System.assert(hosAuthenticationLogsResponseAuthenticationLogs2.equals(hosAuthenticationLogsResponseAuthenticationLogs1));
        System.assert(hosAuthenticationLogsResponseAuthenticationLogs3.equals(hosAuthenticationLogsResponseAuthenticationLogs4));
        System.assert(hosAuthenticationLogsResponseAuthenticationLogs4.equals(hosAuthenticationLogsResponseAuthenticationLogs3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs1 = OASHosAuthenticationLogsResponseAuth.getExample();
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs2 = new OASHosAuthenticationLogsResponseAuth();

        System.assertEquals(false, hosAuthenticationLogsResponseAuthenticationLogs1.equals('foo'));
        System.assertEquals(false, hosAuthenticationLogsResponseAuthenticationLogs2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs1 = OASHosAuthenticationLogsResponseAuth.getExample();
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs2 = new OASHosAuthenticationLogsResponseAuth();
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs3;

        System.assertEquals(false, hosAuthenticationLogsResponseAuthenticationLogs1.equals(hosAuthenticationLogsResponseAuthenticationLogs3));
        System.assertEquals(false, hosAuthenticationLogsResponseAuthenticationLogs2.equals(hosAuthenticationLogsResponseAuthenticationLogs3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs1 = OASHosAuthenticationLogsResponseAuth.getExample();
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs2 = new OASHosAuthenticationLogsResponseAuth();

        System.assertEquals(hosAuthenticationLogsResponseAuthenticationLogs1.hashCode(), hosAuthenticationLogsResponseAuthenticationLogs1.hashCode());
        System.assertEquals(hosAuthenticationLogsResponseAuthenticationLogs2.hashCode(), hosAuthenticationLogsResponseAuthenticationLogs2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs1 = OASHosAuthenticationLogsResponseAuth.getExample();
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs2 = OASHosAuthenticationLogsResponseAuth.getExample();
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs3 = new OASHosAuthenticationLogsResponseAuth();
        OASHosAuthenticationLogsResponseAuth hosAuthenticationLogsResponseAuthenticationLogs4 = new OASHosAuthenticationLogsResponseAuth();

        System.assert(hosAuthenticationLogsResponseAuthenticationLogs1.equals(hosAuthenticationLogsResponseAuthenticationLogs2));
        System.assert(hosAuthenticationLogsResponseAuthenticationLogs3.equals(hosAuthenticationLogsResponseAuthenticationLogs4));
        System.assertEquals(hosAuthenticationLogsResponseAuthenticationLogs1.hashCode(), hosAuthenticationLogsResponseAuthenticationLogs2.hashCode());
        System.assertEquals(hosAuthenticationLogsResponseAuthenticationLogs3.hashCode(), hosAuthenticationLogsResponseAuthenticationLogs4.hashCode());
    }
}
