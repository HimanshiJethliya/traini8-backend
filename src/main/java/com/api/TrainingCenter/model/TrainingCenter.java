package com.api.TrainingCenter.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@Entity
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Center name is mandatory")
    @Size(max = 40, message = "Center name must be less than 40 characters")
    private String centerName;

    @NotBlank(message = "Center code is mandatory")
    @Size(min = 12, max = 12, message = "Center code must be exactly 12 characters")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Center code must be alphanumeric")
    private String centerCode;

    @Embedded
    @NotNull(message = "Address is mandatory")
    private Address address;

    @Min(value = 1, message = "Student capacity must be at least 1")
    private int studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private Instant createdOn;

    @Email(message = "Invalid email format")
    private String contactEmail;

    @NotBlank(message = "Contact phone is mandatory")
    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid phone number")
    private String contactPhone;

    @PrePersist
    protected void onCreate() {
        this.createdOn = Instant.now(); // Automatically set creation time
    }
}

@Embeddable
@Data
class Address {
    private String detailedAddress;
    private String city;
    private String state;
    private String pincode;
}
