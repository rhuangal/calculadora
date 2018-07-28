package com.rhuangal.calculadora.api;

import com.rhuangal.calculadora.model.Variables;
import com.rhuangal.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/calculadora")
public class CalculadoraController {

    @Autowired
    CalculadoraService service;

    @PostMapping("/suma")
    public double suma(@RequestBody Variables variables){
        return service.suma(variables.getNum1(), variables.getNum2());
    }

    @PostMapping("/resta")
    public double resta(@RequestBody Variables variables){
        return service.resta(variables.getNum1(), variables.getNum2());
    }

    @PostMapping("/multiplicacion")
    public double multiplicacion(@RequestBody Variables variables){
        return service.multiplicacion(variables.getNum1(), variables.getNum2());
    }

    @PostMapping("/division")
    public double division(@RequestBody Variables variables){
        return service.division(variables.getNum1(), variables.getNum2());
    }

}
