package net.hb.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher; //7-17-화요일 추가
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.hb.common.GuestDAO;
import net.hb.common.GuestDTO;

@WebServlet("/delete.do")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doUser(request, response); //꼭꼭꼭기술
	}//end

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  doUser(request, response); //꼭꼭꼭기술
	}//end

	public void doUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 response.setContentType("text/html;charset=UTF-8");	
	 	 
	 GuestDAO dao=new GuestDAO( );
	 
	 String data=request.getParameter("idx");
	 System.out.println("Delete컨트롤 넘어온 idx=" + data);
	 
	 dao.dbDelete(data); //삭제후 포워딩 없어요
	 response.sendRedirect("list.do");
	 
	}//end
	
}//DeleteController class END
















