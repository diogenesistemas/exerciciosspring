package br.com.rd.exerciciospring.repository;

import br.com.rd.exerciciospring.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {

    /*TODO Criar um repository para a entidade da tabela TbCupom e implementar um metodo de
    consulta que retornará uma lista através das pesquisas de ID_ClIENTE e DT_VENDA
     */

    public List<Cupom> findByIdCupomAndDataVenda(Long idCupom, String dataVenda);

    public List<Cupom> findByDataVenda(String data);

}
