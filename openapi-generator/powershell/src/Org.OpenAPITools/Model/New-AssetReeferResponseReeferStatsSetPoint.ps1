function New-AssetReeferResponseReeferStatsSetPoint {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${tempInMilliC},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changedAtMs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AssetReeferResponseReeferStatsSetPoint' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AssetReeferResponseReeferStatsSetPoint -ArgumentList @(
            ${tempInMilliC},
            ${changedAtMs}
        )
    }
}
