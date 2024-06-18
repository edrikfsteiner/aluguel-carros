package grupoA.api.services;

import grupoA.api.entities.Endereco;
import grupoA.api.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }

    public Endereco save(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public void deleteById(int id) {
        if (enderecoRepository.existsById(id)) {
            enderecoRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Endereço não encontrado");
        }
    }

    public Optional<Endereco> findById(int id) {
        return enderecoRepository.findById(id);
    }

    public Endereco update(Endereco endereco) {
        if (enderecoRepository.existsById(endereco.getId_endereco())) {
            return enderecoRepository.save(endereco);
        } else {
            throw new IllegalArgumentException("Endereço não encontrado");
        }
    }
}
