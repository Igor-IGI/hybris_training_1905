package de.hybris.platform.testwebservices.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.customer.CustomerDataListWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.customer.CustomerDataWsDTO;
import de.hybris.platform.testwebservices.user.data.CustomerDataList;
import de.hybris.platform.trainingsocialsitefacade.facade.impl.TrainingSocialSiteFacadeImpl;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdAndUserIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.apache.log4j.Logger;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
// https://<localhost>:<port>/trainingsocialsitewebservices/v2/electronic(baseSiteId)/customers...
@RequestMapping(value = "/{baseSiteId}/customer")
@Api(tags = "Customers") // that could be whatever we wanted
public class CustomerController extends BaseCommerceController {

    private static final Logger LOGGER = Logger.getLogger(CustomerController.class);
    @Resource(name = "trainingSocialSiteFacade")
    private TrainingSocialSiteFacadeImpl trainingSocialSiteFacade;

    //@Secured - define which user can access to methode, which role must have use this user.
    //@RequestMapping - define what value must have request and which type is request.
    //@ResponseBody - define what is in the response body, this is the return type.
    //@ApiOperation - metadata of api methode.
    //@Authorization - determine which credential must have user.
    //@ApiParam - set how many properties will return response, we set it in spring.xml
    //ApiBaseSiteIdParam - this means that method depends on base site id
    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "/{customerID}/customer", method = RequestMethod.GET)
    @ApiOperation(nickname = "getCustomer", value = "Get a Customer details", notes = "Return a single costumer",
            authorizations = {@Authorization(value = "oauth2_client_credential")})
    @ApiBaseSiteIdAndUserIdParam
    @ResponseBody
    public CustomerDataWsDTO getCustomer(
            @ApiParam(value = "customer ID", required = true)
            @PathVariable final String customerID,
            @ApiParam(value = "Response configurator. This is the single costumer hath shut be returned in the response body.",
                    allowableValues = "BASIC, DEFAULT, FULL")
            @RequestParam(defaultValue = "DEFAULT_FIELD_SET") final String scope) {

        LOGGER.info("Customer is: " + customerID);

        return getDataMapper().map(trainingSocialSiteFacade.getCustomerById(customerID), CustomerDataWsDTO.class, scope);
    }

    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    @ApiOperation(nickname = "getCustomers", value = "Get a list of customers", notes = "Return a list of customers",
            authorizations = {@Authorization(value = "oauth2_client_credential")})
    @ApiBaseSiteIdParam
    @ResponseBody
    public CustomerDataListWsDTO getCustomers(
            @ApiParam(value = "Response configurator. This is the list that should be returned in the response body.",
                    allowableValues = "BASIC, DEFAULT, FULL")
            @RequestParam(defaultValue = "DEFAULT_FIELD_SET") final String scope) {

        final CustomerDataList customerDataList = new CustomerDataList();
        customerDataList.setCustomers(trainingSocialSiteFacade.getCustomers());

        // Map CustomerDataList to CustomerDataListWsDTO under condition
        return getDataMapper().map(customerDataList, CustomerDataListWsDTO.class, scope);
    }
}