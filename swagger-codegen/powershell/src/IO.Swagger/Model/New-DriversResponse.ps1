function New-DriversResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.Driver[]]]
        ${drivers}
    )

    Process {
        'Creating object: samsara.Model.DriversResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DriversResponse -ArgumentList @(
            ${drivers}
        )
    }
}
