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
                "operator-ref",
                "state-ref"
})
public class Annotation {

    @JsonProperty("operator-ref")
    private String operatorRef;
    @JsonProperty("state-ref")
    private String stateRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The operatorRef
     */
    @JsonProperty("operator-ref")
    public String getOperatorRef() {
        return operatorRef;
    }

    /**
     *
     * @param operatorRef
     * The operator-ref
     */
    @JsonProperty("operator-ref")
    public void setOperatorRef(String operatorRef) {
        this.operatorRef = operatorRef;
    }

    /**
     *
     * @return
     * The stateRef
     */
    @JsonProperty("state-ref")
    public String getStateRef() {
        return stateRef;
    }

    /**
     *
     * @param stateRef
     * The state-ref
     */
    @JsonProperty("state-ref")
    public void setStateRef(String stateRef) {
        this.stateRef = stateRef;
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