function New-TaggedAddressBase {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TaggedAddressBase' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TaggedAddressBase -ArgumentList @(
            ${id}
        )
    }
}
