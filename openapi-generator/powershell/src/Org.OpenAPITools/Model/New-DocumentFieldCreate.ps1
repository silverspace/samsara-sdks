function New-DocumentFieldCreate {
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
        ${valueType}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DocumentFieldCreate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DocumentFieldCreate -ArgumentList @(
            ${numberValue},
            ${photoValue},
            ${stringValue},
            ${valueType}
        )
    }
}
