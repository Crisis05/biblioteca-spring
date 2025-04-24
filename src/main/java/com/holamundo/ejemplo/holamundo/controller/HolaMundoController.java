package com.holamundo.ejemplo.holamundo.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Gigoló";
    }

    @RequestMapping(value = "/saludo", method = RequestMethod.GET)
    public String saludo() {
        return "Hola Mundo";
    }
    @RequestMapping(value = "/saludo", method = RequestMethod.POST)
    public String enviarSaludo(@RequestBody String saludo) {
        return "Recibido: " + saludo;
        }

    @RequestMapping(value = "/pedro", method = RequestMethod.GET)
    public String pedro() {
        return "Hola a todos, mi nombre es Pedro.";
    }

    @GetMapping("/saludo/{nombre}")
    public String saludo(@PathVariable String nombre) {
        return "¡Hola a todos, mi nombre es " + nombre + "!";
    }

    @GetMapping("/sumar/{a}/{b}")
    public int sumar(@PathVariable int a, @PathVariable int b) {
        return a+b;
    }

    @GetMapping("/restar/{a}/{b}")
    public int restar(@PathVariable int a, @PathVariable int b) {
        return a-b;
    }

    @GetMapping("/multiplicar/{a}/{b}")
    public int multiplicar(@PathVariable int a, @PathVariable int b) {
    return a*b;
    }

    @GetMapping("/dividir/{a}/{b}")
    public String dividir(@PathVariable int a, @PathVariable int b) {
        if (b==0) {
            return "Error, no se puede dividir entre 0";
        }else {return String.valueOf(a/b);}
    }

    @GetMapping("/dividir2/{a}/{b}")
    public int dividir2(@PathVariable int a, @PathVariable int b) {
        if (b==0) {
            return 0;
        }else {return (a/b);}
    }
}
