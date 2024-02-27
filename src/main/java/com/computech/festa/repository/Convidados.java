package com.computech.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.computech.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
}
