function New-HosLogsSummaryResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.HosLogsSummaryResponseDrivers[]]]
        ${drivers}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.HosLogsSummaryResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.HosLogsSummaryResponse -ArgumentList @(
            ${drivers}
        )
    }
}
