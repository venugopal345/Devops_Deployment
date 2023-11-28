package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TeamDto 
{
	@Id
	private int jersyno;
	private String name;
	private int age;
	private int matches;
	private String role;
	private int bestscore;
	public int getJersyno() {
		return jersyno;
	}
	public void setJersyno(int jersyno) {
		this.jersyno = jersyno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getBestscore() {
		return bestscore;
	}
	public void setBestscore(int bestscore) {
		this.bestscore = bestscore;
	}
	
	
	@Override
	public String toString() {
		return "TeamDto [jersyno=" + jersyno + ", name=" + name + ", age=" + age + ", matches=" + matches + ", role="
				+ role + ", bestscore=" + bestscore + ", getJersyno()=" + getJersyno() + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getMatches()=" + getMatches() + ", getRole()=" + getRole()
				+ ", getBestscore()=" + getBestscore() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
