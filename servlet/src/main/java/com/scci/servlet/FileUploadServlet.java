package com.scci.servlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(name="FileUploadServlet", urlPatterns = {"/upload"})
@MultipartConfig(
		fileSizeThreshold=1024*1024,
		maxFileSize = 1024 * 1024 * 5,
		maxRequestSize = 1024 * 1024 * 5 * 5)
public class FileUploadServlet extends HttpServlet{
	public static String UPLOAD_DIRECTORY = "upload";
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// /user/data/upload
		// deploy된 디렉토리/upload
		String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY;
		File uploadDir = new File(uploadPath);
		if ( !uploadDir.exists() ) {
			uploadDir.mkdir();
		}
		try {
			Collection<Part> parts = request.getParts();
			List<String> fileNames = new ArrayList<String>();
			String fileName = "";
			for(Part part : parts) {
				fileName = getFileName(part);
				fileNames.add(fileName);
				part.write(uploadPath + File.separator + fileName);
			}
			request.setAttribute("message", "file upload completes successfully");
			request.setAttribute("files", fileNames);
		} catch (IllegalStateException | IOException | ServletException e) {
			request.setAttribute("message", e.getMessage());
		}
		RequestDispatcher rd = request.getRequestDispatcher("/views/result.jsp");
		rd.forward(request, response);
	}
	
    private String getFileName(Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename"))
                return content.substring(content.indexOf("=") + 2, content.length() - 1);
        }
        return "default.file";
    }
}
