package me.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by hua on 15/10/8.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {
    private final EmployeeRepository repository;

    @Autowired
    private Aa aa;

//    public void setAa(Aa aa) {
//        this.aa = aa;
//    }

    @Autowired
    public DatabaseLoader(EmployeeRepository repository, Aa aa) {
        this.repository = repository;
        this.aa = aa;
//        this.aa.getAa();
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
}
