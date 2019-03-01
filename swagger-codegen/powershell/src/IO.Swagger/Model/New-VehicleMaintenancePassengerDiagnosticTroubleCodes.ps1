function New-VehicleMaintenancePassengerDiagnosticTroubleCodes {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${dtcDescription},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${dtcId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${dtcShortCode}
    )

    Process {
        'Creating object: samsara.Model.VehicleMaintenancePassengerDiagnosticTroubleCodes' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.VehicleMaintenancePassengerDiagnosticTroubleCodes -ArgumentList @(
            ${dtcDescription},
            ${dtcId},
            ${dtcShortCode}
        )
    }
}
