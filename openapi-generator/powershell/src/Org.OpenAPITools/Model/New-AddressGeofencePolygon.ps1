function New-AddressGeofencePolygon {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AddressGeofencePolygonVertices[]]]
        ${vertices}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AddressGeofencePolygon' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AddressGeofencePolygon -ArgumentList @(
            ${vertices}
        )
    }
}
