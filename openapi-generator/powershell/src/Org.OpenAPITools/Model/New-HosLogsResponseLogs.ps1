function New-HosLogsResponseLogs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${locLng},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${logStartMs},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${driverId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${statusType},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${locCity},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${locName},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${locLat},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${remark},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${locState},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${vehicleId},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64[]]]
        ${codriverIds}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.HosLogsResponseLogs' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.HosLogsResponseLogs -ArgumentList @(
            ${locLng},
            ${logStartMs},
            ${driverId},
            ${statusType},
            ${locCity},
            ${groupId},
            ${locName},
            ${locLat},
            ${remark},
            ${locState},
            ${vehicleId},
            ${codriverIds}
        )
    }
}
