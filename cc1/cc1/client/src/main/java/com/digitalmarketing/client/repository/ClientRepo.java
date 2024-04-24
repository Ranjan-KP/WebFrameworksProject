package com.digitalmarketing.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.digitalmarketing.client.model.Client;

@Repository
public interface ClientRepo extends JpaRepository<Client,Integer> {
}
