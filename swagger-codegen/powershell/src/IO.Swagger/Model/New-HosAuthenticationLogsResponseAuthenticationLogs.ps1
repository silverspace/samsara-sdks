function New-HosAuthenticationLogsResponseAuthenticationLogs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${actionType},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${address},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${addressName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${city},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${happenedAtMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${state}
    )

    Process {
        'Creating object: samsara.Model.HosAuthenticationLogsResponseAuthenticationLogs' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.HosAuthenticationLogsResponseAuthenticationLogs -ArgumentList @(
            ${actionType},
            ${address},
            ${addressName},
            ${city},
            ${happenedAtMs},
            ${state}
        )
    }
}
