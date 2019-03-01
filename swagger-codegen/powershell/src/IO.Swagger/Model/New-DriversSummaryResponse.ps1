function New-DriversSummaryResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DriversSummaryResponseSummaries[]]]
        ${Summaries}
    )

    Process {
        'Creating object: samsara.Model.DriversSummaryResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DriversSummaryResponse -ArgumentList @(
            ${Summaries}
        )
    }
}
