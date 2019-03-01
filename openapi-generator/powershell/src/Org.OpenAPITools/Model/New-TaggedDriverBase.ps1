function New-TaggedDriverBase {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TaggedDriverBase' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TaggedDriverBase -ArgumentList @(
            ${id}
        )
    }
}
