@isTest
private class OASTagModifyTest {
    @isTest
    private static void equalsSameInstance() {
        OASTagModify tagModify1 = OASTagModify.getExample();
        OASTagModify tagModify2 = tagModify1;
        OASTagModify tagModify3 = new OASTagModify();
        OASTagModify tagModify4 = tagModify3;

        System.assert(tagModify1.equals(tagModify2));
        System.assert(tagModify2.equals(tagModify1));
        System.assert(tagModify1.equals(tagModify1));
        System.assert(tagModify3.equals(tagModify4));
        System.assert(tagModify4.equals(tagModify3));
        System.assert(tagModify3.equals(tagModify3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTagModify tagModify1 = OASTagModify.getExample();
        OASTagModify tagModify2 = OASTagModify.getExample();
        OASTagModify tagModify3 = new OASTagModify();
        OASTagModify tagModify4 = new OASTagModify();

        System.assert(tagModify1.equals(tagModify2));
        System.assert(tagModify2.equals(tagModify1));
        System.assert(tagModify3.equals(tagModify4));
        System.assert(tagModify4.equals(tagModify3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTagModify tagModify1 = OASTagModify.getExample();
        OASTagModify tagModify2 = new OASTagModify();

        System.assertEquals(false, tagModify1.equals('foo'));
        System.assertEquals(false, tagModify2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTagModify tagModify1 = OASTagModify.getExample();
        OASTagModify tagModify2 = new OASTagModify();
        OASTagModify tagModify3;

        System.assertEquals(false, tagModify1.equals(tagModify3));
        System.assertEquals(false, tagModify2.equals(tagModify3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTagModify tagModify1 = OASTagModify.getExample();
        OASTagModify tagModify2 = new OASTagModify();

        System.assertEquals(tagModify1.hashCode(), tagModify1.hashCode());
        System.assertEquals(tagModify2.hashCode(), tagModify2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTagModify tagModify1 = OASTagModify.getExample();
        OASTagModify tagModify2 = OASTagModify.getExample();
        OASTagModify tagModify3 = new OASTagModify();
        OASTagModify tagModify4 = new OASTagModify();

        System.assert(tagModify1.equals(tagModify2));
        System.assert(tagModify3.equals(tagModify4));
        System.assertEquals(tagModify1.hashCode(), tagModify2.hashCode());
        System.assertEquals(tagModify3.hashCode(), tagModify4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTagModify tagModify = new OASTagModify();
        Map<String, String> propertyMappings = tagModify.getPropertyMappings();
        System.assertEquals('r_delete', propertyMappings.get('delete'));
    }
}
