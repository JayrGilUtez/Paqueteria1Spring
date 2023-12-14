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
@Table(name = "pedidos")
public class BeanPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer idPedido;

    //@Column(name = "fk_idUsuario")
    //private Integer fk_IdUsuario;

    @Column(name = "fecha_pedido")
    private String fechaPedido;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pedido", cascade = CascadeType.ALL)
    private Set<BeanDetallesPedido> detallesDePedido;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_idUsuario")
    private BeanUsuario usuario;

    @ManyToMany(mappedBy = "pedidos")
    private Set<BeanProducto> productos;






}
