package mx.edu.utez.paqueteria.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DtoUsuario {

    private Integer idUsuario;
    private String email;
    private String nombre;

}
