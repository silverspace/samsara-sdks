function New-VehicleMaintenancePassengerCheckEngineLight {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${isOn}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VehicleMaintenancePassengerCheckEngineLight' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VehicleMaintenancePassengerCheckEngineLight -ArgumentList @(
            ${isOn}
        )
    }
}
