function New-CargoResponseSensors {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${cargoEmpty},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${id}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.CargoResponseSensors' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.CargoResponseSensors -ArgumentList @(
            ${cargoEmpty},
            ${name},
            ${id}
        )
    }
}
