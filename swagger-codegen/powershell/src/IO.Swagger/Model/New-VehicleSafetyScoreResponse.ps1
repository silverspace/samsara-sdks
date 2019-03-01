function New-VehicleSafetyScoreResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${crashCount},
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
        ${totalTimeDrivenMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${vehicleId}
    )

    Process {
        'Creating object: samsara.Model.VehicleSafetyScoreResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.VehicleSafetyScoreResponse -ArgumentList @(
            ${crashCount},
            ${harshAccelCount},
            ${harshBrakingCount},
            ${harshEvents},
            ${harshTurningCount},
            ${safetyScore},
            ${safetyScoreRank},
            ${timeOverSpeedLimitMs},
            ${totalDistanceDrivenMeters},
            ${totalHarshEventCount},
            ${totalTimeDrivenMs},
            ${vehicleId}
        )
    }
}
