function New-AssetReeferResponseReeferStatsEngineHours {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${engineHours},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changedAtMs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AssetReeferResponseReeferStatsEngineHours' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AssetReeferResponseReeferStatsEngineHours -ArgumentList @(
            ${engineHours},
            ${changedAtMs}
        )
    }
}
