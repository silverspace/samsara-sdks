function Invoke-SafetyApiGetDriverSafetyScore {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${driverId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${endMs}
    )

    Process {
        'Calling method: SafetyApi-GetDriverSafetyScore' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SafetyApi.GetDriverSafetyScore(
            ${driverId},
            ${accessToken},
            ${startMs},
            ${endMs}
        )
    }
}

function Invoke-SafetyApiGetVehicleHarshEvent {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${vehicleId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${timestamp}
    )

    Process {
        'Calling method: SafetyApi-GetVehicleHarshEvent' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SafetyApi.GetVehicleHarshEvent(
            ${vehicleId},
            ${accessToken},
            ${timestamp}
        )
    }
}

function Invoke-SafetyApiGetVehicleSafetyScore {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${vehicleId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${endMs}
    )

    Process {
        'Calling method: SafetyApi-GetVehicleSafetyScore' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SafetyApi.GetVehicleSafetyScore(
            ${vehicleId},
            ${accessToken},
            ${startMs},
            ${endMs}
        )
    }
}

