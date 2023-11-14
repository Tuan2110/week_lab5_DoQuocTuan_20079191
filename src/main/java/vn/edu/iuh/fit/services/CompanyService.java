package vn.edu.iuh.fit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.models.Company;
import vn.edu.iuh.fit.repositories.CompanyRepository;

import java.util.Optional;
@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public Company findByEmailAndPassword(String email, String password) {
        Optional<Company> optional = companyRepository.findByEmailAndPassword(email, password);
        if(optional.isPresent()){
            return optional.get();
        }
        throw new RuntimeException("Company not found");
    }
}
