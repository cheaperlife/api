package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the offer database table.
 * 
 */
@Entity
@Table(name="offer")
public class Offer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private byte activated;

	private byte amount;

    @Lob()
	private String description;

	private int duration;

	private String name;

	@Column(name="picture_url")
	private String pictureUrl;

	private double price;

	//bi-directional many-to-one association to Shop
    @ManyToOne
	private Shop shop;

	//bi-directional many-to-one association to Subscription
	@OneToMany(mappedBy="offer")
	private Set<Subscription> subscriptions;

    public Offer() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getActivated() {
		return this.activated;
	}

	public void setActivated(byte activated) {
		this.activated = activated;
	}

	public byte getAmount() {
		return this.amount;
	}

	public void setAmount(byte amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
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

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Shop getShop() {
		return this.shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	public Set<Subscription> getSubscriptions() {
		return this.subscriptions;
	}

	public void setSubscriptions(Set<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
}