function New-AssetReeferResponseReeferStatsPowerStatus {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changedAtMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${status}
    )

    Process {
        'Creating object: samsara.Model.AssetReeferResponseReeferStatsPowerStatus' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AssetReeferResponseReeferStatsPowerStatus -ArgumentList @(
            ${changedAtMs},
            ${status}
        )
    }
}
