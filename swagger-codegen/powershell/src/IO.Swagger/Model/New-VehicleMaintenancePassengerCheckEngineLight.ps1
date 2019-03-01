function New-VehicleMaintenancePassengerCheckEngineLight {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${isOn}
    )

    Process {
        'Creating object: samsara.Model.VehicleMaintenancePassengerCheckEngineLight' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.VehicleMaintenancePassengerCheckEngineLight -ArgumentList @(
            ${isOn}
        )
    }
}
