function New-MachineHistoryResponseVibrations {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${X},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${Y},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${Z},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${time}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.MachineHistoryResponseVibrations' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.MachineHistoryResponseVibrations -ArgumentList @(
            ${X},
            ${Y},
            ${Z},
            ${time}
        )
    }
}
