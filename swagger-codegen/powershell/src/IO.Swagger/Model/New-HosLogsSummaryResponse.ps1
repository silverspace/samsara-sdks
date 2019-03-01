function New-HosLogsSummaryResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.HosLogsSummaryResponseDrivers[]]]
        ${drivers}
    )

    Process {
        'Creating object: samsara.Model.HosLogsSummaryResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.HosLogsSummaryResponse -ArgumentList @(
            ${drivers}
        )
    }
}
