/*
 * Bevragen Ingeschreven Personen
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.1.0/features) voor nadere toelichting. 
 *
 * The version of the OpenAPI document: 1.2.0
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
import org.openapitools.client.model.HalCollectionLinks;
import org.openapitools.client.model.IngeschrevenPersoonHalCollectieEmbedded;

/**
 * IngeschrevenPersoonHalCollectie
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-15T14:09:29.205Z[Etc/UTC]")
public class IngeschrevenPersoonHalCollectie {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private HalCollectionLinks links;

  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private IngeschrevenPersoonHalCollectieEmbedded embedded;


  public IngeschrevenPersoonHalCollectie links(HalCollectionLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalCollectionLinks getLinks() {
    return links;
  }


  public void setLinks(HalCollectionLinks links) {
    this.links = links;
  }


  public IngeschrevenPersoonHalCollectie embedded(IngeschrevenPersoonHalCollectieEmbedded embedded) {
    
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IngeschrevenPersoonHalCollectieEmbedded getEmbedded() {
    return embedded;
  }


  public void setEmbedded(IngeschrevenPersoonHalCollectieEmbedded embedded) {
    this.embedded = embedded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngeschrevenPersoonHalCollectie ingeschrevenPersoonHalCollectie = (IngeschrevenPersoonHalCollectie) o;
    return Objects.equals(this.links, ingeschrevenPersoonHalCollectie.links) &&
        Objects.equals(this.embedded, ingeschrevenPersoonHalCollectie.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, embedded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngeschrevenPersoonHalCollectie {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

