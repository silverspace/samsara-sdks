@isTest
private class OASUserTagRoleTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserTagRole userTagRole1 = OASUserTagRole.getExample();
        OASUserTagRole userTagRole2 = userTagRole1;
        OASUserTagRole userTagRole3 = new OASUserTagRole();
        OASUserTagRole userTagRole4 = userTagRole3;

        System.assert(userTagRole1.equals(userTagRole2));
        System.assert(userTagRole2.equals(userTagRole1));
        System.assert(userTagRole1.equals(userTagRole1));
        System.assert(userTagRole3.equals(userTagRole4));
        System.assert(userTagRole4.equals(userTagRole3));
        System.assert(userTagRole3.equals(userTagRole3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserTagRole userTagRole1 = OASUserTagRole.getExample();
        OASUserTagRole userTagRole2 = OASUserTagRole.getExample();
        OASUserTagRole userTagRole3 = new OASUserTagRole();
        OASUserTagRole userTagRole4 = new OASUserTagRole();

        System.assert(userTagRole1.equals(userTagRole2));
        System.assert(userTagRole2.equals(userTagRole1));
        System.assert(userTagRole3.equals(userTagRole4));
        System.assert(userTagRole4.equals(userTagRole3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserTagRole userTagRole1 = OASUserTagRole.getExample();
        OASUserTagRole userTagRole2 = new OASUserTagRole();

        System.assertEquals(false, userTagRole1.equals('foo'));
        System.assertEquals(false, userTagRole2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserTagRole userTagRole1 = OASUserTagRole.getExample();
        OASUserTagRole userTagRole2 = new OASUserTagRole();
        OASUserTagRole userTagRole3;

        System.assertEquals(false, userTagRole1.equals(userTagRole3));
        System.assertEquals(false, userTagRole2.equals(userTagRole3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserTagRole userTagRole1 = OASUserTagRole.getExample();
        OASUserTagRole userTagRole2 = new OASUserTagRole();

        System.assertEquals(userTagRole1.hashCode(), userTagRole1.hashCode());
        System.assertEquals(userTagRole2.hashCode(), userTagRole2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserTagRole userTagRole1 = OASUserTagRole.getExample();
        OASUserTagRole userTagRole2 = OASUserTagRole.getExample();
        OASUserTagRole userTagRole3 = new OASUserTagRole();
        OASUserTagRole userTagRole4 = new OASUserTagRole();

        System.assert(userTagRole1.equals(userTagRole2));
        System.assert(userTagRole3.equals(userTagRole4));
        System.assertEquals(userTagRole1.hashCode(), userTagRole2.hashCode());
        System.assertEquals(userTagRole3.hashCode(), userTagRole4.hashCode());
    }
}
