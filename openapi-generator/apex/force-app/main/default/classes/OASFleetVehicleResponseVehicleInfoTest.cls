@isTest
private class OASFleetVehicleResponseVehicleInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo1 = OASFleetVehicleResponseVehicleInfo.getExample();
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo2 = fleetVehicleResponseVehicleInfo1;
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo3 = new OASFleetVehicleResponseVehicleInfo();
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo4 = fleetVehicleResponseVehicleInfo3;

        System.assert(fleetVehicleResponseVehicleInfo1.equals(fleetVehicleResponseVehicleInfo2));
        System.assert(fleetVehicleResponseVehicleInfo2.equals(fleetVehicleResponseVehicleInfo1));
        System.assert(fleetVehicleResponseVehicleInfo1.equals(fleetVehicleResponseVehicleInfo1));
        System.assert(fleetVehicleResponseVehicleInfo3.equals(fleetVehicleResponseVehicleInfo4));
        System.assert(fleetVehicleResponseVehicleInfo4.equals(fleetVehicleResponseVehicleInfo3));
        System.assert(fleetVehicleResponseVehicleInfo3.equals(fleetVehicleResponseVehicleInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo1 = OASFleetVehicleResponseVehicleInfo.getExample();
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo2 = OASFleetVehicleResponseVehicleInfo.getExample();
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo3 = new OASFleetVehicleResponseVehicleInfo();
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo4 = new OASFleetVehicleResponseVehicleInfo();

        System.assert(fleetVehicleResponseVehicleInfo1.equals(fleetVehicleResponseVehicleInfo2));
        System.assert(fleetVehicleResponseVehicleInfo2.equals(fleetVehicleResponseVehicleInfo1));
        System.assert(fleetVehicleResponseVehicleInfo3.equals(fleetVehicleResponseVehicleInfo4));
        System.assert(fleetVehicleResponseVehicleInfo4.equals(fleetVehicleResponseVehicleInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo1 = OASFleetVehicleResponseVehicleInfo.getExample();
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo2 = new OASFleetVehicleResponseVehicleInfo();

        System.assertEquals(false, fleetVehicleResponseVehicleInfo1.equals('foo'));
        System.assertEquals(false, fleetVehicleResponseVehicleInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo1 = OASFleetVehicleResponseVehicleInfo.getExample();
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo2 = new OASFleetVehicleResponseVehicleInfo();
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo3;

        System.assertEquals(false, fleetVehicleResponseVehicleInfo1.equals(fleetVehicleResponseVehicleInfo3));
        System.assertEquals(false, fleetVehicleResponseVehicleInfo2.equals(fleetVehicleResponseVehicleInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo1 = OASFleetVehicleResponseVehicleInfo.getExample();
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo2 = new OASFleetVehicleResponseVehicleInfo();

        System.assertEquals(fleetVehicleResponseVehicleInfo1.hashCode(), fleetVehicleResponseVehicleInfo1.hashCode());
        System.assertEquals(fleetVehicleResponseVehicleInfo2.hashCode(), fleetVehicleResponseVehicleInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo1 = OASFleetVehicleResponseVehicleInfo.getExample();
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo2 = OASFleetVehicleResponseVehicleInfo.getExample();
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo3 = new OASFleetVehicleResponseVehicleInfo();
        OASFleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo4 = new OASFleetVehicleResponseVehicleInfo();

        System.assert(fleetVehicleResponseVehicleInfo1.equals(fleetVehicleResponseVehicleInfo2));
        System.assert(fleetVehicleResponseVehicleInfo3.equals(fleetVehicleResponseVehicleInfo4));
        System.assertEquals(fleetVehicleResponseVehicleInfo1.hashCode(), fleetVehicleResponseVehicleInfo2.hashCode());
        System.assertEquals(fleetVehicleResponseVehicleInfo3.hashCode(), fleetVehicleResponseVehicleInfo4.hashCode());
    }
}
