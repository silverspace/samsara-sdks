function New-AssetReeferResponseReeferStatsAlarms1 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AssetReeferResponseReeferStatsAlarms[]]]
        ${alarms},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changedAtMs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AssetReeferResponseReeferStatsAlarms1' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AssetReeferResponseReeferStatsAlarms1 -ArgumentList @(
            ${alarms},
            ${changedAtMs}
        )
    }
}
