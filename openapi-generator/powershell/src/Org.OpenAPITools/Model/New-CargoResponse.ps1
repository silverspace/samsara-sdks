function New-CargoResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.CargoResponseSensors[]]]
        ${sensors}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.CargoResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.CargoResponse -ArgumentList @(
            ${groupId},
            ${sensors}
        )
    }
}
