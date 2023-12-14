package mx.edu.utez.paqueteria.service.Impl;

import lombok.RequiredArgsConstructor;
import mx.edu.utez.paqueteria.model.dao.DaoUsuario;
import mx.edu.utez.paqueteria.model.dto.DtoUsuario;
import mx.edu.utez.paqueteria.model.entity.BeanUsuario;
import mx.edu.utez.paqueteria.service.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UsuarioImpl implements IUsuario {

    @Autowired
    private DaoUsuario daoUsuario;

    @Override
    @Transactional
    public BeanUsuario save(DtoUsuario dtoUsuario) {
        BeanUsuario usuario = BeanUsuario.builder()
                .idUsuario(dtoUsuario.getIdUsuario())
                .nombre(dtoUsuario.getNombre())
                .email(dtoUsuario.getEmail())
                .build();
        return daoUsuario.save(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public BeanUsuario findById(Integer id) {
        return daoUsuario.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BeanUsuario> findAll() {
        return (List<BeanUsuario>) daoUsuario.findAll();
    }

    @Override
    @Transactional
    public void delete(BeanUsuario beanUsuario) {
        daoUsuario.delete(beanUsuario);

    }
}
