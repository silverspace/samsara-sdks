@isTest
private class OASUserTagRoleTagTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserTagRoleTag userTagRoleTag1 = OASUserTagRoleTag.getExample();
        OASUserTagRoleTag userTagRoleTag2 = userTagRoleTag1;
        OASUserTagRoleTag userTagRoleTag3 = new OASUserTagRoleTag();
        OASUserTagRoleTag userTagRoleTag4 = userTagRoleTag3;

        System.assert(userTagRoleTag1.equals(userTagRoleTag2));
        System.assert(userTagRoleTag2.equals(userTagRoleTag1));
        System.assert(userTagRoleTag1.equals(userTagRoleTag1));
        System.assert(userTagRoleTag3.equals(userTagRoleTag4));
        System.assert(userTagRoleTag4.equals(userTagRoleTag3));
        System.assert(userTagRoleTag3.equals(userTagRoleTag3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserTagRoleTag userTagRoleTag1 = OASUserTagRoleTag.getExample();
        OASUserTagRoleTag userTagRoleTag2 = OASUserTagRoleTag.getExample();
        OASUserTagRoleTag userTagRoleTag3 = new OASUserTagRoleTag();
        OASUserTagRoleTag userTagRoleTag4 = new OASUserTagRoleTag();

        System.assert(userTagRoleTag1.equals(userTagRoleTag2));
        System.assert(userTagRoleTag2.equals(userTagRoleTag1));
        System.assert(userTagRoleTag3.equals(userTagRoleTag4));
        System.assert(userTagRoleTag4.equals(userTagRoleTag3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserTagRoleTag userTagRoleTag1 = OASUserTagRoleTag.getExample();
        OASUserTagRoleTag userTagRoleTag2 = new OASUserTagRoleTag();

        System.assertEquals(false, userTagRoleTag1.equals('foo'));
        System.assertEquals(false, userTagRoleTag2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserTagRoleTag userTagRoleTag1 = OASUserTagRoleTag.getExample();
        OASUserTagRoleTag userTagRoleTag2 = new OASUserTagRoleTag();
        OASUserTagRoleTag userTagRoleTag3;

        System.assertEquals(false, userTagRoleTag1.equals(userTagRoleTag3));
        System.assertEquals(false, userTagRoleTag2.equals(userTagRoleTag3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserTagRoleTag userTagRoleTag1 = OASUserTagRoleTag.getExample();
        OASUserTagRoleTag userTagRoleTag2 = new OASUserTagRoleTag();

        System.assertEquals(userTagRoleTag1.hashCode(), userTagRoleTag1.hashCode());
        System.assertEquals(userTagRoleTag2.hashCode(), userTagRoleTag2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserTagRoleTag userTagRoleTag1 = OASUserTagRoleTag.getExample();
        OASUserTagRoleTag userTagRoleTag2 = OASUserTagRoleTag.getExample();
        OASUserTagRoleTag userTagRoleTag3 = new OASUserTagRoleTag();
        OASUserTagRoleTag userTagRoleTag4 = new OASUserTagRoleTag();

        System.assert(userTagRoleTag1.equals(userTagRoleTag2));
        System.assert(userTagRoleTag3.equals(userTagRoleTag4));
        System.assertEquals(userTagRoleTag1.hashCode(), userTagRoleTag2.hashCode());
        System.assertEquals(userTagRoleTag3.hashCode(), userTagRoleTag4.hashCode());
    }
}
