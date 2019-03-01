package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.TaggedAddress;
import org.openapitools.server.api.model.TaggedAsset;
import org.openapitools.server.api.model.TaggedDriver;
import org.openapitools.server.api.model.TaggedMachine;
import org.openapitools.server.api.model.TaggedSensor;
import org.openapitools.server.api.model.TaggedVehicle;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Tag   {
  
  private List<TaggedAddress> addresses = new ArrayList<>();
  private List<TaggedAsset> assets = new ArrayList<>();
  private List<TaggedDriver> drivers = new ArrayList<>();
  private Long groupId;
  private Long id;
  private List<TaggedMachine> machines = new ArrayList<>();
  private String name;
  private Long parentTagId;
  private List<TaggedSensor> sensors = new ArrayList<>();
  private List<TaggedVehicle> vehicles = new ArrayList<>();

  public Tag () {

  }

  public Tag (List<TaggedAddress> addresses, List<TaggedAsset> assets, List<TaggedDriver> drivers, Long groupId, Long id, List<TaggedMachine> machines, String name, Long parentTagId, List<TaggedSensor> sensors, List<TaggedVehicle> vehicles) {
    this.addresses = addresses;
    this.assets = assets;
    this.drivers = drivers;
    this.groupId = groupId;
    this.id = id;
    this.machines = machines;
    this.name = name;
    this.parentTagId = parentTagId;
    this.sensors = sensors;
    this.vehicles = vehicles;
  }

    
  @JsonProperty("addresses")
  public List<TaggedAddress> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<TaggedAddress> addresses) {
    this.addresses = addresses;
  }

    
  @JsonProperty("assets")
  public List<TaggedAsset> getAssets() {
    return assets;
  }
  public void setAssets(List<TaggedAsset> assets) {
    this.assets = assets;
  }

    
  @JsonProperty("drivers")
  public List<TaggedDriver> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<TaggedDriver> drivers) {
    this.drivers = drivers;
  }

    
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("machines")
  public List<TaggedMachine> getMachines() {
    return machines;
  }
  public void setMachines(List<TaggedMachine> machines) {
    this.machines = machines;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("parentTagId")
  public Long getParentTagId() {
    return parentTagId;
  }
  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

    
  @JsonProperty("sensors")
  public List<TaggedSensor> getSensors() {
    return sensors;
  }
  public void setSensors(List<TaggedSensor> sensors) {
    this.sensors = sensors;
  }

    
  @JsonProperty("vehicles")
  public List<TaggedVehicle> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<TaggedVehicle> vehicles) {
    this.vehicles = vehicles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(addresses, tag.addresses) &&
        Objects.equals(assets, tag.assets) &&
        Objects.equals(drivers, tag.drivers) &&
        Objects.equals(groupId, tag.groupId) &&
        Objects.equals(id, tag.id) &&
        Objects.equals(machines, tag.machines) &&
        Objects.equals(name, tag.name) &&
        Objects.equals(parentTagId, tag.parentTagId) &&
        Objects.equals(sensors, tag.sensors) &&
        Objects.equals(vehicles, tag.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, assets, drivers, groupId, id, machines, name, parentTagId, sensors, vehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentTagId: ").append(toIndentedString(parentTagId)).append("\n");
    sb.append("    sensors: ").append(toIndentedString(sensors)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
