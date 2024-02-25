package org.juandavid.pooclasesabstractas.form;

import org.juandavid.pooclasesabstractas.form.elementos.*;

import org.juandavid.pooclasesabstractas.form.elementos.select.Opcion;
import org.juandavid.pooclasesabstractas.form.validador.*;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());


        InputForm password = new InputForm("clave","password");
        password.addValidador(new RequeridoValidador())
        .addValidador(new LargoValidador(6,12));



        InputForm email = new InputForm("email","email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad","number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5,9);

        SelectForm lenguaje = new SelectForm("Lenguaje");
        lenguaje.addValidador(new NoNuloValidador());



        lenguaje.addOpcion(new Opcion("01","Java").setSelected());
        lenguaje.addOpcion(new Opcion("02","Python"))
        .addOpcion(new Opcion("03","JavaScrypt"))
        .addOpcion(new Opcion("04","Ruby"))
        .addOpcion(new Opcion("05","PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {

            @Override
            public String dibujarHtml() {
                return "<input disabled name='" + this.nombre +
                        "' value=\"" + this.valor + "\">";
            }
        };

        saludar.setValor("Hola que tal este campo esta deshabilitado..");
        username.setValor("juanes steven");
        password.setValor("244543y5");
        email.setValor("jhon.dias@yahooo.com");
        edad.setValor("33");
        experiencia.setValor("==Más de 11 años de experiencia==");

        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        elementos.add(saludar);

        /*for(ElementoForm e:elementos ){

            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }*/

        elementos.forEach(e ->{
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach(System.out::println); //Método referenciado en una expresion lambda

            }
        });

        /*elementos.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach(err ->System.out.println(e.getNombre()+ ": "+ err));
            }
        });*/



    }
}
