function New-VehicleHarshEventResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${downloadForwardVideoUrl},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${downloadInwardVideoUrl},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${downloadTrackedInwardVideoUrl},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${harshEventType},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${incidentReportUrl},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${isDistracted},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.VehicleHarshEventResponseLocation]]
        ${location}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VehicleHarshEventResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VehicleHarshEventResponse -ArgumentList @(
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
