function New-CargoResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.CargoResponseSensors[]]]
        ${sensors}
    )

    Process {
        'Creating object: samsara.Model.CargoResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.CargoResponse -ArgumentList @(
            ${groupId},
            ${sensors}
        )
    }
}
