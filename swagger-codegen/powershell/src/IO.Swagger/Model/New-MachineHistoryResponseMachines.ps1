function New-MachineHistoryResponseMachines {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${id},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.MachineHistoryResponseVibrations[]]]
        ${vibrations}
    )

    Process {
        'Creating object: samsara.Model.MachineHistoryResponseMachines' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.MachineHistoryResponseMachines -ArgumentList @(
            ${id},
            ${name},
            ${vibrations}
        )
    }
}
