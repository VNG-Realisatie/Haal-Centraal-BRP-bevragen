/* 
 * Bevragen Ingeschreven Personen
 *
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.1.0/features) voor nadere toelichting. 
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// NaamPersoon
    /// </summary>
    [DataContract]
    public partial class NaamPersoon :  IEquatable<NaamPersoon>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NaamPersoon" /> class.
        /// </summary>
        /// <param name="geslachtsnaam">De achternaam van een persoon. .</param>
        /// <param name="voorletters">De voorletters van de persoon, afgeleid van de voornamen. .</param>
        /// <param name="voornamen">De verzameling namen voor de geslachtsnaam, gescheiden door spaties. .</param>
        /// <param name="voorvoegsel">voorvoegsel.</param>
        /// <param name="adellijkeTitelPredikaat">adellijkeTitelPredikaat.</param>
        /// <param name="inOnderzoek">inOnderzoek.</param>
        /// <param name="aanhef">Kun je gebruiken als aanhef in een brief gericht aan persoon. .</param>
        /// <param name="aanschrijfwijze">Samengestelde naam die je kunt gebruiken in de communicatie met de persoon. .</param>
        /// <param name="regelVoorafgaandAanAanschrijfwijze">Deze regel moet als aparte regel boven de aanschrijfwijze worden geplaatst. Komt alleen voor bij personen met een adellijke titel of predicaat. .</param>
        /// <param name="gebruikInLopendeTekst">Naam van persoon die je kunt gebruiken als je in lopende tekst (bijvoorbeeld in een brief) aan persoon refereert. .</param>
        /// <param name="aanduidingNaamgebruik">aanduidingNaamgebruik.</param>
        public NaamPersoon(string geslachtsnaam = default(string), string voorletters = default(string), string voornamen = default(string), string voorvoegsel = default(string), Waardetabel adellijkeTitelPredikaat = default(Waardetabel), NaamPersoonInOnderzoek inOnderzoek = default(NaamPersoonInOnderzoek), string aanhef = default(string), string aanschrijfwijze = default(string), string regelVoorafgaandAanAanschrijfwijze = default(string), string gebruikInLopendeTekst = default(string), NaamgebruikEnum aanduidingNaamgebruik = default(NaamgebruikEnum))
        {
            this.Geslachtsnaam = geslachtsnaam;
            this.Voorletters = voorletters;
            this.Voornamen = voornamen;
            this.Voorvoegsel = voorvoegsel;
            this.AdellijkeTitelPredikaat = adellijkeTitelPredikaat;
            this.InOnderzoek = inOnderzoek;
            this.Aanhef = aanhef;
            this.Aanschrijfwijze = aanschrijfwijze;
            this.RegelVoorafgaandAanAanschrijfwijze = regelVoorafgaandAanAanschrijfwijze;
            this.GebruikInLopendeTekst = gebruikInLopendeTekst;
            this.AanduidingNaamgebruik = aanduidingNaamgebruik;
        }
        
        /// <summary>
        /// De achternaam van een persoon. 
        /// </summary>
        /// <value>De achternaam van een persoon. </value>
        [DataMember(Name="geslachtsnaam", EmitDefaultValue=false)]
        public string Geslachtsnaam { get; set; }

        /// <summary>
        /// De voorletters van de persoon, afgeleid van de voornamen. 
        /// </summary>
        /// <value>De voorletters van de persoon, afgeleid van de voornamen. </value>
        [DataMember(Name="voorletters", EmitDefaultValue=false)]
        public string Voorletters { get; set; }

        /// <summary>
        /// De verzameling namen voor de geslachtsnaam, gescheiden door spaties. 
        /// </summary>
        /// <value>De verzameling namen voor de geslachtsnaam, gescheiden door spaties. </value>
        [DataMember(Name="voornamen", EmitDefaultValue=false)]
        public string Voornamen { get; set; }

        /// <summary>
        /// Gets or Sets Voorvoegsel
        /// </summary>
        [DataMember(Name="voorvoegsel", EmitDefaultValue=false)]
        public string Voorvoegsel { get; set; }

        /// <summary>
        /// Gets or Sets AdellijkeTitelPredikaat
        /// </summary>
        [DataMember(Name="adellijkeTitelPredikaat", EmitDefaultValue=false)]
        public Waardetabel AdellijkeTitelPredikaat { get; set; }

        /// <summary>
        /// Gets or Sets InOnderzoek
        /// </summary>
        [DataMember(Name="inOnderzoek", EmitDefaultValue=false)]
        public NaamPersoonInOnderzoek InOnderzoek { get; set; }

        /// <summary>
        /// Kun je gebruiken als aanhef in een brief gericht aan persoon. 
        /// </summary>
        /// <value>Kun je gebruiken als aanhef in een brief gericht aan persoon. </value>
        [DataMember(Name="aanhef", EmitDefaultValue=false)]
        public string Aanhef { get; set; }

        /// <summary>
        /// Samengestelde naam die je kunt gebruiken in de communicatie met de persoon. 
        /// </summary>
        /// <value>Samengestelde naam die je kunt gebruiken in de communicatie met de persoon. </value>
        [DataMember(Name="aanschrijfwijze", EmitDefaultValue=false)]
        public string Aanschrijfwijze { get; set; }

        /// <summary>
        /// Deze regel moet als aparte regel boven de aanschrijfwijze worden geplaatst. Komt alleen voor bij personen met een adellijke titel of predicaat. 
        /// </summary>
        /// <value>Deze regel moet als aparte regel boven de aanschrijfwijze worden geplaatst. Komt alleen voor bij personen met een adellijke titel of predicaat. </value>
        [DataMember(Name="regelVoorafgaandAanAanschrijfwijze", EmitDefaultValue=false)]
        public string RegelVoorafgaandAanAanschrijfwijze { get; set; }

        /// <summary>
        /// Naam van persoon die je kunt gebruiken als je in lopende tekst (bijvoorbeeld in een brief) aan persoon refereert. 
        /// </summary>
        /// <value>Naam van persoon die je kunt gebruiken als je in lopende tekst (bijvoorbeeld in een brief) aan persoon refereert. </value>
        [DataMember(Name="gebruikInLopendeTekst", EmitDefaultValue=false)]
        public string GebruikInLopendeTekst { get; set; }

        /// <summary>
        /// Gets or Sets AanduidingNaamgebruik
        /// </summary>
        [DataMember(Name="aanduidingNaamgebruik", EmitDefaultValue=false)]
        public NaamgebruikEnum AanduidingNaamgebruik { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NaamPersoon {\n");
            sb.Append("  Geslachtsnaam: ").Append(Geslachtsnaam).Append("\n");
            sb.Append("  Voorletters: ").Append(Voorletters).Append("\n");
            sb.Append("  Voornamen: ").Append(Voornamen).Append("\n");
            sb.Append("  Voorvoegsel: ").Append(Voorvoegsel).Append("\n");
            sb.Append("  AdellijkeTitelPredikaat: ").Append(AdellijkeTitelPredikaat).Append("\n");
            sb.Append("  InOnderzoek: ").Append(InOnderzoek).Append("\n");
            sb.Append("  Aanhef: ").Append(Aanhef).Append("\n");
            sb.Append("  Aanschrijfwijze: ").Append(Aanschrijfwijze).Append("\n");
            sb.Append("  RegelVoorafgaandAanAanschrijfwijze: ").Append(RegelVoorafgaandAanAanschrijfwijze).Append("\n");
            sb.Append("  GebruikInLopendeTekst: ").Append(GebruikInLopendeTekst).Append("\n");
            sb.Append("  AanduidingNaamgebruik: ").Append(AanduidingNaamgebruik).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as NaamPersoon);
        }

        /// <summary>
        /// Returns true if NaamPersoon instances are equal
        /// </summary>
        /// <param name="input">Instance of NaamPersoon to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NaamPersoon input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Geslachtsnaam == input.Geslachtsnaam ||
                    (this.Geslachtsnaam != null &&
                    this.Geslachtsnaam.Equals(input.Geslachtsnaam))
                ) && 
                (
                    this.Voorletters == input.Voorletters ||
                    (this.Voorletters != null &&
                    this.Voorletters.Equals(input.Voorletters))
                ) && 
                (
                    this.Voornamen == input.Voornamen ||
                    (this.Voornamen != null &&
                    this.Voornamen.Equals(input.Voornamen))
                ) && 
                (
                    this.Voorvoegsel == input.Voorvoegsel ||
                    (this.Voorvoegsel != null &&
                    this.Voorvoegsel.Equals(input.Voorvoegsel))
                ) && 
                (
                    this.AdellijkeTitelPredikaat == input.AdellijkeTitelPredikaat ||
                    (this.AdellijkeTitelPredikaat != null &&
                    this.AdellijkeTitelPredikaat.Equals(input.AdellijkeTitelPredikaat))
                ) && 
                (
                    this.InOnderzoek == input.InOnderzoek ||
                    (this.InOnderzoek != null &&
                    this.InOnderzoek.Equals(input.InOnderzoek))
                ) && 
                (
                    this.Aanhef == input.Aanhef ||
                    (this.Aanhef != null &&
                    this.Aanhef.Equals(input.Aanhef))
                ) && 
                (
                    this.Aanschrijfwijze == input.Aanschrijfwijze ||
                    (this.Aanschrijfwijze != null &&
                    this.Aanschrijfwijze.Equals(input.Aanschrijfwijze))
                ) && 
                (
                    this.RegelVoorafgaandAanAanschrijfwijze == input.RegelVoorafgaandAanAanschrijfwijze ||
                    (this.RegelVoorafgaandAanAanschrijfwijze != null &&
                    this.RegelVoorafgaandAanAanschrijfwijze.Equals(input.RegelVoorafgaandAanAanschrijfwijze))
                ) && 
                (
                    this.GebruikInLopendeTekst == input.GebruikInLopendeTekst ||
                    (this.GebruikInLopendeTekst != null &&
                    this.GebruikInLopendeTekst.Equals(input.GebruikInLopendeTekst))
                ) && 
                (
                    this.AanduidingNaamgebruik == input.AanduidingNaamgebruik ||
                    (this.AanduidingNaamgebruik != null &&
                    this.AanduidingNaamgebruik.Equals(input.AanduidingNaamgebruik))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Geslachtsnaam != null)
                    hashCode = hashCode * 59 + this.Geslachtsnaam.GetHashCode();
                if (this.Voorletters != null)
                    hashCode = hashCode * 59 + this.Voorletters.GetHashCode();
                if (this.Voornamen != null)
                    hashCode = hashCode * 59 + this.Voornamen.GetHashCode();
                if (this.Voorvoegsel != null)
                    hashCode = hashCode * 59 + this.Voorvoegsel.GetHashCode();
                if (this.AdellijkeTitelPredikaat != null)
                    hashCode = hashCode * 59 + this.AdellijkeTitelPredikaat.GetHashCode();
                if (this.InOnderzoek != null)
                    hashCode = hashCode * 59 + this.InOnderzoek.GetHashCode();
                if (this.Aanhef != null)
                    hashCode = hashCode * 59 + this.Aanhef.GetHashCode();
                if (this.Aanschrijfwijze != null)
                    hashCode = hashCode * 59 + this.Aanschrijfwijze.GetHashCode();
                if (this.RegelVoorafgaandAanAanschrijfwijze != null)
                    hashCode = hashCode * 59 + this.RegelVoorafgaandAanAanschrijfwijze.GetHashCode();
                if (this.GebruikInLopendeTekst != null)
                    hashCode = hashCode * 59 + this.GebruikInLopendeTekst.GetHashCode();
                if (this.AanduidingNaamgebruik != null)
                    hashCode = hashCode * 59 + this.AanduidingNaamgebruik.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
