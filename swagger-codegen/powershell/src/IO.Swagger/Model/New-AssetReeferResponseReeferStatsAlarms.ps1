function New-AssetReeferResponseReeferStatsAlarms {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${alarmCode},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${operatorAction},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${severity}
    )

    Process {
        'Creating object: samsara.Model.AssetReeferResponseReeferStatsAlarms' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AssetReeferResponseReeferStatsAlarms -ArgumentList @(
            ${alarmCode},
            ${description},
            ${operatorAction},
            ${severity}
        )
    }
}
