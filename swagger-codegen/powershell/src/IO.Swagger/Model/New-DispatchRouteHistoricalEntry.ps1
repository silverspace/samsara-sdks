function New-DispatchRouteHistoricalEntry {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changed_at_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DispatchRoute]]
        ${route}
    )

    Process {
        'Creating object: samsara.Model.DispatchRouteHistoricalEntry' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DispatchRouteHistoricalEntry -ArgumentList @(
            ${changed_at_ms},
            ${route}
        )
    }
}
