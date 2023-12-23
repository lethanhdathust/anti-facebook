package com.example.Social.Network.API.Repository;

import com.example.Social.Network.API.Model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SignUpRepo extends JpaRepository<User,Long> {

    boolean existsByEmail(String email);


}
