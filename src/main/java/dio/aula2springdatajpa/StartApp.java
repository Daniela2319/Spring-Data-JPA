package dio.aula2springdatajpa;

import dio.aula2springdatajpa.model.User;
import dio.aula2springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
   private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setName("DANIELA");
        user.setUsarname("velter");
        user.setPassword("abc123");

        repository.save(user); // salva o usuario

        for(User u: repository.findAll()){ //  confimar esta sendo salvo
            System.out.println(u);
        }

    }
}
