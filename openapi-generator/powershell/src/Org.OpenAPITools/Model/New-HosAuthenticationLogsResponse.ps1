function New-HosAuthenticationLogsResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.HosAuthenticationLogsResponseAuthenticationLogs[]]]
        ${authenticationLogs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.HosAuthenticationLogsResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.HosAuthenticationLogsResponse -ArgumentList @(
            ${authenticationLogs}
        )
    }
}
