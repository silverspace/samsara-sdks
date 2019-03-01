function New-HosLogsSummaryResponseDrivers {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${cycleRemaining},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${cycleTomorrow},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${driverId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${driverName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${drivingInViolationCycle},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${drivingInViolationToday},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${dutyStatus},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${shiftDriveRemaining},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${shiftRemaining},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${timeInCurrentStatus},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${timeUntilBreak},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${vehicleName}
    )

    Process {
        'Creating object: samsara.Model.HosLogsSummaryResponseDrivers' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.HosLogsSummaryResponseDrivers -ArgumentList @(
            ${cycleRemaining},
            ${cycleTomorrow},
            ${driverId},
            ${driverName},
            ${drivingInViolationCycle},
            ${drivingInViolationToday},
            ${dutyStatus},
            ${shiftDriveRemaining},
            ${shiftRemaining},
            ${timeInCurrentStatus},
            ${timeUntilBreak},
            ${vehicleName}
        )
    }
}
