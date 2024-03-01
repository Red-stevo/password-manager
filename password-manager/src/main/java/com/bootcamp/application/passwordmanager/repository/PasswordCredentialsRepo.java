package com.bootcamp.application.passwordmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PasswordCredentialsRepo extends JpaRepository<PasswordCredentials,Long> {

    Optional<PasswordCredentials> findByWebsite(String website);

}
