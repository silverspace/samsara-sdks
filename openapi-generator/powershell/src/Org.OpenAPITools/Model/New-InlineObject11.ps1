function New-InlineObject11 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${groupId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject11' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject11 -ArgumentList @(
            ${groupId}
        )
    }
}
