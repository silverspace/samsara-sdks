function New-AssetReeferResponseReeferStatsEngineHours {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changedAtMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${engineHours}
    )

    Process {
        'Creating object: samsara.Model.AssetReeferResponseReeferStatsEngineHours' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AssetReeferResponseReeferStatsEngineHours -ArgumentList @(
            ${changedAtMs},
            ${engineHours}
        )
    }
}
