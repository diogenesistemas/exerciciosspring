package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_CUPOM_ITEM")
public class CupomItem implements Serializable {

    /*TODO Campos:
       ID_CUPOM_ITEM Long (primary key)
       ID_CUPOM Long (foreign key da tabela TB_CUPOM)
        ID_PRODUTO Long (foreign key da tabela TB_PRODUTO)
        QT_PRODUTO Long
        VL_PRODUTO BigDecimal*/

    @Column(name = "ID_CUPOM_ITEM")
    private Long idCupomItem;
    @Column(name = "ID_CUPOM")
    private Long idCupom;
    @Column(name = "ID_PRODUTO")
    private Long idProduto;
    @Column(name = "QT_PRODUTO")
    private Long quantidadeProduto;
    @Column(name = "VL_PRODUTO")
    private BigDecimal valor;
}
