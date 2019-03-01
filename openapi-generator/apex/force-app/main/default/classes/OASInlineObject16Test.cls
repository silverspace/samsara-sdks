@isTest
private class OASInlineObject16Test {
    @isTest
    private static void equalsSameInstance() {
        OASInlineObject16 inlineObject161 = OASInlineObject16.getExample();
        OASInlineObject16 inlineObject162 = inlineObject161;
        OASInlineObject16 inlineObject163 = new OASInlineObject16();
        OASInlineObject16 inlineObject164 = inlineObject163;

        System.assert(inlineObject161.equals(inlineObject162));
        System.assert(inlineObject162.equals(inlineObject161));
        System.assert(inlineObject161.equals(inlineObject161));
        System.assert(inlineObject163.equals(inlineObject164));
        System.assert(inlineObject164.equals(inlineObject163));
        System.assert(inlineObject163.equals(inlineObject163));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInlineObject16 inlineObject161 = OASInlineObject16.getExample();
        OASInlineObject16 inlineObject162 = OASInlineObject16.getExample();
        OASInlineObject16 inlineObject163 = new OASInlineObject16();
        OASInlineObject16 inlineObject164 = new OASInlineObject16();

        System.assert(inlineObject161.equals(inlineObject162));
        System.assert(inlineObject162.equals(inlineObject161));
        System.assert(inlineObject163.equals(inlineObject164));
        System.assert(inlineObject164.equals(inlineObject163));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInlineObject16 inlineObject161 = OASInlineObject16.getExample();
        OASInlineObject16 inlineObject162 = new OASInlineObject16();

        System.assertEquals(false, inlineObject161.equals('foo'));
        System.assertEquals(false, inlineObject162.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInlineObject16 inlineObject161 = OASInlineObject16.getExample();
        OASInlineObject16 inlineObject162 = new OASInlineObject16();
        OASInlineObject16 inlineObject163;

        System.assertEquals(false, inlineObject161.equals(inlineObject163));
        System.assertEquals(false, inlineObject162.equals(inlineObject163));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInlineObject16 inlineObject161 = OASInlineObject16.getExample();
        OASInlineObject16 inlineObject162 = new OASInlineObject16();

        System.assertEquals(inlineObject161.hashCode(), inlineObject161.hashCode());
        System.assertEquals(inlineObject162.hashCode(), inlineObject162.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInlineObject16 inlineObject161 = OASInlineObject16.getExample();
        OASInlineObject16 inlineObject162 = OASInlineObject16.getExample();
        OASInlineObject16 inlineObject163 = new OASInlineObject16();
        OASInlineObject16 inlineObject164 = new OASInlineObject16();

        System.assert(inlineObject161.equals(inlineObject162));
        System.assert(inlineObject163.equals(inlineObject164));
        System.assertEquals(inlineObject161.hashCode(), inlineObject162.hashCode());
        System.assertEquals(inlineObject163.hashCode(), inlineObject164.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASInlineObject16 inlineObject16 = new OASInlineObject16();
        Map<String, String> propertyMappings = inlineObject16.getPropertyMappings();
        System.assertEquals('harshAccelSetting', propertyMappings.get('harsh_accel_setting'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInlineObject16 inlineObject16 = new OASInlineObject16();
        System.assertEquals(new Map<String, String>(), inlineObject16.externalIds);
        System.assertEquals(null, inlineObject16.harshAccelSetting);
        System.assertEquals(null, inlineObject16.name);
    }
}
