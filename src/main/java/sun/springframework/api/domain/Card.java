package sun.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Card implements Serializable {

    private String type;
    private String number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 563327130139053387L;

    public String getType() {
    return type;
    }

    public void setType(String type) {
    this.type = type;
    }

    public String getNumber() {
    return number;
    }

    public void setNumber(String number) {
    this.number = number;
    }

    public ExpirationDate getExpirationDate() {
    return expirationDate;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
    this.expirationDate = expirationDate;
    }

    public String getIban() {
    return iban;
    }

    public void setIban(String iban) {
    this.iban = iban;
    }

    public String getSwift() {
    return swift;
    }

    public void setSwift(String swift) {
    this.swift = swift;
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
