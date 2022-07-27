<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.noticias.model.Registro"%>
<%@page import="com.mycompany.noticias.controller.RegistroDAO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%

    RegistroDAO registro = new RegistroDAO();

    String act = request.getParameter("btnIniciarSesion");
    if (act == null) {
    } else {
        try {
            Registro usuario = registro.find(request.getParameter("usuario"), request.getParameter("contrasenia"));
            if (usuario != null) {
                if (usuario.getTipo().equals("interno")) {
                            System.out.println(usuario.getTipo()+ " a");

                    session.setAttribute("usuario", usuario);
                    response.sendRedirect("http://localhost:8080/Noticias/internos.jsp");
                } else {
                            System.out.println(usuario.getTipo()+" b");

                    session.setAttribute("usuario", usuario);
                     response.sendRedirect("http://localhost:8080/Noticias/publico.jsp");
                }
               
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
        <link rel="stylesheet" href="stylecss.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

        <title>Noticias</title>
    </head>

    <body>
        <div class="login-base">
            <div class="card card-container">
                <img id="profile-img" class="profile-img-card" src="https://img.icons8.com/external-bearicons-outline-color-bearicons/64/000000/external-login-call-to-action-bearicons-outline-color-bearicons.png" />
                <p id="profile-name" class="profile-name-card"></p>
                <form class="form-signin">
                    <input type="text" name= "usuario" class="form-control" placeholder="Usuario" required autofocus>
                    <input type="password" name="contrasenia" class="form-control" placeholder="Contraseña" required>
                    <button class="btn btn-primary btn-signin" type="submit"   name="btnIniciarSesion">Iniciar Sesión</button>
                </form>
            </div>
        </div>
    </body>

</html>
