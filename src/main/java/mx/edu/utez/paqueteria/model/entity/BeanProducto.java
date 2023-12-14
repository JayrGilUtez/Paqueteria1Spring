package mx.edu.utez.paqueteria.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Table(name = "productos")
public class BeanProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "precio")
    private String precio;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "productos_pedidos",
            joinColumns = @JoinColumn(name = "fk_idProducto"),
            inverseJoinColumns = @JoinColumn(name = "fk_idPedido")
    )
    private Set<BeanPedido> pedidos;







}
