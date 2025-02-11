package udemedellin.com.co.basicAirbnb.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import udemedellin.com.co.basicAirbnb.model.Usuario;
import udemedellin.com.co.basicAirbnb.repository.UsuarioRepository;


import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> find(Integer id){
        return usuarioRepository.findById(id);
    }

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Boolean delete(Integer id){
        usuarioRepository.deleteById(id);
        return usuarioRepository.findById(id).isPresent();
    }

}
