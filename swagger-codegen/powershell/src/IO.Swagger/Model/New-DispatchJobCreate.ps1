function New-DispatchJobCreate {
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
        ${scheduled_departure_time_ms}
    )

    Process {
        'Creating object: samsara.Model.DispatchJobCreate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DispatchJobCreate -ArgumentList @(
            ${destination_address},
            ${destination_address_id},
            ${destination_lat},
            ${destination_lng},
            ${destination_name},
            ${notes},
            ${scheduled_arrival_time_ms},
            ${scheduled_departure_time_ms}
        )
    }
}
