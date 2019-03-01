@isTest
private class OASInlineObject21Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject21 inlineObject211 = OASInlineObject21.getExample();
        OASInlineObject21 inlineObject212 = inlineObject211;
        OASInlineObject21 inlineObject213 = new OASInlineObject21();
        OASInlineObject21 inlineObject214 = inlineObject213;

        System.assert(inlineObject211.equals(inlineObject212));
        System.assert(inlineObject212.equals(inlineObject211));
        System.assert(inlineObject211.equals(inlineObject211));
        System.assert(inlineObject213.equals(inlineObject214));
        System.assert(inlineObject214.equals(inlineObject213));
        System.assert(inlineObject213.equals(inlineObject213));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject21 inlineObject211 = OASInlineObject21.getExample();
        OASInlineObject21 inlineObject212 = OASInlineObject21.getExample();
        OASInlineObject21 inlineObject213 = new OASInlineObject21();
        OASInlineObject21 inlineObject214 = new OASInlineObject21();

        System.assert(inlineObject211.equals(inlineObject212));
        System.assert(inlineObject212.equals(inlineObject211));
        System.assert(inlineObject213.equals(inlineObject214));
        System.assert(inlineObject214.equals(inlineObject213));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject21 inlineObject211 = OASInlineObject21.getExample();
        OASInlineObject21 inlineObject212 = new OASInlineObject21();

        System.assertEquals(false, inlineObject211.equals('foo'));
        System.assertEquals(false, inlineObject212.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject21 inlineObject211 = OASInlineObject21.getExample();
        OASInlineObject21 inlineObject212 = new OASInlineObject21();
        OASInlineObject21 inlineObject213;

        System.assertEquals(false, inlineObject211.equals(inlineObject213));
        System.assertEquals(false, inlineObject212.equals(inlineObject213));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject21 inlineObject211 = OASInlineObject21.getExample();
        OASInlineObject21 inlineObject212 = new OASInlineObject21();

        System.assertEquals(inlineObject211.hashCode(), inlineObject211.hashCode());
        System.assertEquals(inlineObject212.hashCode(), inlineObject212.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject21 inlineObject211 = OASInlineObject21.getExample();
        OASInlineObject21 inlineObject212 = OASInlineObject21.getExample();
        OASInlineObject21 inlineObject213 = new OASInlineObject21();
        OASInlineObject21 inlineObject214 = new OASInlineObject21();

        System.assert(inlineObject211.equals(inlineObject212));
        System.assert(inlineObject213.equals(inlineObject214));
        System.assertEquals(inlineObject211.hashCode(), inlineObject212.hashCode());
        System.assertEquals(inlineObject213.hashCode(), inlineObject214.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineObject21 inlineObject21 = new OASInlineObject21();
        System.assertEquals(FillMissingEnum.WITHNULL, inlineObject21.fillMissing);
        System.assertEquals(new List<OASSensorsHistorySeries>(), inlineObject21.series);
        System.assertEquals(null, inlineObject21.endMs);
        System.assertEquals(null, inlineObject21.groupId);
        System.assertEquals(null, inlineObject21.startMs);
        System.assertEquals(null, inlineObject21.stepMs);
    }
}
