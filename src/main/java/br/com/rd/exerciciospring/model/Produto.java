package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {

    //TODO ID_PRODUTO Long (primary key)
    // DS_PRODUTO String

    @Column(name = "ID_PRODUTO")
    private Long idProduto;
    @Column(name = "DS_PRODUTO")
    private String descricao;


}
