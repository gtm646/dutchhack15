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
                "function",
                "function_group_id",
                "function_group",
                "vacancies",
                "applications",
                "applications_male",
                "applications_female",
                "application_age_0_25",
                "application_age_25_40",
                "application_age_40_55",
                "application_age_55_70",
                "application_age_unknown",
                "applications_average_distance",
                "applications_level_wo",
                "applications_level_hbo",
                "applications_level_mbo",
                "applications_level_vwo",
                "applications_level_havo",
                "applications_level_vmbo",
                "applications_level_basisonderwijs",
                "applications_level_unknown",
                "_value"
})
public class ROW {

    @JsonProperty("function")
    private String function;
    @JsonProperty("function_group_id")
    private String functionGroupId;
    @JsonProperty("function_group")
    private String functionGroup;
    @JsonProperty("vacancies")
    private String vacancies;
    @JsonProperty("applications")
    private String applications;
    @JsonProperty("applications_male")
    private String applicationsMale;
    @JsonProperty("applications_female")
    private String applicationsFemale;
    @JsonProperty("application_age_0_25")
    private String applicationAge025;
    @JsonProperty("application_age_25_40")
    private String applicationAge2540;
    @JsonProperty("application_age_40_55")
    private String applicationAge4055;
    @JsonProperty("application_age_55_70")
    private String applicationAge5570;
    @JsonProperty("application_age_unknown")
    private String applicationAgeUnknown;
    @JsonProperty("applications_average_distance")
    private String applicationsAverageDistance;
    @JsonProperty("applications_level_wo")
    private String applicationsLevelWo;
    @JsonProperty("applications_level_hbo")
    private String applicationsLevelHbo;
    @JsonProperty("applications_level_mbo")
    private String applicationsLevelMbo;
    @JsonProperty("applications_level_vwo")
    private String applicationsLevelVwo;
    @JsonProperty("applications_level_havo")
    private String applicationsLevelHavo;
    @JsonProperty("applications_level_vmbo")
    private String applicationsLevelVmbo;
    @JsonProperty("applications_level_basisonderwijs")
    private String applicationsLevelBasisonderwijs;
    @JsonProperty("applications_level_unknown")
    private String applicationsLevelUnknown;
    @JsonProperty("_value")
    private String Value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The function
     */
    @JsonProperty("function")
    public String getFunction() {
        return function;
    }

    /**
     *
     * @param function
     * The function
     */
    @JsonProperty("function")
    public void setFunction(String function) {
        this.function = function;
    }

    /**
     *
     * @return
     * The functionGroupId
     */
    @JsonProperty("function_group_id")
    public String getFunctionGroupId() {
        return functionGroupId;
    }

    /**
     *
     * @param functionGroupId
     * The function_group_id
     */
    @JsonProperty("function_group_id")
    public void setFunctionGroupId(String functionGroupId) {
        this.functionGroupId = functionGroupId;
    }

    /**
     *
     * @return
     * The functionGroup
     */
    @JsonProperty("function_group")
    public String getFunctionGroup() {
        return functionGroup;
    }

    /**
     *
     * @param functionGroup
     * The function_group
     */
    @JsonProperty("function_group")
    public void setFunctionGroup(String functionGroup) {
        this.functionGroup = functionGroup;
    }

    /**
     *
     * @return
     * The vacancies
     */
    @JsonProperty("vacancies")
    public String getVacancies() {
        return vacancies;
    }

    /**
     *
     * @param vacancies
     * The vacancies
     */
    @JsonProperty("vacancies")
    public void setVacancies(String vacancies) {
        this.vacancies = vacancies;
    }

    /**
     *
     * @return
     * The applications
     */
    @JsonProperty("applications")
    public String getApplications() {
        return applications;
    }

    /**
     *
     * @param applications
     * The applications
     */
    @JsonProperty("applications")
    public void setApplications(String applications) {
        this.applications = applications;
    }

    /**
     *
     * @return
     * The applicationsMale
     */
    @JsonProperty("applications_male")
    public String getApplicationsMale() {
        return applicationsMale;
    }

    /**
     *
     * @param applicationsMale
     * The applications_male
     */
    @JsonProperty("applications_male")
    public void setApplicationsMale(String applicationsMale) {
        this.applicationsMale = applicationsMale;
    }

    /**
     *
     * @return
     * The applicationsFemale
     */
    @JsonProperty("applications_female")
    public String getApplicationsFemale() {
        return applicationsFemale;
    }

    /**
     *
     * @param applicationsFemale
     * The applications_female
     */
    @JsonProperty("applications_female")
    public void setApplicationsFemale(String applicationsFemale) {
        this.applicationsFemale = applicationsFemale;
    }

    /**
     *
     * @return
     * The applicationAge025
     */
    @JsonProperty("application_age_0_25")
    public String getApplicationAge025() {
        return applicationAge025;
    }

    /**
     *
     * @param applicationAge025
     * The application_age_0_25
     */
    @JsonProperty("application_age_0_25")
    public void setApplicationAge025(String applicationAge025) {
        this.applicationAge025 = applicationAge025;
    }

    /**
     *
     * @return
     * The applicationAge2540
     */
    @JsonProperty("application_age_25_40")
    public String getApplicationAge2540() {
        return applicationAge2540;
    }

    /**
     *
     * @param applicationAge2540
     * The application_age_25_40
     */
    @JsonProperty("application_age_25_40")
    public void setApplicationAge2540(String applicationAge2540) {
        this.applicationAge2540 = applicationAge2540;
    }

    /**
     *
     * @return
     * The applicationAge4055
     */
    @JsonProperty("application_age_40_55")
    public String getApplicationAge4055() {
        return applicationAge4055;
    }

    /**
     *
     * @param applicationAge4055
     * The application_age_40_55
     */
    @JsonProperty("application_age_40_55")
    public void setApplicationAge4055(String applicationAge4055) {
        this.applicationAge4055 = applicationAge4055;
    }

    /**
     *
     * @return
     * The applicationAge5570
     */
    @JsonProperty("application_age_55_70")
    public String getApplicationAge5570() {
        return applicationAge5570;
    }

    /**
     *
     * @param applicationAge5570
     * The application_age_55_70
     */
    @JsonProperty("application_age_55_70")
    public void setApplicationAge5570(String applicationAge5570) {
        this.applicationAge5570 = applicationAge5570;
    }

    /**
     *
     * @return
     * The applicationAgeUnknown
     */
    @JsonProperty("application_age_unknown")
    public String getApplicationAgeUnknown() {
        return applicationAgeUnknown;
    }

    /**
     *
     * @param applicationAgeUnknown
     * The application_age_unknown
     */
    @JsonProperty("application_age_unknown")
    public void setApplicationAgeUnknown(String applicationAgeUnknown) {
        this.applicationAgeUnknown = applicationAgeUnknown;
    }

    /**
     *
     * @return
     * The applicationsAverageDistance
     */
    @JsonProperty("applications_average_distance")
    public String getApplicationsAverageDistance() {
        return applicationsAverageDistance;
    }

    /**
     *
     * @param applicationsAverageDistance
     * The applications_average_distance
     */
    @JsonProperty("applications_average_distance")
    public void setApplicationsAverageDistance(String applicationsAverageDistance) {
        this.applicationsAverageDistance = applicationsAverageDistance;
    }

    /**
     *
     * @return
     * The applicationsLevelWo
     */
    @JsonProperty("applications_level_wo")
    public String getApplicationsLevelWo() {
        return applicationsLevelWo;
    }

    /**
     *
     * @param applicationsLevelWo
     * The applications_level_wo
     */
    @JsonProperty("applications_level_wo")
    public void setApplicationsLevelWo(String applicationsLevelWo) {
        this.applicationsLevelWo = applicationsLevelWo;
    }

    /**
     *
     * @return
     * The applicationsLevelHbo
     */
    @JsonProperty("applications_level_hbo")
    public String getApplicationsLevelHbo() {
        return applicationsLevelHbo;
    }

    /**
     *
     * @param applicationsLevelHbo
     * The applications_level_hbo
     */
    @JsonProperty("applications_level_hbo")
    public void setApplicationsLevelHbo(String applicationsLevelHbo) {
        this.applicationsLevelHbo = applicationsLevelHbo;
    }

    /**
     *
     * @return
     * The applicationsLevelMbo
     */
    @JsonProperty("applications_level_mbo")
    public String getApplicationsLevelMbo() {
        return applicationsLevelMbo;
    }

    /**
     *
     * @param applicationsLevelMbo
     * The applications_level_mbo
     */
    @JsonProperty("applications_level_mbo")
    public void setApplicationsLevelMbo(String applicationsLevelMbo) {
        this.applicationsLevelMbo = applicationsLevelMbo;
    }

    /**
     *
     * @return
     * The applicationsLevelVwo
     */
    @JsonProperty("applications_level_vwo")
    public String getApplicationsLevelVwo() {
        return applicationsLevelVwo;
    }

    /**
     *
     * @param applicationsLevelVwo
     * The applications_level_vwo
     */
    @JsonProperty("applications_level_vwo")
    public void setApplicationsLevelVwo(String applicationsLevelVwo) {
        this.applicationsLevelVwo = applicationsLevelVwo;
    }

    /**
     *
     * @return
     * The applicationsLevelHavo
     */
    @JsonProperty("applications_level_havo")
    public String getApplicationsLevelHavo() {
        return applicationsLevelHavo;
    }

    /**
     *
     * @param applicationsLevelHavo
     * The applications_level_havo
     */
    @JsonProperty("applications_level_havo")
    public void setApplicationsLevelHavo(String applicationsLevelHavo) {
        this.applicationsLevelHavo = applicationsLevelHavo;
    }

    /**
     *
     * @return
     * The applicationsLevelVmbo
     */
    @JsonProperty("applications_level_vmbo")
    public String getApplicationsLevelVmbo() {
        return applicationsLevelVmbo;
    }

    /**
     *
     * @param applicationsLevelVmbo
     * The applications_level_vmbo
     */
    @JsonProperty("applications_level_vmbo")
    public void setApplicationsLevelVmbo(String applicationsLevelVmbo) {
        this.applicationsLevelVmbo = applicationsLevelVmbo;
    }

    /**
     *
     * @return
     * The applicationsLevelBasisonderwijs
     */
    @JsonProperty("applications_level_basisonderwijs")
    public String getApplicationsLevelBasisonderwijs() {
        return applicationsLevelBasisonderwijs;
    }

    /**
     *
     * @param applicationsLevelBasisonderwijs
     * The applications_level_basisonderwijs
     */
    @JsonProperty("applications_level_basisonderwijs")
    public void setApplicationsLevelBasisonderwijs(String applicationsLevelBasisonderwijs) {
        this.applicationsLevelBasisonderwijs = applicationsLevelBasisonderwijs;
    }

    /**
     *
     * @return
     * The applicationsLevelUnknown
     */
    @JsonProperty("applications_level_unknown")
    public String getApplicationsLevelUnknown() {
        return applicationsLevelUnknown;
    }

    /**
     *
     * @param applicationsLevelUnknown
     * The applications_level_unknown
     */
    @JsonProperty("applications_level_unknown")
    public void setApplicationsLevelUnknown(String applicationsLevelUnknown) {
        this.applicationsLevelUnknown = applicationsLevelUnknown;
    }

    /**
     *
     * @return
     * The Value
     */
    @JsonProperty("_value")
    public String getValue() {
        return Value;
    }

    /**
     *
     * @param Value
     * The _value
     */
    @JsonProperty("_value")
    public void setValue(String Value) {
        this.Value = Value;
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
