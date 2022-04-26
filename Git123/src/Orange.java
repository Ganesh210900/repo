
public class Orange {
	String color;
	Orange(String color)
	{
		this.color=color;
	}
	String getColor()
	{
		return color;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange Apple = new Orange("Red");
		String color= Apple.getColor();
		System.out.println("Color of apple is:" +color);

	}

}
