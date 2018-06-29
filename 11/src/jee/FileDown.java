package jee;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDown extends ActionSupport {
	private static final long serialVersionUID = 1L;
	String path;
	String fileName;
	String contentType;
	String cnFileName;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
		System.out.println(this.path);
	}

	public InputStream getTxtStream() {
		return new ByteArrayInputStream("helloworld".getBytes());
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCnFileName() {
		return cnFileName;
	}

	public void setCnFileName(String cnFileName) {
		this.cnFileName = cnFileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public InputStream getFileStream() {
		return ServletActionContext.getServletContext().getResourceAsStream(path);
	}

	@Override
	public String execute() throws Exception {
		this.cnFileName = new String(fileName.getBytes(), "iso-8859-1");
		return SUCCESS;
	}
}