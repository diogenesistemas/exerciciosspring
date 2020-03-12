package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_CUPOM")
public class Cupom implements Serializable {
    /* TODO Campos:
    ID_CUPOM Long (primary key)
     ID_CLIENTE Long
     DT_VENDA String
      VL_VENDA BigDecimal*/


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CUPOM")
    private Long idCupom;
    @Column(name = "ID_CLIENTE")
    private Long idCliente;
    @Column(name = "DT_VENDA")
    private String dataVenda;
    @Column(name = "VL_VENDA")
    private BigDecimal valor;

}
