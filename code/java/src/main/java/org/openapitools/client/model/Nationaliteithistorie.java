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
import org.openapitools.client.model.AanduidingBijzonderNederlanderschapEnum;
import org.openapitools.client.model.DatumOnvolledig;
import org.openapitools.client.model.Nationaliteit;
import org.openapitools.client.model.NationaliteitInOnderzoek;
import org.openapitools.client.model.NationaliteithistorieAllOf;
import org.openapitools.client.model.Waardetabel;

/**
 * Nationaliteithistorie
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-21T14:20:17.398Z[Etc/UTC]")
public class Nationaliteithistorie {
  public static final String SERIALIZED_NAME_AANDUIDING_BIJZONDER_NEDERLANDERSCHAP = "aanduidingBijzonderNederlanderschap";
  @SerializedName(SERIALIZED_NAME_AANDUIDING_BIJZONDER_NEDERLANDERSCHAP)
  private AanduidingBijzonderNederlanderschapEnum aanduidingBijzonderNederlanderschap;

  public static final String SERIALIZED_NAME_DATUM_INGANG_GELDIGHEID = "datumIngangGeldigheid";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_GELDIGHEID)
  private DatumOnvolledig datumIngangGeldigheid;

  public static final String SERIALIZED_NAME_NATIONALITEIT = "nationaliteit";
  @SerializedName(SERIALIZED_NAME_NATIONALITEIT)
  private Waardetabel nationaliteit;

  public static final String SERIALIZED_NAME_REDEN_OPNAME = "redenOpname";
  @SerializedName(SERIALIZED_NAME_REDEN_OPNAME)
  private Waardetabel redenOpname;

  public static final String SERIALIZED_NAME_IN_ONDERZOEK = "inOnderzoek";
  @SerializedName(SERIALIZED_NAME_IN_ONDERZOEK)
  private NationaliteitInOnderzoek inOnderzoek;

  public static final String SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS = "geheimhoudingPersoonsgegevens";
  @SerializedName(SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS)
  private Boolean geheimhoudingPersoonsgegevens;

  public static final String SERIALIZED_NAME_DATUM_EINDE_GELDIGHEID = "datumEindeGeldigheid";
  @SerializedName(SERIALIZED_NAME_DATUM_EINDE_GELDIGHEID)
  private DatumOnvolledig datumEindeGeldigheid;

  public static final String SERIALIZED_NAME_REDEN_BEEINDIGEN = "redenBeeindigen";
  @SerializedName(SERIALIZED_NAME_REDEN_BEEINDIGEN)
  private Waardetabel redenBeeindigen;

  public static final String SERIALIZED_NAME_INDICATIE_NATIONALITEIT_BEEINDIGD = "indicatieNationaliteitBeeindigd";
  @SerializedName(SERIALIZED_NAME_INDICATIE_NATIONALITEIT_BEEINDIGD)
  private Boolean indicatieNationaliteitBeeindigd;


  public Nationaliteithistorie aanduidingBijzonderNederlanderschap(AanduidingBijzonderNederlanderschapEnum aanduidingBijzonderNederlanderschap) {
    
    this.aanduidingBijzonderNederlanderschap = aanduidingBijzonderNederlanderschap;
    return this;
  }

   /**
   * Get aanduidingBijzonderNederlanderschap
   * @return aanduidingBijzonderNederlanderschap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AanduidingBijzonderNederlanderschapEnum getAanduidingBijzonderNederlanderschap() {
    return aanduidingBijzonderNederlanderschap;
  }


  public void setAanduidingBijzonderNederlanderschap(AanduidingBijzonderNederlanderschapEnum aanduidingBijzonderNederlanderschap) {
    this.aanduidingBijzonderNederlanderschap = aanduidingBijzonderNederlanderschap;
  }


  public Nationaliteithistorie datumIngangGeldigheid(DatumOnvolledig datumIngangGeldigheid) {
    
    this.datumIngangGeldigheid = datumIngangGeldigheid;
    return this;
  }

   /**
   * Get datumIngangGeldigheid
   * @return datumIngangGeldigheid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumIngangGeldigheid() {
    return datumIngangGeldigheid;
  }


  public void setDatumIngangGeldigheid(DatumOnvolledig datumIngangGeldigheid) {
    this.datumIngangGeldigheid = datumIngangGeldigheid;
  }


  public Nationaliteithistorie nationaliteit(Waardetabel nationaliteit) {
    
    this.nationaliteit = nationaliteit;
    return this;
  }

   /**
   * Get nationaliteit
   * @return nationaliteit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getNationaliteit() {
    return nationaliteit;
  }


  public void setNationaliteit(Waardetabel nationaliteit) {
    this.nationaliteit = nationaliteit;
  }


  public Nationaliteithistorie redenOpname(Waardetabel redenOpname) {
    
    this.redenOpname = redenOpname;
    return this;
  }

   /**
   * Get redenOpname
   * @return redenOpname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getRedenOpname() {
    return redenOpname;
  }


  public void setRedenOpname(Waardetabel redenOpname) {
    this.redenOpname = redenOpname;
  }


  public Nationaliteithistorie inOnderzoek(NationaliteitInOnderzoek inOnderzoek) {
    
    this.inOnderzoek = inOnderzoek;
    return this;
  }

   /**
   * Get inOnderzoek
   * @return inOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NationaliteitInOnderzoek getInOnderzoek() {
    return inOnderzoek;
  }


  public void setInOnderzoek(NationaliteitInOnderzoek inOnderzoek) {
    this.inOnderzoek = inOnderzoek;
  }


  public Nationaliteithistorie geheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
    return this;
  }

   /**
   * Een aanduiding die aangeeft dat gegevens wel of niet verstrekt mogen worden. Indien true: op verzoek van deze persoon is het verstrekken van gegevens over deze persoon aan bepaalde derden niet toegestaan.
   * @return geheimhoudingPersoonsgegevens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Een aanduiding die aangeeft dat gegevens wel of niet verstrekt mogen worden. Indien true: op verzoek van deze persoon is het verstrekken van gegevens over deze persoon aan bepaalde derden niet toegestaan.")

  public Boolean getGeheimhoudingPersoonsgegevens() {
    return geheimhoudingPersoonsgegevens;
  }


  public void setGeheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
  }


  public Nationaliteithistorie datumEindeGeldigheid(DatumOnvolledig datumEindeGeldigheid) {
    
    this.datumEindeGeldigheid = datumEindeGeldigheid;
    return this;
  }

   /**
   * Get datumEindeGeldigheid
   * @return datumEindeGeldigheid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumEindeGeldigheid() {
    return datumEindeGeldigheid;
  }


  public void setDatumEindeGeldigheid(DatumOnvolledig datumEindeGeldigheid) {
    this.datumEindeGeldigheid = datumEindeGeldigheid;
  }


  public Nationaliteithistorie redenBeeindigen(Waardetabel redenBeeindigen) {
    
    this.redenBeeindigen = redenBeeindigen;
    return this;
  }

   /**
   * Get redenBeeindigen
   * @return redenBeeindigen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getRedenBeeindigen() {
    return redenBeeindigen;
  }


  public void setRedenBeeindigen(Waardetabel redenBeeindigen) {
    this.redenBeeindigen = redenBeeindigen;
  }


  public Nationaliteithistorie indicatieNationaliteitBeeindigd(Boolean indicatieNationaliteitBeeindigd) {
    
    this.indicatieNationaliteitBeeindigd = indicatieNationaliteitBeeindigd;
    return this;
  }

   /**
   * Een aanduiding dat de nationaliteit beeindigd is.
   * @return indicatieNationaliteitBeeindigd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Een aanduiding dat de nationaliteit beeindigd is.")

  public Boolean getIndicatieNationaliteitBeeindigd() {
    return indicatieNationaliteitBeeindigd;
  }


  public void setIndicatieNationaliteitBeeindigd(Boolean indicatieNationaliteitBeeindigd) {
    this.indicatieNationaliteitBeeindigd = indicatieNationaliteitBeeindigd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nationaliteithistorie nationaliteithistorie = (Nationaliteithistorie) o;
    return Objects.equals(this.aanduidingBijzonderNederlanderschap, nationaliteithistorie.aanduidingBijzonderNederlanderschap) &&
        Objects.equals(this.datumIngangGeldigheid, nationaliteithistorie.datumIngangGeldigheid) &&
        Objects.equals(this.nationaliteit, nationaliteithistorie.nationaliteit) &&
        Objects.equals(this.redenOpname, nationaliteithistorie.redenOpname) &&
        Objects.equals(this.inOnderzoek, nationaliteithistorie.inOnderzoek) &&
        Objects.equals(this.geheimhoudingPersoonsgegevens, nationaliteithistorie.geheimhoudingPersoonsgegevens) &&
        Objects.equals(this.datumEindeGeldigheid, nationaliteithistorie.datumEindeGeldigheid) &&
        Objects.equals(this.redenBeeindigen, nationaliteithistorie.redenBeeindigen) &&
        Objects.equals(this.indicatieNationaliteitBeeindigd, nationaliteithistorie.indicatieNationaliteitBeeindigd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aanduidingBijzonderNederlanderschap, datumIngangGeldigheid, nationaliteit, redenOpname, inOnderzoek, geheimhoudingPersoonsgegevens, datumEindeGeldigheid, redenBeeindigen, indicatieNationaliteitBeeindigd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nationaliteithistorie {\n");
    sb.append("    aanduidingBijzonderNederlanderschap: ").append(toIndentedString(aanduidingBijzonderNederlanderschap)).append("\n");
    sb.append("    datumIngangGeldigheid: ").append(toIndentedString(datumIngangGeldigheid)).append("\n");
    sb.append("    nationaliteit: ").append(toIndentedString(nationaliteit)).append("\n");
    sb.append("    redenOpname: ").append(toIndentedString(redenOpname)).append("\n");
    sb.append("    inOnderzoek: ").append(toIndentedString(inOnderzoek)).append("\n");
    sb.append("    geheimhoudingPersoonsgegevens: ").append(toIndentedString(geheimhoudingPersoonsgegevens)).append("\n");
    sb.append("    datumEindeGeldigheid: ").append(toIndentedString(datumEindeGeldigheid)).append("\n");
    sb.append("    redenBeeindigen: ").append(toIndentedString(redenBeeindigen)).append("\n");
    sb.append("    indicatieNationaliteitBeeindigd: ").append(toIndentedString(indicatieNationaliteitBeeindigd)).append("\n");
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

