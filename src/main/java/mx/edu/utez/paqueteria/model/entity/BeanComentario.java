package mx.edu.utez.paqueteria.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Table(name = "comentarios")
public class BeanComentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario")
    private Integer idComentario;

    @Column(name = "comentario_texto")
    private String comentarioTexto;

    //@Column(name = "fk_idUsuario")
    //private Integer fkIdUsuario;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_idUsuario")
    private BeanUsuario usuario;









}
