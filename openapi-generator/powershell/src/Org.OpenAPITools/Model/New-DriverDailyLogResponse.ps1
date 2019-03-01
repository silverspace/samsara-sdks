function New-DriverDailyLogResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DriverDailyLogResponseDays[]]]
        ${days}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DriverDailyLogResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DriverDailyLogResponse -ArgumentList @(
            ${days}
        )
    }
}
