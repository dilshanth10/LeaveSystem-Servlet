package com.leavesystem.controller;

import com.leavesystem.data.LeaveTypeDao;
import com.leavesystem.model.LeaveType;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ViewLeaveTypeController", urlPatterns={"/ViewLeaveTypeController"})
public class ViewLeaveTypeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        LeaveTypeDao leaveTypeDao = new LeaveTypeDao();
        List<LeaveType> leaveTypeList = new ArrayList<>();
        
        leaveTypeList = leaveTypeDao.viewLeaveType();
        request.setAttribute("leaveTypeListAttribute", leaveTypeList);
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
