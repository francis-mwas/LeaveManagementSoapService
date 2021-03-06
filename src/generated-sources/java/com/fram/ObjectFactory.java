
package com.fram;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fram package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fram
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserRequestType }
     * 
     */
    public UserRequestType createUserRequestType() {
        return new UserRequestType();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link UserResponseType }
     * 
     */
    public UserResponseType createUserResponseType() {
        return new UserResponseType();
    }

    /**
     * Create an instance of {@link GetUserDetailsRequest }
     * 
     */
    public GetUserDetailsRequest createGetUserDetailsRequest() {
        return new GetUserDetailsRequest();
    }

    /**
     * Create an instance of {@link GetUserDetailsResponse }
     * 
     */
    public GetUserDetailsResponse createGetUserDetailsResponse() {
        return new GetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link UsersListResponseType }
     * 
     */
    public UsersListResponseType createUsersListResponseType() {
        return new UsersListResponseType();
    }

    /**
     * Create an instance of {@link UsersListType }
     * 
     */
    public UsersListType createUsersListType() {
        return new UsersListType();
    }

    /**
     * Create an instance of {@link BusinessFaultType }
     * 
     */
    public BusinessFaultType createBusinessFaultType() {
        return new BusinessFaultType();
    }

}
