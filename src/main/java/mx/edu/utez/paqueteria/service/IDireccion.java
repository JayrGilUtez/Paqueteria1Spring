package mx.edu.utez.paqueteria.service;


import mx.edu.utez.paqueteria.model.dto.DtoDireccion;
import mx.edu.utez.paqueteria.model.entity.BeanDireccion;

import java.util.List;

public interface IDireccion {
    BeanDireccion save(DtoDireccion dtoDireccion);
    BeanDireccion findById(Integer id);
    List<BeanDireccion> findAll();
    void delete(BeanDireccion direccion);






}
