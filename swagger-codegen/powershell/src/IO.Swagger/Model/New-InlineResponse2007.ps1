function New-InlineResponse2007 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.Machine[]]]
        ${machines}
    )

    Process {
        'Creating object: samsara.Model.InlineResponse2007' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.InlineResponse2007 -ArgumentList @(
            ${machines}
        )
    }
}
