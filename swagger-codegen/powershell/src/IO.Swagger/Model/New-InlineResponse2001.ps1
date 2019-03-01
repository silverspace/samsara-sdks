function New-InlineResponse2001 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AssetCurrentLocationsResponse[]]]
        ${assets}
    )

    Process {
        'Creating object: samsara.Model.InlineResponse2001' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.InlineResponse2001 -ArgumentList @(
            ${assets}
        )
    }
}
