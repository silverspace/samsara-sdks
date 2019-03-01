function New-DispatchJob {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${destination_address},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${destination_address_id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${destination_lat},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${destination_lng},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${destination_name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${scheduled_arrival_time_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${scheduled_departure_time_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${arrived_at_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${completed_at_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${dispatch_route_id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${driver_id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${en_route_at_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${estimated_arrival_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${fleet_viewer_url},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${group_id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.JobStatus]
        ${job_state},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${skipped_at_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${vehicle_id}
    )

    Process {
        'Creating object: samsara.Model.DispatchJob' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DispatchJob -ArgumentList @(
            ${destination_address},
            ${destination_address_id},
            ${destination_lat},
            ${destination_lng},
            ${destination_name},
            ${notes},
            ${scheduled_arrival_time_ms},
            ${scheduled_departure_time_ms},
            ${arrived_at_ms},
            ${completed_at_ms},
            ${dispatch_route_id},
            ${driver_id},
            ${en_route_at_ms},
            ${estimated_arrival_ms},
            ${fleet_viewer_url},
            ${group_id},
            ${id},
            ${job_state},
            ${skipped_at_ms},
            ${vehicle_id}
        )
    }
}
