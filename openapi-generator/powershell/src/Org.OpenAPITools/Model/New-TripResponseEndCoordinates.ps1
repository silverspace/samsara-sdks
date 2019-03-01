function New-TripResponseEndCoordinates {
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
        'Creating object: Org.OpenAPITools.Model.TripResponseEndCoordinates' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TripResponseEndCoordinates -ArgumentList @(
            ${latitude},
            ${longitude}
        )
    }
}
