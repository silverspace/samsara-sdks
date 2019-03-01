function New-Pagination {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${endCursor},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Boolean]
        ${hasNextPage},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Boolean]
        ${hasPrevPage},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${startCursor}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.Pagination' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.Pagination -ArgumentList @(
            ${endCursor},
            ${hasNextPage},
            ${hasPrevPage},
            ${startCursor}
        )
    }
}
