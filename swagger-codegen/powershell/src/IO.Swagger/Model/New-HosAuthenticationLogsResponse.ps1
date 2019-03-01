function New-HosAuthenticationLogsResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.HosAuthenticationLogsResponseAuthenticationLogs[]]]
        ${authenticationLogs}
    )

    Process {
        'Creating object: samsara.Model.HosAuthenticationLogsResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.HosAuthenticationLogsResponse -ArgumentList @(
            ${authenticationLogs}
        )
    }
}
