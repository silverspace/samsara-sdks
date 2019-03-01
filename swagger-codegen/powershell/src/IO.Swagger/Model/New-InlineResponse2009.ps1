function New-InlineResponse2009 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.Tag[]]]
        ${tags}
    )

    Process {
        'Creating object: samsara.Model.InlineResponse2009' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.InlineResponse2009 -ArgumentList @(
            ${tags}
        )
    }
}
