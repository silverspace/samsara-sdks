function New-VehicleMaintenancePassengerDiagnosticTroubleCodes {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${dtcShortCode},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${dtcId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${dtcDescription}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VehicleMaintenancePassengerDiagnosticTroubleCodes' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VehicleMaintenancePassengerDiagnosticTroubleCodes -ArgumentList @(
            ${dtcShortCode},
            ${dtcId},
            ${dtcDescription}
        )
    }
}
