package pe.edu.cibertec.demo_azure_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.demo_azure_01.viewmodel.VehiculoModel;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehiculoController {
    @GetMapping("/")
    public String obtenerVehiculos(Model model){
        List<VehiculoModel> listaVehiculos = new ArrayList<VehiculoModel>();
        listaVehiculos.add(new VehiculoModel(1,"Toyota", "Corolla", "Rojo", "ABC123"));
        listaVehiculos.add(new VehiculoModel(2,"Hyundai", "Santa Fe", "Verde", "AFC124"));
        listaVehiculos.add(new VehiculoModel(3,"Ford Mustang ", "Ford", "Blanco", "SBC125"));
        listaVehiculos.add(new VehiculoModel(4,"BMW X5", "BMW", "Negro", "ABV126"));

        model.addAttribute("listaVehiculos", listaVehiculos);
        return "vehiculo";
    }
}
