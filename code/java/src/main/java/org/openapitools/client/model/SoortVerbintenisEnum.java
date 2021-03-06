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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Soort verbintenis die bij de burgerlijke stand is ingeschreven * &#x60;huwelijk&#x60; - H * &#x60;geregistreerd_partnerschap&#x60; - P 
 */
@JsonAdapter(SoortVerbintenisEnum.Adapter.class)
public enum SoortVerbintenisEnum {
  
  HUWELIJK("huwelijk"),
  
  GEREGISTREERD_PARTNERSCHAP("geregistreerd_partnerschap");

  private String value;

  SoortVerbintenisEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SoortVerbintenisEnum fromValue(String value) {
    for (SoortVerbintenisEnum b : SoortVerbintenisEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SoortVerbintenisEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final SoortVerbintenisEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SoortVerbintenisEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SoortVerbintenisEnum.fromValue(value);
    }
  }
}

