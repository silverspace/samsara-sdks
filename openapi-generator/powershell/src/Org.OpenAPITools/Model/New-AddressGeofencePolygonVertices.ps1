function New-AddressGeofencePolygonVertices {
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
        'Creating object: Org.OpenAPITools.Model.AddressGeofencePolygonVertices' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AddressGeofencePolygonVertices -ArgumentList @(
            ${latitude},
            ${longitude}
        )
    }
}
