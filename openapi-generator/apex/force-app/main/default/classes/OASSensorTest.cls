@isTest
private class OASSensorTest {
    @isTest
    private static void equalsSameInstance() {
        OASSensor sensor1 = OASSensor.getExample();
        OASSensor sensor2 = sensor1;
        OASSensor sensor3 = new OASSensor();
        OASSensor sensor4 = sensor3;

        System.assert(sensor1.equals(sensor2));
        System.assert(sensor2.equals(sensor1));
        System.assert(sensor1.equals(sensor1));
        System.assert(sensor3.equals(sensor4));
        System.assert(sensor4.equals(sensor3));
        System.assert(sensor3.equals(sensor3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSensor sensor1 = OASSensor.getExample();
        OASSensor sensor2 = OASSensor.getExample();
        OASSensor sensor3 = new OASSensor();
        OASSensor sensor4 = new OASSensor();

        System.assert(sensor1.equals(sensor2));
        System.assert(sensor2.equals(sensor1));
        System.assert(sensor3.equals(sensor4));
        System.assert(sensor4.equals(sensor3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSensor sensor1 = OASSensor.getExample();
        OASSensor sensor2 = new OASSensor();

        System.assertEquals(false, sensor1.equals('foo'));
        System.assertEquals(false, sensor2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSensor sensor1 = OASSensor.getExample();
        OASSensor sensor2 = new OASSensor();
        OASSensor sensor3;

        System.assertEquals(false, sensor1.equals(sensor3));
        System.assertEquals(false, sensor2.equals(sensor3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSensor sensor1 = OASSensor.getExample();
        OASSensor sensor2 = new OASSensor();

        System.assertEquals(sensor1.hashCode(), sensor1.hashCode());
        System.assertEquals(sensor2.hashCode(), sensor2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSensor sensor1 = OASSensor.getExample();
        OASSensor sensor2 = OASSensor.getExample();
        OASSensor sensor3 = new OASSensor();
        OASSensor sensor4 = new OASSensor();

        System.assert(sensor1.equals(sensor2));
        System.assert(sensor3.equals(sensor4));
        System.assertEquals(sensor1.hashCode(), sensor2.hashCode());
        System.assertEquals(sensor3.hashCode(), sensor4.hashCode());
    }
}
