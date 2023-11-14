package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.edu.iuh.fit.models.Candidate;

import java.util.List;
import java.util.Optional;

public interface CandidateRepository extends JpaRepository<Candidate,Long> {

    Optional<Candidate> findByEmailAndPassword(String email, String password);
    @Query("select c from Candidate c join CandidateSkill cs on c.id = cs.candidate.id" +
            " join Skill s on cs.skill.id = s.id where s.skillName like %:keyword%")
    List<Candidate> search(@Param("keyword") String keyword);
}
