import java.util.Scanner;

class Book{
	String name, author;
	int price, no_pages;
	
	public Book(String name, String author, int price, int no_pages){
		this.name = name;
		this.author = author;
		this.price = price;
		this.no_pages = no_pages;
	}

	public String toString(){
		System.out.println("Name: " + this.name);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);
		System.out.println("Pages: " + this.no_pages);
		return this.name + this.author + this.price + this.no_pages;
	}
}

class BookMain{
	public static void main(String args[]){
		System.out.println("Ranisha Giri- 1BM22CS218");
		Book books[] = new Book[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of book objects: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++){
			String name, author;
			int price, no_pages;
			System.out.println("Enter name: ");
			name = sc.next();
			System.out.println("Enter author: ");
			author = sc.next();
			System.out.println("Enter price: ");
			price = sc.nextInt();
			System.out.println("Enter no. of pages: ");
			no_pages = sc.nextInt();
			books[i] = new Book(name, author, price, no_pages);
		}
		System.out.println("\n");
		for(int i = 0; i < n; i++){
			System.out.println("Book " + (i+1) + " Details:\n");
			books[i].toString();
			System.out.println("\n");
		}
		
	}
}
	

		
		
