function New-TripResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TripResponseTrips[]]]
        ${trips}
    )

    Process {
        'Creating object: samsara.Model.TripResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.TripResponse -ArgumentList @(
            ${trips}
        )
    }
}
