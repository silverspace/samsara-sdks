function New-HumidityResponseSensors {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${humidity},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${id}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.HumidityResponseSensors' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.HumidityResponseSensors -ArgumentList @(
            ${name},
            ${humidity},
            ${id}
        )
    }
}
