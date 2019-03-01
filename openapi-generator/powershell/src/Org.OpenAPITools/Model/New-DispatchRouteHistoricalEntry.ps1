function New-DispatchRouteHistoricalEntry {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changedUnderscoreatUnderscorems},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DispatchRoute]]
        ${route}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DispatchRouteHistoricalEntry' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DispatchRouteHistoricalEntry -ArgumentList @(
            ${changedUnderscoreatUnderscorems},
            ${route}
        )
    }
}
