function New-DispatchRouteCreate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${actual_end_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${actual_start_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${driver_id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${group_id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${scheduled_end_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${scheduled_meters},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${scheduled_start_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${start_location_address},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${start_location_address_id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${start_location_lat},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${start_location_lng},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${start_location_name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${trailer_id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${vehicle_id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.DispatchJobCreate[]]
        ${dispatch_jobs}
    )

    Process {
        'Creating object: samsara.Model.DispatchRouteCreate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DispatchRouteCreate -ArgumentList @(
            ${actual_end_ms},
            ${actual_start_ms},
            ${driver_id},
            ${group_id},
            ${name},
            ${scheduled_end_ms},
            ${scheduled_meters},
            ${scheduled_start_ms},
            ${start_location_address},
            ${start_location_address_id},
            ${start_location_lat},
            ${start_location_lng},
            ${start_location_name},
            ${trailer_id},
            ${vehicle_id},
            ${dispatch_jobs}
        )
    }
}
