package sun.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Location implements Serializable {

    private String street;
    private String city;
    private String state;
    private String postcode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4009252828032026426L;

    public String getStreet() {
    return street;
    }

    public void setStreet(String street) {
    this.street = street;
    }

    public String getCity() {
    return city;
    }

    public void setCity(String city) {
    this.city = city;
    }

    public String getState() {
    return state;
    }

    public void setState(String state) {
    this.state = state;
    }

    public String getPostcode() {
    return postcode;
    }

    public void setPostcode(String postcode) {
    this.postcode = postcode;
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