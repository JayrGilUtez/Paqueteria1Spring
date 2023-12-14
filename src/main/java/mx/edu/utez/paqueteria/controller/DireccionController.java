package mx.edu.utez.paqueteria.controller;


import lombok.RequiredArgsConstructor;

import mx.edu.utez.paqueteria.model.dto.DtoDireccion;
import mx.edu.utez.paqueteria.model.entity.BeanDireccion;
import mx.edu.utez.paqueteria.service.Impl.DireccionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/direccion")
@RequiredArgsConstructor
public class DireccionController {
    @Autowired
    private DireccionImpl direccionService;

    @GetMapping("/")
    public List<BeanDireccion> findAll(){
        return direccionService.findAll();
    }



    @GetMapping("/{id}")
    public BeanDireccion findById(@PathVariable Integer id){
        return direccionService.findById(id);

    }



    @PostMapping("/")
    public DtoDireccion create(@RequestBody DtoDireccion dtoDireccion) {
        BeanDireccion direccion = direccionService.save(dtoDireccion);
        return DtoDireccion.builder()
                .idDireccion(dtoDireccion.getIdDireccion())
                .direccion(direccion.getDireccion())
                .build();
    }

    @PutMapping
    public DtoDireccion update(@RequestBody DtoDireccion dtoDireccion) {
        BeanDireccion direccion = direccionService.save(dtoDireccion);
        return DtoDireccion.builder()
                .idDireccion(dtoDireccion.getIdDireccion())
                .direccion(direccion.getDireccion())
                .build();
    }

   // @DeleteMapping("/")

}
