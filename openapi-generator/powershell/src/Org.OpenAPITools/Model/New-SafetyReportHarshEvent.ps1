function New-SafetyReportHarshEvent {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${harshEventType},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${timestampMs},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${vehicleId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.SafetyReportHarshEvent' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.SafetyReportHarshEvent -ArgumentList @(
            ${harshEventType},
            ${timestampMs},
            ${vehicleId}
        )
    }
}
