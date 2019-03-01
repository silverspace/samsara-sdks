function New-HosLogsResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.HosLogsResponseLogs[]]]
        ${logs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.HosLogsResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.HosLogsResponse -ArgumentList @(
            ${logs}
        )
    }
}
