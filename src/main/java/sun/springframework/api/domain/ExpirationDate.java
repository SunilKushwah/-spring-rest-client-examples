package sun.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExpirationDate implements Serializable {

    private String date;
    private Integer timezoneType;
    private String timezone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -9125094620256110801L;

    public String getDate() {
    return date;
    }

    public void setDate(String date) {
    this.date = date;
    }

    public Integer getTimezoneType() {
    return timezoneType;
    }

    public void setTimezoneType(Integer timezoneType) {
    this.timezoneType = timezoneType;
    }

    public String getTimezone() {
    return timezone;
    }

    public void setTimezone(String timezone) {
    this.timezone = timezone;
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
