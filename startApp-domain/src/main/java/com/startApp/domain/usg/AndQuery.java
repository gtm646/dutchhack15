package com.startApp.domain.usg;

/**
 * Created by X081515 on 10/31/2015.
 */

                import java.util.ArrayList;
                import java.util.HashMap;
                import java.util.List;
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
                "annotation"
})
public class AndQuery {

    @JsonProperty("annotation")
    private List<Annotation> annotation = new ArrayList<Annotation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The annotation
     */
    @JsonProperty("annotation")
    public List<Annotation> getAnnotation() {
        return annotation;
    }

    /**
     *
     * @param annotation
     * The annotation
     */
    @JsonProperty("annotation")
    public void setAnnotation(List<Annotation> annotation) {
        this.annotation = annotation;
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
