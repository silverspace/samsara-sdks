function New-FleetVehiclesLocations {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.FleetVehiclesLocations' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.FleetVehiclesLocations -ArgumentList @(
        )
    }
}
