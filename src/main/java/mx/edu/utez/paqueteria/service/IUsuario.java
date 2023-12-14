package mx.edu.utez.paqueteria.service;


import mx.edu.utez.paqueteria.model.dto.DtoUsuario;
import mx.edu.utez.paqueteria.model.entity.BeanUsuario;

import java.util.List;

public interface IUsuario {
    BeanUsuario save(DtoUsuario dtoUsuario);
    BeanUsuario findById(Integer id);
    List<BeanUsuario> findAll();
    void delete(BeanUsuario usuario);
}
