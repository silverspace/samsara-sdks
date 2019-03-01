function New-AuxInputSeries {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.AuxInput[]]
        ${values}
    )

    Process {
        'Creating object: samsara.Model.AuxInputSeries' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AuxInputSeries -ArgumentList @(
            ${name},
            ${values}
        )
    }
}
