package com.flores.v1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value = "/productos")
public class ProductosController {

    @GetMapping("/listar")
    public String listarproductos() {
        return "/productos/productos";
    }
    
    
}
