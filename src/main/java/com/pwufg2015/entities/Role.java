package com.pwufg2015.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Roles")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ROLE_ID")
    private Long id;

    private String role;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="User_Roles",
            joinColumns = {@JoinColumn(name="ROLE_ID")},
            inverseJoinColumns = {@JoinColumn(name="USER_ID")}
    )
    private Set<User> userRoles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<User> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<User> userRoles) {
        this.userRoles = userRoles;
    }

}
