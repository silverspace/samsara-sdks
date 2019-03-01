function New-DriverDailyLogResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DriverDailyLogResponseDays[]]]
        ${days}
    )

    Process {
        'Creating object: samsara.Model.DriverDailyLogResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DriverDailyLogResponse -ArgumentList @(
            ${days}
        )
    }
}
