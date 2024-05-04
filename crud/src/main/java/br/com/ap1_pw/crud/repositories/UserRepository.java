package br.com.ap1_pw.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ap1_pw.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
