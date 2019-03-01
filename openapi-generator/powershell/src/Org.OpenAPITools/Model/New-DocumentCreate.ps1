function New-DocumentCreate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${dispatchJobId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notes},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${documentTypeUuid},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.DocumentField[]]
        ${fields}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DocumentCreate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DocumentCreate -ArgumentList @(
            ${dispatchJobId},
            ${notes},
            ${documentTypeUuid},
            ${fields}
        )
    }
}
