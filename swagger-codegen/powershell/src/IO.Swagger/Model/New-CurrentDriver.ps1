function New-CurrentDriver {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating object: samsara.Model.CurrentDriver' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.CurrentDriver -ArgumentList @(
        )
    }
}
