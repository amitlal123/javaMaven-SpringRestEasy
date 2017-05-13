package mavenspringresteasypkg.SpringRestEasyAPI.controller;

import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import mavenspringresteasypkg.SpringRestEasyAPI.service.CardDesignService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Path("/design")
public class CardDesignController {
	
	@Autowired
	private CardDesignService cardDesignSvc;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getDesigns")
	public List<String> getCardDesigns(@QueryParam("type")String type){
		if(type.equals("biz"))
			return cardDesignSvc.getBizCardDesigns();
		else
			return cardDesignSvc.getBizCardDesigns();
	}
}
