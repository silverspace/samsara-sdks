# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test Vehicle")

model.instance <- Vehicle$new()

test_that("engineHours", {
  # tests for the property `engineHours` (integer)
  # Total engine hours for the vehicle.

  # uncomment below to test the property 
  #expect_equal(model.instance$`engineHours`, "EXPECTED_RESULT")
})

test_that("fuelLevelPercent", {
  # tests for the property `fuelLevelPercent` (numeric)
  # The fuel level of the vehicle as a percentage. (0.0 to 1.0)

  # uncomment below to test the property 
  #expect_equal(model.instance$`fuelLevelPercent`, "EXPECTED_RESULT")
})

test_that("id", {
  # tests for the property `id` (integer)
  # ID of the vehicle.

  # uncomment below to test the property 
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)
  # Name of the vehicle.

  # uncomment below to test the property 
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("note", {
  # tests for the property `note` (character)

  # uncomment below to test the property 
  #expect_equal(model.instance$`note`, "EXPECTED_RESULT")
})

test_that("odometerMeters", {
  # tests for the property `odometerMeters` (integer)
  # The number of meters reported by the odometer.

  # uncomment below to test the property 
  #expect_equal(model.instance$`odometerMeters`, "EXPECTED_RESULT")
})

test_that("vin", {
  # tests for the property `vin` (character)
  # Vehicle Identification Number.

  # uncomment below to test the property 
  #expect_equal(model.instance$`vin`, "EXPECTED_RESULT")
})

