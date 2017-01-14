package org.sales.controller;

import java.util.List;

import org.sales.entity.Channels;
import org.sales.entity.Customers;
import org.sales.repository.ChannelsRepository;
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
public class ChannelsController {
	@Autowired
	private ChannelsRepository repository;

	@RequestMapping(value="/channels", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllChannels", nickname="getAllChannels")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Channels.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Channels> getAllChannels(){
		return repository.getAllChannels();
	}
	
	@RequestMapping(value="/channels/{channelID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="channelID", value="channelID", required=true, dataType="Integer", 
		paramType="path")})
	@ApiOperation(value="getChannelsByID", nickname="getChannelsByID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Channels.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public Channels getChannelsByID(@PathVariable Integer channelID){
		return repository.getChannelsByID(channelID);
	}

}
