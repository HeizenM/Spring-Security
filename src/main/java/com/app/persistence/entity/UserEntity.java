package com.app.persistence.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true)
    private String username;
    private String password;
    
    @Column(name = "is_enable")
    private boolean isEnabled;
    
    @Column(name = "account_no_expired")
    private boolean accountNoExpired;
    
    @Column(name = "account_no_locked")
    private boolean accountNoLocked;
    
    @Column(name = "credential_no_expired")
    private boolean credentialNoExpired;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "roles_id"))
    private Set<RoleEntity> roles = new HashSet<>();

}
