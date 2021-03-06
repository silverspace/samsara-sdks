# This file is auto-generated by Swagger Codegen (https://github.com/swagger-api/swagger-codegen)
# Please replace "TEST_VALUE" with a proper value and uncomment the code for testing the function

Describe 'samsara IndustrialApi' {
    Context 'IndustrialApi' {
        It 'Invoke-IndustrialApiGetAllDataInputs' {
            $ret = Invoke-PetApiGetPetById -accessToken "TEST_VALUE" -groupId "TEST_VALUE" -startMs "TEST_VALUE" -endMs "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'IndustrialApi' {
        It 'Invoke-IndustrialApiGetDataInput' {
            $ret = Invoke-PetApiGetPetById -accessToken "TEST_VALUE" -dataInputId "TEST_VALUE" -startMs "TEST_VALUE" -endMs "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'IndustrialApi' {
        It 'Invoke-IndustrialApiGetMachines' {
            $ret = Invoke-PetApiGetPetById -accessToken "TEST_VALUE" -groupParam "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'IndustrialApi' {
        It 'Invoke-IndustrialApiGetMachinesHistory' {
            $ret = Invoke-PetApiGetPetById -accessToken "TEST_VALUE" -historyParam "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

}
