<%@page import="com.mycompany.noticias.model.Noticia"%>
<%@page import="com.mycompany.noticias.controller.NoticiaDAO"%>
<%@page import="com.mycompany.noticias.model.Registro"%>
<%
    try {
        Registro usuario = (Registro) session.getAttribute("usuario");
        if (usuario == null) {
            response.sendRedirect("http://localhost:8080/Noticias");
        }

    } catch (Exception e) {
    }
    NoticiaDAO noticiaDAO = new NoticiaDAO();
    String publicar = request.getParameter("publicar");
    String mostrar = request.getParameter("mostrarNoticias");

    if (publicar == null) {

    } else {
        try {
            Noticia noti = new Noticia(request.getParameter("noticia"), Integer.parseInt(request.getParameter("personal")));

            if (noticiaDAO.insert(noti)) {
                System.out.println("se ejecuto corectamente");
            }

        } catch (Exception e) {
        }

    }

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="comentarios.css">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

        <title>Nocicias</title>
    </head>
    <body>
        <div class="jumbotron text-center">
            <form>
                <div class="form-group">
                    <label for=""></label> 
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <div class="input-group-text">
                                <i class="fa fa-address-card"></i>
                            </div>
                        </div> 
                        <input  name="personal" placeholder="Ingrese su id de personal" type="number" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="noticia"></label> 
                    <input  name="noticia" placeholder="Escribe qui tu nota..." type="text" class="form-control">
                </div> 
                <div class="form-group">
                    <button name="publicar"  class="btn btn-primary">publicar</button>
                </div>

            </form>
        </div>
        <div class="form-group">
            <button name="mostrarNoticias"  class="btn btn-primary">ver noticias</button>
        </div>

        <%     
            
          
                out.println("<div class=\"container\">");
            out.print("<div>");
            out.print("<div>");

            out.print("<h5>Personal N° 1</h5>");
            out.print("<p>" + "Nota completa de la noticia" + "</p>");
            out.print("<button class=\"btn btn-primary\" name=\"comentar\"> Comentar</button>");
            out.print("</div>");
            out.print("</div>");
            out.print("</div>");
                
            

        %>

    </body>
</html>
