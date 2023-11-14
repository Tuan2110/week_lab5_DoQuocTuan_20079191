package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "job")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id",length = 20)
    private long id;
    @Column(name = "job_desc",length = 2000)
    private String jobDesc;
    @Column(name = "job_name")
    private String jobName;
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "job")
    private List<JobSkill> jobSkills = new ArrayList<>();

    public Job(String jobDesc, String jobName, Company company) {
        this.jobDesc = jobDesc;
        this.jobName = jobName;
        this.company = company;
    }

    public Job(String jobDesc, String jobName, Company company, List<JobSkill> jobSkills) {
        this.jobDesc = jobDesc;
        this.jobName = jobName;
        this.company = company;
        this.jobSkills = jobSkills;
    }
}
