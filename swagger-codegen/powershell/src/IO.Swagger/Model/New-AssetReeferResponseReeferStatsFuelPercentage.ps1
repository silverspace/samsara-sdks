function New-AssetReeferResponseReeferStatsFuelPercentage {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changedAtMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${fuelPercentage}
    )

    Process {
        'Creating object: samsara.Model.AssetReeferResponseReeferStatsFuelPercentage' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AssetReeferResponseReeferStatsFuelPercentage -ArgumentList @(
            ${changedAtMs},
            ${fuelPercentage}
        )
    }
}
