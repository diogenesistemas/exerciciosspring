package br.com.rd.exerciciospring.controller;

import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class CupomController {

    //TODO Criar uma classe de controller e implementar um endpoint de consulta que receba os parametros de id_cliente e dt_venda

    @Autowired
    private CupomService service;

    @GetMapping("/cupom")
    public List<Cupom> buscaPorIdEData(@PathParam("id") Long id, @PathParam("data") String data){
       return service.buscaPorIdEData(id, data);
    }

}
