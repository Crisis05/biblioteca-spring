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
}
