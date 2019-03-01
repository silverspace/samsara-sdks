function New-AddressGeofence {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AddressGeofenceCircle]]
        ${circle},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AddressGeofencePolygon]]
        ${polygon}
    )

    Process {
        'Creating object: samsara.Model.AddressGeofence' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AddressGeofence -ArgumentList @(
            ${circle},
            ${polygon}
        )
    }
}
