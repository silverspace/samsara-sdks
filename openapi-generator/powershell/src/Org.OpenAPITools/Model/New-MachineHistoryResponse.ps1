function New-MachineHistoryResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.MachineHistoryResponseMachines[]]]
        ${machines}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.MachineHistoryResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.MachineHistoryResponse -ArgumentList @(
            ${machines}
        )
    }
}
