package com.exis.GestionPaie.service;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.exis.GestionPaie.entities.UploadResponse;


public interface IStorageService {

	void init();

	Stream<Path> loadAll();

	Path load(String filename);

	Resource loadAsResource(String filename);

	void deleteAll();

	List<UploadResponse> store(MultipartFile file, String DESCRIPTION) throws Exception;

}