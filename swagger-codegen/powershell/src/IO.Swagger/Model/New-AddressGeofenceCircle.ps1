function New-AddressGeofenceCircle {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${latitude},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${longitude},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${radiusMeters}
    )

    Process {
        'Creating object: samsara.Model.AddressGeofenceCircle' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AddressGeofenceCircle -ArgumentList @(
            ${latitude},
            ${longitude},
            ${radiusMeters}
        )
    }
}
