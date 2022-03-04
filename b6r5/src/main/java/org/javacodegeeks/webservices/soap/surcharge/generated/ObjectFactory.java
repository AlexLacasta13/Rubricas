//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.03.04 a las 11:45:05 AM CET 
//


package org.javacodegeeks.webservices.soap.surcharge.generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.javacodegeeks.webservices.soap.surcharge.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.javacodegeeks.webservices.soap.surcharge.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SurchargeRequest }
     * 
     */
    public SurchargeRequest createSurchargeRequest() {
        return new SurchargeRequest();
    }

    /**
     * Create an instance of {@link SurchargeRequest.Order }
     * 
     */
    public SurchargeRequest.Order createSurchargeRequestOrder() {
        return new SurchargeRequest.Order();
    }

    /**
     * Create an instance of {@link SurchargeRequest.Order.Customer }
     * 
     */
    public SurchargeRequest.Order.Customer createSurchargeRequestOrderCustomer() {
        return new SurchargeRequest.Order.Customer();
    }

    /**
     * Create an instance of {@link SurchargeRequest.Order.Customer.Address }
     * 
     */
    public SurchargeRequest.Order.Customer.Address createSurchargeRequestOrderCustomerAddress() {
        return new SurchargeRequest.Order.Customer.Address();
    }

    /**
     * Create an instance of {@link SurchargeResponse }
     * 
     */
    public SurchargeResponse createSurchargeResponse() {
        return new SurchargeResponse();
    }

    /**
     * Create an instance of {@link SurchargeRequest.Order.Customer.Name }
     * 
     */
    public SurchargeRequest.Order.Customer.Name createSurchargeRequestOrderCustomerName() {
        return new SurchargeRequest.Order.Customer.Name();
    }

    /**
     * Create an instance of {@link SurchargeRequest.Order.Customer.Address.Street }
     * 
     */
    public SurchargeRequest.Order.Customer.Address.Street createSurchargeRequestOrderCustomerAddressStreet() {
        return new SurchargeRequest.Order.Customer.Address.Street();
    }

}
