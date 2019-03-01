function New-TemperatureResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TemperatureResponseSensors[]]]
        ${sensors}
    )

    Process {
        'Creating object: samsara.Model.TemperatureResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.TemperatureResponse -ArgumentList @(
            ${groupId},
            ${sensors}
        )
    }
}
