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
                "ROW"
})
public class Content {

    @JsonProperty("ROW")
    private com.startApp.domain.usg.ROW ROW;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The ROW
     */
    @JsonProperty("ROW")
    public com.startApp.domain.usg.ROW getROW() {
        return ROW;
    }

    /**
     *
     * @param ROW
     * The ROW
     */
    @JsonProperty("ROW")
    public void setROW(com.startApp.domain.usg.ROW ROW) {
        this.ROW = ROW;
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
