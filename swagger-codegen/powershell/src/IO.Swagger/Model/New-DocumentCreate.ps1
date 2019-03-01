function New-DocumentCreate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${dispatchJobId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${documentTypeUuid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.DocumentField[]]
        ${fields}
    )

    Process {
        'Creating object: samsara.Model.DocumentCreate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DocumentCreate -ArgumentList @(
            ${dispatchJobId},
            ${notes},
            ${documentTypeUuid},
            ${fields}
        )
    }
}
