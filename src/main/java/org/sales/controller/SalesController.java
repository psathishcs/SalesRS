package org.sales.controller;

import java.util.Date;
import java.util.List;

import org.sales.entity.Sales;
import org.sales.repository.SalesRepository;
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
public class SalesController {
	@Autowired
	private SalesRepository repository;

	@RequestMapping(value="/sales", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllSales", nickname="getAllSales")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Sales.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Sales> getAllSales(){
		return repository.getAllSales();
	}
	
	@RequestMapping(value="/sales/prod/{prodID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="prodID", value="prodID", required=true, dataType="Long", 
		paramType="path")})
	@ApiOperation(value="getSalesByProdID", nickname="getSalesByProdID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Sales.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Sales> getSalesByProdID(@PathVariable Long prodID){
		return repository.getSalesByProdID(prodID);
	}
	
	@RequestMapping(value="/sales/cust/{custID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="custID", value="custID", required=true, dataType="Integer", 
		paramType="path")})
	@ApiOperation(value="getSalesByCustID", nickname="getSalesByCustID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Sales.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Sales> getSalesByCustID(@PathVariable Integer custID){
		return repository.getSalesByCustID(custID);
	}
	
	@RequestMapping(value="/sales/time/{timeID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="timeID", value="timeID", required=true, dataType="Date", 
		paramType="path")})
	@ApiOperation(value="getSalesByTimeID", nickname="getSalesByTimeID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Sales.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Sales> getSalesByTimeID(@PathVariable Date timeID){
		return repository.getSalesByTimeID(timeID);
	}
	
	@RequestMapping(value="/sales/channel/{channelID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="channelID", value="channelID", required=true, dataType="Date", 
		paramType="path")})
	@ApiOperation(value="getSalesByChannelID", nickname="getSalesByChannelID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Sales.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Sales> getSalesByChannelID(@PathVariable Integer channelID){
		return repository.getSalesByChannelID(channelID);
	}

	
	@RequestMapping(value="/sales/promo/{promoID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="promoID", value="promoID", required=true, dataType="Long", 
		paramType="path")})
	@ApiOperation(value="getSalesByPromoID", nickname="getSalesByPromoID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Sales.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Sales> getSalesByPromoID(@PathVariable Long promoID){
		return repository.getSalesByPromoID(promoID);
	}


}
