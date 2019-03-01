@isTest
private class OASUserBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserBase userBase1 = OASUserBase.getExample();
        OASUserBase userBase2 = userBase1;
        OASUserBase userBase3 = new OASUserBase();
        OASUserBase userBase4 = userBase3;

        System.assert(userBase1.equals(userBase2));
        System.assert(userBase2.equals(userBase1));
        System.assert(userBase1.equals(userBase1));
        System.assert(userBase3.equals(userBase4));
        System.assert(userBase4.equals(userBase3));
        System.assert(userBase3.equals(userBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserBase userBase1 = OASUserBase.getExample();
        OASUserBase userBase2 = OASUserBase.getExample();
        OASUserBase userBase3 = new OASUserBase();
        OASUserBase userBase4 = new OASUserBase();

        System.assert(userBase1.equals(userBase2));
        System.assert(userBase2.equals(userBase1));
        System.assert(userBase3.equals(userBase4));
        System.assert(userBase4.equals(userBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserBase userBase1 = OASUserBase.getExample();
        OASUserBase userBase2 = new OASUserBase();

        System.assertEquals(false, userBase1.equals('foo'));
        System.assertEquals(false, userBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserBase userBase1 = OASUserBase.getExample();
        OASUserBase userBase2 = new OASUserBase();
        OASUserBase userBase3;

        System.assertEquals(false, userBase1.equals(userBase3));
        System.assertEquals(false, userBase2.equals(userBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserBase userBase1 = OASUserBase.getExample();
        OASUserBase userBase2 = new OASUserBase();

        System.assertEquals(userBase1.hashCode(), userBase1.hashCode());
        System.assertEquals(userBase2.hashCode(), userBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserBase userBase1 = OASUserBase.getExample();
        OASUserBase userBase2 = OASUserBase.getExample();
        OASUserBase userBase3 = new OASUserBase();
        OASUserBase userBase4 = new OASUserBase();

        System.assert(userBase1.equals(userBase2));
        System.assert(userBase3.equals(userBase4));
        System.assertEquals(userBase1.hashCode(), userBase2.hashCode());
        System.assertEquals(userBase3.hashCode(), userBase4.hashCode());
    }
}
