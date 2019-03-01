function New-VehicleMaintenancePassenger {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.VehicleMaintenancePassengerCheckEngineLight]]
        ${checkEngineLight},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.VehicleMaintenancePassengerDiagnosticTroubleCodes[]]]
        ${diagnosticTroubleCodes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VehicleMaintenancePassenger' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VehicleMaintenancePassenger -ArgumentList @(
            ${checkEngineLight},
            ${diagnosticTroubleCodes}
        )
    }
}
