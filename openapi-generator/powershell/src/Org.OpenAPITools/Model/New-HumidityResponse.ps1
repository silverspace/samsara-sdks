function New-HumidityResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.HumidityResponseSensors[]]]
        ${sensors}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.HumidityResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.HumidityResponse -ArgumentList @(
            ${groupId},
            ${sensors}
        )
    }
}
