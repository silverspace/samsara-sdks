function New-JobUpdateObject {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changed_at_ms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${job_id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.JobStatus]]
        ${job_state},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.PrevJobStatus]]
        ${prev_job_state},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DispatchRoute]]
        ${route},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${route_id}
    )

    Process {
        'Creating object: samsara.Model.JobUpdateObject' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.JobUpdateObject -ArgumentList @(
            ${changed_at_ms},
            ${job_id},
            ${job_state},
            ${prev_job_state},
            ${route},
            ${route_id}
        )
    }
}
