package grupoA.api.services;

import grupoA.api.dtos.MarcaDTO;
import grupoA.api.dtos.ModeloDTO;
import grupoA.api.entities.Marca;
import grupoA.api.entities.Modelo;
import grupoA.api.repositories.MarcaRepository;
import grupoA.api.repositories.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloService {
    @Autowired
    private ModeloRepository modeloRepository;
    @Autowired
    private MarcaRepository marcaRepository;
    public Modelo save(ModeloDTO modeloDTO) {
        Modelo modelo = new Modelo();
        modelo.setModelo(modeloDTO.modelo());
        if (marcaRepository.existsById(modeloDTO.id_marca())) {
            Marca marca = marcaRepository.getById(modeloDTO.id_marca());
            modelo.setMarca(marca);
        } else {
            throw new IllegalArgumentException("Marca não encontrada para o ID fornecido: " + modeloDTO.id_marca());
        }
        return modeloRepository.save(modelo);
    }

    public List<Modelo> findAll() {
        return modeloRepository.findAll();
    }

    public void deleteById(int id) {
        if (modeloRepository.existsById(id)) {
            modeloRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Modelo nao encontrado para o ID: " + id);
        }
    }

    public Modelo updateModelo(int id, ModeloDTO modeloDTO) {
        if (modeloRepository.existsById(id)) {
            Modelo modelo = modeloRepository.getById(id);
            modelo.setModelo(modeloDTO.modelo());
            return modeloRepository.save(modelo);
        }
        return null;
    }
}
