package jee;

import java.io.File;
import java.io.IOException;

import com.opensymphony.xwork2.ActionSupport;

public class FilesUpload extends ActionSupport {
	private static final long serialVersionUID = 1L;
	File[] uploads;
	String[] uploadsContentType;
	String[] uploadsFileName;

	public String execute() throws IOException {
		Copy cop = new Copy();
		cop.copyFiles(uploads, uploadsFileName);
		return SUCCESS;

	}

	public File[] getUploads() {
		return uploads;
	}

	public void setUploads(File[] uploads) {
		this.uploads = uploads;
	}

	public String[] getUploadsContentType() {
		return uploadsContentType;
	}

	public void setUploadsContentType(String[] uploadsContentType) {
		this.uploadsContentType = uploadsContentType;
	}

	public String[] getUploadsFileName() {
		return uploadsFileName;
	}

	public void setUploadsFileName(String[] uploadsFileName) {
		this.uploadsFileName = uploadsFileName;
	}
}
