package io.github.hugo.domain.repositorio;

import io.github.hugo.domain.entiti.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Clientes extends JpaRepository<Cliente, Integer> {

   List<Cliente> findByNomeLike(String nome);

   boolean existsByNome(String nome);
}
