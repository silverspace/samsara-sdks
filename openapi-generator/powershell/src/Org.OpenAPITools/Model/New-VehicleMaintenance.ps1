function New-VehicleMaintenance {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.VehicleMaintenanceJ1939]]
        ${j1939},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.VehicleMaintenancePassenger]]
        ${passenger}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VehicleMaintenance' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VehicleMaintenance -ArgumentList @(
            ${id},
            ${j1939},
            ${passenger}
        )
    }
}
