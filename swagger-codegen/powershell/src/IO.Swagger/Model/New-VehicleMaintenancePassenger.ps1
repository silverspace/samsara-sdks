function New-VehicleMaintenancePassenger {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.VehicleMaintenancePassengerCheckEngineLight]]
        ${checkEngineLight},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.VehicleMaintenancePassengerDiagnosticTroubleCodes[]]]
        ${diagnosticTroubleCodes}
    )

    Process {
        'Creating object: samsara.Model.VehicleMaintenancePassenger' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.VehicleMaintenancePassenger -ArgumentList @(
            ${checkEngineLight},
            ${diagnosticTroubleCodes}
        )
    }
}
