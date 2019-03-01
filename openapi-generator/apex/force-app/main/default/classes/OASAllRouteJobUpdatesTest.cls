@isTest
private class OASAllRouteJobUpdatesTest {
    @isTest
    private static void equalsSameInstance() {
        OASAllRouteJobUpdates allRouteJobUpdates1 = OASAllRouteJobUpdates.getExample();
        OASAllRouteJobUpdates allRouteJobUpdates2 = allRouteJobUpdates1;
        OASAllRouteJobUpdates allRouteJobUpdates3 = new OASAllRouteJobUpdates();
        OASAllRouteJobUpdates allRouteJobUpdates4 = allRouteJobUpdates3;

        System.assert(allRouteJobUpdates1.equals(allRouteJobUpdates2));
        System.assert(allRouteJobUpdates2.equals(allRouteJobUpdates1));
        System.assert(allRouteJobUpdates1.equals(allRouteJobUpdates1));
        System.assert(allRouteJobUpdates3.equals(allRouteJobUpdates4));
        System.assert(allRouteJobUpdates4.equals(allRouteJobUpdates3));
        System.assert(allRouteJobUpdates3.equals(allRouteJobUpdates3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAllRouteJobUpdates allRouteJobUpdates1 = OASAllRouteJobUpdates.getExample();
        OASAllRouteJobUpdates allRouteJobUpdates2 = OASAllRouteJobUpdates.getExample();
        OASAllRouteJobUpdates allRouteJobUpdates3 = new OASAllRouteJobUpdates();
        OASAllRouteJobUpdates allRouteJobUpdates4 = new OASAllRouteJobUpdates();

        System.assert(allRouteJobUpdates1.equals(allRouteJobUpdates2));
        System.assert(allRouteJobUpdates2.equals(allRouteJobUpdates1));
        System.assert(allRouteJobUpdates3.equals(allRouteJobUpdates4));
        System.assert(allRouteJobUpdates4.equals(allRouteJobUpdates3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAllRouteJobUpdates allRouteJobUpdates1 = OASAllRouteJobUpdates.getExample();
        OASAllRouteJobUpdates allRouteJobUpdates2 = new OASAllRouteJobUpdates();

        System.assertEquals(false, allRouteJobUpdates1.equals('foo'));
        System.assertEquals(false, allRouteJobUpdates2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAllRouteJobUpdates allRouteJobUpdates1 = OASAllRouteJobUpdates.getExample();
        OASAllRouteJobUpdates allRouteJobUpdates2 = new OASAllRouteJobUpdates();
        OASAllRouteJobUpdates allRouteJobUpdates3;

        System.assertEquals(false, allRouteJobUpdates1.equals(allRouteJobUpdates3));
        System.assertEquals(false, allRouteJobUpdates2.equals(allRouteJobUpdates3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAllRouteJobUpdates allRouteJobUpdates1 = OASAllRouteJobUpdates.getExample();
        OASAllRouteJobUpdates allRouteJobUpdates2 = new OASAllRouteJobUpdates();

        System.assertEquals(allRouteJobUpdates1.hashCode(), allRouteJobUpdates1.hashCode());
        System.assertEquals(allRouteJobUpdates2.hashCode(), allRouteJobUpdates2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAllRouteJobUpdates allRouteJobUpdates1 = OASAllRouteJobUpdates.getExample();
        OASAllRouteJobUpdates allRouteJobUpdates2 = OASAllRouteJobUpdates.getExample();
        OASAllRouteJobUpdates allRouteJobUpdates3 = new OASAllRouteJobUpdates();
        OASAllRouteJobUpdates allRouteJobUpdates4 = new OASAllRouteJobUpdates();

        System.assert(allRouteJobUpdates1.equals(allRouteJobUpdates2));
        System.assert(allRouteJobUpdates3.equals(allRouteJobUpdates4));
        System.assertEquals(allRouteJobUpdates1.hashCode(), allRouteJobUpdates2.hashCode());
        System.assertEquals(allRouteJobUpdates3.hashCode(), allRouteJobUpdates4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAllRouteJobUpdates allRouteJobUpdates = new OASAllRouteJobUpdates();
        Map<String, String> propertyMappings = allRouteJobUpdates.getPropertyMappings();
        System.assertEquals('jobUpdates', propertyMappings.get('job_updates'));
        System.assertEquals('sequenceId', propertyMappings.get('sequence_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAllRouteJobUpdates allRouteJobUpdates = new OASAllRouteJobUpdates();
        System.assertEquals(new List<OASJobUpdateObject>(), allRouteJobUpdates.jobUpdates);
        System.assertEquals(null, allRouteJobUpdates.sequenceId);
    }
}
