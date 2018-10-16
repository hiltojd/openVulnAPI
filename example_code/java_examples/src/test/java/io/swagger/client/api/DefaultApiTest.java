/*
 * Cisco PSIRT openVuln API
 * The Cisco Product Security Incident Response Team (PSIRT) openVuln API is a RESTful API that allows customers to obtain Cisco Security Vulnerability information in different machine-consumable formats. APIs are important for customers because they allow their technical staff and programmers to build tools that help them do their job more effectively (in this case, to keep up with security vulnerability information). For more information about the Cisco PSIRT openVuln API visit https://developer.cisco.com/site/PSIRT/discover/overview  For detail steps on how to use the API go to: https://developer.cisco.com/site/PSIRT/get-started/getting-started.gsp  This is a beta release of a swagger YAML for the Cisco PSIRT openVuln API  To access the API sign in with your Cisco CCO account at http://apiconsole.cisco.com and register an application to recieve a client_id and a client_secret  You can then get your token using curl or any other method you prefer.  'curl -s -k -H \"Content-Type: application/x-www-form-urlencoded\" -X POST -d \"client_id=<your_client_id>\" -d \"client_secret=<your_client_secret>\" -d \"grant_type=client_credentials\" https://cloudsso.cisco.com/as/token.oauth2'  You will receive an access token as demonstrated in the following example:  '{\"access_token\":\"I7omWtBDAieSiUX3shOxNJfuy4J6\",\"token_type\":\"Bearer\",\"expires_in\":3599}'  In Swagger, click on Change Authentication  enter the text \"I7omWtBDAieSiUX3shOxNJfuy4J6\" (which is the token you received)  then click on \"Try this operation\" 
 *
 * OpenAPI spec version: 0.0.4
 * Contact: os@cisco.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.threeten.bp.LocalDate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Used to obtain an advisory given its advisory ID &#x60;advisory_id&#x60; (i.e., cisco-sa-20180221-ucdm) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityAdvisoriesAdvisoryAdvisoryIdGetTest() throws ApiException {
        String advisoryId = null;
        api.securityAdvisoriesAdvisoryAdvisoryIdGet(advisoryId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to obtain information about all published security advisories. By default the output is in JSON. To obtain the output in XML use the .xml extension. For example, /advisories/all.xml 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityAdvisoriesAllGetTest() throws ApiException {
        api.securityAdvisoriesAllGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to obtain an advisory using a given Common Vulnerability Enumerator (CVE). The &#x60;cve_id&#x60; format is CVE-YYYY-NNNN. For more information about CVE visit http://cve.mitre.org/ 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityAdvisoriesCveCveIdGetTest() throws ApiException {
        String cveId = null;
        api.securityAdvisoriesCveCveIdGet(cveId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to obtain all advisories that affects the given ios version 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityAdvisoriesIosGetTest() throws ApiException {
        String version = null;
        api.securityAdvisoriesIosGet(version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to obtain all advisories that affects the given ios version 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityAdvisoriesIosxeGetTest() throws ApiException {
        String version = null;
        api.securityAdvisoriesIosxeGet(version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to obtain all the latest security advisories given an absolute number. For instance, the latest 10 or latest 5. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityAdvisoriesLatestNumberGetTest() throws ApiException {
        Integer number = null;
        api.securityAdvisoriesLatestNumberGet(number);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to obtain all the advisories that affects the given product name. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityAdvisoriesProductGetTest() throws ApiException {
        String product = null;
        api.securityAdvisoriesProductGet(product);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to obtain all security advisories for a given security impact rating (critical, high, medium, or low) and additionally filter based of firstpublished start date and enddate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityAdvisoriesSeveritySeverityFirstpublishedGetTest() throws ApiException {
        String severity = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        api.securityAdvisoriesSeveritySeverityFirstpublishedGet(severity, startDate, endDate);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to obtain all security advisories for a given security impact rating (critical, high, medium, or low). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityAdvisoriesSeveritySeverityGetTest() throws ApiException {
        String severity = null;
        api.securityAdvisoriesSeveritySeverityGet(severity);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to obtain all security advisories for a given security impact rating (critical, high, medium, or low). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityAdvisoriesSeveritySeverityLastpublishedGetTest() throws ApiException {
        String severity = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        api.securityAdvisoriesSeveritySeverityLastpublishedGet(severity, startDate, endDate);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to obtain all security advisories that have were orginally published in a specific year &#x60;YYYY&#x60;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityAdvisoriesYearYearGetTest() throws ApiException {
        String year = null;
        api.securityAdvisoriesYearYearGet(year);

        // TODO: test validations
    }
    
}
