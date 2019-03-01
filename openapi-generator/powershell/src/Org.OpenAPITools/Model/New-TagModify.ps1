function New-TagModify {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TagModifyAdd]]
        ${add},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TagModifyDelete]]
        ${delete},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${parentTagId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TagModify' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TagModify -ArgumentList @(
            ${add},
            ${delete},
            ${name},
            ${parentTagId}
        )
    }
}
