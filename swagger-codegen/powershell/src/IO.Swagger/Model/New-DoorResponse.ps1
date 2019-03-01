function New-DoorResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DoorResponseSensors[]]]
        ${sensors}
    )

    Process {
        'Creating object: samsara.Model.DoorResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DoorResponse -ArgumentList @(
            ${groupId},
            ${sensors}
        )
    }
}
