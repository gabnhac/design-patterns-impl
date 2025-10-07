package com.example.demo;

import org.springframework.stereotype.Service;
import com.example.demo.PostTurmaDto;

@Service
public class TurmaService implements ITurmaService{
    private TurmaRepository turmaRepository;

    public TurmaService(TurmaRepository turmaRepository){
        this.turmaRepository = turmaRepository;
    }

    public String cadastraTurma(PostTurmaDto dto){
        if(dto.professor().length() > 100){
            throw new IllegalArgumentException("O nome do professor não pode ser maior que 100 caracteres");
        }

        if(dto.classNumber() < 0){
            throw new IllegalArgumentException("O número da turma não pode ser menor que 0");
        }

        var newTurma = new TurmaEntity();

        newTurma.setProfessor(dto.professor());
        newTurma.setClassNumber(dto.classNumber());

        turmaRepository.save(newTurma);

        return "Turma cadastrada com sucesso";
    }
}
