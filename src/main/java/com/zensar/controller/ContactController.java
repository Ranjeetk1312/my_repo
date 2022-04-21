package com.zensar.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	//PATH Parameter Based API Versioning
	@GetMapping(value="/api/contact/v1")
	public Contact getContact() {
		return new Contact("Tom",8765);
	}

	@GetMapping(value="/api/contact/v2")
	public Contactv2 getContactv2() {
		return new Contactv2("Tom",8765);
		}
//Query Request Parameter BBASEd API Versioning
@GetMapping(value="/api/contact",params="version v1")
public Contact getContactQueryV1() {
	return new Contact("Tom",8765);
}

@GetMapping(value="/api/contact",params="version v2")
public Contactv2 getContactQueryV2() {
	return new Contactv2("Tom",8765);
	}
//Header Request Parameter BBASEd API Versioning
@GetMapping(value="/api/contact",produces=MediaType.APPLICATION_JSON_VALUE,headers="version=v1")
public Contact getContactHeaderV1() {
	return new Contact("Tom",8765);
}

@GetMapping(value="/api/contact",produces=MediaType.APPLICATION_JSON_VALUE,headers="version=v2")
public Contactv2 getContactHeaderV2() {
	return new Contactv2("Tom",8765);
	}
//Content type negosation
@GetMapping(value="/api/contact",produces="application/contact.v1+json")
public Contact getContactNegoV1() {
	return new Contact("Tom",8765);
}

@GetMapping(value="/api/contact",produces="application/contact.v2+json")
public Contactv2 getContactNegoV2() {
	return new Contactv2("Tom",8765);
	}
}
class Contact{
	private String name;
	private int mob;
	public Contact(String name, int mob) {
		super();
		this.name = name;
		this.mob = mob;
	}
	public Contact() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", mob=" + mob + "]";
	}
	
}
class Contactv2{
	private String name;
	private int mobNo;
	public Contactv2(String name, int mob) {
		super();
		this.name = name;
		this.mobNo = mob;
	}
	public Contactv2() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mob) {
		this.mobNo = mob;
	}
	@Override
	public String toString() {
		return "Contactv2 [name=" + name + ", mob=" + mobNo + "]";
	}
	
}
