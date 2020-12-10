/*
 * Bevragen Ingeschreven Personen
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.1.0/features) voor nadere toelichting. 
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

/**
 * Details over fouten in opgegeven parameters
 */
@ApiModel(description = "Details over fouten in opgegeven parameters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-10T12:50:17.442Z[Etc/UTC]")
public class InvalidParams {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private URI type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;


  public InvalidParams type(URI type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.vng.nl/realisatie/api/{major-versie}/validaties/integer", value = "")

  public URI getType() {
    return type;
  }


  public void setType(URI type) {
    this.type = type;
  }


  public InvalidParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Naam van de parameter
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "verblijfplaats__huisnummer", value = "Naam van de parameter")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InvalidParams code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Systeemcode die het type fout aangeeft
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "integer", value = "Systeemcode die het type fout aangeeft")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public InvalidParams reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Beschrijving van de fout op de parameterwaarde
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Waarde is geen geldige integer.", value = "Beschrijving van de fout op de parameterwaarde")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidParams invalidParams = (InvalidParams) o;
    return Objects.equals(this.type, invalidParams.type) &&
        Objects.equals(this.name, invalidParams.name) &&
        Objects.equals(this.code, invalidParams.code) &&
        Objects.equals(this.reason, invalidParams.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, code, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidParams {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

