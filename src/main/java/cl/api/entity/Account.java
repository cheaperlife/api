package cl.api.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@Table(name="account")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String address;

	@Column(name="address_complement")
	private String addressComplement;

	private String city;

	private byte client;

	private String email;

	private String password;

	private String username;

	@Column(name="zip_code")
	private int zipCode;

	//bi-directional many-to-one association to Client
    @ManyToOne
	@JoinColumn(name="client_id")
	private Client clientBean;

	//bi-directional many-to-one association to Shop
    @ManyToOne
	private Shop shop;

    public Account() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressComplement() {
		return this.addressComplement;
	}

	public void setAddressComplement(String addressComplement) {
		this.addressComplement = addressComplement;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public byte getClient() {
		return this.client;
	}

	public void setClient(byte client) {
		this.client = client;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public Client getClientBean() {
		return this.clientBean;
	}

	public void setClientBean(Client clientBean) {
		this.clientBean = clientBean;
	}
	
	public Shop getShop() {
		return this.shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
}