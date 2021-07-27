package sun.springframework.api.domain;

import java.io.Serializable;
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
public class Login implements Serializable {

    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1814262759202133050L;

    public String getUsername() {
    return username;
    }

    public void setUsername(String username) {
    this.username = username;
    }

    public String getPassword() {
    return password;
    }

    public void setPassword(String password) {
    this.password = password;
    }

    public String getMd5() {
    return md5;
    }

    public void setMd5(String md5) {
    this.md5 = md5;
    }

    public String getSha1() {
    return sha1;
    }

    public void setSha1(String sha1) {
    this.sha1 = sha1;
    }

    public String getSha256() {
    return sha256;
    }

    public void setSha256(String sha256) {
    this.sha256 = sha256;
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