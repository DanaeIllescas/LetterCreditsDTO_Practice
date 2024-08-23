package com.bbva.mzic.dto.projecto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The LetterCredits class...
 */
public class LetterCreditsDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;


	private String letter;
	private String reference;
	private List<Banks> banks;
	private Costumer costumer;


	public String getLetter() {
		return this.letter;
	}


	public void setLetter(final String letter) {
		this.letter = letter;
	}
	

	public String getReference() {
		return this.reference;
	}

	/**
	 * Set the surname attribute
	 */
	public void setReference(final String reference) {
		this.reference = reference;
	}

	public List<Banks> getBanks() {
        return this.banks;
    }
	public void setBanks(final List<Banks> banks) {
        this.banks = banks;
    }
	public String getCostumer() {
		return this.costumer;
	}
	public void setCostumer(final String Costumer) {
        this.costumer = costumer;
	}



	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final LetterCreditsDTO rhs = (LetterCreditsDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(letter, rhs.letter)
					.append(reference, rhs.reference)
					.append(banks, rhs.banks)
					.append(costumer,rhs.costumer)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.letter)
			.append(this.reference)
			.append(this.banks)
			.append(this.costumer)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("letter", letter)
			.append("reference", reference)
			.append("banks",banks)
			.append("costumer", costumer)
			.toString();
	}
}
