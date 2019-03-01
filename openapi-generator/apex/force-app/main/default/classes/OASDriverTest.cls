@isTest
private class OASDriverTest {
    @isTest
    private static void equalsSameInstance() {
        OASDriver driver1 = OASDriver.getExample();
        OASDriver driver2 = driver1;
        OASDriver driver3 = new OASDriver();
        OASDriver driver4 = driver3;

        System.assert(driver1.equals(driver2));
        System.assert(driver2.equals(driver1));
        System.assert(driver1.equals(driver1));
        System.assert(driver3.equals(driver4));
        System.assert(driver4.equals(driver3));
        System.assert(driver3.equals(driver3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDriver driver1 = OASDriver.getExample();
        OASDriver driver2 = OASDriver.getExample();
        OASDriver driver3 = new OASDriver();
        OASDriver driver4 = new OASDriver();

        System.assert(driver1.equals(driver2));
        System.assert(driver2.equals(driver1));
        System.assert(driver3.equals(driver4));
        System.assert(driver4.equals(driver3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDriver driver1 = OASDriver.getExample();
        OASDriver driver2 = new OASDriver();

        System.assertEquals(false, driver1.equals('foo'));
        System.assertEquals(false, driver2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDriver driver1 = OASDriver.getExample();
        OASDriver driver2 = new OASDriver();
        OASDriver driver3;

        System.assertEquals(false, driver1.equals(driver3));
        System.assertEquals(false, driver2.equals(driver3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDriver driver1 = OASDriver.getExample();
        OASDriver driver2 = new OASDriver();

        System.assertEquals(driver1.hashCode(), driver1.hashCode());
        System.assertEquals(driver2.hashCode(), driver2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDriver driver1 = OASDriver.getExample();
        OASDriver driver2 = OASDriver.getExample();
        OASDriver driver3 = new OASDriver();
        OASDriver driver4 = new OASDriver();

        System.assert(driver1.equals(driver2));
        System.assert(driver3.equals(driver4));
        System.assertEquals(driver1.hashCode(), driver2.hashCode());
        System.assertEquals(driver3.hashCode(), driver4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDriver driver = new OASDriver();
        System.assertEquals(false, driver.eldPcEnabled);
        System.assertEquals(false, driver.eldYmEnabled);
        System.assertEquals(new Map<String, String>(), driver.externalIds);
        System.assertEquals(new List<OASTagMetadata>(), driver.tags);
        System.assertEquals(null, driver.eldAdverseWeatherExemptionEnabled);
        System.assertEquals(null, driver.eldBigDayExemptionEnabled);
        System.assertEquals(null, driver.eldDayStartHour);
        System.assertEquals(null, driver.eldExempt);
        System.assertEquals(null, driver.eldExemptReason);
        System.assertEquals(null, driver.groupId);
        System.assertEquals(null, driver.licenseNumber);
        System.assertEquals(null, driver.licenseState);
        System.assertEquals(null, driver.name);
        System.assertEquals(null, driver.notes);
        System.assertEquals(null, driver.phone);
        System.assertEquals(null, driver.username);
        System.assertEquals(null, driver.vehicleId);
        System.assertEquals(null, driver.id);
        System.assertEquals(null, driver.isDeactivated);
    }
}
