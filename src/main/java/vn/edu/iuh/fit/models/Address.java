package vn.edu.iuh.fit.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 20,name = "add_id")
    private long id;
    @Column(length = 150)
    private String street;
    @Column(length = 50)
    private String city;
    @Column(length = 6)
    private CountryCode country;
    @Column(length = 20)
    private String number;
    @Column(length = 7,name = "zipcode")
    private String zipCode;

    public Address(String street, String city, CountryCode country, String number, String zipCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
        this.zipCode = zipCode;
    }
}
