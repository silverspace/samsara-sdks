function New-VehicleSafetyScoreResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${crashCount},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${harshAccelCount},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${harshBrakingCount},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SafetyReportHarshEvent[]]]
        ${harshEvents},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${harshTurningCount},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${safetyScore},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${safetyScoreRank},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${timeOverSpeedLimitMs},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${totalDistanceDrivenMeters},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${totalHarshEventCount},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${totalTimeDrivenMs},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${vehicleId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VehicleSafetyScoreResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VehicleSafetyScoreResponse -ArgumentList @(
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
