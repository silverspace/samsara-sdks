function New-AuxInput {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Decimal]
        ${timeMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Boolean]
        ${value}
    )

    Process {
        'Creating object: samsara.Model.AuxInput' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AuxInput -ArgumentList @(
            ${timeMs},
            ${value}
        )
    }
}
