function New-TripResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TripResponseTrips[]]]
        ${trips}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TripResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TripResponse -ArgumentList @(
            ${trips}
        )
    }
}
