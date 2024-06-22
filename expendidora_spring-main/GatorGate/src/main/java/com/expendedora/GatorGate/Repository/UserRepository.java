package com.expendedora.GatorGate.Repository;

import com.expendedora.GatorGate.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

