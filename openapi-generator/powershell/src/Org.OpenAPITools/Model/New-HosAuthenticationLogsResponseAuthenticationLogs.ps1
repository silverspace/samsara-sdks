function New-HosAuthenticationLogsResponseAuthenticationLogs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${actionType},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${address},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${city},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${happenedAtMs},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${addressName},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${state}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.HosAuthenticationLogsResponseAuthenticationLogs' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.HosAuthenticationLogsResponseAuthenticationLogs -ArgumentList @(
            ${actionType},
            ${address},
            ${city},
            ${happenedAtMs},
            ${addressName},
            ${state}
        )
    }
}
