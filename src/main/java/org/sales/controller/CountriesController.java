package org.sales.controller;

import java.util.List;

import org.sales.entity.Countries;
import org.sales.repository.CountriesRepository;
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
public class CountriesController {
	@Autowired
	private CountriesRepository repository;

	@RequestMapping(value="/countries", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllCountries", nickname="getAllCountries")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Countries.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Countries> getAllCountries(){
		return repository.getAllCountries();
	}
	
	@RequestMapping(value="/countries/{countryID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="countryID", value="countryID", required=true, dataType="Integer", 
		paramType="path")})
	@ApiOperation(value="getCountriesByID", nickname="getCountriesByID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Countries.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public Countries getCountriesByID(@PathVariable Integer countryID){
		return repository.getCountriesByID(countryID);
	}
	
	@RequestMapping(value="/countries/name/{countryName}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="countryName", value="countryName", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getCountriesByName", nickname="getCountriesByName")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Countries.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public Countries getCountriesByName(@PathVariable String countryName){
		return repository.getCountriesByName(countryName);
	}
	
	@RequestMapping(value="/countries/sub-region/{countrySubRegion}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="countrySubRegion", value="countrySubRegion", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getCountriesByCountrySubRegion", nickname="getCountriesByCountrySubRegion")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Countries.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Countries> getCountriesByCountrySubRegion(@PathVariable String countrySubRegion){
		return repository.getCountriesByCountrySubRegion(countrySubRegion);
	}
	
	@RequestMapping(value="/countries/region/{countryRegion}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="countryRegion", value="countryRegion", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getCountriesByCountryRegion", nickname="getCountriesByCountryRegion")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Countries.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Countries> getCountriesByCountryRegion(@PathVariable String countryRegion){
		return repository.getCountriesByCountryRegion(countryRegion);
	}

}
