//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.15 at 09:48:58 AM CEST 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevocationConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevocationConstraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RevocationFreshness" type="{http://dss.esig.europa.eu/validation/diagnostic}TimeConstraint" minOccurs="0"/>
 *         &lt;element name="SigningCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateConstraints" minOccurs="0"/>
 *         &lt;element name="CACertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateConstraints" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevocationConstraints", propOrder = {
    "revocationFreshness",
    "signingCertificate",
    "caCertificate"
})
public class RevocationConstraints {

    @XmlElement(name = "RevocationFreshness")
    protected TimeConstraint revocationFreshness;
    @XmlElement(name = "SigningCertificate")
    protected CertificateConstraints signingCertificate;
    @XmlElement(name = "CACertificate")
    protected CertificateConstraints caCertificate;

    /**
     * Gets the value of the revocationFreshness property.
     * 
     * @return
     *     possible object is
     *     {@link TimeConstraint }
     *     
     */
    public TimeConstraint getRevocationFreshness() {
        return revocationFreshness;
    }

    /**
     * Sets the value of the revocationFreshness property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeConstraint }
     *     
     */
    public void setRevocationFreshness(TimeConstraint value) {
        this.revocationFreshness = value;
    }

    /**
     * Gets the value of the signingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateConstraints }
     *     
     */
    public CertificateConstraints getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Sets the value of the signingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateConstraints }
     *     
     */
    public void setSigningCertificate(CertificateConstraints value) {
        this.signingCertificate = value;
    }

    /**
     * Gets the value of the caCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateConstraints }
     *     
     */
    public CertificateConstraints getCACertificate() {
        return caCertificate;
    }

    /**
     * Sets the value of the caCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateConstraints }
     *     
     */
    public void setCACertificate(CertificateConstraints value) {
        this.caCertificate = value;
    }

}
