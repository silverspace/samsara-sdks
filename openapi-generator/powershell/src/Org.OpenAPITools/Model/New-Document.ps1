function New-Document {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${dispatchJobId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notes},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${documentType},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${driverCreatedAtMs},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${driverId},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.DocumentField[]]
        ${fields},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${vehicleId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.Document' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.Document -ArgumentList @(
            ${dispatchJobId},
            ${notes},
            ${documentType},
            ${driverCreatedAtMs},
            ${driverId},
            ${fields},
            ${vehicleId}
        )
    }
}
