package io.github.hugo.rest.controller;

import antlr.Token;
import io.github.hugo.domain.entity.Usuario;
import io.github.hugo.exception.SenhaInvalidaExepition;
import io.github.hugo.rest.dto.CredenciaisDTO;
import io.github.hugo.rest.dto.TokenDTO;
import io.github.hugo.security.jwt.JwtService;
import io.github.hugo.service.impl.UsuarioServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioServiceImpl usuarioService;
    private final PasswordEncoder encoder;
    private final JwtService jwtService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario save(@RequestBody @Valid Usuario usuario){
        String senhaCeipitografada = encoder.encode(usuario.getSenha());
        usuario.setSenha(senhaCeipitografada);
        return usuarioService.save(usuario);
    }

    @PostMapping("/auth")
    public TokenDTO autenticar (@RequestBody CredenciaisDTO credenciais){
        try {
              Usuario usuario = Usuario
                    .builder()
                    .login(credenciais.getLogin())
                    .senha(credenciais.getSenha())
                    .build();
            UserDetails usuarioAutenticado = usuarioService.autenticar(usuario);
            String token = jwtService.gerarToken(usuario);
            return new TokenDTO(usuario.getLogin(),token);
        }catch (UsernameNotFoundException | SenhaInvalidaExepition e ){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,e.getMessage());
        }
    }

}

