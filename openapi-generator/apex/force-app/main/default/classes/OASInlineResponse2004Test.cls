@isTest
private class OASInlineResponse2004Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineResponse2004 inlineResponse20041 = OASInlineResponse2004.getExample();
        OASInlineResponse2004 inlineResponse20042 = inlineResponse20041;
        OASInlineResponse2004 inlineResponse20043 = new OASInlineResponse2004();
        OASInlineResponse2004 inlineResponse20044 = inlineResponse20043;

        System.assert(inlineResponse20041.equals(inlineResponse20042));
        System.assert(inlineResponse20042.equals(inlineResponse20041));
        System.assert(inlineResponse20041.equals(inlineResponse20041));
        System.assert(inlineResponse20043.equals(inlineResponse20044));
        System.assert(inlineResponse20044.equals(inlineResponse20043));
        System.assert(inlineResponse20043.equals(inlineResponse20043));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineResponse2004 inlineResponse20041 = OASInlineResponse2004.getExample();
        OASInlineResponse2004 inlineResponse20042 = OASInlineResponse2004.getExample();
        OASInlineResponse2004 inlineResponse20043 = new OASInlineResponse2004();
        OASInlineResponse2004 inlineResponse20044 = new OASInlineResponse2004();

        System.assert(inlineResponse20041.equals(inlineResponse20042));
        System.assert(inlineResponse20042.equals(inlineResponse20041));
        System.assert(inlineResponse20043.equals(inlineResponse20044));
        System.assert(inlineResponse20044.equals(inlineResponse20043));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineResponse2004 inlineResponse20041 = OASInlineResponse2004.getExample();
        OASInlineResponse2004 inlineResponse20042 = new OASInlineResponse2004();

        System.assertEquals(false, inlineResponse20041.equals('foo'));
        System.assertEquals(false, inlineResponse20042.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineResponse2004 inlineResponse20041 = OASInlineResponse2004.getExample();
        OASInlineResponse2004 inlineResponse20042 = new OASInlineResponse2004();
        OASInlineResponse2004 inlineResponse20043;

        System.assertEquals(false, inlineResponse20041.equals(inlineResponse20043));
        System.assertEquals(false, inlineResponse20042.equals(inlineResponse20043));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineResponse2004 inlineResponse20041 = OASInlineResponse2004.getExample();
        OASInlineResponse2004 inlineResponse20042 = new OASInlineResponse2004();

        System.assertEquals(inlineResponse20041.hashCode(), inlineResponse20041.hashCode());
        System.assertEquals(inlineResponse20042.hashCode(), inlineResponse20042.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineResponse2004 inlineResponse20041 = OASInlineResponse2004.getExample();
        OASInlineResponse2004 inlineResponse20042 = OASInlineResponse2004.getExample();
        OASInlineResponse2004 inlineResponse20043 = new OASInlineResponse2004();
        OASInlineResponse2004 inlineResponse20044 = new OASInlineResponse2004();

        System.assert(inlineResponse20041.equals(inlineResponse20042));
        System.assert(inlineResponse20043.equals(inlineResponse20044));
        System.assertEquals(inlineResponse20041.hashCode(), inlineResponse20042.hashCode());
        System.assertEquals(inlineResponse20043.hashCode(), inlineResponse20044.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineResponse2004 inlineResponse2004 = new OASInlineResponse2004();
        System.assertEquals(new List<OASVehicleMaintenance>(), inlineResponse2004.vehicles);
    }
}
