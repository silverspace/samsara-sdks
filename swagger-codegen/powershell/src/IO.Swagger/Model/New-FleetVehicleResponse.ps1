function New-FleetVehicleResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[{String, String}]]
        ${externalIds},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${harshAccelSetting},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.FleetVehicleResponseVehicleInfo]]
        ${vehicleInfo}
    )

    Process {
        'Creating object: samsara.Model.FleetVehicleResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.FleetVehicleResponse -ArgumentList @(
            ${externalIds},
            ${harshAccelSetting},
            ${id},
            ${name},
            ${vehicleInfo}
        )
    }
}
