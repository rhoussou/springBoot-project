package inventory.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileServiceImpl implements UploadFileService  {
	
	
	@Override
	public String SingleFileUpload(MultipartFile uploadfile, String UPLOADED_FOLDER ) throws IOException {
		saveUploadedFiles(Arrays.asList(uploadfile), UPLOADED_FOLDER );
		return null;
	}
	

	private void saveUploadedFiles(List<MultipartFile> files, String UPLOADED_FOLDER  ) throws IOException {

        for (MultipartFile file : files) {

            if (file.isEmpty()) {
                continue; //next pls
            }

            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);

        }

    }
	
	
	

}
