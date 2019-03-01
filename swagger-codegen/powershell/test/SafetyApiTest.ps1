# This file is auto-generated by Swagger Codegen (https://github.com/swagger-api/swagger-codegen)
# Please replace "TEST_VALUE" with a proper value and uncomment the code for testing the function

Describe 'samsara SafetyApi' {
    Context 'SafetyApi' {
        It 'Invoke-SafetyApiGetDriverSafetyScore' {
            $ret = Invoke-PetApiGetPetById -driverId "TEST_VALUE" -accessToken "TEST_VALUE" -startMs "TEST_VALUE" -endMs "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'SafetyApi' {
        It 'Invoke-SafetyApiGetVehicleHarshEvent' {
            $ret = Invoke-PetApiGetPetById -vehicleId "TEST_VALUE" -accessToken "TEST_VALUE" -timestamp "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'SafetyApi' {
        It 'Invoke-SafetyApiGetVehicleSafetyScore' {
            $ret = Invoke-PetApiGetPetById -vehicleId "TEST_VALUE" -accessToken "TEST_VALUE" -startMs "TEST_VALUE" -endMs "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

}