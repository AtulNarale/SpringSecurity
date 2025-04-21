package spring.sec.example.SpringDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.sec.example.SpringDemo.model.MyUser;

import java.util.Optional;

public interface MyUserRepository extends JpaRepository<MyUser,Long> {

   Optional<MyUser> findByUsername(String username);
}
