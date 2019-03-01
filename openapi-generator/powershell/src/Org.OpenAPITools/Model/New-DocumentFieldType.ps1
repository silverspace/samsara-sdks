function New-DocumentFieldType {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${label},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DocumentFieldTypeNumberValueTypeMetadata]]
        ${numberValueTypeMetadata},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${valueType}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DocumentFieldType' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DocumentFieldType -ArgumentList @(
            ${label},
            ${numberValueTypeMetadata},
            ${valueType}
        )
    }
}
