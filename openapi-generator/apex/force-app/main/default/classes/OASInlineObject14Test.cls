@isTest
private class OASInlineObject14Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject14 inlineObject141 = OASInlineObject14.getExample();
        OASInlineObject14 inlineObject142 = inlineObject141;
        OASInlineObject14 inlineObject143 = new OASInlineObject14();
        OASInlineObject14 inlineObject144 = inlineObject143;

        System.assert(inlineObject141.equals(inlineObject142));
        System.assert(inlineObject142.equals(inlineObject141));
        System.assert(inlineObject141.equals(inlineObject141));
        System.assert(inlineObject143.equals(inlineObject144));
        System.assert(inlineObject144.equals(inlineObject143));
        System.assert(inlineObject143.equals(inlineObject143));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject14 inlineObject141 = OASInlineObject14.getExample();
        OASInlineObject14 inlineObject142 = OASInlineObject14.getExample();
        OASInlineObject14 inlineObject143 = new OASInlineObject14();
        OASInlineObject14 inlineObject144 = new OASInlineObject14();

        System.assert(inlineObject141.equals(inlineObject142));
        System.assert(inlineObject142.equals(inlineObject141));
        System.assert(inlineObject143.equals(inlineObject144));
        System.assert(inlineObject144.equals(inlineObject143));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject14 inlineObject141 = OASInlineObject14.getExample();
        OASInlineObject14 inlineObject142 = new OASInlineObject14();

        System.assertEquals(false, inlineObject141.equals('foo'));
        System.assertEquals(false, inlineObject142.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject14 inlineObject141 = OASInlineObject14.getExample();
        OASInlineObject14 inlineObject142 = new OASInlineObject14();
        OASInlineObject14 inlineObject143;

        System.assertEquals(false, inlineObject141.equals(inlineObject143));
        System.assertEquals(false, inlineObject142.equals(inlineObject143));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject14 inlineObject141 = OASInlineObject14.getExample();
        OASInlineObject14 inlineObject142 = new OASInlineObject14();

        System.assertEquals(inlineObject141.hashCode(), inlineObject141.hashCode());
        System.assertEquals(inlineObject142.hashCode(), inlineObject142.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject14 inlineObject141 = OASInlineObject14.getExample();
        OASInlineObject14 inlineObject142 = OASInlineObject14.getExample();
        OASInlineObject14 inlineObject143 = new OASInlineObject14();
        OASInlineObject14 inlineObject144 = new OASInlineObject14();

        System.assert(inlineObject141.equals(inlineObject142));
        System.assert(inlineObject143.equals(inlineObject144));
        System.assertEquals(inlineObject141.hashCode(), inlineObject142.hashCode());
        System.assertEquals(inlineObject143.hashCode(), inlineObject144.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineObject14 inlineObject14 = new OASInlineObject14();
        System.assertEquals(new List<OASVehicle>(), inlineObject14.vehicles);
        System.assertEquals(null, inlineObject14.groupId);
    }
}
