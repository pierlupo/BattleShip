package com.example.bataillenavale.controller;

import com.example.bataillenavale.service.GrilleService;
import com.example.bataillenavale.util.HibernateSession;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "grille", value = "")
public class GrilleServlet extends HttpServlet {

    private GrilleService grilleService;
    public void init() { grilleService = new GrilleService(HibernateSession.getSessionFactory());

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String messageError = null;
    }


    public void doGet (){

    }

}
