function New-VehicleHarshEventResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${downloadForwardVideoUrl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${downloadInwardVideoUrl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${downloadTrackedInwardVideoUrl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${harshEventType},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${incidentReportUrl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${isDistracted},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.VehicleHarshEventResponseLocation]]
        ${location}
    )

    Process {
        'Creating object: samsara.Model.VehicleHarshEventResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.VehicleHarshEventResponse -ArgumentList @(
            ${downloadForwardVideoUrl},
            ${downloadInwardVideoUrl},
            ${downloadTrackedInwardVideoUrl},
            ${harshEventType},
            ${incidentReportUrl},
            ${isDistracted},
            ${location}
        )
    }
}
