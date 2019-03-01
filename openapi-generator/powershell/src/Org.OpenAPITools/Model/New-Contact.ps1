function New-Contact {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${email},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${firstName},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${id},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${lastName},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${phone}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.Contact' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.Contact -ArgumentList @(
            ${email},
            ${firstName},
            ${id},
            ${lastName},
            ${phone}
        )
    }
}
