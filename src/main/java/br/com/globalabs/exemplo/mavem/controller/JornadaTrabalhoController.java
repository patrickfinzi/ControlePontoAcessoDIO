package br.com.globalabs.exemplo.mavem.controller;

import br.com.globalabs.exemplo.mavem.model.JornadaTrabalho;
import br.com.globalabs.exemplo.mavem.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    /*@PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaList(@PathParam("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.getById(idJornada).orElseThrow(() -> new Exception("Jornada nao encontrada!")));
    }*/
}
