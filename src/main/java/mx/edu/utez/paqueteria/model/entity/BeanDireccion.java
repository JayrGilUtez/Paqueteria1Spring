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
@Table(name = "direcciones")
public class BeanDireccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion")
    private Integer idDireccion;

    @Column(name = "direccion")
    private String direccion;

    @OneToOne(mappedBy = "direccion", cascade = CascadeType.ALL , optional = false)
    private BeanUsuario usuario;






}
