function Invoke-SensorsApiGetSensors {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.InlineObject23]
        ${groupParam}
    )

    Process {
        'Calling method: SensorsApi-GetSensors' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SensorsApi.GetSensors(
            ${accessToken},
            ${groupParam}
        )
    }
}

function Invoke-SensorsApiGetSensorsCargo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.InlineObject19]
        ${sensorParam}
    )

    Process {
        'Calling method: SensorsApi-GetSensorsCargo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SensorsApi.GetSensorsCargo(
            ${accessToken},
            ${sensorParam}
        )
    }
}

function Invoke-SensorsApiGetSensorsDoor {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.InlineObject20]
        ${sensorParam}
    )

    Process {
        'Calling method: SensorsApi-GetSensorsDoor' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SensorsApi.GetSensorsDoor(
            ${accessToken},
            ${sensorParam}
        )
    }
}

function Invoke-SensorsApiGetSensorsHistory {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.InlineObject21]
        ${historyParam}
    )

    Process {
        'Calling method: SensorsApi-GetSensorsHistory' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SensorsApi.GetSensorsHistory(
            ${accessToken},
            ${historyParam}
        )
    }
}

function Invoke-SensorsApiGetSensorsHumidity {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.InlineObject22]
        ${sensorParam}
    )

    Process {
        'Calling method: SensorsApi-GetSensorsHumidity' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SensorsApi.GetSensorsHumidity(
            ${accessToken},
            ${sensorParam}
        )
    }
}

function Invoke-SensorsApiGetSensorsTemperature {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.InlineObject24]
        ${sensorParam}
    )

    Process {
        'Calling method: SensorsApi-GetSensorsTemperature' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:SensorsApi.GetSensorsTemperature(
            ${accessToken},
            ${sensorParam}
        )
    }
}

