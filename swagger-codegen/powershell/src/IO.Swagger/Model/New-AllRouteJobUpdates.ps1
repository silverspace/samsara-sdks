function New-AllRouteJobUpdates {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.JobUpdateObject[]]]
        ${job_updates},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${sequence_id}
    )

    Process {
        'Creating object: samsara.Model.AllRouteJobUpdates' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AllRouteJobUpdates -ArgumentList @(
            ${job_updates},
            ${sequence_id}
        )
    }
}
