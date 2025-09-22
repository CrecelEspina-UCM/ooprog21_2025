public class CompanyInfo{
   public void Main(){
      System.out.println("Smart Electronics");
      displayHour();
   }
   public void displayHour(){
      System.out.println("Monday - Friday 8 am to 6 pm");
      System.out.println("Saturday 8 am to noon");
      System.out.println("Sunday closed");
   }
   public static void main(String[] args){
      CompanyInfo obj = new CompanyInfo();
      obj.Main();
   }
}
