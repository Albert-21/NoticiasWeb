<%@page import="com.mycompany.noticias.model.Registro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try {
        Registro usuario = (Registro) session.getAttribute("usuario");
        if (usuario == null) {
            response.sendRedirect("http://localhost:8080/Noticias");
        }

    } catch (Exception e) {
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <title>Noticias</title>
    </head>
    <body>
        <div class="card">
            <h5 class="card-header">Featured</h5>
            <div class="card-body">
                <h5 class="card-title">Special title treatment</h5>
                <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                <button href="#" class="btn btn-primary">Comentar</button>
            </div>
        </div>
    </body>
</html>
