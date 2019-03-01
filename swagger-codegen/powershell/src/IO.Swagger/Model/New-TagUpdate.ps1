function New-TagUpdate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedAssetBase[]]]
        ${assets},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedDriverBase[]]]
        ${drivers},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedMachineBase[]]]
        ${machines},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${parentTagId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedSensorBase[]]]
        ${sensors},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TaggedVehicleBase[]]]
        ${vehicles}
    )

    Process {
        'Creating object: samsara.Model.TagUpdate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.TagUpdate -ArgumentList @(
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
