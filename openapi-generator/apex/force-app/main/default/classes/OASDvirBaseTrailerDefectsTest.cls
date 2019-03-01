@isTest
private class OASDvirBaseTrailerDefectsTest {
    @isTest
    private static void equalsSameInstance() {
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects1 = OASDvirBaseTrailerDefects.getExample();
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects2 = dvirBaseTrailerDefects1;
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects3 = new OASDvirBaseTrailerDefects();
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects4 = dvirBaseTrailerDefects3;

        System.assert(dvirBaseTrailerDefects1.equals(dvirBaseTrailerDefects2));
        System.assert(dvirBaseTrailerDefects2.equals(dvirBaseTrailerDefects1));
        System.assert(dvirBaseTrailerDefects1.equals(dvirBaseTrailerDefects1));
        System.assert(dvirBaseTrailerDefects3.equals(dvirBaseTrailerDefects4));
        System.assert(dvirBaseTrailerDefects4.equals(dvirBaseTrailerDefects3));
        System.assert(dvirBaseTrailerDefects3.equals(dvirBaseTrailerDefects3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects1 = OASDvirBaseTrailerDefects.getExample();
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects2 = OASDvirBaseTrailerDefects.getExample();
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects3 = new OASDvirBaseTrailerDefects();
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects4 = new OASDvirBaseTrailerDefects();

        System.assert(dvirBaseTrailerDefects1.equals(dvirBaseTrailerDefects2));
        System.assert(dvirBaseTrailerDefects2.equals(dvirBaseTrailerDefects1));
        System.assert(dvirBaseTrailerDefects3.equals(dvirBaseTrailerDefects4));
        System.assert(dvirBaseTrailerDefects4.equals(dvirBaseTrailerDefects3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects1 = OASDvirBaseTrailerDefects.getExample();
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects2 = new OASDvirBaseTrailerDefects();

        System.assertEquals(false, dvirBaseTrailerDefects1.equals('foo'));
        System.assertEquals(false, dvirBaseTrailerDefects2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects1 = OASDvirBaseTrailerDefects.getExample();
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects2 = new OASDvirBaseTrailerDefects();
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects3;

        System.assertEquals(false, dvirBaseTrailerDefects1.equals(dvirBaseTrailerDefects3));
        System.assertEquals(false, dvirBaseTrailerDefects2.equals(dvirBaseTrailerDefects3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects1 = OASDvirBaseTrailerDefects.getExample();
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects2 = new OASDvirBaseTrailerDefects();

        System.assertEquals(dvirBaseTrailerDefects1.hashCode(), dvirBaseTrailerDefects1.hashCode());
        System.assertEquals(dvirBaseTrailerDefects2.hashCode(), dvirBaseTrailerDefects2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects1 = OASDvirBaseTrailerDefects.getExample();
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects2 = OASDvirBaseTrailerDefects.getExample();
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects3 = new OASDvirBaseTrailerDefects();
        OASDvirBaseTrailerDefects dvirBaseTrailerDefects4 = new OASDvirBaseTrailerDefects();

        System.assert(dvirBaseTrailerDefects1.equals(dvirBaseTrailerDefects2));
        System.assert(dvirBaseTrailerDefects3.equals(dvirBaseTrailerDefects4));
        System.assertEquals(dvirBaseTrailerDefects1.hashCode(), dvirBaseTrailerDefects2.hashCode());
        System.assertEquals(dvirBaseTrailerDefects3.hashCode(), dvirBaseTrailerDefects4.hashCode());
    }
}
