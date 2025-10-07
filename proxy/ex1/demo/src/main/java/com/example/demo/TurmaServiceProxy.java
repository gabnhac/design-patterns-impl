package com.example.demo;

import java.beans.JavaBean;

import org.springframework.stereotype.Service;

@Service
public class TurmaServiceProxy implements ITurmaService{
    private TurmaService turmaService;

    public TurmaServiceProxy(TurmaService turmaService){
        this.turmaService = turmaService;
    }

    @Override
    public String cadastraTurma(PostTurmaDto dto) {
        try {
            System.out.println("Iniciando transaction");
            turmaService.cadastraTurma(dto);
            return "Operação concluída com sucesso";
        } catch (Exception e) {
            System.out.println("Efetuando rollback");
            return "Erro: %s".formatted(e.getMessage());
        }
    }
}
