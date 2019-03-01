function New-DvirBaseVehicle {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${id}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DvirBaseVehicle' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DvirBaseVehicle -ArgumentList @(
            ${name},
            ${id}
        )
    }
}
