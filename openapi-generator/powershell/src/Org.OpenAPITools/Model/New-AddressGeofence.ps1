function New-AddressGeofence {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AddressGeofenceCircle]]
        ${circle},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AddressGeofencePolygon]]
        ${polygon}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AddressGeofence' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AddressGeofence -ArgumentList @(
            ${circle},
            ${polygon}
        )
    }
}
