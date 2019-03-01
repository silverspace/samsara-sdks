@isTest
private class OASTaggedSensorTest {
    @isTest
    private static void equalsSameInstance() {
        OASTaggedSensor taggedSensor1 = OASTaggedSensor.getExample();
        OASTaggedSensor taggedSensor2 = taggedSensor1;
        OASTaggedSensor taggedSensor3 = new OASTaggedSensor();
        OASTaggedSensor taggedSensor4 = taggedSensor3;

        System.assert(taggedSensor1.equals(taggedSensor2));
        System.assert(taggedSensor2.equals(taggedSensor1));
        System.assert(taggedSensor1.equals(taggedSensor1));
        System.assert(taggedSensor3.equals(taggedSensor4));
        System.assert(taggedSensor4.equals(taggedSensor3));
        System.assert(taggedSensor3.equals(taggedSensor3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTaggedSensor taggedSensor1 = OASTaggedSensor.getExample();
        OASTaggedSensor taggedSensor2 = OASTaggedSensor.getExample();
        OASTaggedSensor taggedSensor3 = new OASTaggedSensor();
        OASTaggedSensor taggedSensor4 = new OASTaggedSensor();

        System.assert(taggedSensor1.equals(taggedSensor2));
        System.assert(taggedSensor2.equals(taggedSensor1));
        System.assert(taggedSensor3.equals(taggedSensor4));
        System.assert(taggedSensor4.equals(taggedSensor3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTaggedSensor taggedSensor1 = OASTaggedSensor.getExample();
        OASTaggedSensor taggedSensor2 = new OASTaggedSensor();

        System.assertEquals(false, taggedSensor1.equals('foo'));
        System.assertEquals(false, taggedSensor2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTaggedSensor taggedSensor1 = OASTaggedSensor.getExample();
        OASTaggedSensor taggedSensor2 = new OASTaggedSensor();
        OASTaggedSensor taggedSensor3;

        System.assertEquals(false, taggedSensor1.equals(taggedSensor3));
        System.assertEquals(false, taggedSensor2.equals(taggedSensor3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTaggedSensor taggedSensor1 = OASTaggedSensor.getExample();
        OASTaggedSensor taggedSensor2 = new OASTaggedSensor();

        System.assertEquals(taggedSensor1.hashCode(), taggedSensor1.hashCode());
        System.assertEquals(taggedSensor2.hashCode(), taggedSensor2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTaggedSensor taggedSensor1 = OASTaggedSensor.getExample();
        OASTaggedSensor taggedSensor2 = OASTaggedSensor.getExample();
        OASTaggedSensor taggedSensor3 = new OASTaggedSensor();
        OASTaggedSensor taggedSensor4 = new OASTaggedSensor();

        System.assert(taggedSensor1.equals(taggedSensor2));
        System.assert(taggedSensor3.equals(taggedSensor4));
        System.assertEquals(taggedSensor1.hashCode(), taggedSensor2.hashCode());
        System.assertEquals(taggedSensor3.hashCode(), taggedSensor4.hashCode());
    }
}
