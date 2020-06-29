//package com.springbootme.social.model;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.Access;
//import javax.persistence.AccessType;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotNull;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.springbootme.domain.DomainObjectImpl;
//import com.springbootme.domain.Organization;
//import com.springbootme.domain.Role;
//import com.springbootme.domain.UserRole;
//
//import lombok.AccessLevel;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.experimental.SuperBuilder;
//
//@Data
//@SuperBuilder
//@Entity(name = "users")
//@Table(name = "USERS", schema = "public")
//@NoArgsConstructor
//@Access(value = AccessType.PROPERTY)
//public class User extends DomainObjectImpl{
//    
//
//    @Column(nullable = false)
//    private String name;
//
//    @Email
//    @Column(nullable = false)
//    private String email;
//
//    private String imageUrl;
//
//    @Column(nullable = false)
//    private Boolean emailVerified = false;
//
//    @JsonIgnore
//    private String password;
//
//    @NotNull
//    @Enumerated(EnumType.STRING)
//    private AuthProvider provider;
//
//    private String providerId;
//    
//    private Organization organization;
//
//	@Getter(AccessLevel.NONE)
//	@Setter(AccessLevel.NONE)
//	private Set<UserRole> userRoles;
//
//	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
//	public Set<UserRole> getUserRoles()
//	{
//		return this.userRoles;
//	}
//
//	public void setUserRoles(Set<UserRole> roles)
//	{
//		this.userRoles = roles;
//	}
//
//	public void addRole(Role role, User user)
//	{
//		if (userRoles == null)
//		{
//			userRoles = new HashSet<UserRole>();
//		}
//
//		this.userRoles.add(UserRole.builder().id(role.getId())
//				.userId(user.getId()).build());
//	}
//
//	@ManyToOne(optional = false)
//	public Organization getOrganization()
//	{
//		return this.organization;
//	}
//
//	public void setOrganization(Organization org)
//	{
//		this.organization = org;
//	}
//
//    
//}
