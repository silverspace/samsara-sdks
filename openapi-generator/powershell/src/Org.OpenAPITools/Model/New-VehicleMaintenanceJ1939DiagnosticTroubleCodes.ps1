function New-VehicleMaintenanceJ1939DiagnosticTroubleCodes {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${spnDescription},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${fmiText},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${spnId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${occurrenceCount},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${txId},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${fmiId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VehicleMaintenanceJ1939DiagnosticTroubleCodes' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VehicleMaintenanceJ1939DiagnosticTroubleCodes -ArgumentList @(
            ${spnDescription},
            ${fmiText},
            ${spnId},
            ${occurrenceCount},
            ${txId},
            ${fmiId}
        )
    }
}
