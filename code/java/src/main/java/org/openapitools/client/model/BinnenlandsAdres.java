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
import org.openapitools.client.model.AanduidingBijHuisnummerEnum;
import org.openapitools.client.model.SoortAdresEnum;

/**
 * Dit object bevat de basis Verblijfsplaats kenmerken die gedeeld worden door Bewoning en Verblijfplaats 
 */
@ApiModel(description = "Dit object bevat de basis Verblijfsplaats kenmerken die gedeeld worden door Bewoning en Verblijfplaats ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-21T14:20:17.398Z[Etc/UTC]")
public class BinnenlandsAdres {
  public static final String SERIALIZED_NAME_FUNCTIE_ADRES = "functieAdres";
  @SerializedName(SERIALIZED_NAME_FUNCTIE_ADRES)
  private SoortAdresEnum functieAdres;

  public static final String SERIALIZED_NAME_HUISLETTER = "huisletter";
  @SerializedName(SERIALIZED_NAME_HUISLETTER)
  private String huisletter;

  public static final String SERIALIZED_NAME_HUISNUMMER = "huisnummer";
  @SerializedName(SERIALIZED_NAME_HUISNUMMER)
  private Integer huisnummer;

  public static final String SERIALIZED_NAME_HUISNUMMERTOEVOEGING = "huisnummertoevoeging";
  @SerializedName(SERIALIZED_NAME_HUISNUMMERTOEVOEGING)
  private String huisnummertoevoeging;

  public static final String SERIALIZED_NAME_AANDUIDING_BIJ_HUISNUMMER = "aanduidingBijHuisnummer";
  @SerializedName(SERIALIZED_NAME_AANDUIDING_BIJ_HUISNUMMER)
  private AanduidingBijHuisnummerEnum aanduidingBijHuisnummer;

  public static final String SERIALIZED_NAME_IDENTIFICATIECODE_NUMMERAANDUIDING = "identificatiecodeNummeraanduiding";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIECODE_NUMMERAANDUIDING)
  private String identificatiecodeNummeraanduiding;

  public static final String SERIALIZED_NAME_NAAM_OPENBARE_RUIMTE = "naamOpenbareRuimte";
  @SerializedName(SERIALIZED_NAME_NAAM_OPENBARE_RUIMTE)
  private String naamOpenbareRuimte;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_WOONPLAATSNAAM = "woonplaatsnaam";
  @SerializedName(SERIALIZED_NAME_WOONPLAATSNAAM)
  private String woonplaatsnaam;


  public BinnenlandsAdres functieAdres(SoortAdresEnum functieAdres) {
    
    this.functieAdres = functieAdres;
    return this;
  }

   /**
   * Get functieAdres
   * @return functieAdres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SoortAdresEnum getFunctieAdres() {
    return functieAdres;
  }


  public void setFunctieAdres(SoortAdresEnum functieAdres) {
    this.functieAdres = functieAdres;
  }


  public BinnenlandsAdres huisletter(String huisletter) {
    
    this.huisletter = huisletter;
    return this;
  }

   /**
   * Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende toevoeging aan een huisnummer in de vorm van een alfanumeriek teken. a - z , A – Z
   * @return huisletter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B", value = "Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende toevoeging aan een huisnummer in de vorm van een alfanumeriek teken. a - z , A – Z")

  public String getHuisletter() {
    return huisletter;
  }


  public void setHuisletter(String huisletter) {
    this.huisletter = huisletter;
  }


  public BinnenlandsAdres huisnummer(Integer huisnummer) {
    
    this.huisnummer = huisnummer;
    return this;
  }

   /**
   * Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende nummering. Alle natuurlijke getallen tussen 1 en 99999.
   * maximum: 99999
   * @return huisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23", value = "Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende nummering. Alle natuurlijke getallen tussen 1 en 99999.")

  public Integer getHuisnummer() {
    return huisnummer;
  }


  public void setHuisnummer(Integer huisnummer) {
    this.huisnummer = huisnummer;
  }


  public BinnenlandsAdres huisnummertoevoeging(String huisnummertoevoeging) {
    
    this.huisnummertoevoeging = huisnummertoevoeging;
    return this;
  }

   /**
   * Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende nadere toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter. a - z , A - Z , 0 – 9
   * @return huisnummertoevoeging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IV", value = "Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende nadere toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter. a - z , A - Z , 0 – 9")

  public String getHuisnummertoevoeging() {
    return huisnummertoevoeging;
  }


  public void setHuisnummertoevoeging(String huisnummertoevoeging) {
    this.huisnummertoevoeging = huisnummertoevoeging;
  }


  public BinnenlandsAdres aanduidingBijHuisnummer(AanduidingBijHuisnummerEnum aanduidingBijHuisnummer) {
    
    this.aanduidingBijHuisnummer = aanduidingBijHuisnummer;
    return this;
  }

   /**
   * Get aanduidingBijHuisnummer
   * @return aanduidingBijHuisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AanduidingBijHuisnummerEnum getAanduidingBijHuisnummer() {
    return aanduidingBijHuisnummer;
  }


  public void setAanduidingBijHuisnummer(AanduidingBijHuisnummerEnum aanduidingBijHuisnummer) {
    this.aanduidingBijHuisnummer = aanduidingBijHuisnummer;
  }


  public BinnenlandsAdres identificatiecodeNummeraanduiding(String identificatiecodeNummeraanduiding) {
    
    this.identificatiecodeNummeraanduiding = identificatiecodeNummeraanduiding;
    return this;
  }

   /**
   * De unieke aanduiding van een NUMMERAANDUIDING. Combinatie van de viercijferige &#39;gemeentecode&#39; de tweecijferige &#39;objecttypecode&#39; en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig &#39;objectvolgnummer&#39;. De objecttypecode kent in de BAG de volgende waarde:20 nummeraanduiding. Combinatie van de viercijferige &#39;gemeentecode&#39; (volgens GBA tabel 33, Gemeententabel), de tweecijferige &#39;objecttypecode&#39; en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig &#39;objectvolgnummer&#39;. De objecttypecode kent in de BAG de volgende waarde:20 nummeraanduiding.
   * @return identificatiecodeNummeraanduiding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0518200000366054", value = "De unieke aanduiding van een NUMMERAANDUIDING. Combinatie van de viercijferige 'gemeentecode' de tweecijferige 'objecttypecode' en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig 'objectvolgnummer'. De objecttypecode kent in de BAG de volgende waarde:20 nummeraanduiding. Combinatie van de viercijferige 'gemeentecode' (volgens GBA tabel 33, Gemeententabel), de tweecijferige 'objecttypecode' en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig 'objectvolgnummer'. De objecttypecode kent in de BAG de volgende waarde:20 nummeraanduiding.")

  public String getIdentificatiecodeNummeraanduiding() {
    return identificatiecodeNummeraanduiding;
  }


  public void setIdentificatiecodeNummeraanduiding(String identificatiecodeNummeraanduiding) {
    this.identificatiecodeNummeraanduiding = identificatiecodeNummeraanduiding;
  }


  public BinnenlandsAdres naamOpenbareRuimte(String naamOpenbareRuimte) {
    
    this.naamOpenbareRuimte = naamOpenbareRuimte;
    return this;
  }

   /**
   * Een door het bevoegde gemeentelijke orgaan aan een OPENBARE RUIMTE toegekende benaming Tekens gecodeerd volgens de UTF-8 standaard
   * @return naamOpenbareRuimte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Loosduinsekade", value = "Een door het bevoegde gemeentelijke orgaan aan een OPENBARE RUIMTE toegekende benaming Tekens gecodeerd volgens de UTF-8 standaard")

  public String getNaamOpenbareRuimte() {
    return naamOpenbareRuimte;
  }


  public void setNaamOpenbareRuimte(String naamOpenbareRuimte) {
    this.naamOpenbareRuimte = naamOpenbareRuimte;
  }


  public BinnenlandsAdres postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * De door PostNL vastgestelde code behorende bij een bepaalde combinatie van een naam van een woonplaats, naam van een openbare ruimte en een huisnummer
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2571CC", value = "De door PostNL vastgestelde code behorende bij een bepaalde combinatie van een naam van een woonplaats, naam van een openbare ruimte en een huisnummer")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public BinnenlandsAdres woonplaatsnaam(String woonplaatsnaam) {
    
    this.woonplaatsnaam = woonplaatsnaam;
    return this;
  }

   /**
   * De door het bevoegde gemeentelijke orgaan aan een WOONPLAATS toegekende benaming. Tekens gecodeerd volgens de UTF-8 standaard.
   * @return woonplaatsnaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Utrecht", value = "De door het bevoegde gemeentelijke orgaan aan een WOONPLAATS toegekende benaming. Tekens gecodeerd volgens de UTF-8 standaard.")

  public String getWoonplaatsnaam() {
    return woonplaatsnaam;
  }


  public void setWoonplaatsnaam(String woonplaatsnaam) {
    this.woonplaatsnaam = woonplaatsnaam;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinnenlandsAdres binnenlandsAdres = (BinnenlandsAdres) o;
    return Objects.equals(this.functieAdres, binnenlandsAdres.functieAdres) &&
        Objects.equals(this.huisletter, binnenlandsAdres.huisletter) &&
        Objects.equals(this.huisnummer, binnenlandsAdres.huisnummer) &&
        Objects.equals(this.huisnummertoevoeging, binnenlandsAdres.huisnummertoevoeging) &&
        Objects.equals(this.aanduidingBijHuisnummer, binnenlandsAdres.aanduidingBijHuisnummer) &&
        Objects.equals(this.identificatiecodeNummeraanduiding, binnenlandsAdres.identificatiecodeNummeraanduiding) &&
        Objects.equals(this.naamOpenbareRuimte, binnenlandsAdres.naamOpenbareRuimte) &&
        Objects.equals(this.postcode, binnenlandsAdres.postcode) &&
        Objects.equals(this.woonplaatsnaam, binnenlandsAdres.woonplaatsnaam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functieAdres, huisletter, huisnummer, huisnummertoevoeging, aanduidingBijHuisnummer, identificatiecodeNummeraanduiding, naamOpenbareRuimte, postcode, woonplaatsnaam);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinnenlandsAdres {\n");
    sb.append("    functieAdres: ").append(toIndentedString(functieAdres)).append("\n");
    sb.append("    huisletter: ").append(toIndentedString(huisletter)).append("\n");
    sb.append("    huisnummer: ").append(toIndentedString(huisnummer)).append("\n");
    sb.append("    huisnummertoevoeging: ").append(toIndentedString(huisnummertoevoeging)).append("\n");
    sb.append("    aanduidingBijHuisnummer: ").append(toIndentedString(aanduidingBijHuisnummer)).append("\n");
    sb.append("    identificatiecodeNummeraanduiding: ").append(toIndentedString(identificatiecodeNummeraanduiding)).append("\n");
    sb.append("    naamOpenbareRuimte: ").append(toIndentedString(naamOpenbareRuimte)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    woonplaatsnaam: ").append(toIndentedString(woonplaatsnaam)).append("\n");
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

