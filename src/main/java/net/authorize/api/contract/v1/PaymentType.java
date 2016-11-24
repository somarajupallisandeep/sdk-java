//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.22 at 06:00:08 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="creditCard" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}creditCardType"/>
 *           &lt;element name="bankAccount" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}bankAccountType"/>
 *           &lt;element name="trackData" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}creditCardTrackType"/>
 *           &lt;element name="encryptedTrackData" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}encryptedTrackDataType"/>
 *           &lt;element name="payPal" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}payPalType"/>
 *           &lt;element name="opaqueData" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}opaqueDataType"/>
 *           &lt;element name="emv" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}paymentEmvType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentType", propOrder = {
    "creditCard",
    "bankAccount",
    "trackData",
    "encryptedTrackData",
    "payPal",
    "opaqueData",
    "emv"
})
public class PaymentType {

    protected CreditCardType creditCard;
    protected BankAccountType bankAccount;
    protected CreditCardTrackType trackData;
    protected EncryptedTrackDataType encryptedTrackData;
    protected PayPalType payPal;
    protected OpaqueDataType opaqueData;
    protected PaymentEmvType emv;

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardType }
     *     
     */
    public CreditCardType getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardType }
     *     
     */
    public void setCreditCard(CreditCardType value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountType }
     *     
     */
    public BankAccountType getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountType }
     *     
     */
    public void setBankAccount(BankAccountType value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the trackData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardTrackType }
     *     
     */
    public CreditCardTrackType getTrackData() {
        return trackData;
    }

    /**
     * Sets the value of the trackData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardTrackType }
     *     
     */
    public void setTrackData(CreditCardTrackType value) {
        this.trackData = value;
    }

    /**
     * Gets the value of the encryptedTrackData property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedTrackDataType }
     *     
     */
    public EncryptedTrackDataType getEncryptedTrackData() {
        return encryptedTrackData;
    }

    /**
     * Sets the value of the encryptedTrackData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedTrackDataType }
     *     
     */
    public void setEncryptedTrackData(EncryptedTrackDataType value) {
        this.encryptedTrackData = value;
    }

    /**
     * Gets the value of the payPal property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalType }
     *     
     */
    public PayPalType getPayPal() {
        return payPal;
    }

    /**
     * Sets the value of the payPal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalType }
     *     
     */
    public void setPayPal(PayPalType value) {
        this.payPal = value;
    }

    /**
     * Gets the value of the opaqueData property.
     * 
     * @return
     *     possible object is
     *     {@link OpaqueDataType }
     *     
     */
    public OpaqueDataType getOpaqueData() {
        return opaqueData;
    }

    /**
     * Sets the value of the opaqueData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpaqueDataType }
     *     
     */
    public void setOpaqueData(OpaqueDataType value) {
        this.opaqueData = value;
    }

    /**
     * Gets the value of the emv property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentEmvType }
     *     
     */
    public PaymentEmvType getEmv() {
        return emv;
    }

    /**
     * Sets the value of the emv property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentEmvType }
     *     
     */
    public void setEmv(PaymentEmvType value) {
        this.emv = value;
    }

}
