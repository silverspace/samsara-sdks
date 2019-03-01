function New-DocumentBase {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${dispatchJobId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DocumentBase' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DocumentBase -ArgumentList @(
            ${dispatchJobId},
            ${notes}
        )
    }
}
