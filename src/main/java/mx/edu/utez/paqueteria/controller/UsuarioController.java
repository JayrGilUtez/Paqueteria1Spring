package mx.edu.utez.paqueteria.controller;

import lombok.RequiredArgsConstructor;
import mx.edu.utez.paqueteria.model.dto.DtoUsuario;
import mx.edu.utez.paqueteria.model.entity.BeanUsuario;
import mx.edu.utez.paqueteria.service.Impl.UsuarioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    @Autowired
    private UsuarioImpl usuarioService;


    @GetMapping("/{id}")
    public BeanUsuario findById(@PathVariable Integer id){
        return usuarioService.findById(id);
    }



    @GetMapping("/")
    public List<BeanUsuario> findAll(){
        return usuarioService.findAll();
    }

    @PostMapping("/")
    public DtoUsuario create(@RequestBody DtoUsuario dtoUsuario){
        BeanUsuario usuario = usuarioService.save(dtoUsuario);
        return DtoUsuario.builder()
                .idUsuario(dtoUsuario.getIdUsuario())
                .nombre(dtoUsuario.getNombre())
                .email(dtoUsuario.getEmail())
                .build();
    }


   @PutMapping("/")
   public DtoUsuario update(@RequestBody DtoUsuario dtoUsuario){
       BeanUsuario usuario = usuarioService.save(dtoUsuario);
       return DtoUsuario.builder()
               .idUsuario(dtoUsuario.getIdUsuario())
               .nombre(dtoUsuario.getNombre())
               .email(dtoUsuario.getEmail())
               .build();
   }

   @DeleteMapping("/")
   public void delete(@PathVariable Integer id){
       BeanUsuario usuario = usuarioService.findById(id);
       usuarioService.delete(usuario);
   }
    //
}
