package cl.api.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the subscription database table.
 * 
 */
@Entity
@Table(name="subscription")
public class Subscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int amount;

	//bi-directional many-to-one association to Offer
    @ManyToOne
	private Offer offer;

	//bi-directional many-to-one association to Client
    @ManyToOne
	private Client client;

    public Subscription() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Offer getOffer() {
		return this.offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}
	
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}