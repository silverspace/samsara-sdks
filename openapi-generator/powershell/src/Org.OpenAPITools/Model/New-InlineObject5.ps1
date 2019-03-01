function New-InlineObject5 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${endMs},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${orgId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${startMs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject5' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject5 -ArgumentList @(
            ${endMs},
            ${orgId},
            ${startMs}
        )
    }
}
