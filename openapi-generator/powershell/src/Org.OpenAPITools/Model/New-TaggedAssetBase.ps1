function New-TaggedAssetBase {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TaggedAssetBase' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TaggedAssetBase -ArgumentList @(
            ${id}
        )
    }
}
