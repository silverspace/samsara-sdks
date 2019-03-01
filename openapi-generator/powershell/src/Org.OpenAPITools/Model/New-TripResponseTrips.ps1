function New-TripResponseTrips {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${endOdometer},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${distanceMeters},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${endMs},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${startMs},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${fuelConsumedMl},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${startAddress},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TripResponseStartCoordinates]]
        ${startCoordinates},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TripResponseEndCoordinates]]
        ${endCoordinates},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${startOdometer},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${driverId},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${startLocation},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${tollMeters},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${endAddress},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${endLocation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TripResponseTrips' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TripResponseTrips -ArgumentList @(
            ${endOdometer},
            ${distanceMeters},
            ${endMs},
            ${startMs},
            ${fuelConsumedMl},
            ${startAddress},
            ${startCoordinates},
            ${endCoordinates},
            ${startOdometer},
            ${driverId},
            ${startLocation},
            ${tollMeters},
            ${endAddress},
            ${endLocation}
        )
    }
}
