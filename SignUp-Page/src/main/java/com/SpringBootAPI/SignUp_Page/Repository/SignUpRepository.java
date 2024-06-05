package com.SpringBootAPI.SignUp_Page.Repository;

import com.SpringBootAPI.SignUp_Page.Services.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository extends JpaRepository<SignUp,Integer> {
}
