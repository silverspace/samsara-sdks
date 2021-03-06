# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test Tag")

model.instance <- Tag$new()

test_that("addresses", {
  # tests for the property `addresses` (TaggedAddress)
  # The addresses that belong to this tag.

  # uncomment below to test the property 
  #expect_equal(model.instance$`addresses`, "EXPECTED_RESULT")
})

test_that("assets", {
  # tests for the property `assets` (TaggedAsset)
  # The assets that belong to this tag.

  # uncomment below to test the property 
  #expect_equal(model.instance$`assets`, "EXPECTED_RESULT")
})

test_that("drivers", {
  # tests for the property `drivers` (TaggedDriver)
  # The drivers that belong to this tag.

  # uncomment below to test the property 
  #expect_equal(model.instance$`drivers`, "EXPECTED_RESULT")
})

test_that("groupId", {
  # tests for the property `groupId` (integer)
  # The GroupID that this tag belongs to.

  # uncomment below to test the property 
  #expect_equal(model.instance$`groupId`, "EXPECTED_RESULT")
})

test_that("id", {
  # tests for the property `id` (integer)
  # The ID of this tag.

  # uncomment below to test the property 
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("machines", {
  # tests for the property `machines` (TaggedMachine)
  # The machines that belong to this tag.

  # uncomment below to test the property 
  #expect_equal(model.instance$`machines`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)
  # Name of this tag.

  # uncomment below to test the property 
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("parentTagId", {
  # tests for the property `parentTagId` (integer)
  # If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.

  # uncomment below to test the property 
  #expect_equal(model.instance$`parentTagId`, "EXPECTED_RESULT")
})

test_that("sensors", {
  # tests for the property `sensors` (TaggedSensor)
  # The sensors that belong to this tag.

  # uncomment below to test the property 
  #expect_equal(model.instance$`sensors`, "EXPECTED_RESULT")
})

test_that("vehicles", {
  # tests for the property `vehicles` (TaggedVehicle)
  # The vehicles that belong to this tag.

  # uncomment below to test the property 
  #expect_equal(model.instance$`vehicles`, "EXPECTED_RESULT")
})

