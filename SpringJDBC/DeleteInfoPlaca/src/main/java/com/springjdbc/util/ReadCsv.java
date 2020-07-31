package com.springjdbc.util;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import com.opencsv.CSVReader;

@Component
public class ReadCsv {

	@Value("${pathCsv}")
	private String path;
	@Autowired
	ResourceLoader resourceLoader;

	List<String[]> rows;

	public String readCsv() throws Exception {
		Reader reader = Files.newBufferedReader(Paths.get(ClassLoader.getSystemResource(path).toURI()));
		
		return oneByOne(reader).toString();
	}

	public static String oneByOne(Reader reader) throws Exception {
		ArrayList<String> data = new ArrayList<String>();
		CSVReader csvReader = new CSVReader(reader);
		String[] line;
		while ((line = csvReader.readNext()) != null) {
			for (String row : line) {
				data.add(row);
			}
		}
		reader.close();
		csvReader.close();
		return data.stream().map(Object::toString).collect(Collectors.joining(", "));
	}
}
