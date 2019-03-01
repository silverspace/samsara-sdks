function New-AddressGeofencePolygonVertices {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${latitude},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${longitude}
    )

    Process {
        'Creating object: samsara.Model.AddressGeofencePolygonVertices' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AddressGeofencePolygonVertices -ArgumentList @(
            ${latitude},
            ${longitude}
        )
    }
}
