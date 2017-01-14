package org.sales.controller;

import java.util.List;

import org.sales.entity.Customers;
import org.sales.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class CustomersController {
	@Autowired
	private CustomersRepository repository;

	@RequestMapping(value="/customers", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllCustomers", nickname="getAllCustomers")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Customers.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Customers> getAllCustomers(){
		return repository.getAllCustomers();
	}
	
	@RequestMapping(value="/customers/{custID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="custID", value="custID", required=true, dataType="Long", 
		paramType="path")})
	@ApiOperation(value="getByCountriesByID", nickname="getByCountriesByID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Customers.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public Customers getCustomersByID(@PathVariable Long custID){
		return repository.getCustomersByID(custID);
	}
	

}
