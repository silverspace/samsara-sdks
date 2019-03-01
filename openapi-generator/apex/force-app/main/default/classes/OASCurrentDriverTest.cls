@isTest
private class OASCurrentDriverTest {
    @isTest
    private static void equalsSameInstance() {
        OASCurrentDriver currentDriver1 = OASCurrentDriver.getExample();
        OASCurrentDriver currentDriver2 = currentDriver1;
        OASCurrentDriver currentDriver3 = new OASCurrentDriver();
        OASCurrentDriver currentDriver4 = currentDriver3;

        System.assert(currentDriver1.equals(currentDriver2));
        System.assert(currentDriver2.equals(currentDriver1));
        System.assert(currentDriver1.equals(currentDriver1));
        System.assert(currentDriver3.equals(currentDriver4));
        System.assert(currentDriver4.equals(currentDriver3));
        System.assert(currentDriver3.equals(currentDriver3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCurrentDriver currentDriver1 = OASCurrentDriver.getExample();
        OASCurrentDriver currentDriver2 = OASCurrentDriver.getExample();
        OASCurrentDriver currentDriver3 = new OASCurrentDriver();
        OASCurrentDriver currentDriver4 = new OASCurrentDriver();

        System.assert(currentDriver1.equals(currentDriver2));
        System.assert(currentDriver2.equals(currentDriver1));
        System.assert(currentDriver3.equals(currentDriver4));
        System.assert(currentDriver4.equals(currentDriver3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCurrentDriver currentDriver1 = OASCurrentDriver.getExample();
        OASCurrentDriver currentDriver2 = new OASCurrentDriver();

        System.assertEquals(false, currentDriver1.equals('foo'));
        System.assertEquals(false, currentDriver2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCurrentDriver currentDriver1 = OASCurrentDriver.getExample();
        OASCurrentDriver currentDriver2 = new OASCurrentDriver();
        OASCurrentDriver currentDriver3;

        System.assertEquals(false, currentDriver1.equals(currentDriver3));
        System.assertEquals(false, currentDriver2.equals(currentDriver3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCurrentDriver currentDriver1 = OASCurrentDriver.getExample();
        OASCurrentDriver currentDriver2 = new OASCurrentDriver();

        System.assertEquals(currentDriver1.hashCode(), currentDriver1.hashCode());
        System.assertEquals(currentDriver2.hashCode(), currentDriver2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCurrentDriver currentDriver1 = OASCurrentDriver.getExample();
        OASCurrentDriver currentDriver2 = OASCurrentDriver.getExample();
        OASCurrentDriver currentDriver3 = new OASCurrentDriver();
        OASCurrentDriver currentDriver4 = new OASCurrentDriver();

        System.assert(currentDriver1.equals(currentDriver2));
        System.assert(currentDriver3.equals(currentDriver4));
        System.assertEquals(currentDriver1.hashCode(), currentDriver2.hashCode());
        System.assertEquals(currentDriver3.hashCode(), currentDriver4.hashCode());
    }
}
