function New-AssetCable {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${assetType}
    )

    Process {
        'Creating object: samsara.Model.AssetCable' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AssetCable -ArgumentList @(
            ${assetType}
        )
    }
}
