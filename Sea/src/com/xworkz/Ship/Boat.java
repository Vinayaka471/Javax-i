package com.xworkz.Ship;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/Boat",loadOnStartup = 1)
public class Boat extends GenericServlet {

    public Boat(){
        System.out.println("Sea Servlet create by TomCat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service Running");
    }
}
