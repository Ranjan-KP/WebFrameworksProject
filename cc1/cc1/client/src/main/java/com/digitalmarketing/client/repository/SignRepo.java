package com.digitalmarketing.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.digitalmarketing.client.model.Signup;

@Repository
public interface SignRepo extends JpaRepository<Signup,String>{
    @Query("select q from Signup q where q.emailId=?1")
    Signup findByEmailId(String emailId);
    Signup findByEmailIdAndPassword(String emailId, String password);
}
