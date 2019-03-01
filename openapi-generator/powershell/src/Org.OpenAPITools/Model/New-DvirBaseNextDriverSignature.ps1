function New-DvirBaseNextDriverSignature {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${driverId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${signedAt},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${type},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${email},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${username}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DvirBaseNextDriverSignature' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DvirBaseNextDriverSignature -ArgumentList @(
            ${driverId},
            ${name},
            ${signedAt},
            ${type},
            ${email},
            ${username}
        )
    }
}
