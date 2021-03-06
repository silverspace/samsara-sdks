# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test DriverDailyLogResponseDays")

model.instance <- DriverDailyLogResponseDays$new()

test_that("certifiedAtMs", {
  # tests for the property `certifiedAtMs` (integer)
  # Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.

  # uncomment below to test the property 
  #expect_equal(model.instance$`certifiedAtMs`, "EXPECTED_RESULT")
})

test_that("endMs", {
  # tests for the property `endMs` (integer)
  # End of the HOS day, specified in milliseconds UNIX time.

  # uncomment below to test the property 
  #expect_equal(model.instance$`endMs`, "EXPECTED_RESULT")
})

test_that("startMs", {
  # tests for the property `startMs` (integer)
  # End of the HOS day, specified in milliseconds UNIX time.

  # uncomment below to test the property 
  #expect_equal(model.instance$`startMs`, "EXPECTED_RESULT")
})

test_that("trailerIds", {
  # tests for the property `trailerIds` (object)
  # List of trailer ID&#39;s associated with the driver for the day.

  # uncomment below to test the property 
  #expect_equal(model.instance$`trailerIds`, "EXPECTED_RESULT")
})

test_that("activeHours", {
  # tests for the property `activeHours` (numeric)
  # Hours spent on duty or driving, rounded to two decimal places.

  # uncomment below to test the property 
  #expect_equal(model.instance$`activeHours`, "EXPECTED_RESULT")
})

test_that("distanceMiles", {
  # tests for the property `distanceMiles` (numeric)
  # Distance driven in miles, rounded to two decimal places.

  # uncomment below to test the property 
  #expect_equal(model.instance$`distanceMiles`, "EXPECTED_RESULT")
})

test_that("activeMs", {
  # tests for the property `activeMs` (integer)
  # Milliseconds spent on duty or driving.

  # uncomment below to test the property 
  #expect_equal(model.instance$`activeMs`, "EXPECTED_RESULT")
})

test_that("certified", {
  # tests for the property `certified` (character)
  # Whether this HOS day chart was certified by the driver.

  # uncomment below to test the property 
  #expect_equal(model.instance$`certified`, "EXPECTED_RESULT")
})

test_that("vehicleIds", {
  # tests for the property `vehicleIds` (object)
  # List of vehicle ID&#39;s associated with the driver for the day.

  # uncomment below to test the property 
  #expect_equal(model.instance$`vehicleIds`, "EXPECTED_RESULT")
})

