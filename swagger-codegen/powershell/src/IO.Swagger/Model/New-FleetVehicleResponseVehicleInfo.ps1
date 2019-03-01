function New-FleetVehicleResponseVehicleInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${make},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${model},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${vin},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${year}
    )

    Process {
        'Creating object: samsara.Model.FleetVehicleResponseVehicleInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.FleetVehicleResponseVehicleInfo -ArgumentList @(
            ${make},
            ${model},
            ${vin},
            ${year}
        )
    }
}
