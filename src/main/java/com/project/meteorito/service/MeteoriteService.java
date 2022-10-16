package com.project.meteorito.service;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.project.meteorito.model.Meteorite;

@Service
public class MeteoriteService {

	@Autowired
//	private ModelMapper mapperToDto;
	private ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

	public String listAllMetorite() throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/Meteorite_Landings.csv"));
		CsvToBean<Meteorite> listAll = new CsvToBeanBuilder<Meteorite>(reader)
				.withType(Meteorite.class)
				.build();

		List<Meteorite> database = new ArrayList<>(listAll.parse())
				.stream()
				.collect(Collectors.toList());
		
		String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(database);
		System.out.println(jsonInString);
		
		return jsonInString;	
	}
	
	
	public List<Meteorite> listId(Long id) throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/Meteorite_Landings.csv"));
 		
		CsvToBean<Meteorite> meteorito = new CsvToBeanBuilder(reader)
				.withType(Meteorite.class)
				.build();
		
		List<Meteorite> meteoritBundle = meteorito.parse();
		
		for(Meteorite bundle : meteoritBundle) {
			System.out.println(bundle.getId());
		}
		return null;
	}
}
