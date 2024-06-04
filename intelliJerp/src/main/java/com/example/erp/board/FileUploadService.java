package com.example.erp.board;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.erp.dto.BoardFileDTO;

@Service
public class FileUploadService {
	@Value("${file.dir}")
	private String uploadpath;

	public String getUploadpath(String filename) {
		return uploadpath + filename;

	}

	public List<BoardFileDTO> uploadFiles(List<MultipartFile> files) throws IllegalStateException, IOException {
		List<BoardFileDTO> filetolist = new ArrayList<BoardFileDTO>();
		
		for(MultipartFile multipartFile: files) {
			if(!multipartFile.isEmpty()) {
				String storeFilename = uploadFile(multipartFile);
				
				filetolist.add(new BoardFileDTO(UUID.randomUUID().toString(), null, multipartFile.getOriginalFilename(), storeFilename));
			}
		}
		
		return filetolist;
	}
	
	public String uploadFile(MultipartFile file) throws IllegalStateException, IOException {
	    String storeFilename = "";
	    
		if(!file.isEmpty()) {
			String originalfilename = file.getOriginalFilename();
			storeFilename = createStoreFilename(originalfilename);
			
			System.out.println(originalfilename + "/" + storeFilename);
			
			file.transferTo(new File(getUploadpath(storeFilename)));
		}
		
		return storeFilename;
	}
	
	private String createStoreFilename(String originalFilename) {
		int position = originalFilename.lastIndexOf(".");
		String ext = originalFilename.substring(position + 1);
		String uuid = UUID.randomUUID().toString();
		
		return uuid + "." + ext;
	}
}