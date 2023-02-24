package com.pe.organizacion.easynutrition.domain.users.repository;

import com.pe.organizacion.easynutrition.domain.users.model.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUserRepository extends JpaRepository<SystemUser, String> {
}
