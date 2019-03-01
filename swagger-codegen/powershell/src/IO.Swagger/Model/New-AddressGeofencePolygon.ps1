function New-AddressGeofencePolygon {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AddressGeofencePolygonVertices[]]]
        ${vertices}
    )

    Process {
        'Creating object: samsara.Model.AddressGeofencePolygon' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AddressGeofencePolygon -ArgumentList @(
            ${vertices}
        )
    }
}
