package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.PostTurmaDto;

@RestController
@RequestMapping("/api")
public class TurmaController {
    private TurmaServiceProxy turmaServiceProxy;

    public TurmaController(TurmaServiceProxy turmaServiceProxy){
        this.turmaServiceProxy = turmaServiceProxy;
    }
    
    @PostMapping
    public String cadastraTurma(@RequestBody PostTurmaDto dto){
        return turmaServiceProxy.cadastraTurma(dto);
    }
}
