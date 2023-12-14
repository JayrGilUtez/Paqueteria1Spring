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
@Table(name = "detalles_pedido")
public class BeanDetallesPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detallesPedido")
    private Integer idDetallesPedido;

    @Column(name = "cantidad")
    private Integer cantidad;

    //@Column(name = "fk_idPedidio")
    //private Integer fkIdPedido

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_idPedidio")
    private BeanPedido pedido;




}
