function New-AddressGeofenceCircle {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${latitude},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${radiusMeters},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${longitude}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AddressGeofenceCircle' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AddressGeofenceCircle -ArgumentList @(
            ${latitude},
            ${radiusMeters},
            ${longitude}
        )
    }
}
