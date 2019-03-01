function New-DocumentFieldType {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${label},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DocumentFieldTypeNumberValueTypeMetadata]]
        ${numberValueTypeMetadata},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${valueType}
    )

    Process {
        'Creating object: samsara.Model.DocumentFieldType' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DocumentFieldType -ArgumentList @(
            ${label},
            ${numberValueTypeMetadata},
            ${valueType}
        )
    }
}
