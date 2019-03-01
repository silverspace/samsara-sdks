function New-DocumentFieldCreate {
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
        ${valueType}
    )

    Process {
        'Creating object: samsara.Model.DocumentFieldCreate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DocumentFieldCreate -ArgumentList @(
            ${numberValue},
            ${photoValue},
            ${stringValue},
            ${valueType}
        )
    }
}
