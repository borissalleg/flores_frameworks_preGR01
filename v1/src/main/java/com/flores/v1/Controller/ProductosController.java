package com.flores.v1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.flores.v1.Model.ProductModel;
import com.flores.v1.Services.ProductService;


@Controller
@RequestMapping(value = "/productos")
public class ProductosController {

    @Autowired
    ProductService productService;

 @GetMapping("/nuevo-arreglo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("arregloFloral", new ProductModel());
        return "/productos/registrar-productos"; // Nombre del archivo HTML
    }

    @PostMapping("/guardar-arreglo-floral")
    public String guardarArreglo(@ModelAttribute ProductModel arreglo, 
                                BindingResult result,
                                RedirectAttributes redirectAttrs) {
        if (result.hasErrors()) {
            return "/productos/registrar-productos"; // Retorna al formulario si hay errores
        }
        productService.saveProduct(arreglo);
        redirectAttrs.addFlashAttribute("mensaje", "Arreglo guardado con éxito");
        return "redirect:/productos/listarproductos";
    }
    @GetMapping("/listarproductos")
    public String listarproductos(Model model) {
        model.addAttribute("productos",productService.listAllProduct());
        return "/productos/listar-productos";
    }
    @GetMapping("/listar")
    public String listproductos(Model model) {
        model.addAttribute("productos",productService.listAllProduct());
        return "/productos/productos";
    }
    
    
}
