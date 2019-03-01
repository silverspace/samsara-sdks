function New-HosLogsSummaryResponseDrivers {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${timeUntilBreak},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${vehicleName},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${drivingInViolationToday},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${driverId},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${cycleRemaining},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${driverName},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${dutyStatus},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${cycleTomorrow},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${shiftDriveRemaining},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${timeInCurrentStatus},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${drivingInViolationCycle},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${shiftRemaining}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.HosLogsSummaryResponseDrivers' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.HosLogsSummaryResponseDrivers -ArgumentList @(
            ${timeUntilBreak},
            ${vehicleName},
            ${drivingInViolationToday},
            ${driverId},
            ${cycleRemaining},
            ${driverName},
            ${dutyStatus},
            ${cycleTomorrow},
            ${shiftDriveRemaining},
            ${timeInCurrentStatus},
            ${drivingInViolationCycle},
            ${shiftRemaining}
        )
    }
}
