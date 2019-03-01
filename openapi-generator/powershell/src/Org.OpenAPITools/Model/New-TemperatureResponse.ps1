function New-TemperatureResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TemperatureResponseSensors[]]]
        ${sensors}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TemperatureResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TemperatureResponse -ArgumentList @(
            ${groupId},
            ${sensors}
        )
    }
}
