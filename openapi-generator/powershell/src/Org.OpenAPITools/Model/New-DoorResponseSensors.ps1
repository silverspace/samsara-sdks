function New-DoorResponseSensors {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${doorClosed},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${id}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DoorResponseSensors' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DoorResponseSensors -ArgumentList @(
            ${doorClosed},
            ${name},
            ${id}
        )
    }
}
