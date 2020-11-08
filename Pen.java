package other.person.test.test1;
/**
 * . class未必要包class，也就是class屬同一階層(HTML裏頭標籤的階層概念)
 * .一個class可以擁有一個main方法，當一個java檔有兩個不重疊的class的時候，可以有兩個main方法且編譯不會錯誤。
 * 		@但是只有一個main方法會被執行
 * .公開的類別只有一個( = 和java檔案同名的那一個 )，只有這個類的main方法會被執行
 * .建構子修飾字可以缺省或是private，但是private建構子意義不大，畢竟建構子就是要拿來建立物件，在檔案外卻不能建立物件，成何體統。
 * 	- @建構子不能static，
 * 		 建構子建立物件時需要實體變數及成員方法，但實體變數和成員方法都是在執行時期才會載入的資料，也就是說這和
 * 		static發法內不能使用this關鍵字是一樣的道理。
 * 
 * 
 * @author never
 *
 */
//這裡是Git註解測試

class StrucOfTest { //XX
	 public static void main(String[] args) {
		
	 Pen myPen = new Pen(11.3);
	 myPen.getPrice();
	 
		 System.out.println("第一個main方法");
	 
	}
}
 

/**
 * @只有和java檔案同名的類別才可以使用public，且也只有這個class的main方法會被執行。
 * 
 *
 */
  class Pen{
	 private static double price;
	 
	 public  Pen() {
		 
	 }
	 
	 public  Pen( double price) {
		 Pen.price = price;
	 }
	 
	 public static void setPrice(double price) {
		 Pen.price = price;
	 }
	 
	 public static void getPrice() {
		 System.out.println(Pen.price);
	 }
	 
	 public static void main(String[] args) {
		System.out.println("第二個類別的main方法區域");
	}
 }
 
