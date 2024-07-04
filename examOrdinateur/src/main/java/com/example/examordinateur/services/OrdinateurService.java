package com.example.examordinateur.services;

import com.example.examordinateur.dto.OrdinateurDTO;
import com.example.examordinateur.entities.Ordinateur;
import com.example.examordinateur.mappers.OrdinateurMapper;
import com.example.examordinateur.repositories.OrdinateurRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@RequiredArgsConstructor
@Service
public class OrdinateurService implements IOrdinateurService{

    private final OrdinateurRepository ordinateurRepository;

  //  private final QuantiteClient QuantiteClient;


    @Override
    public OrdinateurDTO addOrdinateur(OrdinateurDTO o) {
        Ordinateur ordinateur = ordinateurRepository.save(OrdinateurMapper.mapToEntity(o));
        return o;
    }

    @Override
    public Ordinateur updateOrdinateur(Ordinateur o) {
        return  ordinateurRepository.save(o);
    }


    @Override
    public List<OrdinateurDTO> getAllOrdinateurs() {
        return ordinateurRepository.findAll()
                .stream()
                .map(ordinateur -> OrdinateurMapper.mapToDto(ordinateur)).
                collect(Collectors.toList()) ;
    }


   /*  @Override
   public OrdinateurDTO getOrdinateurById(long id) {
        Ordinateur article = ordinateurRepository.findById(id).get() ;
        QuantiteDTO quantiteDTO = QuantiteClient.getById(ordinateur.getId_quantite());
        return OrdinateurMapper.mapToDto(ordinateur,quantiteDTO);

    }*/

   @Override
    public void deleteOrdinateurById(long id) {
        ordinateurRepository.deleteById(id);
    }

    @Override
    public void deleteOrdinateur(Ordinateur o) {
        ordinateurRepository.delete(o);


    }

}