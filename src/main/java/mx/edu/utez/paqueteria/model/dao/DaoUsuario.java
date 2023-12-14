package mx.edu.utez.paqueteria.model.dao;

import mx.edu.utez.paqueteria.model.entity.BeanUsuario;
import org.springframework.data.repository.CrudRepository;

public interface DaoUsuario extends CrudRepository<BeanUsuario, Integer> {
}
