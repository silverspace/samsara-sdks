function New-MachineHistoryResponseMachines {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${id},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.MachineHistoryResponseVibrations[]]]
        ${vibrations}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.MachineHistoryResponseMachines' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.MachineHistoryResponseMachines -ArgumentList @(
            ${name},
            ${id},
            ${vibrations}
        )
    }
}
