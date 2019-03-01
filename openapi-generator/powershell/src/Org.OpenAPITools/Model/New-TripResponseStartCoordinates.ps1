function New-TripResponseStartCoordinates {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${latitude},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${longitude}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TripResponseStartCoordinates' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TripResponseStartCoordinates -ArgumentList @(
            ${latitude},
            ${longitude}
        )
    }
}
