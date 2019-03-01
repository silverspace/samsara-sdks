function New-HosLogsResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.HosLogsResponseLogs[]]]
        ${logs}
    )

    Process {
        'Creating object: samsara.Model.HosLogsResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.HosLogsResponse -ArgumentList @(
            ${logs}
        )
    }
}
