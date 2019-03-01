function New-AssetReeferResponseReeferStatsReturnAirTemp {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changedAtMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${tempInMilliC}
    )

    Process {
        'Creating object: samsara.Model.AssetReeferResponseReeferStatsReturnAirTemp' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AssetReeferResponseReeferStatsReturnAirTemp -ArgumentList @(
            ${changedAtMs},
            ${tempInMilliC}
        )
    }
}
