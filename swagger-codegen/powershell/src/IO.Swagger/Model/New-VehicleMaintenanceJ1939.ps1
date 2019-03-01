function New-VehicleMaintenanceJ1939 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.VehicleMaintenanceJ1939CheckEngineLight]]
        ${checkEngineLight},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.VehicleMaintenanceJ1939DiagnosticTroubleCodes[]]]
        ${diagnosticTroubleCodes}
    )

    Process {
        'Creating object: samsara.Model.VehicleMaintenanceJ1939' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.VehicleMaintenanceJ1939 -ArgumentList @(
            ${checkEngineLight},
            ${diagnosticTroubleCodes}
        )
    }
}
