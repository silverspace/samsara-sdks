function New-DispatchRouteHistory {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DispatchRouteHistoricalEntry[]]]
        ${history}
    )

    Process {
        'Creating object: samsara.Model.DispatchRouteHistory' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DispatchRouteHistory -ArgumentList @(
            ${history}
        )
    }
}
