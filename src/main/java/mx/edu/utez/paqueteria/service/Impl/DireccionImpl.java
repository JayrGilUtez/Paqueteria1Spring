package mx.edu.utez.paqueteria.service.Impl;

import lombok.RequiredArgsConstructor;
import mx.edu.utez.paqueteria.model.dao.DaoDireccion;
import mx.edu.utez.paqueteria.model.dto.DtoDireccion;
import mx.edu.utez.paqueteria.model.entity.BeanDireccion;
import mx.edu.utez.paqueteria.service.IDireccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class DireccionImpl implements IDireccion {
@Autowired
private DaoDireccion daoDireccion;

    @Override
    @Transactional
    public BeanDireccion save(DtoDireccion dtoDireccion) {
        BeanDireccion direccion = BeanDireccion.builder()
                .idDireccion(dtoDireccion.getIdDireccion())
                .direccion(dtoDireccion.getDireccion())
                .build();
        return daoDireccion.save(direccion);

    }

    @Override
    @Transactional(readOnly = true)
    public BeanDireccion findById(Integer id) {
        return daoDireccion.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BeanDireccion> findAll() {
        return (List<BeanDireccion>) daoDireccion.findAll();
    }

    @Override
    @Transactional
    public void delete(BeanDireccion beanDireccion) {
        daoDireccion.delete(beanDireccion);

    }

    /*
    ICard -------------------------------------
public interface ICard {
    CardBean save(CardDto card);

    CardBean findById(Integer id);

    List<CardBean> findAll();

    void delete(CardBean card);
}
-------------------------------------------

ImplCard --------------------------------------------------------------

public class ImplCard implements ICard {
    @Autowired
    private CardDao cardDao;

    @Override
    @Transactional
    public CardBean save(CardDto cardDto) {
        CardBean card = CardBean.builder()
                .idCard(cardDto.getId_card())
                .creditLimit(cardDto.getCredit_limit())
                .creditNumber(cardDto.getCredit_number())
                .nameCard(cardDto.getName_card())
                .build();
        return cardDao.save(card);
    }
----------------------------------------------------------------------

@RestController
@RequestMapping("api/v1/card")
public class CardController {
    @Autowired
    private ICard cardService;

    @PostMapping("/")
    public CardDto create(@RequestBody CardDto cardDto) {
        CardBean cardSave = cardService.save(cardDto);
        return CardDto.builder()
                .id_card(cardDto.getId_card())
                .credit_limit(cardDto.getCredit_limit())
                .credit_number(cardDto.getCredit_number())
                .name_card(cardDto.getName_card())
                .build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        Map<String, Object> response = new HashMap<>();
        try {
            CardBean card = cardService.findById(id);
            cardService.delete(card);
            return new ResponseEntity<>(card, HttpStatus.OK);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al eliminar la tarjeta");
            response.put("Card", null);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
     */

}
