function New-DriverSafetyScoreResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${crashCount},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${driverId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${harshAccelCount},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${harshBrakingCount},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.SafetyReportHarshEvent[]]]
        ${harshEvents},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${harshTurningCount},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${safetyScore},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${safetyScoreRank},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${timeOverSpeedLimitMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${totalDistanceDrivenMeters},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${totalHarshEventCount},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${totalTimeDrivenMs}
    )

    Process {
        'Creating object: samsara.Model.DriverSafetyScoreResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DriverSafetyScoreResponse -ArgumentList @(
            ${crashCount},
            ${driverId},
            ${harshAccelCount},
            ${harshBrakingCount},
            ${harshEvents},
            ${harshTurningCount},
            ${safetyScore},
            ${safetyScoreRank},
            ${timeOverSpeedLimitMs},
            ${totalDistanceDrivenMeters},
            ${totalHarshEventCount},
            ${totalTimeDrivenMs}
        )
    }
}
