package org.sales.controller;

import java.util.List;

import org.sales.entity.Promotions;
import org.sales.repository.PromotionsRepository;
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
public class PromotionsController {
	@Autowired
	private PromotionsRepository repository;

	@RequestMapping(value="/promotions", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllPromotions", nickname="getAllPromotions")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Promotions.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Promotions> getAllPromotions(){
		return repository.getAllPromotions();
	}
	
	@RequestMapping(value="/promotions/{promoID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="promoID", value="promoID", required=true, dataType="Long", 
		paramType="path")})
	@ApiOperation(value="getPromotionsByID", nickname="getPromotionsByID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Promotions.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public Promotions getPromotionsByID(@PathVariable Long promoID){
		return repository.getPromotionsByID(promoID);
	}
	
	@RequestMapping(value="/promotions/name/{promoName}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="promoName", value="promoName", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getPromotionsByName", nickname="getPromotionsByName")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Promotions.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public Promotions getPromotionsByName(@PathVariable String promoName){
		return repository.getPromotionsByName(promoName);
	}
	
	@RequestMapping(value="/promotions/sub-category/{promoSubCategory}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="promoSubCategory", value="promoSubCategory", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getPromotionsBySubCategory", nickname="getPromotionsBySubCategory")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Promotions.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Promotions> getPromotionsBySubCategory(@PathVariable String promoSubCategory){
		return repository.getPromotionsBySubCategory(promoSubCategory);
	}
	
	@RequestMapping(value="/promotions/category/{promoCategory}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="promoCategory", value="promoCategory", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getPromotionsByCategory", nickname="getPromotionsByCategory")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Promotions.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Promotions> getPromotionsByCategory(@PathVariable String promoCategory){
		return repository.getPromotionsByCategory(promoCategory);
	}


}
