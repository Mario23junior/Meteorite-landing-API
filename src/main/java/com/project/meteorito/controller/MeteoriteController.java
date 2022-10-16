package com.project.meteorito.controller;

 import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.meteorito.service.MeteoriteService;

@RestController
@RequestMapping("/api/v1/meteorite/listall/")
public class MeteoriteController {

	private MeteoriteService service;

	public MeteoriteController(MeteoriteService service) {
 		this.service = service;
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  	private String listAll() throws IOException {
		 return service.listAllMetorite();
	}
}
