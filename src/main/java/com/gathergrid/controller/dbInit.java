package com.gathergrid.controller;

import com.gathergrid.service.EventService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "init-db", value = "/init", loadOnStartup = 1)
public class dbInit extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        EventService eventService = new EventService();
    }
}

