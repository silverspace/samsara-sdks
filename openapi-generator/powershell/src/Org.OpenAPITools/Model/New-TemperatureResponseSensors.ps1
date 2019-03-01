function New-TemperatureResponseSensors {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${probeTemperature},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${id},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ambientTemperature}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TemperatureResponseSensors' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TemperatureResponseSensors -ArgumentList @(
            ${probeTemperature},
            ${name},
            ${id},
            ${ambientTemperature}
        )
    }
}
