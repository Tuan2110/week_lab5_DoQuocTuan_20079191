package vn.edu.iuh.fit;

import com.neovisionaries.i18n.CountryCode;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.enums.SkillLevel;
import vn.edu.iuh.fit.enums.SkillType;
import vn.edu.iuh.fit.models.*;
import vn.edu.iuh.fit.repositories.*;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class Week5Lab520079191Application {
    public static void main(String[] args) {
        SpringApplication.run(Week5Lab520079191Application.class, args);
    }
}
