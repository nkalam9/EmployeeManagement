package com.infy.empmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
@Table(name="users", uniqueConstraints = {@UniqueConstraint(columnNames = {"mobile","emailId"})})
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserId;

    @NotBlank(message="emailId is a mandatory field")
    @Email(message = "please enter a valid email")
    @Column(length = 100)
    private String emailId;

    @Pattern(regexp = "[1-9]{1}\\d{9}", message = "mobile number should contain 10 digits")
    @Column(length = 10)
    private String mobile;

    @NotBlank(message="password is a mandatory field")
    @Column(length = 20)
    private String password;

    @Pattern(regexp = "Admin|Viewer", message = "role can be either Admin or viewer")
    @Column(length = 50)
    private String Role;

    @Min(value = 1, message = "staus should be either 1 or 2")
    @Max(value = 2, message = "staus should be either 1 or 2")
    private int Status;
}
