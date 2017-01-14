package org.sales.controller;

import java.util.Date;
import java.util.List;

import org.sales.entity.Times;
import org.sales.repository.TimesRepository;
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
public class TimesController {
	
	@Autowired
	private TimesRepository repository;
	
	@RequestMapping(value="/times", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllTimes", nickname="getAllTimes")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Times.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Times> getAllTimes(){
		return repository.getAllTimes();
	}
	
	@RequestMapping(value="/times/{timeID}", method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getEmployeesByID", nickname="getEmployeesByID")
	@ApiImplicitParams({@ApiImplicitParam(name="employeesID", value="Employees ID", required=true, 
		dataType="Integer", paramType="path")})
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Times.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public Times getTimesByID(@PathVariable Date timeID){
		return repository.getTimesByID(timeID);
	}

}
