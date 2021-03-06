# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test VehicleSafetyScoreResponse")

model.instance <- VehicleSafetyScoreResponse$new()

test_that("crashCount", {
  # tests for the property `crashCount` (integer)
  # Crash event count

  # uncomment below to test the property 
  #expect_equal(model.instance$`crashCount`, "EXPECTED_RESULT")
})

test_that("harshAccelCount", {
  # tests for the property `harshAccelCount` (integer)
  # Harsh acceleration event count

  # uncomment below to test the property 
  #expect_equal(model.instance$`harshAccelCount`, "EXPECTED_RESULT")
})

test_that("harshBrakingCount", {
  # tests for the property `harshBrakingCount` (integer)
  # Harsh braking event count

  # uncomment below to test the property 
  #expect_equal(model.instance$`harshBrakingCount`, "EXPECTED_RESULT")
})

test_that("harshEvents", {
  # tests for the property `harshEvents` (SafetyReportHarshEvent)

  # uncomment below to test the property 
  #expect_equal(model.instance$`harshEvents`, "EXPECTED_RESULT")
})

test_that("harshTurningCount", {
  # tests for the property `harshTurningCount` (integer)
  # Harsh turning event count

  # uncomment below to test the property 
  #expect_equal(model.instance$`harshTurningCount`, "EXPECTED_RESULT")
})

test_that("safetyScore", {
  # tests for the property `safetyScore` (integer)
  # Safety Score

  # uncomment below to test the property 
  #expect_equal(model.instance$`safetyScore`, "EXPECTED_RESULT")
})

test_that("safetyScoreRank", {
  # tests for the property `safetyScoreRank` (character)
  # Safety Score Rank

  # uncomment below to test the property 
  #expect_equal(model.instance$`safetyScoreRank`, "EXPECTED_RESULT")
})

test_that("timeOverSpeedLimitMs", {
  # tests for the property `timeOverSpeedLimitMs` (integer)
  # Amount of time driven over the speed limit in milliseconds

  # uncomment below to test the property 
  #expect_equal(model.instance$`timeOverSpeedLimitMs`, "EXPECTED_RESULT")
})

test_that("totalDistanceDrivenMeters", {
  # tests for the property `totalDistanceDrivenMeters` (integer)
  # Total distance driven in meters

  # uncomment below to test the property 
  #expect_equal(model.instance$`totalDistanceDrivenMeters`, "EXPECTED_RESULT")
})

test_that("totalHarshEventCount", {
  # tests for the property `totalHarshEventCount` (integer)
  # Total harsh event count

  # uncomment below to test the property 
  #expect_equal(model.instance$`totalHarshEventCount`, "EXPECTED_RESULT")
})

test_that("totalTimeDrivenMs", {
  # tests for the property `totalTimeDrivenMs` (integer)
  # Amount of time driven in milliseconds

  # uncomment below to test the property 
  #expect_equal(model.instance$`totalTimeDrivenMs`, "EXPECTED_RESULT")
})

test_that("vehicleId", {
  # tests for the property `vehicleId` (integer)
  # Vehicle ID

  # uncomment below to test the property 
  #expect_equal(model.instance$`vehicleId`, "EXPECTED_RESULT")
})

