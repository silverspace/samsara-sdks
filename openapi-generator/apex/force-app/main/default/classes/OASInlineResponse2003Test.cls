@isTest
private class OASInlineResponse2003Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineResponse2003 inlineResponse20031 = OASInlineResponse2003.getExample();
        OASInlineResponse2003 inlineResponse20032 = inlineResponse20031;
        OASInlineResponse2003 inlineResponse20033 = new OASInlineResponse2003();
        OASInlineResponse2003 inlineResponse20034 = inlineResponse20033;

        System.assert(inlineResponse20031.equals(inlineResponse20032));
        System.assert(inlineResponse20032.equals(inlineResponse20031));
        System.assert(inlineResponse20031.equals(inlineResponse20031));
        System.assert(inlineResponse20033.equals(inlineResponse20034));
        System.assert(inlineResponse20034.equals(inlineResponse20033));
        System.assert(inlineResponse20033.equals(inlineResponse20033));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineResponse2003 inlineResponse20031 = OASInlineResponse2003.getExample();
        OASInlineResponse2003 inlineResponse20032 = OASInlineResponse2003.getExample();
        OASInlineResponse2003 inlineResponse20033 = new OASInlineResponse2003();
        OASInlineResponse2003 inlineResponse20034 = new OASInlineResponse2003();

        System.assert(inlineResponse20031.equals(inlineResponse20032));
        System.assert(inlineResponse20032.equals(inlineResponse20031));
        System.assert(inlineResponse20033.equals(inlineResponse20034));
        System.assert(inlineResponse20034.equals(inlineResponse20033));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineResponse2003 inlineResponse20031 = OASInlineResponse2003.getExample();
        OASInlineResponse2003 inlineResponse20032 = new OASInlineResponse2003();

        System.assertEquals(false, inlineResponse20031.equals('foo'));
        System.assertEquals(false, inlineResponse20032.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineResponse2003 inlineResponse20031 = OASInlineResponse2003.getExample();
        OASInlineResponse2003 inlineResponse20032 = new OASInlineResponse2003();
        OASInlineResponse2003 inlineResponse20033;

        System.assertEquals(false, inlineResponse20031.equals(inlineResponse20033));
        System.assertEquals(false, inlineResponse20032.equals(inlineResponse20033));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineResponse2003 inlineResponse20031 = OASInlineResponse2003.getExample();
        OASInlineResponse2003 inlineResponse20032 = new OASInlineResponse2003();

        System.assertEquals(inlineResponse20031.hashCode(), inlineResponse20031.hashCode());
        System.assertEquals(inlineResponse20032.hashCode(), inlineResponse20032.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineResponse2003 inlineResponse20031 = OASInlineResponse2003.getExample();
        OASInlineResponse2003 inlineResponse20032 = OASInlineResponse2003.getExample();
        OASInlineResponse2003 inlineResponse20033 = new OASInlineResponse2003();
        OASInlineResponse2003 inlineResponse20034 = new OASInlineResponse2003();

        System.assert(inlineResponse20031.equals(inlineResponse20032));
        System.assert(inlineResponse20033.equals(inlineResponse20034));
        System.assertEquals(inlineResponse20031.hashCode(), inlineResponse20032.hashCode());
        System.assertEquals(inlineResponse20033.hashCode(), inlineResponse20034.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineResponse2003 inlineResponse2003 = new OASInlineResponse2003();
        System.assertEquals(new List<OASVehicleLocation>(), inlineResponse2003.vehicles);
        System.assertEquals(null, inlineResponse2003.groupId);
    }
}
