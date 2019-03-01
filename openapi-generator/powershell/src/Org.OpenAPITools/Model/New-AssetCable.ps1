function New-AssetCable {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${assetType}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AssetCable' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AssetCable -ArgumentList @(
            ${assetType}
        )
    }
}
