/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tatooine.controle;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ThigoYure
 */
@WebFilter(urlPatterns = {""})
public class FiltroSessao implements Filter {

    //private static final String[] URLS_TO_EXCLUDE = {".css", ".js", ".png", ".jpg", ".gif", "index.jsp", "cadastro.jsp", ".html"};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = ((HttpServletRequest) request);
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        /*String uri = httpRequest.getRequestURI();

        if (!isURIToExclusao(uri, httpRequest)) {
            HttpSession session = httpRequest.getSession();
            System.out.println(session.getAttribute("usuario"));
            if (session.getAttribute("usuario") == null) {
                httpResponse.sendRedirect("error2.html");
            } else {
                chain.doFilter(httpRequest, httpResponse);
            }
        } else {
            chain.doFilter(httpRequest, httpResponse);
        }*/
        HttpSession session = httpRequest.getSession();
        if(session.getAttribute("usuario")==null){
            httpResponse.sendRedirect("error2.html");
        }else{
            chain.doFilter(httpRequest, httpResponse);
        }
    }

    @Override
    public void destroy() {
    }

    /*private boolean isURIToExclusao(String uri, HttpServletRequest httpRequest) {
        boolean retorno = false;
        for (String url : URLS_TO_EXCLUDE) {
            if (uri != null && uri.endsWith(url)) {
                retorno = true;
            }

            if (uri != null && uri.endsWith("main")
                    && (httpRequest.getParameter("acao") != null
                    && httpRequest.getParameter("acao").equals("login"))) {
                retorno = true;
            }
        }
        return retorno;
    }*/

}
