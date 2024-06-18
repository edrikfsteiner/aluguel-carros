package grupoA.api.services;

import grupoA.api.dtos.AluguelDTO;
import grupoA.api.entities.Aluguel;
import grupoA.api.entities.Cliente;
import grupoA.api.entities.Pagamento;
import grupoA.api.entities.Veiculo;
import grupoA.api.repositories.AluguelRepository;
import grupoA.api.repositories.ClienteRepository;
import grupoA.api.repositories.PagamentoRepository;
import grupoA.api.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class AluguelService {
    @Autowired
    private AluguelRepository aluguelRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public Aluguel save(AluguelDTO aluguelDTO) {
        Aluguel aluguel = new Aluguel();

        Cliente cliente = clienteRepository.findById(aluguelDTO.cd_cliente())
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado para o ID: " + aluguelDTO.cd_cliente()));
        aluguel.setCliente(cliente);

        Veiculo veiculo = veiculoRepository.findById(aluguelDTO.placa())
                .orElseThrow(() -> new IllegalArgumentException("Veículo não encontrado para a placa: " + aluguelDTO.placa()));
        aluguel.setVeiculo(veiculo);

        Pagamento pagamento = pagamentoRepository.findById(aluguelDTO.id_pagamento())
                .orElseThrow(() -> new IllegalArgumentException("Pagamento não encontrado para o ID: " + aluguelDTO.id_pagamento()));
        aluguel.setPagamento(pagamento);

        aluguel.setDataInicio(aluguelDTO.data_inicio());
        aluguel.setDataFim(aluguelDTO.data_fim());
        aluguel.setValor(aluguelDTO.valor());

        return aluguelRepository.save(aluguel);
    }

    public List<Aluguel> getAllAlugueis() {
        return aluguelRepository.findAll();
    }

    public void deleteAluguel(int id) {
        aluguelRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return aluguelRepository.existsById(id);
    }

    public Aluguel updateAluguel(int id, AluguelDTO aluguelDTO) {
        if (aluguelRepository.existsById(id)) {
            Aluguel aluguel = aluguelRepository.getById(id);

            Cliente cliente = clienteRepository.findById(aluguelDTO.cd_cliente())
                    .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado para o ID: " + aluguelDTO.cd_cliente()));
            aluguel.setCliente(cliente);

            Veiculo veiculo = veiculoRepository.findById(aluguelDTO.placa())
                    .orElseThrow(() -> new IllegalArgumentException("Veículo não encontrado para a placa: " + aluguelDTO.placa()));
            aluguel.setVeiculo(veiculo);

            Pagamento pagamento = pagamentoRepository.findById(aluguelDTO.id_pagamento())
                    .orElseThrow(() -> new IllegalArgumentException("Pagamento não encontrado para o ID: " + aluguelDTO.id_pagamento()));
            aluguel.setPagamento(pagamento);

            aluguel.setDataInicio(aluguelDTO.data_inicio());
            aluguel.setDataFim(aluguelDTO.data_fim());
            aluguel.setValor(aluguelDTO.valor());

            return aluguelRepository.save(aluguel);
        }
        return null;
    }
}
