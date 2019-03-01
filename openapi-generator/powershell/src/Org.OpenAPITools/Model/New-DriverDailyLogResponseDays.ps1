function New-DriverDailyLogResponseDays {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${certifiedAtMs},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${endMs},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String]]
        ${trailerIds},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${activeHours},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${distanceMiles},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${activeMs},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${certified},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String]]
        ${vehicleIds}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DriverDailyLogResponseDays' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DriverDailyLogResponseDays -ArgumentList @(
            ${certifiedAtMs},
            ${endMs},
            ${startMs},
            ${trailerIds},
            ${activeHours},
            ${distanceMiles},
            ${activeMs},
            ${certified},
            ${vehicleIds}
        )
    }
}
