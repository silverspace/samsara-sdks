function New-InlineResponse200 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.Asset[]]]
        ${assets}
    )

    Process {
        'Creating object: samsara.Model.InlineResponse200' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.InlineResponse200 -ArgumentList @(
            ${assets}
        )
    }
}
