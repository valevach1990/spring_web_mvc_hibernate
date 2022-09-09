package com.valevach.spring.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "details_id")
    private int details;
//    @Column(name = "position")
//    private int position;
//    @ManyToOne(cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "position")
//    private Position empPosition;
//    @OneToOne(cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "details")
//    private Details empDetails;
//
//    @ManyToMany(cascade = CascadeType.REMOVE)
//    @JoinTable(name = "emp_projects",
//            joinColumns = @JoinColumn(name = "emp_id"),
//            inverseJoinColumns = @JoinColumn(name = "project_id"))
//    private List<Project> projectList;

    public Employee() {
    }

    public Employee(String name, int details) {
        this.name = name;
        this.details = details;
       // this.position = position;
    }

//    public void addProjectToEmp(Project empProject) {
//        if (projectList == null) {
//            projectList = new ArrayList<>();
//        }
//        projectList.add(empProject);
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDetails() {
        return details;
    }

    public void setDetails(int details) {
        this.details = details;
    }

//    public int getPosition() {
//        return position;
//    }
//
//    public void setPosition(int position) {
//        this.position = position;
//    }
//
//    public Position getEmpPosition() {
//        return empPosition;
//    }
//
//    public void setEmpPosition(Position empPosition) {
//        this.empPosition = empPosition;
//    }
//
//    public Details getEmpDetails() {
//        return empDetails;
//    }
//
//    public void setEmpDetails(Details empDetails) {
//        this.empDetails = empDetails;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", project='" + details + '\'' +
              //  ", position='" + position + '\'' +
                '}';
    }
}
