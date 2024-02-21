package com.nelson.webtechassign3;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Admission extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phoneNumber = request.getParameter("phone");

            // You can retrieve additional parameters as needed

            // Set attributes to pass to the preview page
            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("phone", phoneNumber);

            // Forward the request to the preview page
            RequestDispatcher dispatcher = request.getRequestDispatcher("/preview.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Error Occurred");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/admissionPage.jsp");
            dispatcher.forward(request, response);
        }
    }
}
