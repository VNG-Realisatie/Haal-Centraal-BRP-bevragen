# openapi-java-client

Bevragen Ingeschreven Personen
- API version: 1.2.0
  - Build date: 2021-01-15T14:09:29.205Z[Etc/UTC]

API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.

Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.

Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.1.0/features) voor nadere toelichting.


  For more information, please visit [https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.2.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.2.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IngeschrevenPersonenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.haalcentraal.nl/haalcentraal/api/brp");

    IngeschrevenPersonenApi apiInstance = new IngeschrevenPersonenApi(defaultClient);
    String expand = "expand_example"; // String | Hiermee kun je opgeven welke gerelateerde resources meegeleverd moeten worden, en hun inhoud naar behoefte aanpassen. Hele resources of enkele properties geef je in de expand parameter kommagescheiden op. Properties die je wil ontvangen geef je op met de resource-naam gevolgd door de property naam, met daartussen een punt. In de definitie van het antwoord kun je bij _embedded zien welke gerelateerde resources meegeleverd kunnen worden. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/expand.feature).
    String fields = "fields_example"; // String | Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature)
    List<String> burgerservicenummer = Arrays.asList(); // List<String> | Uniek persoonsnummer. 
    LocalDate geboorteDatum = new LocalDate(); // LocalDate | Je kunt alleen zoeken met een volledig geboortedatum. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/parametervalidatie.feature) 
    String geboortePlaats = "Utrecht"; // String | Gemeentenaam of een buitenlandse plaats of een plaatsbepaling, die aangeeft waar de persoon is geboren. **Zoeken met tekstvelden is [case-Insensitive](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/case_insensitive.feature).** 
    GeslachtEnum geslachtsaanduiding = GeslachtEnum.fromValue("man"); // GeslachtEnum | Geeft aan dat de persoon een man of een vrouw is, of dat het geslacht (nog) onbekend is. 
    Boolean inclusiefOverledenPersonen = true; // Boolean | Als je ook overleden personen in het antwoord wilt, geef dan de parameter inclusiefOverledenPersonen op met waarde True.  Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/overleden_personen.feature) 
    String naamGeslachtsnaam = "Vries"; // String | De (geslachts)naam waarvan de eventueel aanwezige voorvoegsels zijn afgesplitst. **Gebruik van de wildcard is toegestaan. Zie [feature-beschrijving](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/wildcard.feature)** **Zoeken met tekstvelden is [case-Insensitive](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/case_insensitive.feature).** 
    String naamVoorvoegsel = "de"; // String | Deel van de geslachtsnaam dat vooraf gaat aan de rest van de geslachtsnaam. Het zoeken op het voorvoegsel is [case-Insensitive](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/case_insensitive.feature).** 
    String naamVoornamen = "Dirk"; // String | De verzameling namen die, gescheiden door spaties, aan de geslachtsnaam voorafgaat. ** Bij deze query-parameter is het gebruik van een [wildcard](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/wildcard.feature) toegestaan in combinatie met minimaal 2 karakters.** **Zoeken met tekstvelden is [case-Insensitive](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/case_insensitive.feature).** 
    String verblijfplaatsGemeenteVanInschrijving = "0518"; // String | Een code die aangeeft in welke gemeente de persoon woont, of de laatste gemeente waar de persoon heeft gewoond, of de gemeente waar de persoon voor het eerst is ingeschreven. 
    String verblijfplaatsHuisletter = "a"; // String | Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven. 
    Integer verblijfplaatsHuisnummer = 14; // Integer | Een nummer dat door de gemeente aan een adresseerbaar object is gegeven. 
    String verblijfplaatsHuisnummertoevoeging = "bis"; // String | Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven. 
    String verblijfplaatsNummeraanduidingIdentificatie = "0518200000366054"; // String | Unieke identificatie van een nummeraanduiding (en het bijbehorende adres) in de BAG. 
    String verblijfplaatsStraat = "Tulpstraat"; // String | Een naam die door de gemeente aan een openbare ruimte is gegeven. **Gebruik van de wildcard is toegestaan. Zie [feature-beschrijving](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/wildcard.feature)** **Zoeken met tekstvelden is [case-Insensitive](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/case_insensitive.feature). 
    String verblijfplaatsPostcode = "2341SX"; // String | De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort. 
    try {
      IngeschrevenPersoonHalCollectie result = apiInstance.getIngeschrevenPersonen(expand, fields, burgerservicenummer, geboorteDatum, geboortePlaats, geslachtsaanduiding, inclusiefOverledenPersonen, naamGeslachtsnaam, naamVoorvoegsel, naamVoornamen, verblijfplaatsGemeenteVanInschrijving, verblijfplaatsHuisletter, verblijfplaatsHuisnummer, verblijfplaatsHuisnummertoevoeging, verblijfplaatsNummeraanduidingIdentificatie, verblijfplaatsStraat, verblijfplaatsPostcode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IngeschrevenPersonenApi#getIngeschrevenPersonen");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://www.haalcentraal.nl/haalcentraal/api/brp*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*IngeschrevenPersonenApi* | [**getIngeschrevenPersonen**](docs/IngeschrevenPersonenApi.md#getIngeschrevenPersonen) | **GET** /ingeschrevenpersonen | Vindt personen
*IngeschrevenPersonenApi* | [**getIngeschrevenPersoon**](docs/IngeschrevenPersonenApi.md#getIngeschrevenPersoon) | **GET** /ingeschrevenpersonen/{burgerservicenummer} | Raadpleeg een persoon
*IngeschrevenPersonenApi* | [**getKind**](docs/IngeschrevenPersonenApi.md#getKind) | **GET** /ingeschrevenpersonen/{burgerservicenummer}/kinderen/{id} | Raadpleeg een kind van een persoon
*IngeschrevenPersonenApi* | [**getKinderen**](docs/IngeschrevenPersonenApi.md#getKinderen) | **GET** /ingeschrevenpersonen/{burgerservicenummer}/kinderen | Levert de kinderen van een persoon
*IngeschrevenPersonenApi* | [**getOuder**](docs/IngeschrevenPersonenApi.md#getOuder) | **GET** /ingeschrevenpersonen/{burgerservicenummer}/ouders/{id} | Raadpleeg een ouder van een persoon
*IngeschrevenPersonenApi* | [**getOuders**](docs/IngeschrevenPersonenApi.md#getOuders) | **GET** /ingeschrevenpersonen/{burgerservicenummer}/ouders | Levert de ouders van een persoon
*IngeschrevenPersonenApi* | [**getPartner**](docs/IngeschrevenPersonenApi.md#getPartner) | **GET** /ingeschrevenpersonen/{burgerservicenummer}/partners/{id} | Raadpleeg de partner van een persoon
*IngeschrevenPersonenApi* | [**getPartners**](docs/IngeschrevenPersonenApi.md#getPartners) | **GET** /ingeschrevenpersonen/{burgerservicenummer}/partners | Levert de actuele partners van een persoon


## Documentation for Models

 - [AanduidingBijHuisnummerEnum](docs/AanduidingBijHuisnummerEnum.md)
 - [AanduidingBijzonderNederlanderschapEnum](docs/AanduidingBijzonderNederlanderschapEnum.md)
 - [AangaanHuwelijkPartnerschap](docs/AangaanHuwelijkPartnerschap.md)
 - [AangaanHuwelijkPartnerschapInOnderzoek](docs/AangaanHuwelijkPartnerschapInOnderzoek.md)
 - [Adres](docs/Adres.md)
 - [BadRequestFoutbericht](docs/BadRequestFoutbericht.md)
 - [BadRequestFoutberichtAllOf](docs/BadRequestFoutberichtAllOf.md)
 - [DatumOnvolledig](docs/DatumOnvolledig.md)
 - [Foutbericht](docs/Foutbericht.md)
 - [Geboorte](docs/Geboorte.md)
 - [GeboorteAllOf](docs/GeboorteAllOf.md)
 - [GeboorteInOnderzoek](docs/GeboorteInOnderzoek.md)
 - [Geboortedatum](docs/Geboortedatum.md)
 - [GeslachtEnum](docs/GeslachtEnum.md)
 - [Gezagsverhouding](docs/Gezagsverhouding.md)
 - [GezagsverhoudingInOnderzoek](docs/GezagsverhoudingInOnderzoek.md)
 - [HalCollectionLinks](docs/HalCollectionLinks.md)
 - [HalLink](docs/HalLink.md)
 - [IndicatieGezagMinderjarigeEnum](docs/IndicatieGezagMinderjarigeEnum.md)
 - [IngeschrevenPersoon](docs/IngeschrevenPersoon.md)
 - [IngeschrevenPersoonEmbedded](docs/IngeschrevenPersoonEmbedded.md)
 - [IngeschrevenPersoonHal](docs/IngeschrevenPersoonHal.md)
 - [IngeschrevenPersoonHalAllOf](docs/IngeschrevenPersoonHalAllOf.md)
 - [IngeschrevenPersoonHalBasis](docs/IngeschrevenPersoonHalBasis.md)
 - [IngeschrevenPersoonHalBasisAllOf](docs/IngeschrevenPersoonHalBasisAllOf.md)
 - [IngeschrevenPersoonHalCollectie](docs/IngeschrevenPersoonHalCollectie.md)
 - [IngeschrevenPersoonHalCollectieEmbedded](docs/IngeschrevenPersoonHalCollectieEmbedded.md)
 - [IngeschrevenPersoonLinks](docs/IngeschrevenPersoonLinks.md)
 - [InvalidParams](docs/InvalidParams.md)
 - [Kiesrecht](docs/Kiesrecht.md)
 - [Kind](docs/Kind.md)
 - [KindHalBasis](docs/KindHalBasis.md)
 - [KindHalBasisAllOf](docs/KindHalBasisAllOf.md)
 - [KindHalCollectie](docs/KindHalCollectie.md)
 - [KindHalCollectieEmbedded](docs/KindHalCollectieEmbedded.md)
 - [KindInOnderzoek](docs/KindInOnderzoek.md)
 - [KindLinks](docs/KindLinks.md)
 - [Naam](docs/Naam.md)
 - [NaamInOnderzoek](docs/NaamInOnderzoek.md)
 - [NaamPersoon](docs/NaamPersoon.md)
 - [NaamPersoonAllOf](docs/NaamPersoonAllOf.md)
 - [NaamPersoonInOnderzoek](docs/NaamPersoonInOnderzoek.md)
 - [NaamPersoonInOnderzoekAllOf](docs/NaamPersoonInOnderzoekAllOf.md)
 - [NaamgebruikEnum](docs/NaamgebruikEnum.md)
 - [Nationaliteit](docs/Nationaliteit.md)
 - [NationaliteitInOnderzoek](docs/NationaliteitInOnderzoek.md)
 - [OpschortingBijhouding](docs/OpschortingBijhouding.md)
 - [Ouder](docs/Ouder.md)
 - [OuderAanduidingEnum](docs/OuderAanduidingEnum.md)
 - [OuderHalBasis](docs/OuderHalBasis.md)
 - [OuderHalBasisAllOf](docs/OuderHalBasisAllOf.md)
 - [OuderHalCollectie](docs/OuderHalCollectie.md)
 - [OuderHalCollectieEmbedded](docs/OuderHalCollectieEmbedded.md)
 - [OuderInOnderzoek](docs/OuderInOnderzoek.md)
 - [OuderLinks](docs/OuderLinks.md)
 - [Overlijden](docs/Overlijden.md)
 - [OverlijdenInOnderzoek](docs/OverlijdenInOnderzoek.md)
 - [Partner](docs/Partner.md)
 - [PartnerHalBasis](docs/PartnerHalBasis.md)
 - [PartnerHalBasisAllOf](docs/PartnerHalBasisAllOf.md)
 - [PartnerHalCollectie](docs/PartnerHalCollectie.md)
 - [PartnerHalCollectieEmbedded](docs/PartnerHalCollectieEmbedded.md)
 - [PartnerInOnderzoek](docs/PartnerInOnderzoek.md)
 - [PartnerLinks](docs/PartnerLinks.md)
 - [PersoonInOnderzoek](docs/PersoonInOnderzoek.md)
 - [RedenOpschortingBijhoudingEnum](docs/RedenOpschortingBijhoudingEnum.md)
 - [SoortAdresEnum](docs/SoortAdresEnum.md)
 - [SoortVerbintenisEnum](docs/SoortVerbintenisEnum.md)
 - [Verblijfplaats](docs/Verblijfplaats.md)
 - [VerblijfplaatsAllOf](docs/VerblijfplaatsAllOf.md)
 - [VerblijfplaatsInOnderzoek](docs/VerblijfplaatsInOnderzoek.md)
 - [Verblijfstitel](docs/Verblijfstitel.md)
 - [VerblijfstitelInOnderzoek](docs/VerblijfstitelInOnderzoek.md)
 - [Waardetabel](docs/Waardetabel.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



