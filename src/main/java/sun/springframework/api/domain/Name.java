package sun.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class Name implements Serializable {

    private String title;
    private String first;
    private String last;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -126977741310622500L;


    public String getTitle() {
    return title;
    }


    public void setTitle(String title) {
    this.title = title;
    }


    public String getFirst() {
    return first;
    }


    public void setFirst(String first) {
    this.first = first;
    }


    public String getLast() {
    return last;
    }


    public void setLast(String last) {
    this.last = last;
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