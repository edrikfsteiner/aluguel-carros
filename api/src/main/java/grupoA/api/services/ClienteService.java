package grupoA.api.services;

import grupoA.api.dtos.ClienteDTO;
import grupoA.api.entities.Cliente;
import grupoA.api.entities.Endereco;
import grupoA.api.repositories.ClienteRepository;
import grupoA.api.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Cliente save(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setNm_cliente(clienteDTO.nm_cliente());
        cliente.setTelefone(clienteDTO.telefone());
        cliente.setEmail(clienteDTO.email());
        cliente.setCpf(clienteDTO.cpf());
        if (enderecoRepository.existsById(clienteDTO.id_endereco())) {
            Endereco endereco = enderecoRepository.getById(clienteDTO.id_endereco());
            cliente.setEndereco(endereco);
        } else {
            throw new IllegalArgumentException("Endereço não encontrado para o ID fornecido: " + clienteDTO.id_endereco());
        }
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public void deleteCliente(int id) {
        clienteRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return clienteRepository.existsById(id);
    }

    public Cliente updateCliente(int id, ClienteDTO clienteDTO) {
        if (clienteRepository.existsById(id)) {
            Cliente cliente = clienteRepository.getById(id);
            cliente.setNm_cliente(clienteDTO.nm_cliente());
            cliente.setTelefone(clienteDTO.telefone());
            cliente.setEmail(clienteDTO.email());
            cliente.setCpf(clienteDTO.cpf());
            if (enderecoRepository.existsById(clienteDTO.id_endereco())) {
                Endereco endereco = enderecoRepository.getById(clienteDTO.id_endereco());
                cliente.setEndereco(endereco);
            } else {
                throw new IllegalArgumentException("Endereço não encontrado para o ID fornecido: " + clienteDTO.id_endereco());
            }
            return clienteRepository.save(cliente);
        }
        return null;
    }
}
