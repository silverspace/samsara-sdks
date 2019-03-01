function New-DriversSummaryResponseSummaries {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${driverId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${distanceMiles},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${driveMs},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${activeMs},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${driverUsername},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${driverName},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${onDutyMs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DriversSummaryResponseSummaries' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DriversSummaryResponseSummaries -ArgumentList @(
            ${driverId},
            ${distanceMiles},
            ${driveMs},
            ${activeMs},
            ${driverUsername},
            ${groupId},
            ${driverName},
            ${onDutyMs}
        )
    }
}
