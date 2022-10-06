package com.itbulls.learnit.spring.core.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpecialOffer {
	
	private Product masterProduct;
	private Product variantProduct;
	
	public SpecialOffer(@Qualifier("masterProduct") Product masterProduct, 
			@Qualifier("variantProduct") Product variantProduct) {
		this.masterProduct = masterProduct;
		this.variantProduct = variantProduct;
	}

	public Product getMasterProduct() {
		return masterProduct;
	}

	public void setMasterProduct(Product masterProduct) {
		this.masterProduct = masterProduct;
	}

	public Product getVariantProduct() {
		return variantProduct;
	}

	public void setVariantProduct(Product variantProduct) {
		this.variantProduct = variantProduct;
	}
	
	

}
