function New-TagUpdate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TaggedAssetBase[]]]
        ${assets},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TaggedDriverBase[]]]
        ${drivers},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TaggedMachineBase[]]]
        ${machines},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${parentTagId},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TaggedSensorBase[]]]
        ${sensors},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TaggedVehicleBase[]]]
        ${vehicles}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.TagUpdate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.TagUpdate -ArgumentList @(
            ${assets},
            ${drivers},
            ${machines},
            ${name},
            ${parentTagId},
            ${sensors},
            ${vehicles}
        )
    }
}
