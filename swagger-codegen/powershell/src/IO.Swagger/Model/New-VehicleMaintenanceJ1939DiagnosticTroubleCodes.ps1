function New-VehicleMaintenanceJ1939DiagnosticTroubleCodes {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${fmiId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${fmiText},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${occurrenceCount},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${spnDescription},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${spnId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${txId}
    )

    Process {
        'Creating object: samsara.Model.VehicleMaintenanceJ1939DiagnosticTroubleCodes' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.VehicleMaintenanceJ1939DiagnosticTroubleCodes -ArgumentList @(
            ${fmiId},
            ${fmiText},
            ${occurrenceCount},
            ${spnDescription},
            ${spnId},
            ${txId}
        )
    }
}
