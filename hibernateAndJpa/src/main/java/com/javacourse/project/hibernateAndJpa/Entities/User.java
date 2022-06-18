package com.javacourse.project.hibernateAndJpa.Entities;
import javax.persistence.*;
@Entity
@Table(name="user")
public class User
{
    @Id
    @Column(name="userID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="email")
    private String email;

    public User(int userID, String name, String surname, String username, String password, String email)
    {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.email = email;
    }

  

    public User() {
    }

   

    public int getUserID() {
		return userID;
	}



	public void setUserID(int userID) {
		this.userID = userID;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
    public String toString() {
        return getUserID()+ " " + getName() + " " + getSurname() + " " + getUsername() + " " + getEmail() + " "+ getPassword()+"\n";
    }
}
