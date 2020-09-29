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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Aanduiding van het soort adres.: * &#x60;woonadres&#x60; - W * &#x60;briefadres&#x60; - B
 */
@JsonAdapter(SoortAdresEnum.Adapter.class)
public enum SoortAdresEnum {
  
  WOONADRES("woonadres"),
  
  BRIEFADRES("briefadres");

  private String value;

  SoortAdresEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SoortAdresEnum fromValue(String value) {
    for (SoortAdresEnum b : SoortAdresEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SoortAdresEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final SoortAdresEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SoortAdresEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SoortAdresEnum.fromValue(value);
    }
  }
}
