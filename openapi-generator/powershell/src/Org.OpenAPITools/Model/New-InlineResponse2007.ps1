function New-InlineResponse2007 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.Machine[]]]
        ${machines}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse2007' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse2007 -ArgumentList @(
            ${machines}
        )
    }
}
