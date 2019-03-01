function New-AssetReeferResponseReeferStatsAlarms1 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AssetReeferResponseReeferStatsAlarms[]]]
        ${alarms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changedAtMs}
    )

    Process {
        'Creating object: samsara.Model.AssetReeferResponseReeferStatsAlarms1' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AssetReeferResponseReeferStatsAlarms1 -ArgumentList @(
            ${alarms},
            ${changedAtMs}
        )
    }
}
