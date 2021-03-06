# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test DriversSummaryResponseSummaries")

model.instance <- DriversSummaryResponseSummaries$new()

test_that("driverId", {
  # tests for the property `driverId` (integer)
  # ID of the driver.

  # uncomment below to test the property 
  #expect_equal(model.instance$`driverId`, "EXPECTED_RESULT")
})

test_that("distanceMiles", {
  # tests for the property `distanceMiles` (numeric)
  # Distance driven in miles, rounded to two decimal places.

  # uncomment below to test the property 
  #expect_equal(model.instance$`distanceMiles`, "EXPECTED_RESULT")
})

test_that("driveMs", {
  # tests for the property `driveMs` (integer)
  # Duration in milliseconds that driver was driving during the requested time range

  # uncomment below to test the property 
  #expect_equal(model.instance$`driveMs`, "EXPECTED_RESULT")
})

test_that("activeMs", {
  # tests for the property `activeMs` (integer)
  # Duration in milliseconds that driver was on duty or driving during the requested time range

  # uncomment below to test the property 
  #expect_equal(model.instance$`activeMs`, "EXPECTED_RESULT")
})

test_that("driverUsername", {
  # tests for the property `driverUsername` (character)
  # Username of the driver.

  # uncomment below to test the property 
  #expect_equal(model.instance$`driverUsername`, "EXPECTED_RESULT")
})

test_that("groupId", {
  # tests for the property `groupId` (integer)
  # Group of the driver.

  # uncomment below to test the property 
  #expect_equal(model.instance$`groupId`, "EXPECTED_RESULT")
})

test_that("driverName", {
  # tests for the property `driverName` (character)
  # Name of the driver.

  # uncomment below to test the property 
  #expect_equal(model.instance$`driverName`, "EXPECTED_RESULT")
})

test_that("onDutyMs", {
  # tests for the property `onDutyMs` (integer)
  # Duration in milliseconds that driver was on duty during the requested time range

  # uncomment below to test the property 
  #expect_equal(model.instance$`onDutyMs`, "EXPECTED_RESULT")
})

