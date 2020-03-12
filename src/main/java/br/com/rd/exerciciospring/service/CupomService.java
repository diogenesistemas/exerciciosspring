package br.com.rd.exerciciospring.service;

import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service("CupomService")
public class CupomService {
    //TODO Criar uma nova classe de Service que implemente um novo método que execute o método implementado no item 2 e retorne o resultado.

    @Autowired
    private CupomRepository repository;

    public List<Cupom> buscaPorIdEData(Long id, String data){

        List<Cupom> cupom = new ArrayList<>();
        if (id != null && data != null)
            cupom = repository.findByIdCupomAndDataVenda(id, data);
        else if (id != null)
            cupom.add(repository.findById(id).get());
        else if (data != null)
            cupom=  repository.findByDataVenda (data);
        return  cupom;

    }

}
