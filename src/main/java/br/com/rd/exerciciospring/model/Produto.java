package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {

    //TODO ID_PRODUTO Long (primary key)
    // DS_PRODUTO String

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO")
    private Long idProduto;
    @Column(name = "DS_PRODUTO")
    private String descricao;


}
