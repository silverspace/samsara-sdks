function New-HosLogsResponseLogs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64[]]]
        ${codriverIds},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${driverId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${locCity},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${locLat},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${locLng},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${locName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${locState},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${logStartMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${remark},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${statusType},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${vehicleId}
    )

    Process {
        'Creating object: samsara.Model.HosLogsResponseLogs' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.HosLogsResponseLogs -ArgumentList @(
            ${codriverIds},
            ${driverId},
            ${groupId},
            ${locCity},
            ${locLat},
            ${locLng},
            ${locName},
            ${locState},
            ${logStartMs},
            ${remark},
            ${statusType},
            ${vehicleId}
        )
    }
}
