# This file is auto-generated by Swagger Codegen (https://github.com/swagger-api/swagger-codegen)
# Please replace "TEST_VALUE" with a proper value and uncomment the code for testing the function

Describe 'samsara TagsApi' {
    Context 'TagsApi' {
        It 'Invoke-TagsApiCreateTag' {
            $ret = Invoke-PetApiGetPetById -accessToken "TEST_VALUE" -tagCreateParams "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'TagsApi' {
        It 'Invoke-TagsApiDeleteTagById' {
            $ret = Invoke-PetApiGetPetById -accessToken "TEST_VALUE" -tagId "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'TagsApi' {
        It 'Invoke-TagsApiGetAllTags' {
            $ret = Invoke-PetApiGetPetById -accessToken "TEST_VALUE" -groupId "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'TagsApi' {
        It 'Invoke-TagsApiGetTagById' {
            $ret = Invoke-PetApiGetPetById -accessToken "TEST_VALUE" -tagId "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'TagsApi' {
        It 'Invoke-TagsApiModifyTagById' {
            $ret = Invoke-PetApiGetPetById -accessToken "TEST_VALUE" -tagId "TEST_VALUE" -tagModifyParams "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'TagsApi' {
        It 'Invoke-TagsApiUpdateTagById' {
            $ret = Invoke-PetApiGetPetById -accessToken "TEST_VALUE" -tagId "TEST_VALUE" -updateTagParams "TEST_VALUE"
            #$ret | Should BeOfType samsara.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

}
