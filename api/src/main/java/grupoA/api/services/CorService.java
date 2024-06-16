package grupoA.api.services;

import grupoA.api.dtos.CorDto;
import grupoA.api.entities.Cor;
import grupoA.api.repositories.CorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorService {
    @Autowired
    private CorRepository corRepository;

    public Cor save(CorDto corDto){
        Cor cor = new Cor();
        cor.setCor(corDto.cor());
        return corRepository.save(cor);
    }

    public List<Cor> getAllCores(){
        return corRepository.findAll();
    }

    public void deleteCor(int id){
        corRepository.deleteById(id);
    }

    public boolean existsById(int id){
        return corRepository.existsById(id);
    }

    public Cor updateCor(int id, CorDto corDto){
        if (corRepository.existsById(id)) {
            Cor cor = corRepository.getById(id);
            cor.setCor(corDto.cor());
            return corRepository.save(cor);
        }
        return null;
    }
}
