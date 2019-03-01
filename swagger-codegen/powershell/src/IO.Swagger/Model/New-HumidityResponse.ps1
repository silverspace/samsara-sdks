function New-HumidityResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.HumidityResponseSensors[]]]
        ${sensors}
    )

    Process {
        'Creating object: samsara.Model.HumidityResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.HumidityResponse -ArgumentList @(
            ${groupId},
            ${sensors}
        )
    }
}
