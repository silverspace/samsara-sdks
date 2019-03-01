function New-MachineHistoryResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.MachineHistoryResponseMachines[]]]
        ${machines}
    )

    Process {
        'Creating object: samsara.Model.MachineHistoryResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.MachineHistoryResponse -ArgumentList @(
            ${machines}
        )
    }
}
