function New-SensorHistoryResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.SensorHistoryResponseResults[]]]
        ${results}
    )

    Process {
        'Creating object: samsara.Model.SensorHistoryResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.SensorHistoryResponse -ArgumentList @(
            ${results}
        )
    }
}
