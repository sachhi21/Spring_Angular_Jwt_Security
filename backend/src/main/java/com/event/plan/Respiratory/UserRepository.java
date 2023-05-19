package com.event.plan.Respiratory;

import com.event.plan.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



    @Repository
    public interface UserRepository extends JpaRepository<User, Long>{
    }

