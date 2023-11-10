package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "candidate")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 20,name = "can_id")
    private long id;
    private LocalDate dob;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(name = "full_name")
    private String fullName;
    @Column(length = 15,unique = true)
    private String phone;
    @ManyToOne
    @JoinColumn(name = "address")
    private Address address;

    public Candidate(LocalDate dob, String email, String password, String fullName, String phone, Address address) {
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

    public Candidate(long id) {
        this.id = id;
    }
}
