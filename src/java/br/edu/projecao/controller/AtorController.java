package br.edu.projecao.controller;

import br.edu.projecao.model.Ator;
import br.edu.projecao.model.AtorDao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Controla todas as comunicações entre a parte visual e a parte negocial para Atores
 * @author Hudsonn
 */
public class AtorController extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");
        String nome = request.getParameter("nome");
        Integer id = Integer.parseInt(request.getParameter("id"));
        String destino = "erro-ator.jsp";
        
        List<Ator> atores = new ArrayList<>();
        AtorDao dao = new AtorDao();
        Ator ator = null;
        
        switch (acao){
            case "ins": //Clicou no botao "Salvar Novo"...
                break;
            case "lst": //Listar todos os registros...
                atores = dao.listaTodos();
                request.setAttribute("ATTR-ATORES", atores);
                destino = "lista-ator.jsp";
                break;
            case "ped": //Clicou em preparar...
                break;
            case "edt": //Clicou em editar...
                break;
            case "del": //Clicou em excluir...
                break;
        }
        RequestDispatcher despacha =
                getServletContext().getRequestDispatcher(destino);
        despacha.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
