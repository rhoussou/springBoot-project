package inventory.services;

import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;


public interface UploadFileService {
	
	public String SingleFileUpload(MultipartFile uploadfile, String UPLOADED_FOLDER ) throws IOException;

}
