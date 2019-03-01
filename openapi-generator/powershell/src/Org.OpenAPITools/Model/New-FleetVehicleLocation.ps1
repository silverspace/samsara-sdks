function New-FleetVehicleLocation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${latitude},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${location},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${longitude},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${speedMilesPerHour},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${timeMs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.FleetVehicleLocation' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.FleetVehicleLocation -ArgumentList @(
            ${latitude},
            ${location},
            ${longitude},
            ${speedMilesPerHour},
            ${timeMs}
        )
    }
}
