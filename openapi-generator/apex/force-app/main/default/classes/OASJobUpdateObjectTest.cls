@isTest
private class OASJobUpdateObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASJobUpdateObject jobUpdateObject1 = OASJobUpdateObject.getExample();
        OASJobUpdateObject jobUpdateObject2 = jobUpdateObject1;
        OASJobUpdateObject jobUpdateObject3 = new OASJobUpdateObject();
        OASJobUpdateObject jobUpdateObject4 = jobUpdateObject3;

        System.assert(jobUpdateObject1.equals(jobUpdateObject2));
        System.assert(jobUpdateObject2.equals(jobUpdateObject1));
        System.assert(jobUpdateObject1.equals(jobUpdateObject1));
        System.assert(jobUpdateObject3.equals(jobUpdateObject4));
        System.assert(jobUpdateObject4.equals(jobUpdateObject3));
        System.assert(jobUpdateObject3.equals(jobUpdateObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASJobUpdateObject jobUpdateObject1 = OASJobUpdateObject.getExample();
        OASJobUpdateObject jobUpdateObject2 = OASJobUpdateObject.getExample();
        OASJobUpdateObject jobUpdateObject3 = new OASJobUpdateObject();
        OASJobUpdateObject jobUpdateObject4 = new OASJobUpdateObject();

        System.assert(jobUpdateObject1.equals(jobUpdateObject2));
        System.assert(jobUpdateObject2.equals(jobUpdateObject1));
        System.assert(jobUpdateObject3.equals(jobUpdateObject4));
        System.assert(jobUpdateObject4.equals(jobUpdateObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASJobUpdateObject jobUpdateObject1 = OASJobUpdateObject.getExample();
        OASJobUpdateObject jobUpdateObject2 = new OASJobUpdateObject();

        System.assertEquals(false, jobUpdateObject1.equals('foo'));
        System.assertEquals(false, jobUpdateObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASJobUpdateObject jobUpdateObject1 = OASJobUpdateObject.getExample();
        OASJobUpdateObject jobUpdateObject2 = new OASJobUpdateObject();
        OASJobUpdateObject jobUpdateObject3;

        System.assertEquals(false, jobUpdateObject1.equals(jobUpdateObject3));
        System.assertEquals(false, jobUpdateObject2.equals(jobUpdateObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASJobUpdateObject jobUpdateObject1 = OASJobUpdateObject.getExample();
        OASJobUpdateObject jobUpdateObject2 = new OASJobUpdateObject();

        System.assertEquals(jobUpdateObject1.hashCode(), jobUpdateObject1.hashCode());
        System.assertEquals(jobUpdateObject2.hashCode(), jobUpdateObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASJobUpdateObject jobUpdateObject1 = OASJobUpdateObject.getExample();
        OASJobUpdateObject jobUpdateObject2 = OASJobUpdateObject.getExample();
        OASJobUpdateObject jobUpdateObject3 = new OASJobUpdateObject();
        OASJobUpdateObject jobUpdateObject4 = new OASJobUpdateObject();

        System.assert(jobUpdateObject1.equals(jobUpdateObject2));
        System.assert(jobUpdateObject3.equals(jobUpdateObject4));
        System.assertEquals(jobUpdateObject1.hashCode(), jobUpdateObject2.hashCode());
        System.assertEquals(jobUpdateObject3.hashCode(), jobUpdateObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASJobUpdateObject jobUpdateObject = new OASJobUpdateObject();
        Map<String, String> propertyMappings = jobUpdateObject.getPropertyMappings();
        System.assertEquals('changedAtMs', propertyMappings.get('changed_at_ms'));
        System.assertEquals('jobId', propertyMappings.get('job_id'));
        System.assertEquals('jobState', propertyMappings.get('job_state'));
        System.assertEquals('prevJobState', propertyMappings.get('prev_job_state'));
        System.assertEquals('routeId', propertyMappings.get('route_id'));
    }
}
