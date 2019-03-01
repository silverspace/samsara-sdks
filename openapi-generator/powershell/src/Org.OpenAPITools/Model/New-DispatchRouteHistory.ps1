function New-DispatchRouteHistory {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DispatchRouteHistoricalEntry[]]]
        ${history}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DispatchRouteHistory' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DispatchRouteHistory -ArgumentList @(
            ${history}
        )
    }
}
