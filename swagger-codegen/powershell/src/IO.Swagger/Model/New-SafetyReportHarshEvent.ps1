function New-SafetyReportHarshEvent {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${harshEventType},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${timestampMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${vehicleId}
    )

    Process {
        'Creating object: samsara.Model.SafetyReportHarshEvent' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.SafetyReportHarshEvent -ArgumentList @(
            ${harshEventType},
            ${timestampMs},
            ${vehicleId}
        )
    }
}
