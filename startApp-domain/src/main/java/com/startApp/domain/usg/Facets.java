package com.startApp.domain.usg;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
                "DeviceID",
                "DeviceName",
                "collection",
                "lora gateways",
                "lora devices"
})
public class Facets {

    @JsonProperty("DeviceID")
    private com.startApp.domain.usg.DeviceID DeviceID;
    @JsonProperty("DeviceName")
    private com.startApp.domain.usg.DeviceName DeviceName;
    @JsonProperty("collection")
    private Collection collection;
    @JsonProperty("lora gateways")
    private LoraGateways loraGateways;
    @JsonProperty("lora devices")
    private LoraDevices loraDevices;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The DeviceID
     */
    @JsonProperty("DeviceID")
    public com.startApp.domain.usg.DeviceID getDeviceID() {
        return DeviceID;
    }

    /**
     *
     * @param DeviceID
     * The DeviceID
     */
    @JsonProperty("DeviceID")
    public void setDeviceID(com.startApp.domain.usg.DeviceID DeviceID) {
        this.DeviceID = DeviceID;
    }

    /**
     *
     * @return
     * The DeviceName
     */
    @JsonProperty("DeviceName")
    public com.startApp.domain.usg.DeviceName getDeviceName() {
        return DeviceName;
    }

    /**
     *
     * @param DeviceName
     * The DeviceName
     */
    @JsonProperty("DeviceName")
    public void setDeviceName(com.startApp.domain.usg.DeviceName DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     *
     * @return
     * The collection
     */
    @JsonProperty("collection")
    public Collection getCollection() {
        return collection;
    }

    /**
     *
     * @param collection
     * The collection
     */
    @JsonProperty("collection")
    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    /**
     *
     * @return
     * The loraGateways
     */
    @JsonProperty("lora gateways")
    public LoraGateways getLoraGateways() {
        return loraGateways;
    }

    /**
     *
     * @param loraGateways
     * The lora gateways
     */
    @JsonProperty("lora gateways")
    public void setLoraGateways(LoraGateways loraGateways) {
        this.loraGateways = loraGateways;
    }

    /**
     *
     * @return
     * The loraDevices
     */
    @JsonProperty("lora devices")
    public LoraDevices getLoraDevices() {
        return loraDevices;
    }

    /**
     *
     * @param loraDevices
     * The lora devices
     */
    @JsonProperty("lora devices")
    public void setLoraDevices(LoraDevices loraDevices) {
        this.loraDevices = loraDevices;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
