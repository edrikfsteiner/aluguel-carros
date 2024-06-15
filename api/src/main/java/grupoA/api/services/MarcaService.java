package grupoA.api.services;
import grupoA.api.dtos.MarcaDTO;
import grupoA.api.entities.Marca;
import grupoA.api.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    public Marca save(MarcaDTO marcaDTO) {
        Marca marca = new Marca();
        marca.setMarca(marcaDTO.marca());
        return marcaRepository.save(marca);
    }

    public List<Marca> getAllMarcas() {
        return marcaRepository.findAll();
    }

    public void deleteMarca(int id) {
        marcaRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return marcaRepository.existsById(id);
    }

    public Marca updateMarca(int id, MarcaDTO marcaDTO) {
        if (marcaRepository.existsById(id)) {
            Marca marca = marcaRepository.getById(id);
            marca.setMarca(marcaDTO.marca());
            return marcaRepository.save(marca);
        }
        return null;
    }
}

