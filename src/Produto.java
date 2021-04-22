
public class Produto {

	String nomeProd;
	double priceUnitProd;
	//double priceTotalProd;
	int quantProd;
	public Produto(String nomeProd, double priceUnitProd, int quantProd) {
		this.nomeProd = nomeProd;
		this.priceUnitProd = priceUnitProd;
		//this.priceTotalProd = priceTotalProd;
		this.quantProd = quantProd;
	}
	public double getPriceUnitProd() {
		return priceUnitProd;
	}
	public void setPriceUnitProd(double priceUnitProd) {
		this.priceUnitProd = priceUnitProd;
	}
	/*public double getPriceTotalProd() {
		return priceTotalProd;
	}
	public void setPriceTotalProd(double priceTotalProd) {
		this.priceTotalProd = priceTotalProd;
	}*/
	public String getNomeProd() {
		return nomeProd;
	}
	public int getQuantProd() {
		return quantProd;
	}
	
	public double calculaPriceTotal() {
		double priceTotal =  priceUnitProd * quantProd;
		return priceTotal;
	}
}
