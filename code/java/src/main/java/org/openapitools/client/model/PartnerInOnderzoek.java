/*
 * Bevragingen ingeschreven personen
 * API voor het ontsluiten van gegevens van ingeschreven personen en aanverwante gegevens uit de GBA en RNI. Met deze API worden de actuele gegevens van ingeschreven personen, hun kinderen, partners en ouders ontsloten. <br> Heeft een persoon bijvoorbeeld geen geldige nationaliteit, dan wordt nationaliteit niet geretourneerd. <br> Heeft een persoon een beëindigd partnerschap of huwelijk, dan wordt de partner niet geretourneerd. <br> <br> Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/tree/master/features) voor nadere toelichting. <br> 
 *
 * The version of the OpenAPI document: 1.0.0
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
import org.openapitools.client.model.DatumOnvolledig;

/**
 * Indicators over het in onderzoek zijn van gegevens over de aangaan van het huwelijk van de INGESCHREVEN PERSOON. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/blob/master/features/in_onderzoek.feature)
 */
@ApiModel(description = "Indicators over het in onderzoek zijn van gegevens over de aangaan van het huwelijk van de INGESCHREVEN PERSOON. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/blob/master/features/in_onderzoek.feature)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-21T14:20:17.398Z[Etc/UTC]")
public class PartnerInOnderzoek {
  public static final String SERIALIZED_NAME_BURGERSERVICENUMMER = "burgerservicenummer";
  @SerializedName(SERIALIZED_NAME_BURGERSERVICENUMMER)
  private Boolean burgerservicenummer;

  public static final String SERIALIZED_NAME_GESLACHTSAANDUIDING = "geslachtsaanduiding";
  @SerializedName(SERIALIZED_NAME_GESLACHTSAANDUIDING)
  private Boolean geslachtsaanduiding;

  public static final String SERIALIZED_NAME_SOORT_VERBINTENIS = "soortVerbintenis";
  @SerializedName(SERIALIZED_NAME_SOORT_VERBINTENIS)
  private Boolean soortVerbintenis;

  public static final String SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK = "datumIngangOnderzoek";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK)
  private DatumOnvolledig datumIngangOnderzoek;


  public PartnerInOnderzoek burgerservicenummer(Boolean burgerservicenummer) {
    
    this.burgerservicenummer = burgerservicenummer;
    return this;
  }

   /**
   * Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.
   * @return burgerservicenummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.")

  public Boolean getBurgerservicenummer() {
    return burgerservicenummer;
  }


  public void setBurgerservicenummer(Boolean burgerservicenummer) {
    this.burgerservicenummer = burgerservicenummer;
  }


  public PartnerInOnderzoek geslachtsaanduiding(Boolean geslachtsaanduiding) {
    
    this.geslachtsaanduiding = geslachtsaanduiding;
    return this;
  }

   /**
   * Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.
   * @return geslachtsaanduiding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.")

  public Boolean getGeslachtsaanduiding() {
    return geslachtsaanduiding;
  }


  public void setGeslachtsaanduiding(Boolean geslachtsaanduiding) {
    this.geslachtsaanduiding = geslachtsaanduiding;
  }


  public PartnerInOnderzoek soortVerbintenis(Boolean soortVerbintenis) {
    
    this.soortVerbintenis = soortVerbintenis;
    return this;
  }

   /**
   * Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.
   * @return soortVerbintenis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.")

  public Boolean getSoortVerbintenis() {
    return soortVerbintenis;
  }


  public void setSoortVerbintenis(Boolean soortVerbintenis) {
    this.soortVerbintenis = soortVerbintenis;
  }


  public PartnerInOnderzoek datumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    
    this.datumIngangOnderzoek = datumIngangOnderzoek;
    return this;
  }

   /**
   * Get datumIngangOnderzoek
   * @return datumIngangOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumIngangOnderzoek() {
    return datumIngangOnderzoek;
  }


  public void setDatumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    this.datumIngangOnderzoek = datumIngangOnderzoek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerInOnderzoek partnerInOnderzoek = (PartnerInOnderzoek) o;
    return Objects.equals(this.burgerservicenummer, partnerInOnderzoek.burgerservicenummer) &&
        Objects.equals(this.geslachtsaanduiding, partnerInOnderzoek.geslachtsaanduiding) &&
        Objects.equals(this.soortVerbintenis, partnerInOnderzoek.soortVerbintenis) &&
        Objects.equals(this.datumIngangOnderzoek, partnerInOnderzoek.datumIngangOnderzoek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burgerservicenummer, geslachtsaanduiding, soortVerbintenis, datumIngangOnderzoek);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerInOnderzoek {\n");
    sb.append("    burgerservicenummer: ").append(toIndentedString(burgerservicenummer)).append("\n");
    sb.append("    geslachtsaanduiding: ").append(toIndentedString(geslachtsaanduiding)).append("\n");
    sb.append("    soortVerbintenis: ").append(toIndentedString(soortVerbintenis)).append("\n");
    sb.append("    datumIngangOnderzoek: ").append(toIndentedString(datumIngangOnderzoek)).append("\n");
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
