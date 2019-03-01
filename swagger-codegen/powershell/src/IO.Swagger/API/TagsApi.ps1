function Invoke-TagsApiCreateTag {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.TagCreate]
        ${tagCreateParams}
    )

    Process {
        'Calling method: TagsApi-CreateTag' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:TagsApi.CreateTag(
            ${accessToken},
            ${tagCreateParams}
        )
    }
}

function Invoke-TagsApiDeleteTagById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${tagId}
    )

    Process {
        'Calling method: TagsApi-DeleteTagById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:TagsApi.DeleteTagById(
            ${accessToken},
            ${tagId}
        )
    }
}

function Invoke-TagsApiGetAllTags {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${groupId}
    )

    Process {
        'Calling method: TagsApi-GetAllTags' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:TagsApi.GetAllTags(
            ${accessToken},
            ${groupId}
        )
    }
}

function Invoke-TagsApiGetTagById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${tagId}
    )

    Process {
        'Calling method: TagsApi-GetTagById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:TagsApi.GetTagById(
            ${accessToken},
            ${tagId}
        )
    }
}

function Invoke-TagsApiModifyTagById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${tagId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.TagModify]
        ${tagModifyParams}
    )

    Process {
        'Calling method: TagsApi-ModifyTagById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:TagsApi.ModifyTagById(
            ${accessToken},
            ${tagId},
            ${tagModifyParams}
        )
    }
}

function Invoke-TagsApiUpdateTagById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${tagId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.TagUpdate]
        ${updateTagParams}
    )

    Process {
        'Calling method: TagsApi-UpdateTagById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:TagsApi.UpdateTagById(
            ${accessToken},
            ${tagId},
            ${updateTagParams}
        )
    }
}

