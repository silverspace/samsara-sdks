function New-DriversSummaryResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DriversSummaryResponseSummaries[]]]
        ${Summaries}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DriversSummaryResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DriversSummaryResponse -ArgumentList @(
            ${Summaries}
        )
    }
}
