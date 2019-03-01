function New-SensorParam {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${groupId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64[]]
        ${sensors}
    )

    Process {
        'Creating object: samsara.Model.SensorParam' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.SensorParam -ArgumentList @(
            ${groupId},
            ${sensors}
        )
    }
}
