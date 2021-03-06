# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test MachineHistoryResponseMachines")

model.instance <- MachineHistoryResponseMachines$new()

test_that("name", {
  # tests for the property `name` (character)
  # Machine name

  # uncomment below to test the property 
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("id", {
  # tests for the property `id` (integer)
  # Machine ID

  # uncomment below to test the property 
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("vibrations", {
  # tests for the property `vibrations` (MachineHistoryResponseVibrations)
  # List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s

  # uncomment below to test the property 
  #expect_equal(model.instance$`vibrations`, "EXPECTED_RESULT")
})

