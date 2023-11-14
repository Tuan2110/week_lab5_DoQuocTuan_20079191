package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.edu.iuh.fit.models.Job;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    @Query("select j from Job j join Company c on j.company.id = c.id" +
            " join JobSkill js on j.id = js.job.id" +
            " join Skill s on js.skill.id = s.id " +
            " where j.jobName like %:query% or c.comp_name like %:query% or s.skillName like %:query%")
    List<Job> findByQuery(@Param("query")String query);
}