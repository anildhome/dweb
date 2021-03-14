package beans;

import java.util.List;

public class Emp 
{
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", add=" + add + ", emails=" + emails + ", dept=" + dept
				+ "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	int empid;
	Name name;
	Address add;
	List<String> emails;
	Dept dept;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empid, Name name, Address add, List<String> emails, Dept dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.add = add;
		this.emails = emails;
		this.dept = dept;
	}
	
	
	

}
