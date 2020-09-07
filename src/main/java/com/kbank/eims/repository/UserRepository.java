package com.kbank.eims.repository;

import com.kbank.eims.domain.Users;

public interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<Users, Long> {
	Users findByName(String name);
}