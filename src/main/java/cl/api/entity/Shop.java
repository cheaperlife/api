package cl.api.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the shop database table.
 * 
 */
@Entity
@Table(name="shop")
public class Shop implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

    @Lob()
	private String description;

	private String name;

	@Column(name="picture_url")
	private String pictureUrl;

	//bi-directional many-to-one association to Account
	@OneToMany(mappedBy="shop")
	private Set<Account> accounts;

	//bi-directional many-to-one association to Offer
	@OneToMany(mappedBy="shop")
	private Set<Offer> offers;

    public Shop() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPictureUrl() {
		return this.pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public Set<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	
	public Set<Offer> getOffers() {
		return this.offers;
	}

	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}
	
}