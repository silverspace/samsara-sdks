@isTest
private class OASInlineResponse2002Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineResponse2002 inlineResponse20021 = OASInlineResponse2002.getExample();
        OASInlineResponse2002 inlineResponse20022 = inlineResponse20021;
        OASInlineResponse2002 inlineResponse20023 = new OASInlineResponse2002();
        OASInlineResponse2002 inlineResponse20024 = inlineResponse20023;

        System.assert(inlineResponse20021.equals(inlineResponse20022));
        System.assert(inlineResponse20022.equals(inlineResponse20021));
        System.assert(inlineResponse20021.equals(inlineResponse20021));
        System.assert(inlineResponse20023.equals(inlineResponse20024));
        System.assert(inlineResponse20024.equals(inlineResponse20023));
        System.assert(inlineResponse20023.equals(inlineResponse20023));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineResponse2002 inlineResponse20021 = OASInlineResponse2002.getExample();
        OASInlineResponse2002 inlineResponse20022 = OASInlineResponse2002.getExample();
        OASInlineResponse2002 inlineResponse20023 = new OASInlineResponse2002();
        OASInlineResponse2002 inlineResponse20024 = new OASInlineResponse2002();

        System.assert(inlineResponse20021.equals(inlineResponse20022));
        System.assert(inlineResponse20022.equals(inlineResponse20021));
        System.assert(inlineResponse20023.equals(inlineResponse20024));
        System.assert(inlineResponse20024.equals(inlineResponse20023));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineResponse2002 inlineResponse20021 = OASInlineResponse2002.getExample();
        OASInlineResponse2002 inlineResponse20022 = new OASInlineResponse2002();

        System.assertEquals(false, inlineResponse20021.equals('foo'));
        System.assertEquals(false, inlineResponse20022.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineResponse2002 inlineResponse20021 = OASInlineResponse2002.getExample();
        OASInlineResponse2002 inlineResponse20022 = new OASInlineResponse2002();
        OASInlineResponse2002 inlineResponse20023;

        System.assertEquals(false, inlineResponse20021.equals(inlineResponse20023));
        System.assertEquals(false, inlineResponse20022.equals(inlineResponse20023));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineResponse2002 inlineResponse20021 = OASInlineResponse2002.getExample();
        OASInlineResponse2002 inlineResponse20022 = new OASInlineResponse2002();

        System.assertEquals(inlineResponse20021.hashCode(), inlineResponse20021.hashCode());
        System.assertEquals(inlineResponse20022.hashCode(), inlineResponse20022.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineResponse2002 inlineResponse20021 = OASInlineResponse2002.getExample();
        OASInlineResponse2002 inlineResponse20022 = OASInlineResponse2002.getExample();
        OASInlineResponse2002 inlineResponse20023 = new OASInlineResponse2002();
        OASInlineResponse2002 inlineResponse20024 = new OASInlineResponse2002();

        System.assert(inlineResponse20021.equals(inlineResponse20022));
        System.assert(inlineResponse20023.equals(inlineResponse20024));
        System.assertEquals(inlineResponse20021.hashCode(), inlineResponse20022.hashCode());
        System.assertEquals(inlineResponse20023.hashCode(), inlineResponse20024.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineResponse2002 inlineResponse2002 = new OASInlineResponse2002();
        System.assertEquals(new List<OASVehicle>(), inlineResponse2002.vehicles);
        System.assertEquals(null, inlineResponse2002.pagination);
        System.assertEquals(null, inlineResponse2002.groupId);
    }
}
