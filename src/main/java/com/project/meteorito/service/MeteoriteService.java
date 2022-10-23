package com.project.meteorito.service;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.project.meteorito.handler.ExceptionsErroImpact;
import com.project.meteorito.model.Meteorite;

@Service
public class MeteoriteService {

	
	public List<Meteorite> listAllMetorite()   {
		Reader reader;
		try {
			reader = Files.newBufferedReader(Paths.get("src/main/resources/Meteorite_Landings.csv"));
			
			CsvToBean<Meteorite> listAll = new CsvToBeanBuilder<Meteorite>(reader)
					.withType(Meteorite.class)
					.build();
			List<Meteorite> database = new ArrayList<>(listAll.parse());
			return database;
		} catch (IOException e) {
 			throw new ExceptionsErroImpact("Erro ao processar informação.");
		}
			
	}
	
  	public Meteorite listId(int id)   {
		Reader reader;
		try {
			reader = Files.newBufferedReader(Paths.get("src/main/resources/Meteorite_Landings.csv"));
			CsvToBean<Meteorite> meteorito = new CsvToBeanBuilder<Meteorite>(reader)
					.withType(Meteorite.class)
					.build();
			List<Meteorite> meteoritBundle = meteorito.parse();
	 		return meteoritBundle.get(id);
		} catch (IOException e) {
 		  throw new ExceptionsErroImpact("ID "+id+" não encontrado po"
 		  		+ " favor tente novamente.");
		}
		
	}
}
