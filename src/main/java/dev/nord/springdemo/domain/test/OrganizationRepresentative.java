package dev.nord.springdemo.domain.test;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import dev.nord.springdemo.validation.test.AgeConstraint;
import dev.nord.springdemo.validation.test.EmailVerification;

public class OrganizationRepresentative {
	
	@NotBlank(message="* First Name: cannot be blank")
	private String firstName;
	
	@NotEmpty(message="* Surname: cannot be empty")
	@Size(min=3, max=10, message="* Surname: min 3 characters required, max 10 characters allowed")
	private String lastName;
	
	@AgeConstraint(lower=20, upper=70, message="* Age: range 20 to 70 only")
	private Integer age;
	
	@NotBlank(message="* ZipCode: cannot be empty")
	@Pattern(regexp="^[a-zA-Z-0-9]{6}", message="* Zipcode: 6 characters and/or digits only")
	private String zipCode;
	
	@EmailVerification(message="* Email is invalid")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
