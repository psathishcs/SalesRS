package org.sales.controller;

import java.util.List;

import org.sales.entity.Products;
import org.sales.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class ProductsController {
	@Autowired
	private ProductsRepository repository;

	@RequestMapping(value="/products", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllProducts", nickname="getAllProducts")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Products.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Products> getAllProducts(){
		return repository.getAllProducts();
	}
	
	@RequestMapping(value="/products/{prodID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="prodID", value="prodID", required=true, dataType="Long", 
		paramType="path")})
	@ApiOperation(value="getChannelsByID", nickname="getChannelsByID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Products.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public Products getProductsByID(@PathVariable Long prodID){
		return repository.getProductsByID(prodID);
	}
	
	@RequestMapping(value="/products/name/{prodName}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="prodName", value="prodName", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getProductsByName", nickname="getProductsByName")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Products.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public Products getProductsByName(@PathVariable String prodName){
		return repository.getProductsByName(prodName);
	}
	
	@RequestMapping(value="/products/pricerange", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="minPrice", value="minPrice", required=true, dataType="Double", 
		paramType="query"),
		@ApiImplicitParam(name="maxPrice", value="maxPrice", required=true, dataType="Double", 
		paramType="query")})
	@ApiOperation(value="getProductsByPriceRange", nickname="getProductsByPriceRange")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Products.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Products> getProductsByPriceRange(@RequestParam(value="minPrice", defaultValue="0.0")Double minPrice, 
			@RequestParam(value="maxPrice")Double maxPrice ){
		return repository.getProductsByPriceRange(minPrice, maxPrice);
	}
	
	@RequestMapping(value="/products/sub-category/{prodSubCategory}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="prodSubCategory", value="prodSubCategory", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getProductsBySubCategory", nickname="getProductsBySubCategory")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Products.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Products> getProductsBySubCategory(@PathVariable String prodSubCategory){
		return repository.getProductsBySubCategory(prodSubCategory);
	}
	
	@RequestMapping(value="/products/category/{prodCategory}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="prodCategory", value="prodCategory", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getProductsByCategory", nickname="getProductsByCategory")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Products.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Products> getProductsByCategory(@PathVariable String prodCategory){
		return repository.getProductsByCategory(prodCategory);
	}



}
