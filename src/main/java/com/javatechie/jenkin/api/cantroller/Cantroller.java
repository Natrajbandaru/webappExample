package com.javatechie.jenkin.api.cantroller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.jenkin.api.DTO.Dtoclass;

@RestController
public class Cantroller {
	
	@GetMapping("webappExample")
	public String app() {
		return "welcome to KK tutorials";
	}
	
	@PostMapping(path = "post",produces = "application/json")
	public String post() {
		
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("status","It is in post method");
		return jsonobject.toString();
	}
	
	@PostMapping(path = "postwithbody",produces = "application/json")
	public String post1(@RequestBody Dtoclass dtoclass) {
		
		JSONObject jsonobject=new JSONObject();
		
		jsonobject.put("name", dtoclass.getName());
		jsonobject.put("lastname", dtoclass.getLastname());
		jsonobject.put("status","It is in post method");
		
		return jsonobject.toString();
	}

	

}
