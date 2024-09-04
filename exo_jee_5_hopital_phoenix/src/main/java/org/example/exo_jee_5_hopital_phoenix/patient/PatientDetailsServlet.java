package org.example.exo_jee_5_hopital_phoenix.patient;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/patient-details")
public class PatientDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String patientId = request.getParameter("id");
        request.setAttribute("patient", "Détails du patient");
        request.getRequestDispatcher("/WEB-INF/jsp/patient-details.jsp").forward(request, response);
    }
}
