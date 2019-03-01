function New-VehicleMaintenance {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.VehicleMaintenanceJ1939]]
        ${j1939},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.VehicleMaintenancePassenger]]
        ${passenger}
    )

    Process {
        'Creating object: samsara.Model.VehicleMaintenance' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.VehicleMaintenance -ArgumentList @(
            ${id},
            ${j1939},
            ${passenger}
        )
    }
}
