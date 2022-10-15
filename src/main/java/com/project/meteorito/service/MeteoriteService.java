package com.project.meteorito.service;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.project.meteorito.dto.MeteoriteDTO;
import com.project.meteorito.model.Meteorite;

@Service
public class MeteoriteService {

	@Autowired
	private ModelMapper mapperToDto;

	public ResponseEntity<MeteoriteDTO> listAllMetorite() throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/Meteorite_Landings.csv"));
		CsvToBean<Meteorite> listAll = new CsvToBeanBuilder<Meteorite>(reader).withType(Meteorite.class).build();

		List<Meteorite> database = listAll.parse();

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		mapper.writeValue(System.out, database);

		ResponseEntity<MeteoriteDTO> list = ResponseEntity.ok(mapperToDto.map(mapper, MeteoriteDTO.class));

		return list;
	}

}
