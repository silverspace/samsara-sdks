function New-FleetVehicleLocation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${latitude},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${location},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${longitude},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${speedMilesPerHour},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${timeMs}
    )

    Process {
        'Creating object: samsara.Model.FleetVehicleLocation' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.FleetVehicleLocation -ArgumentList @(
            ${latitude},
            ${location},
            ${longitude},
            ${speedMilesPerHour},
            ${timeMs}
        )
    }
}
