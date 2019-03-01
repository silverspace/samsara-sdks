function Invoke-DriversApiCreateDriver {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.DriverForCreate]
        ${createDriverParam}
    )

    Process {
        'Calling method: DriversApi-CreateDriver' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DriversApi.CreateDriver(
            ${accessToken},
            ${createDriverParam}
        )
    }
}

function Invoke-DriversApiDeactivateDriver {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${driverIdOrExternalId}
    )

    Process {
        'Calling method: DriversApi-DeactivateDriver' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DriversApi.DeactivateDriver(
            ${accessToken},
            ${driverIdOrExternalId}
        )
    }
}

function Invoke-DriversApiGetAllDeactivatedDrivers {
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
        'Calling method: DriversApi-GetAllDeactivatedDrivers' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DriversApi.GetAllDeactivatedDrivers(
            ${accessToken},
            ${groupId}
        )
    }
}

function Invoke-DriversApiGetDeactivatedDriverById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${driverIdOrExternalId}
    )

    Process {
        'Calling method: DriversApi-GetDeactivatedDriverById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DriversApi.GetDeactivatedDriverById(
            ${accessToken},
            ${driverIdOrExternalId}
        )
    }
}

function Invoke-DriversApiGetDriverById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${driverIdOrExternalId}
    )

    Process {
        'Calling method: DriversApi-GetDriverById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DriversApi.GetDriverById(
            ${accessToken},
            ${driverIdOrExternalId}
        )
    }
}

function Invoke-DriversApiReactivateDriverById {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${driverIdOrExternalId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.InlineObject4]
        ${reactivateDriverParam}
    )

    Process {
        'Calling method: DriversApi-ReactivateDriverById' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DriversApi.ReactivateDriverById(
            ${accessToken},
            ${driverIdOrExternalId},
            ${reactivateDriverParam}
        )
    }
}

