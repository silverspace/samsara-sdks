function New-DoorResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DoorResponseSensors[]]]
        ${sensors}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DoorResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DoorResponse -ArgumentList @(
            ${groupId},
            ${sensors}
        )
    }
}
