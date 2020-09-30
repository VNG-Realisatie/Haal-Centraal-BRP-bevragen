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
 * &lt;body&gt;&lt;p&gt;Gegevens over de geboorte van respectievelijk de persoon, de ouder, de echtgenoot/geregistreerd partner, de eerdere echtgenoot/geregistreerd partner of het kind.&lt;/p&gt;&lt;p&gt;  &lt;em&gt;*&lt;/em&gt; datum** : Datum waarop de persoon is geboren.&lt;/p&gt;&lt;p&gt;  &lt;em&gt;*&lt;/em&gt; land** : Land waar de persoon is geboren&lt;/p&gt;&lt;p&gt;  &lt;em&gt;*&lt;/em&gt; plaats** : De plaats waar een persoon is geboren. Voor een plaats buiten Nederland is gemeentecode&#x3D;1999 (RNI) en gemeentenaam de buitenlandse plaatsnaam of aanduiding.&lt;/p&gt;&lt;/body&gt;
 */
@ApiModel(description = "<body><p>Gegevens over de geboorte van respectievelijk de persoon, de ouder, de echtgenoot/geregistreerd partner, de eerdere echtgenoot/geregistreerd partner of het kind.</p><p>  <em>*</em> datum** : Datum waarop de persoon is geboren.</p><p>  <em>*</em> land** : Land waar de persoon is geboren</p><p>  <em>*</em> plaats** : De plaats waar een persoon is geboren. Voor een plaats buiten Nederland is gemeentecode=1999 (RNI) en gemeentenaam de buitenlandse plaatsnaam of aanduiding.</p></body>")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-21T14:20:17.398Z[Etc/UTC]")
public class Geboortedatum {
  public static final String SERIALIZED_NAME_DATUM = "datum";
  @SerializedName(SERIALIZED_NAME_DATUM)
  private DatumOnvolledig datum;


  public Geboortedatum datum(DatumOnvolledig datum) {
    
    this.datum = datum;
    return this;
  }

   /**
   * Get datum
   * @return datum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatum() {
    return datum;
  }


  public void setDatum(DatumOnvolledig datum) {
    this.datum = datum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Geboortedatum geboortedatum = (Geboortedatum) o;
    return Objects.equals(this.datum, geboortedatum.datum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Geboortedatum {\n");
    sb.append("    datum: ").append(toIndentedString(datum)).append("\n");
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

