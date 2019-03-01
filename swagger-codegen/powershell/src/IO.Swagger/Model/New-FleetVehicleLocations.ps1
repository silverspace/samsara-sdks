function New-FleetVehicleLocations {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.FleetVehicleLocations' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.FleetVehicleLocations -ArgumentList @(
        )
    }
}
