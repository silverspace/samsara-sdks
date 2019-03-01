function New-InlineObject23 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${groupId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject23' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject23 -ArgumentList @(
            ${groupId}
        )
    }
}
