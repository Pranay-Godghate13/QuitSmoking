package com.quitsmoking.quitsmoking;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
    
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
        String name=req.getParameter("name");
        int age=Integer.parseInt(req.getParameter("age"));
        PrintWriter out=res.getWriter();
        out.println(name+" : "+age);
    }

}
