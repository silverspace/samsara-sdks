function New-TripResponseTrips {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${distanceMeters},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${driverId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${endAddress},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TripResponseEndCoordinates]]
        ${endCoordinates},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${endLocation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${endMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${endOdometer},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${fuelConsumedMl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${startAddress},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TripResponseStartCoordinates]]
        ${startCoordinates},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${startLocation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${startMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${startOdometer},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${tollMeters}
    )

    Process {
        'Creating object: samsara.Model.TripResponseTrips' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.TripResponseTrips -ArgumentList @(
            ${distanceMeters},
            ${driverId},
            ${endAddress},
            ${endCoordinates},
            ${endLocation},
            ${endMs},
            ${endOdometer},
            ${fuelConsumedMl},
            ${startAddress},
            ${startCoordinates},
            ${startLocation},
            ${startMs},
            ${startOdometer},
            ${tollMeters}
        )
    }
}
