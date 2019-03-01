function New-InlineResponse2002 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.Pagination]]
        ${pagination},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.Vehicle[]]]
        ${vehicles}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2002' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2002 -ArgumentList @(
            ${pagination},
            ${groupId},
            ${vehicles}
        )
    }
}
