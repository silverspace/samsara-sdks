function Invoke-IndustrialApiGetAllDataInputs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${groupId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${endMs}
    )

    Process {
        'Calling method: IndustrialApi-GetAllDataInputs' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:IndustrialApi.GetAllDataInputs(
            ${accessToken},
            ${groupId},
            ${startMs},
            ${endMs}
        )
    }
}

function Invoke-IndustrialApiGetDataInput {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${dataInputId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${endMs}
    )

    Process {
        'Calling method: IndustrialApi-GetDataInput' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:IndustrialApi.GetDataInput(
            ${accessToken},
            ${dataInputId},
            ${startMs},
            ${endMs}
        )
    }
}

function Invoke-IndustrialApiGetMachines {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.InlineObject18]
        ${groupParam}
    )

    Process {
        'Calling method: IndustrialApi-GetMachines' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:IndustrialApi.GetMachines(
            ${accessToken},
            ${groupParam}
        )
    }
}

function Invoke-IndustrialApiGetMachinesHistory {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.InlineObject17]
        ${historyParam}
    )

    Process {
        'Calling method: IndustrialApi-GetMachinesHistory' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:IndustrialApi.GetMachinesHistory(
            ${accessToken},
            ${historyParam}
        )
    }
}

