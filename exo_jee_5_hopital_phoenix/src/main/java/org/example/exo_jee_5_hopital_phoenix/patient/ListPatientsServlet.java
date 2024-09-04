package org.example.exo_jee_5_hopital_phoenix.patient;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/list-patients")
public class ListPatientsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchQuery = request.getParameter("search");
        List<String> patients = List.of("Patient A", "Patient B", "Patient C");
        request.setAttribute("patients", patients);
        request.getRequestDispatcher("/WEB-INF/jsp/list-patients.jsp").forward(request, response);
    }
}
