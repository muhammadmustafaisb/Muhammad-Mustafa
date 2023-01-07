//interface Animal{
//	
//	public abstract void sound();
//		
//	
//	public abstract void movement();
//	
//}
//
//
//interface Horse{
//	
//	public abstract void sound();
//		
//	
//	public abstract void movement();
//	
//}
//
//
//class Dog implements Animal{
//
//	private String name;
//	private String legs;
//	private String color;
//	
//	public String getLegs() {
//		return legs;
//	}
//
//	public void setLegs(String legs) {
//		this.legs = legs;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public void sound() {
//		// TODO Auto-generated method stub
//		System.out.println("Dog Brak");
//		
//	}
//
//	@Override
//	public void movement() {
//		// TODO Auto-generated method stub
//		System.out.println("Dog Run");
//	}
//	
//} 
//
//class horse1 implements Horse{
//
//	@Override
//	public void sound() {
//		// TODO Auto-generated method stub
//		System.out.println("Horse Sound");
//		
//	}
//
//	@Override
//	public void movement() {
//		// TODO Auto-generated method stub
//		System.out.println("Horse Run");
//	}
//	
//} 
//
//
//
//
//public class Opp11 {
//
//	public static void main(String[] args) {
//		
//		Dog mDog =new Dog();
//		mDog.setName("Tomy");
//		mDog.setColor("Black");
//		mDog.setLegs("4Legs");
//		
//		mDog.sound();
//		mDog.movement();
//		
//		horse1 mhorse1 = new horse1();
//		mhorse1.sound();
//		mhorse1.movement();
//		
//		System.out.println(mDog.getName());
//		System.out.println(mDog.getColor());
//		System.out.println(mDog.getLegs());
//		
//		
//		
//	}
//	
//	
//}

interface Books{
	
	public abstract void BookName();
	public abstract void AuthorName();
	public abstract void BookPrice();
	
}


class Fictional implements Books{

	private String type;
	private String page;
	private String agetype;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {

		this.type = type;
	}

	public String getPage() {
		
		return page;
	}

	public void setPage(String page) {
		
		this.page = page;
	}

	public String getAgetype() {
		
		return agetype;
	}

	public void setAgetype(String agetype) {
		
		this.agetype = agetype;
	}

	
	@Override
	public void BookName() {
		// TODO Auto-generated method stub
		System.out.println("Fictional Book");
	}

	@Override
	public void AuthorName() {
		// TODO Auto-generated method stub
		System.out.println("James");
	}

	@Override
	public void BookPrice() {
		// TODO Auto-generated method stub
		System.out.println("Price = $-999");
	}
	
	
}


class NonFictional implements Books{

	private String type;
	private String page;
	private String agetype;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getAgetype() {
		return agetype;
	}

	public void setAgetype(String agetype) {
		this.agetype = agetype;
	}

	
	@Override
	public void BookName() {
		// TODO Auto-generated method stub
		System.out.println("Non Fictional");
	}

	@Override
	public void AuthorName() {
		// TODO Auto-generated method stub
		System.out.println("Tom");
		
	}

	@Override
	public void BookPrice() {
		// TODO Auto-generated method stub
		System.out.println("Price = $-499");
	}
	
}


public class Opp11 {

	public static void main(String[] args) {

		Fictional type2 = new Fictional();
		type2.AuthorName();
		type2.BookName();
		type2.BookPrice();
		
		type2.setType("Horror");
		type2.setPage("Pages = 249");
		type2.setAgetype("Adult");
		
		System.out.println(type2.getType());
		System.out.println(type2.getPage());
		System.out.println(type2.getAgetype());
		
		NonFictional type1 = new NonFictional();
		type1.AuthorName();
		type1.BookName();
		type1.BookPrice();
		
		type1.setType("Non Horror");
		type1.setPage("Pages = 399");
		type1.setAgetype("Non Adult");
		
		System.out.println(type1.getType());
		System.out.println(type1.getPage());
		System.out.println(type1.getAgetype());
		
	}
}		