package com.xworkz.internal;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/movie",loadOnStartup = 1)
public class Movie extends GenericServlet {
    public Movie(){
        System.out.println("Constructor Movie");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Sevice is Running");
        String movie1 = servletRequest.getParameter("name");
        System.out.println("Movie Name: "+movie1);
        String movie2 = servletRequest.getParameter("hero");
        System.out.println("Movie Hero: "+movie2);
        String movie3 = servletRequest.getParameter("location");
        System.out.println("Movie Shotting Location: "+movie3);
        int movie4 = Integer.parseInt(servletRequest.getParameter("rating"));
        System.out.println("Movie Rating: "+movie4);
        System.out.println("End...");
    }
}
