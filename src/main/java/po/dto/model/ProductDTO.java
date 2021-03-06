package po.dto.model;

import po.model.Product;

public class ProductDTO {
	protected String phoneNumber;
	protected String packageName;
	protected String productName;
	protected String categoryName;
	protected double monthlyUsage;
	protected double downloadSpeed;
	protected double price;
	
	
	public ProductDTO(){}
	
	public Product toProduct(){
		Product p = new Product();
		p.setName(this.getProductName());
		p.setPackageName(this.getPackageName());
		p.setDownloadSpeed(this.getDownloadSpeed());
		p.setMonthlyUsage(this.getMonthlyUsage());
		p.setPrice(this.getPrice());
		p.setProductCategory(this.getCategoryName());
		return p;
	}
	
	public static ProductDTO toProductDTO(Product p,String phoneNumber){
		ProductDTO pDTO = new ProductDTO();
		pDTO.setCategoryName(p.getProductCategory());
		pDTO.setPhoneNumber(phoneNumber);
		pDTO.setProductName(p.getName());
		pDTO.setPackageName(p.getPackageName());
		pDTO.setDownloadSpeed(p.getDownloadSpeed());
		pDTO.setMonthlyUsage(p.getMonthlyUsage());
		pDTO.setPrice(p.getPrice());
		return pDTO;
	}
	
	public static ProductDTO toProductDTO(Product p){
		return toProductDTO(p,null);
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String productType) {
		this.packageName = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public double getMonthlyUsage() {
		return monthlyUsage;
	}

	public void setMonthlyUsage(double monthlyUsage) {
		this.monthlyUsage = monthlyUsage;
	}

	public double getDownloadSpeed() {
		return downloadSpeed;
	}

	public void setDownloadSpeed(double downloadSpeed) {
		this.downloadSpeed = downloadSpeed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
