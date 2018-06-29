package jee;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class Copy {
	public void copyFiles(File[] uploads, String[] uploadsFileName) throws IOException {
		String realpath = ServletActionContext.getServletContext().getRealPath("/file");
		File file = new File(realpath);
		if (!file.exists())

		{
			file.mkdirs();
		}
		for (

		int i = 0; i < uploads.length; i++)

		{
			File uploadImage = uploads[i];
			FileUtils.copyFile(uploadImage, new File(file, uploadsFileName[i]));
		}
	}

}
