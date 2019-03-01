function New-VehicleMaintenanceJ1939 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.VehicleMaintenanceJ1939CheckEngineLight]]
        ${checkEngineLight},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.VehicleMaintenanceJ1939DiagnosticTroubleCodes[]]]
        ${diagnosticTroubleCodes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VehicleMaintenanceJ1939' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VehicleMaintenanceJ1939 -ArgumentList @(
            ${checkEngineLight},
            ${diagnosticTroubleCodes}
        )
    }
}
