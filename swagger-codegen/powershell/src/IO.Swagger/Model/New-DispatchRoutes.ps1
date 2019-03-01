function New-DispatchRoutes {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.DispatchRoutes' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DispatchRoutes -ArgumentList @(
        )
    }
}
