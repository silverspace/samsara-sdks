function New-AssetReeferResponseReeferStatsReturnAirTemp {
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
        'Creating object: Org.OpenAPITools.Model.AssetReeferResponseReeferStatsReturnAirTemp' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AssetReeferResponseReeferStatsReturnAirTemp -ArgumentList @(
            ${tempInMilliC},
            ${changedAtMs}
        )
    }
}
