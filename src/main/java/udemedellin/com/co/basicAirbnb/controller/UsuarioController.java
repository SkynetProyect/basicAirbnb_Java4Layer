package udemedellin.com.co.basicAirbnb.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import udemedellin.com.co.basicAirbnb.model.Usuario;
import udemedellin.com.co.basicAirbnb.service.UsuarioService;


import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @GetMapping("/all")
    public List<Usuario> getAll(){
        return usuarioService.getAll();
    }

    @GetMapping("/{id}")
    public Usuario get(@PathVariable Integer id){
        Optional<Usuario> usuario = usuarioService.find(id);
        return usuario.orElseGet(Usuario::new);
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario){
        return usuarioService.login(usuario);
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return usuarioService.delete(id);
    }


}
