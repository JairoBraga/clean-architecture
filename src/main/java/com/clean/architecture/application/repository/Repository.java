package com.clean.architecture.application.repository;

import com.clean.architecture.application.repository.model.UserDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<UserDB, Long> {
}
