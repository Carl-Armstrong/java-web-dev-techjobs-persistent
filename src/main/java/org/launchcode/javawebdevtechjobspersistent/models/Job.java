package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
//    @NotNull(message = "Employer is required")
    private Employer employer;

    @ManyToMany
    private final List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer) {
        super();
        this.employer = anEmployer;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }

}
