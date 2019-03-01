function New-DocumentField {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${numberValue},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DocumentFieldCreatePhotoValue[]]]
        ${photoValue},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${stringValue},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${valueType},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${label},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String]]
        ${value}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DocumentField' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DocumentField -ArgumentList @(
            ${numberValue},
            ${photoValue},
            ${stringValue},
            ${valueType},
            ${label},
            ${value}
        )
    }
}
