function New-InlineObject17 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${endMs},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${groupId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${startMs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject17' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject17 -ArgumentList @(
            ${endMs},
            ${groupId},
            ${startMs}
        )
    }
}
