function New-DocumentField {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${numberValue},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.DocumentFieldCreatePhotoValue[]]]
        ${photoValue},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${stringValue},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${valueType},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${label},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.ERRORUNKNOWN]]
        ${value}
    )

    Process {
        'Creating object: samsara.Model.DocumentField' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DocumentField -ArgumentList @(
            ${numberValue},
            ${photoValue},
            ${stringValue},
            ${valueType},
            ${label},
            ${value}
        )
    }
}
