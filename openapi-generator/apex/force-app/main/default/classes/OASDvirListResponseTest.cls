@isTest
private class OASDvirListResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDvirListResponse dvirListResponse1 = OASDvirListResponse.getExample();
        OASDvirListResponse dvirListResponse2 = dvirListResponse1;
        OASDvirListResponse dvirListResponse3 = new OASDvirListResponse();
        OASDvirListResponse dvirListResponse4 = dvirListResponse3;

        System.assert(dvirListResponse1.equals(dvirListResponse2));
        System.assert(dvirListResponse2.equals(dvirListResponse1));
        System.assert(dvirListResponse1.equals(dvirListResponse1));
        System.assert(dvirListResponse3.equals(dvirListResponse4));
        System.assert(dvirListResponse4.equals(dvirListResponse3));
        System.assert(dvirListResponse3.equals(dvirListResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDvirListResponse dvirListResponse1 = OASDvirListResponse.getExample();
        OASDvirListResponse dvirListResponse2 = OASDvirListResponse.getExample();
        OASDvirListResponse dvirListResponse3 = new OASDvirListResponse();
        OASDvirListResponse dvirListResponse4 = new OASDvirListResponse();

        System.assert(dvirListResponse1.equals(dvirListResponse2));
        System.assert(dvirListResponse2.equals(dvirListResponse1));
        System.assert(dvirListResponse3.equals(dvirListResponse4));
        System.assert(dvirListResponse4.equals(dvirListResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDvirListResponse dvirListResponse1 = OASDvirListResponse.getExample();
        OASDvirListResponse dvirListResponse2 = new OASDvirListResponse();

        System.assertEquals(false, dvirListResponse1.equals('foo'));
        System.assertEquals(false, dvirListResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDvirListResponse dvirListResponse1 = OASDvirListResponse.getExample();
        OASDvirListResponse dvirListResponse2 = new OASDvirListResponse();
        OASDvirListResponse dvirListResponse3;

        System.assertEquals(false, dvirListResponse1.equals(dvirListResponse3));
        System.assertEquals(false, dvirListResponse2.equals(dvirListResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDvirListResponse dvirListResponse1 = OASDvirListResponse.getExample();
        OASDvirListResponse dvirListResponse2 = new OASDvirListResponse();

        System.assertEquals(dvirListResponse1.hashCode(), dvirListResponse1.hashCode());
        System.assertEquals(dvirListResponse2.hashCode(), dvirListResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDvirListResponse dvirListResponse1 = OASDvirListResponse.getExample();
        OASDvirListResponse dvirListResponse2 = OASDvirListResponse.getExample();
        OASDvirListResponse dvirListResponse3 = new OASDvirListResponse();
        OASDvirListResponse dvirListResponse4 = new OASDvirListResponse();

        System.assert(dvirListResponse1.equals(dvirListResponse2));
        System.assert(dvirListResponse3.equals(dvirListResponse4));
        System.assertEquals(dvirListResponse1.hashCode(), dvirListResponse2.hashCode());
        System.assertEquals(dvirListResponse3.hashCode(), dvirListResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDvirListResponse dvirListResponse = new OASDvirListResponse();
        System.assertEquals(new List<OASDvirBase>(), dvirListResponse.dvirs);
    }
}
